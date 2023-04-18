package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.sql.*;

public class ClientHandler implements Runnable {
	private Socket clientSocket;
	private Connection ConnexionDB;
	
	public ClientHandler(Socket clientSocket,Connection ConnexionDB)
	{
		this.clientSocket = clientSocket;
		this.ConnexionDB = ConnexionDB;
	}
	
	@Override
	public void run()
	{
		try {
			//Créaion flux pour recevoir données client
			BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			//Création flux sortie pour envoyer les données client
			PrintWriter output = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()),true);
			
			//mamaky requete client
			String request = input.readLine();
			
			//traitement de la requete et renvoye reponse client
			String response = processRequest(request);
			output.println(response);
			
			//Ferme la connexion db
			ConnexionDB.close();
			
		}catch (IOException|SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
	private String processRequest(String request)throws SQLException{
		Statement stat = ConnexionDB.createStatement();
		ResultSet res = stat.executeQuery(request);
		
		StringBuilder response = new StringBuilder();
		while (res.next()) {
			response.append(res.getString("column_name"));
			response.append(",");
		}
		
		//remove to virgule
		if(response.length()>0) {
			response.setLength(response.length()-1);
		}
		
		res.close();
		stat.close();
		
		return response.toString();
		
	}

}


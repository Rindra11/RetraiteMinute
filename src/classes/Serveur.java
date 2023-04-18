package classes;

import java.io.*;
import java.net.*;

public class Serveur {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 ServerSocket ss = new ServerSocket(5000);
	     Socket s = ss.accept();

	     System.out.println("Client connecté");

	}

}

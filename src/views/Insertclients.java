package views;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import configuration.ConnexionDB;

public class Insertclients {
	private void Insertclients(int IdCl, String NameCli, String AdrsCl,int CINCl,int TelCl,String LibelleCl,int NBAO,int STAT) throws SQLException {
		String sql = "INSERT INTO clients(NameCli,AdrsCl,CINCl,TelCl,LibelleCl,NBAO,STAT) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement stat = ConnexionDB.prepareStatement(sql);
		stat.setString(1, NameCli);
		stat.setString(2, AdrsCl);
		stat.setInt(3, CINCl);
		stat.setInt(4,TelCl);
		stat.setString(5, LibelleCl);
		stat.setInt(6, NBAO);
		stat.setInt(7, STAT);
		
		stat.executeUpdate();
		stat.close();
		
	}

}

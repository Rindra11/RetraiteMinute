package configuration;

import java.sql.*;

public class ConnexionDB {
	public Connection conn;
	public Statement stat;
	

	public ConnexionDB() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(Constants.URL,Constants.USER,Constants.PASSWD);
		stat = conn.createStatement();
	}	

	    public ResultSet execute (String query)throws Exception
	    {
	        ResultSet res=null;
	       res=stat.executeQuery(query);
	        return(res);
	    }
	    
	    public int executeUpdate (String query) throws Exception
	    {
	        int res=0;
	      	res=stat.executeUpdate(query);
	        return(res);
	    }
	    
	    public void close() throws Exception
	    {
	        stat.close();
	        conn.close();
	    }

}

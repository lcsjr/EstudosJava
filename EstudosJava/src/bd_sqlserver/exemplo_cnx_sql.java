package bd_sqlserver;

import java.sql.*;

public class exemplo_cnx_sql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String connectionUrl = "jdbc:sqlserver://NOTE\\SQLEXPRESS:1433;databaseName=smart";
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				
		Connection cnn = DriverManager.getConnection(connectionUrl,"sa","1");
		
		System.out.println("Conexão obtida com sucesso!");
	} catch (SQLException ex) {
		
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("Error: " + ex.getErrorCode());
			ex.printStackTrace();

	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

	} 
}



package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading the driver classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sandi","sandi");
		
//		(3)create the statements
		
		Statement stmt = conn.createStatement();
		
//		(4)excute the statements
		
		stmt.execute("create table hello(name varchar2(10),id number)");
		
//		(5)close the connections
		
		conn.close();
		
		System.out.println("Table is created successfully");
		
	}

}

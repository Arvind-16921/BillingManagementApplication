package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
public static Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bma", "root", "kumar");
		return cn;
	}
	catch(Exception e){
		return null;
	}
}
}

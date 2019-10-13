package com.jm2190921.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbUtil {

	private static Connection connection;

	public static Connection getCon() throws SQLException {
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		return connection;
	}

	public static Connection getConByReadingPropFile() throws SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");

		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url, username, password);
		}
		return connection;
	}
}

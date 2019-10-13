package com.jm2190921.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	private static Connection connection;

	public static Connection getCon() throws SQLException {
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		return connection;
	}
}

package com.jm2190921.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			boolean result = stmt.execute("DROP TABLE JM2190921_USER");
			if (!result) {
				System.out.println("Table dropped successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

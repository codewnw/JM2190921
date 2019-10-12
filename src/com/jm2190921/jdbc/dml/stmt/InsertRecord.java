package com.jm2190921.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("INSERT INTO JM2190921_USER VALUES (1, 'Sachin')");
			if (result > 0) {
				System.out.println("Record inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

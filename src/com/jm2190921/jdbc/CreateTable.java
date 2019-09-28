package com.jm2190921.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			// 1. Establish the connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create statement/command
			Statement stmt = con.createStatement();
			// 3. Execute statement/command
			boolean result = stmt.execute("CREATE TABLE JM2190921_USER(ID NUMBER, NAME VARCHAR)");
			// 4. Process the result
			if (!result) {
				System.out.println("Table created successfully.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

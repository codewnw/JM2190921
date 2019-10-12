package com.jm2190921.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecords {

	public static void main(String[] args) throws SQLException {
		// 1. Establish the connection with database
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

		// 2. Create statement/command
		Statement stmt = con.createStatement();

		Scanner scan = new Scanner(System.in);
		String userChoice = null;

		do {
			// Ask ID
			System.out.print("Enter ID: ");
			// Capture the ID
			int id = Integer.parseInt(scan.nextLine());
			// Ask new name
			System.out.print("Enter new name: ");
			// Capture the name
			String newName = scan.nextLine();
			// 3. Execute the statement/command
			int result = stmt
					.executeUpdate("UPDATE JM2190921_USER VALUES SET NAME = '" + newName + "' WHERE ID = " + id);
			// 4. Process the result
			if (result > 0) {
				System.out.println("Record updated succssfully.");
			}
			// Ask if user wants to continue or not
			System.out.print("Do you wish to continue(Y/N): ");
			// Capture user's choice
			userChoice = scan.nextLine();
		} while (userChoice.equalsIgnoreCase("Y"));
	}

}

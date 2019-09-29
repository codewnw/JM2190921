package com.jm2190921.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecords {

	public static void main(String[] args) {

		try {
			// 1. Establish the connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create statement/command
			Statement stmt = con.createStatement();
			// Create Scanner object
			Scanner scan = new Scanner(System.in);
			// Create user choice variable
			String userChoice = null;
			// In loop
			do {
				// Ask id of person to delete
				System.out.print("Enter id: ");
				// Capture the id
				int id = Integer.parseInt(scan.nextLine());
				// 3. Execute the statement/command
				int result = stmt.executeUpdate("DELETE FROM JM2190921_USER WHERE ID = " + id);
				// 4. Process the result
				if (result > 0) {
					System.out.println("Record deleted succssfully.");
				}
				// Ask user choice if he/she wants to continue
				System.out.print("Do you wish to continue(Y/N): ");
				// Capture user choice
				userChoice = scan.nextLine();
			} while (userChoice.equalsIgnoreCase("Y"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

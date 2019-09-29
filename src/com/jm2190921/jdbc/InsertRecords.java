package com.jm2190921.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) {

		try {
			// 1. Establish the connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create statement/command
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				// Ask id
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				// Ask name
				System.out.print("Enter name: ");
				String name = scan.nextLine();

				// Insert record
				// 3. Execute statement/command
				int result = stmt.executeUpdate("INSERT INTO JM2190921_USER VALUES(" + id + ",'" + name + "')");

				// 4. Process the result
				if (result > 0) {
					System.out.println("Record inserted succssfully.");
				}

				// Again ask do you wish to continue
				System.out.print("Do you wish to continue(Y/N): ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

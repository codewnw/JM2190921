package com.jm2190921.jdbc.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190921_USER VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				int result = pstmt.executeUpdate();
				if (result > 0) {
					System.out.println("Record inseted successfully.");
				}

				System.out.print("Do you wish to continue? (Y/N) ");
				userChoice = scan.nextLine();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package com.jm2190921.jdbc.batch.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordsInBatchUsingPreparedStatement {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190921_USER VALUES (?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				pstmt.addBatch();

				System.out.print("Do you wish to continue?(Y/N): ");
				userChoice = scan.nextLine();

			}

			int[] result = pstmt.executeBatch();

			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

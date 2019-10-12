package com.jm2190921.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190921_USER VALUES(?, ?)");
			pstmt.setInt(1, 100001);
			pstmt.setString(2, "JDBC");
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("Record inseted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

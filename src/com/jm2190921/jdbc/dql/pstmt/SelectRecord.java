package com.jm2190921.jdbc.dql.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareCall("SELECT * FROM JM2190921_USER WHERE ID = ?");
			pstmt.setInt(1, 100001);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			} else {
				System.out.println("No record found!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

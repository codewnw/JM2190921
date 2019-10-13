package com.jm2190921.jdbc.transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2190921.jdbc.util.DbUtil;

public class ControlCommit {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getConByReadingPropFile();

			con.setAutoCommit(false);

			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("INSERT INTO JM2190921_USER VALUES (987, 'Jadeja')");
			if (result > 0) {
				System.out.println("Record inserted successfully.");
			}

			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190921_USER");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}
//			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

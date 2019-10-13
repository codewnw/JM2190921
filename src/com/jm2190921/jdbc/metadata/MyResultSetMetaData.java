package com.jm2190921.jdbc.metadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2190921.jdbc.util.DbUtil;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190921_USER");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getTableName(1));
			
			System.out.print(rsmd.getColumnName(1) + "(" + rsmd.getColumnTypeName(1) + ")");
			System.out.print("    ");
			System.out.print(rsmd.getColumnName(2) + "(" + rsmd.getColumnTypeName(2) + ")");
			System.out.println();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

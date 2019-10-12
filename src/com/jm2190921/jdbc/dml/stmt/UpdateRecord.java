package com.jm2190921.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate("UPDATE JM2190921_USER SET NAME = 'Sachin Tendulkar' WHERE ID  = 1");
		if (result > 0) {
			System.out.println("Record has been updated successfully.");
		}
	}

}

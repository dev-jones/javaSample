package com.devJones.web.main;

import com.devJones.web.db.dbconnect.DBConnection;

public class MainClass {
	public static void main(String[] args) {
		DBConnection.initConnection();
		
		DBConnection.getConnection();
	}
}

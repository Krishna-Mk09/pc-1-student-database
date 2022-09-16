/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.service;

import java.sql.Connection;

public class DatabaseService {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Krishna81433*";
    private final Connection connection;

    public DatabaseService() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean connect() {
        return false;
    }

    public void printConnectionStatus() {
        if (connection != null) {
            System.out.println("\u001B[32m Database is connected. \u001B[0m");
        } else {
            System.err.println("!!Database is NOT connected!!");
        }
    }
}

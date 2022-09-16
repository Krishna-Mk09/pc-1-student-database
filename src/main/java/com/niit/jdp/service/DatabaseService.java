/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
    // This is the connection string to connect to the database.
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Krishna@81433*";
    // This is a constructor for the DatabaseService class.
    private Connection connection;

    // This is a constructor for the DatabaseService class.
    public DatabaseService() {
        this.connection = null;
    }

    public Connection getConnection() {
        return connection;
    }

    /**
     * > This function connects to the database using the URL, USERNAME, and PASSWORD variables
     *
     * @return A boolean value.
     */
    public boolean connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection != null;
    }

    /**
     * If the connection is not null, print a green message saying the database is connected. Otherwise, print a red error
     * message saying the database is not connected
     */
    public void printConnectionStatus() {
        if (connection != null) {
            System.out.println("\u001B[32m Database is connected. \u001B[0m");
        } else {
            System.err.println("!!Database is NOT connected!!");
        }
    }
}

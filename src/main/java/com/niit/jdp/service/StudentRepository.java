/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.service;

import com.niit.jdp.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> getAllStudentDetails(Connection connection) throws SQLException {
        String readQuery = "SELECT * FROM `sales_commission`.`sales_person`;";
        List<Student> salespersonList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet studentResultSet = statement.executeQuery(readQuery);
        while (studentResultSet.next()) {
            String name = studentResultSet.getString("name");
            int rollNumber = studentResultSet.getInt("roll_number");
            String grades = studentResultSet.getString("grades");
        }
        return salespersonList;
    }
}

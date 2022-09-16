/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.repository;

import com.niit.jdp.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> getAllStudentDetails(Connection connection) throws SQLException {
        String readQuery = "SELECT * FROM `school`.`student`;";
        List<Student> studentList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet studentResultSet = statement.executeQuery(readQuery);
        while (studentResultSet.next()) {
            String name = studentResultSet.getString("name");
            int rollNumber = studentResultSet.getInt("roll_number");
            String grades = studentResultSet.getString("grades");
            Student student = new Student(name, rollNumber, grades);
            studentList.add(student);
        }
        return studentList;
    }
}

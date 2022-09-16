/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.service;

import com.niit.jdp.model.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentRepository {
    public List<Student> getAllStudentDetails(Connection connection) throws SQLException {
        String readQuery = "SELECT * FROM `sales_commission`.`sales_person`;";

        return null;
    }
}

/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

import com.niit.jdp.model.Student;
import com.niit.jdp.repository.StudentRepository;
import com.niit.jdp.service.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentImpl {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService();
        StudentRepository studentRepository = new StudentRepository();
        Connection connection = databaseService.getConnection();
        try {
            List<Student> allStudent = studentRepository.getAllStudentDetails(connection);
            for (Student student : allStudent) {
                System.out.println(student);
            }
        } catch (SQLException exception) {
            System.out.println("Not connected to the database");
            exception.printStackTrace();
        } finally {
            databaseService.printConnectionStatus();

        }
    }
}

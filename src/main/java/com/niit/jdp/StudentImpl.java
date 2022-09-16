/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */
package com.niit.jdp;

import com.niit.jdp.repository.StudentRepository;
import com.niit.jdp.service.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentImpl {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService();
        try {
            databaseService.connect();
            StudentRepository studentRepository = new StudentRepository();
            Connection connection = databaseService.getConnection();
            studentRepository.getAllStudentDetails(connection).forEach(System.out::println);
        } catch (ClassNotFoundException | SQLException exception) {
            System.err.println("Error connecting to database ");
            exception.printStackTrace();
        } finally {
            databaseService.printConnectionStatus();
        }
    }
}
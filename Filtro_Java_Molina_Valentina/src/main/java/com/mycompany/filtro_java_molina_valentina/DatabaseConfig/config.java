/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filtro_java_molina_valentina.DatabaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {
    private static final String URL = "JDBC:mysql://ujiwdq4rb9ail7hq:GYJILXCv6f3LsXVxEqtm@b5f4dzkesh9qz2h03fnp-mysql.services.clever-cloud.com:3306/b5f4dzkesh9qz2h03fnp";
    private static final String USER = "ujiwdq4rb9ail7hq";
    private static final String PASSWORD = "GYJILXCv6f3LsXVxEqtm";

    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if (connection == null || connection.isClosed()){
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Exito");
            } catch (SQLException e) {
                System.out.println("Error"+ e.getMessage());
                throw e;
            }
        }
        return connection;
    }
}


package com.mycompany.filtro_java_molina_valentina.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mycompany.filtro_java_molina_valentina.model.Ninja;
import java.sql.ResultSet;
import java.sql.Statement;

public class NinjaDAO {

    private static final String URL = "JDBC:mysql://ujiwdq4rb9ail7hq:GYJILXCv6f3LsXVxEqtm@b5f4dzkesh9qz2h03fnp-mysql.services.clever-cloud.com:3306/b5f4dzkesh9qz2h03fnp";
    private static final String USER = "ujiwdq4rb9ail7hq";
    private static final String PASSWORD = "GYJILXCv6f3LsXVxEqtm";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}

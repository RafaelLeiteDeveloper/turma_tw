package com.SRP.SRP.src;

import java.sql.Connection;
import java.util.Properties;

public class ConnectionDAO {

    private Properties connectionProps;
    private Connection conn;

    private static final String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false";

    ConnectionDAO(String username, String password) {
        connectionProps = new Properties();
        connectionProps.put("user", username);
        connectionProps.put("password", password);
    }

    Connection createConnection() {
        //Cria conexão com o banco
        return null;
    }
    
}

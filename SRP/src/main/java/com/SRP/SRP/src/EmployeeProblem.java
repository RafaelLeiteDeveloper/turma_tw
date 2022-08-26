package com.SRP.SRP.src;

public class EmployeeProblem {


    private Long id;
    private String name;
    private double salary;
    private String jobTitle;

    private static final String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false";

    public boolean login() {
        return true;
        //Abre conexão com o banco e realiza o login do empregado no sistema
    }
    
}

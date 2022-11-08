package com.example.bookmanagementproject;
import java.sql.*;

public class Database {
    public static Connection connectDB(){
        String url = "jdbc:mysql://localhost/PublicLibrary";
        String uid = "root";
        String pw = "root123";

        try{
            Connection connect = DriverManager.getConnection(url, uid, pw);
            return connect;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

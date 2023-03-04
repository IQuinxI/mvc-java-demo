package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private String dbURL = "jdbc:mysql://localhost:3306/sampledb";    
    private String username = "root";
    private String password = "";
    private Connection conn;

    public Connector(){
        Connect();
    }

    public void Connect() {
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null)System.out.println("Connected");
            else System.out.println("Problems connecting, Retry Later!!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public Connection getConn(){ return conn; }
    
    protected void finalize()
    {
        try {conn.close();}
        catch(SQLException e) {System.out.println(e.getMessage());}        
    }
}

package com.controller;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.models.User;

public class UserCRUD implements ICRUD<User> {
    Connection conn;
    
    public UserCRUD(Connection conn)
    {
        this.conn = conn;
    }
    
    @Override
    public boolean Insert(User user) throws SQLException {
        String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);

        // we should use setInt, setFloat, set Date etc depending on t<he type 
        // of the variable
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.setString(3, user.getFullname());
        statement.setString(4, user.getEmail());
        
        int rowInserted = statement.executeUpdate();
        return rowInserted > 0 ? true : false;        
    }

    @Override
    public ResultSet SelectAll() throws SQLException {
        String sql = "SELECT * from Users";
        
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        
        return resultSet;
    }

}

package com.controller;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface ICRUD<T> {
    // returns true if the insertion was successful
    // false if the insertion failed
    public boolean Insert(T object) throws SQLException;
    
    // returns a ResultSet of the selected Item(s)
    // e.g result.getString("CNE"); selects the column CNE
    // you should adapt getString to getInt, getFloat etc depending on the
    // column's type
    public ResultSet SelectAll() throws SQLException;

    // public ResultSet Select(int id) throws SQLException;
}

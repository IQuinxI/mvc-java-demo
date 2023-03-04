package com.app;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.Instancer;
import com.models.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void readSelect(ResultSet results) throws SQLException {
        if (results.next() == false) {
            System.err.println("There's no users in the database");
        } else {
            do {
                System.out.println(results.getString("username"));
            } while (results.next());
        }
    }

    public static void test() throws SQLException {
        // instancer.user.Insert();
        // ResultSet results = instancer.user.SelectAll();
        // readSelect(results);
    }

    public static void main(String[] args) {
        Instancer instancer = new Instancer();
        try {
            User user = new User("Quinx   ", "pass", "name", "dhf@gmail.com");                        
            instancer.user.Insert(user);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
}

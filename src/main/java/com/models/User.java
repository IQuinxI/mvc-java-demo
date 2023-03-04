package com.models;

public class User {
    private String username = "";
    private String password = "";
    private String fullname = "";
    private String email = "";
    // Handles modifications and verifications of data
    // These actions are performed when calling the set Functions
    // Exceptions should be used to handle these cases
    public User(){}

    public User(String username, String password, String fullname, String email) {
        setUsername(username);
        setEmail(email);
        setFullname(fullname);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.trim();
    }


}

package com.db;

import com.controller.UserCRUD;

// The Instancer class manages all of the interactions with the database
public class Instancer {
    private Connector conn = new Connector();
    public UserCRUD user = new UserCRUD(conn.getConn());
}

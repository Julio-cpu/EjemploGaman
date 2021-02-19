package com.Restaurant.Comida.Persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
    InfoConect dataConect = new InfoConect();

    public Conect() {
    }
    public Connection conexionMYSQL() throws SQLException ,ClassNotFoundException{
        //Connection con = null;
        String myDriver = dataConect.mySqlDriver;
        String myUrl = dataConect.mySqelUrl;
        Class.forName(myDriver);
        Connection con = DriverManager.getConnection(myUrl, dataConect.user, dataConect.password);
        return con;
    }

}

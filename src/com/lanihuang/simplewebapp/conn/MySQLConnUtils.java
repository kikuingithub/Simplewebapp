package com.lanihuang.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {

  public static Connection getMySQLConnection()
  throws ClassNotFoundException, SQLException {

    // Note: Change the connection parameters accordingly.
    String hostName = "us-cdbr-iron-east-04.cleardb.net";
    String dbName = "heroku_2c893dd9e4fdf5d";
    String userName = "bc7a403442c80e";
    String password = "d85f72d1";
    return getMySQLConnectionDB();
  }

  public static Connection getMySQLConnectionDB() throws SQLException,
    ClassNotFoundException {

    // Declare the class driver for MySQL DB
    Class.forName("com.mysql.jdbc.Driver");

    // URL Connection for MySQL
    // Example: jdbc:mysql://localhost:3306/simplehr
    String connectionURL = "jdbc:mysql://mysqldb:3306/sample";

    Connection conn = DriverManager.getConnection(connectionURL, "root",
                      "root");
    return conn;
  }

}

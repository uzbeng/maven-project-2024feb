package com.facebook.abc.gtl.dbconnection;

import java.sql.*;

public class SqliteDbConnect {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Jurabek\\application.db");
            Statement statement = connection.createStatement();

//            statement.execute("CREATE TABLE \"locations\" (\n" +
//                    "\t\"id\"\tINTEGER NOT NULL UNIQUE,\n" +
//                    "\t\"name\"\tTEXT NOT NULL UNIQUE\n" +
//                    "\tPRIMARY KEY(\"id\" AUTOINCREMENT)\n" +
//                    ");");

//            statement.execute("insert into contacts (name, phone, email) values ('demo user', '254353', 'demo@mail.com');");

            ResultSet results = statement.executeQuery("select * from contacts where name='Bob Smith'");

            while(results.next()) {
                String name = results.getString(1);
                String phone = results.getString(2);
                String email = results.getString(3);
                System.out.println(name + " : " + phone + " : " + email);
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DB connection failed");
        }

    }
}

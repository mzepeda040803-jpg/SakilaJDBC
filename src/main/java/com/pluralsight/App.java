package com.pluralsight;

import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";


        //1. open connection to database
        Connection connection = DriverManager.getConnection(url, username);

        //create statement
        //statement is tied to open connection
        Statement statement = connection.createStatement();

        //define your query
        String query = "SELECT city FROM city ";

        //2. Execute your query
        ResultSet results = statement.executeQuery(query);

        System.out.println(results);

        // process the results
        while (results.next()) {
            String city = results.getString("city");
            System.out.println(city);
        }
            // 3. Close the connection
        connection.close();

    }
}

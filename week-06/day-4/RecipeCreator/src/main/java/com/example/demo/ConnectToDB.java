package com.example.demo;

import javax.validation.constraints.Null;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectToDB {

  public static void main(String[] args) {
    Connection con = null;
    try {
      con = DriverManager.getConnection("jdbc:mysql://localhost/recipe_db", "root", "avatar10");
      if (con != null) {
        System.out.println("Successful connection");
      }
    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println("Not connected");
    }

/*    String query = "insert into recipes (recipe_name, category, isVegan, isVegetarian, creationTime, rating)"
            + " values (?, ?, ?, ?, ?, ?)";
    PreparedStatement preparedStmt;*/
    try {
/*      preparedStmt = con.prepareStatement(query);

      preparedStmt.setString(1, "Lentil soup");
      preparedStmt.setString(2, "Soup");
      preparedStmt.setBoolean(3, true);
      preparedStmt.setBoolean(4, true);
      preparedStmt.setInt(5, 30);
      preparedStmt.setInt(6, 5);
      preparedStmt.execute();*/
      con.close();
    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println("SQL exception");
    } catch (NullPointerException ne) {
      ne.printStackTrace();
      System.out.println("Nullpointer exception on connection");
    }
  }
}


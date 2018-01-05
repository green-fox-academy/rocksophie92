package models;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import java.sql.*;



public class Ingredient {
  public static void main(String[] args) {

    Connection connection;
    Statement statement;

    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost/recipe_db", "root", "avatar10");
      statement = connection.createStatement();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}

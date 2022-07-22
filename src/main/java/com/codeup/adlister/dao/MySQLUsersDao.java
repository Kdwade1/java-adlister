package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;


public class MySQLUsersDao implements Users{

    public MySQLUsersDao (Config config){
        if(connection == null) {
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to the database!", e);
            }

        }
    }
    private Connection connection;


    @Override
    public User findByUsername(String username) {
String sql ="SELECT* FROM user WHERE userName = ?";
        try {
            PreparedStatement stmt= connection.prepareStatement(sql);
            stmt.setString(1,username);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return new User(rs.getLong("id"),rs.getString("userName"),rs.getString("email"),rs.getString("password"));


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public Long insert(User user) {
//        System.out.println();
        String sql = "INSERT INTO user(userName, email, password) VALUES (?,?,?) ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    public static void main(String[] args) {
        MySQLUsersDao usersDao = new MySQLUsersDao(new Config());}
    }



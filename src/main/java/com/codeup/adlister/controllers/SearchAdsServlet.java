//package com.codeup.adlister.controllers;
//
//import com.codeup.adlister.dao.Config;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.*;
//import com.mysql.cj.jdbc.Driver;
//
//@WebServlet(name = "SearchAdsServlet", urlPatterns = "/search")
//public class SearchAdsServlet extends HttpServlet {
//    private Connection connection = null;
//    Config config= new Config();
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //Creates a way to search through the database
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        String search = request.getParameter("searchbar");
//        String SearchWithWildCards = "%"+ search + "%";
//        String sql ="Select * FROM ads WHERE category LIKE ? OR title LIKE ? OR description like ?;";
//        request.setAttribute("search",search);
//        try {
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setString(1,SearchWithWildCards);
//            stmt.setString(2,SearchWithWildCards);
//            stmt.setString(3,SearchWithWildCards);
//            ResultSet rs = stmt.executeQuery();
//            while(rs.next()){
//                response.sendRedirect("/result");
//
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        request.getRequestDispatcher("/WEB-INF/ads/search.jsp").forward(request,response);
//    }
//}

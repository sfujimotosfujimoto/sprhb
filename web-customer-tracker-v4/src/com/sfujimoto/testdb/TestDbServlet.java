package com.sfujimoto.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by sfujimoto on 2017/03/15.
 */
@WebServlet(name = "TestDbServlet", urlPatterns = {"/TestDbServlet"})
public class TestDbServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // setup conn var
        String user = "springstudent";
        String pass = "springstudent";

        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";


        // get conn to db
        try {
            PrintWriter out = response.getWriter();

            out.println("Connecting to db: " + jdbcUrl);

            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            out.println("SUCCESS!!");

            myConn.close();

        }
        catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }
}

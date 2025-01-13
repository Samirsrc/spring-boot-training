package org.example;

//import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service ");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2><b>ok je vois</b><h2>");
    }
}

// <dependency>
//      <groupId>jakarta.servlet</groupId>
//      <artifactId>jakarta.servlet-api</artifactId>
//      <version>6.0.0</version>
//      <scope>provided</scope>
//    </dependency>
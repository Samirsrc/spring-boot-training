package org.example;

//import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service ");
        PrintWriter out = res.getWriter();
        out.println("ok je vois");
        

    }
}

// <dependency>
//      <groupId>jakarta.servlet</groupId>
//      <artifactId>jakarta.servlet-api</artifactId>
//      <version>6.0.0</version>
//      <scope>provided</scope>
//    </dependency>
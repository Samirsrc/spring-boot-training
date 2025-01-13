package com.example.SpringBootWeb1;

import jakarta.servlet.annotation.WebServlet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
}

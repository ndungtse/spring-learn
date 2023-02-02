package com.example.taskify.controllers;
import com.example.taskify.utils.CustomResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public CustomResponse handleError() {
        return new CustomResponse("Error", "Error", false);
    }

    public String getErrorPath() {
        return "/error";
    }
}

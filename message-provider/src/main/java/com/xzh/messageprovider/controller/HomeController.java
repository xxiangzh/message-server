package com.xzh.messageprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 向振华
 * @date 2019/05/08 11:00
 */
@RestController
@RequestMapping
public class HomeController {

    @RequestMapping("/")
    public void home(HttpServletResponse response){
        try {
            response.getWriter().write( "success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

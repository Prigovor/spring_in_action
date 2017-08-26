package ua.prigovor.spring_in_action.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Prigovor on 24.08.2017.
 */

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }

//    @RequestMapping(value = "/spittles")
//    public String spittles() {
//        return "home";
//    }
//
//    @RequestMapping(value = "/spitter/register")
//    public String register() {
//        return "home";
//    }
}
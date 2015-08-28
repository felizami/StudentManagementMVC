/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcapp.controller;

import com.leapfrog.mvcapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Anuz
 */
@Controller
@RequestMapping(value = "content/home")
public class HomeController {

    @Autowired
    private CourseService courseService;

//    @RequestMapping(method = RequestMethod.GET)
//    public String index(){
//        return "content/home/index";
//    }
    
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("content/home/index");
        mv.addObject("courses", courseService.getAll());
        return mv;
    }
    
   
    

}

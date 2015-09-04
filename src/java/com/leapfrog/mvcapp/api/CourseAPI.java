/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcapp.api;

import com.leapfrog.mvcapp.service.CourseService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Anuz
 */
@RestController
@RequestMapping(value = "/api/course")
public class CourseAPI {
    
    @Autowired
    private CourseService courseService;
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelMap getCourse(){
        ModelMap map=new ModelMap();
        map.addAttribute("CourseList",courseService.getAll());
        return map;
    }
    @RequestMapping(method = RequestMethod.POST)
    public String postCourse(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println(name);
        return name;
    }
}

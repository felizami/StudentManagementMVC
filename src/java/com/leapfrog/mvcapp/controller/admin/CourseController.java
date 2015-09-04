/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcapp.controller.admin;

import com.leapfrog.mvcapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Anuz
 */
@Controller
@RequestMapping(value = "admin/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    
   @RequestMapping(method = RequestMethod.GET)
   public String index(){
      return "admin/course/index";
   }
   
   @RequestMapping(value="table",method = RequestMethod.GET)
   public ModelAndView table(){
       ModelAndView mv=new ModelAndView("admin/course/table");
       
       mv.addObject("courses",courseService.getAll());
       
       return mv;
   }

}

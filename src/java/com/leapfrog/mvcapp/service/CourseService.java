/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcapp.service;

import com.leapfrog.mvcapp.dao.CourseDAO;
import com.leapfrog.mvcapp.entity.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anuz
 */
@Service
public class CourseService {
    
    @Autowired
    private CourseDAO courseDAO;
    
    public List<Course> getAll(){
        return courseDAO.getAll();
    }
    public Course getById(int id){
        return courseDAO.getById(id);
    }
    
//    public int insert(Course c){
//        return courseDAO.insert(c);
//    }
    
}

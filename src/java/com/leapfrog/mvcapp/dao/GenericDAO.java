/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcapp.dao;

import java.util.List;

/**
 *
 * @author Anuz
 */
public interface GenericDAO<T> {
    
    int insert(T t);
    List<T> getAll();
    T getById(int id);
    int update(T t);
    int delete(int id);
    
    
}

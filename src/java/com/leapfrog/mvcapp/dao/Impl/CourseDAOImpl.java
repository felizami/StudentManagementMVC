/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mvcapp.dao.Impl;

import com.leapfrog.mvcapp.constant.SqlConstant;
import com.leapfrog.mvcapp.dao.CourseDAO;
import com.leapfrog.mvcapp.entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anuz
 */
@Repository(value = "CourseDAO")
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Course t) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Course> getAll() {

        return jdbcTemplate.query(SqlConstant.COURSE_GETALL, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });

    }

    @Override
    public Course getById(int id) {
        return jdbcTemplate.queryForObject(SqlConstant.COURSE_GETBYID, new Object[]{id}, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }

    @Override
    public int update(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Course mapData(ResultSet rs) throws SQLException {
        Course course = new Course();
        course.setId(rs.getInt("id"));
        course.setName(rs.getString("name"));
        course.setDescription(rs.getString("description"));
        course.setPrice(rs.getDouble("price"));
        course.setStatus(rs.getBoolean("status"));
        return course;
    }
}

package com.example.demo;

import com.example.demo.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper  implements RowMapper {


    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException{
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setId(rs.getInt("id"));
        user.setFirstName("firstName");
        user.setLastName("lastName");
        return user;
    }
}

package com.w.smb.dao;

import com.w.smb.bean.User;
import com.w.smb.mapping.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {

    @Autowired
    public UserMapper userMapper;

    public void insertUser(User user){
        userMapper.insert(user);
    }
}

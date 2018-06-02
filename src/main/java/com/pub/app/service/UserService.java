package com.pub.app.service;

import com.pub.app.mapper.UserMapper;
import com.pub.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User selectUserbyUserSysNo(int sysno) {
        return userMapper.selectUserbyUserSysNo(sysno);
    }

    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}

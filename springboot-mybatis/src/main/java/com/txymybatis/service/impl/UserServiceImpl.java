package com.txymybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.txymybatis.mapper.UserMapper;
import com.txymybatis.pojo.User;
import com.txymybatis.service.UserService;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
    public PageInfo<User> findByPage(int pageNum, int pageSize) {
        //使用PageHelper设置分页
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;}

    @Override
    public void updateBatch(List<User> list) {
       List<User> list1 = new ArrayList<User>();
        for (User user : list) {
            user.setPassword("0");
            list1.add(user);
        }

        userMapper.updateBatch(list1);
    }

    @Override
    public void updatetowparam(List<User> list) {
        List<User> list1 = new ArrayList<User>();
        String pass = "changpassword";
        String username = "changUsername";

        for (User user : list) {
            user.setPassword(pass);
            user.setAge(33);
            user.setUsername(username);
            list1.add(user);
        }

        userMapper.updatetowparam(list1);

    }
}

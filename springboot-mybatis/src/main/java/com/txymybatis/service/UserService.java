package com.txymybatis.service;

import com.github.pagehelper.PageInfo;
import com.txymybatis.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> selectAll();
    public User selectById(int id);
    public void insert(User user);
    public PageInfo<User> findByPage(int pageNum, int pageSize);
    public void updateBatch(List<User> list);
    public void updatetowparam(List<User> list);
}

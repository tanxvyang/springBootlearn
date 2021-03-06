package com.txymybatis.mapper;

import com.txymybatis.pojo.User;

import java.util.List;

public interface UserMapper {
   public List<User> selectAll();
    public User selectById(int id);
    public void insert(User user);
    public void updateBatch(List<User> list);
    public void updatetowparam(List<User> list);
}

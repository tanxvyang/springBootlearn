package com.demo;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {
@Autowired
private UserMapper userMapper;
    @Test
    void contextLoads() {
    }
@Test
    public void add(){
    User user = new User();
//    user.setUsername("ooo");
//    user.setPassword("9999999");
    userMapper.insert(user);
    System.out.println("==========================="+user);
}
@Test
    public void delbyid(){
    userMapper.deleteById(4);
}
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        //Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}

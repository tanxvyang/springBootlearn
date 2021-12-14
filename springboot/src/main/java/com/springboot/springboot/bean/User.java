package com.springboot.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
//必须将当前类添加到容器中
@Component
//默认读取全局配置文件获取值，将当前类中的所有属性与配置文件中的user进行绑定
@ConfigurationProperties(prefix = "user")        //使用@value（“ ”），不需要这个注解
@PropertySource({"classpath:user.properties"})
public class User {
    //@Value("${user.name}")
    private String username ;
    //@Value("${user.age}")
    private Integer age;
    private Date  birthday;
    //@Value("${user.Address}") 不支持复杂的对象形式，并且只能注入一个
    @Autowired
    private Address address;
    private Boolean status;
    private List<String> lists;
    private Map<String,Object> map;


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address=" + address +
                ", status=" + status +
                ", lists=" + lists +
                ", map=" + map +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public User() {
    }

    public User(String username, Integer age, Date birthday, Address address, Boolean status, List<String> lists, Map<String, Object> map) {
        this.username = username;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.status = status;
        this.lists = lists;
        this.map = map;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

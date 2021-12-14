package com.demo.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

import java.io.Serializable;
@TableName("user")
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private  String name;
    private  String email  ;
    private  Integer age;
    private  Integer id;

    // public User(String username, String password, Integer age, Integer id) {
    //     this.username = username;
    //     this.password = password;
    //     this.age = age;
    //     this.id = id;
    // }
    //
    // public Integer getId() {
    //     return id;
    // }
    //
    // public void setId(Integer id) {
    //     this.id = id;
    // }
    //
    // public User() {
    // }
    //
    // @Override
    // public String toString() {
    //     return "User{" +
    //             "username='" + username + '\'' +
    //             ", password='" + password + '\'' +
    //             ", age=" + age +
    //             '}';
    // }
    //
    //
    //
    // public String getPassword() {
    //     return password;
    // }
    //
    // public void setPassword(String password) {
    //     this.password = password;
    // }
    //
    // public Integer getAge() {
    //     return age;
    // }
    //
    // public void setAge(Integer age) {
    //     this.age = age;
    // }
    //
    // public String getUsername() {
    //     return username;
    // }
    //
    // public void setUsername(String username) {
    //     this.username = username;
    // }
}

package com.txy;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class SpringbootJdbcApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        System.out.println("===============================");
        System.out.println("-------------DataSource类型----------"+dataSource.getClass());
        System.out.println("-------------Connection连接----------"+dataSource.getConnection());

    }

}

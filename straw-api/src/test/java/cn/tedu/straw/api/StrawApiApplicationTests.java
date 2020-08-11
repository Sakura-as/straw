package cn.tedu.straw.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class StrawApiApplicationTests {


    @Test
    void contextLoads() {

    }
    @Autowired
    DataSource dataSource;

    @Test
    void getConnection() throws Exception {
        System.out.println("打桩:"+dataSource.getConnection());
    }

}

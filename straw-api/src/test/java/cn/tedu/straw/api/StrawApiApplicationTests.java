package cn.tedu.straw.api;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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

    @Test
    void md5Test(){
        String password = "1234";
        String enPassword = DigestUtils.md5Hex(password);
        System.out.println("[md5] password = "+enPassword);
    }
    @Test
    void bcrtypeTest(){
        int a = 0;
        while (a<10){
            a++;
            String password = "1234";
            String enPassword = new BCryptPasswordEncoder().encode(password);
            System.out.println("[bcrtype] password = "+enPassword);
        }

    }

}

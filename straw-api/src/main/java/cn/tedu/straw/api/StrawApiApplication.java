package cn.tedu.straw.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.straw.api.mapper")
public class StrawApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(StrawApiApplication.class,args);
    }
}

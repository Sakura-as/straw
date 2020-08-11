package cn.tedu.straw.api.mapper;

import cn.tedu.straw.commons.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserMapperTests {

    @Autowired
    UserMapper mapper;
    User user;
    @Test
    void insert(){
        User user = new User();
        user.setUsername("三三");
        user.setPassword("13579");
        int rows = mapper.insert(user);
        log.debug("rows={}"+rows);
    }

    @Test
    void deleteById(){
        Integer id = 1;
        int rows = mapper.deleteById(id);
        log.debug("rows={}",rows);
    }

    @Test
    void updataById(){
        User user = new User();
        user.setId(3);
        user.setPassword("24680");
        int rows = mapper.updateById(user);
        log.debug("rows={}",rows);
    }

    @Test
    void selectById(){
        Integer id = 3;
        User user = mapper.selectById(id);
        log.debug("user={}",user);

    }


}

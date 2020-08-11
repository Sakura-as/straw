package cn.tedu.straw.api.service.impl;

import cn.tedu.straw.api.mapper.UserMapper;
import cn.tedu.straw.api.service.IUserService;
import cn.tedu.straw.commons.model.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tedu.cn
 * @since 2020-08-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

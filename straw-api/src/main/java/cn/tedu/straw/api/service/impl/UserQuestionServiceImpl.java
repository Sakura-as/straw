package cn.tedu.straw.api.service.impl;

import cn.tedu.straw.api.mapper.UserQuestionMapper;
import cn.tedu.straw.api.service.IUserQuestionService;
import cn.tedu.straw.commons.model.UserQuestion;
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
public class UserQuestionServiceImpl extends ServiceImpl<UserQuestionMapper, UserQuestion> implements IUserQuestionService {

}

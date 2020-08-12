package cn.tedu.straw.api.service;

import cn.tedu.straw.api.dto.StudentRegisterDTO;
import cn.tedu.straw.commons.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author tedu.cn
 * @since 2020-08-11
 */
public interface IUserService extends IService<User> {

    /**
     * 学生注册
     *
     * @param studentRegisterDTO 学生通过客户端提交的注册信息
     */
    void regStudent(StudentRegisterDTO studentRegisterDTO);
}

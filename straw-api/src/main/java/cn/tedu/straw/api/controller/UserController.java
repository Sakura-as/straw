package cn.tedu.straw.api.controller;


import cn.tedu.straw.api.dto.StudentRegisterDTO;
import cn.tedu.straw.api.ex.InsertException;
import cn.tedu.straw.api.ex.InviteCodeException;
import cn.tedu.straw.api.ex.PhoneDuplicateException;
import cn.tedu.straw.api.service.IUserService;
import cn.tedu.straw.commons.vo.R;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tedu.cn
 * @since 2020-08-11
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/student/register")
    public R regStudent(StudentRegisterDTO studentRegisterDTO){
        R r = new R();
        try {
            userService.regStudent(studentRegisterDTO);
            return R.ok().setMassage("注册成功!");
        } catch (InviteCodeException e){
            return R.failure(2).setMassage("注册失败！邀请码错误！");
        } catch (PhoneDuplicateException e){
            return R.failure(3).setMassage("注册失败！手机号码已经被占用！");
        } catch (InsertException e){
            return R.failure(4).setMassage("注册失败！服务器忙，请稍后再次尝试！");
        } catch (Throwable e){
            return R.failure(5).setMassage("注册失败！出现预期以外的异常！"
                    + e.getClass().getName() + ", "
                    + e.getMessage());
        }

    }
}

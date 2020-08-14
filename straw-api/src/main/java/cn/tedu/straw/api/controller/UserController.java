package cn.tedu.straw.api.controller;


import cn.tedu.straw.api.dto.StudentRegisterDTO;
import cn.tedu.straw.api.ex.*;
import cn.tedu.straw.api.service.IUserService;
import cn.tedu.straw.commons.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.internal.util.logging.Log;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

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
@Slf4j
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/student/register")
    public R regStudent(@Valid StudentRegisterDTO studentRegisterDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            String errorMessage = bindingResult.getFieldError().getDefaultMessage();
            log.debug("验证参数格式失败!{}",errorMessage);
            throw new ParameterValidationException(errorMessage);
        }
        userService.regStudent(studentRegisterDTO);
        return R.ok();
    }



}

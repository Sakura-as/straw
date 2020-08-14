package cn.tedu.straw.api.controller;

import cn.tedu.straw.api.ex.*;
import cn.tedu.straw.commons.vo.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public R handleException(Throwable e){
        if(e instanceof InviteCodeException){
            return R.failure(R.State.ERR_INVITE_CODE,e);
        } else if(e instanceof PhoneDuplicateException){
            return R.failure(R.State.ERR_PHONE_DUPLICATE,e);
        } else if(e instanceof InsertException){
            return R.failure(R.State.ERR_INSERT_FAIL,e);
        } else if(e instanceof ParameterValidationException){
            return R.failure(R.State.ERR_PARAMETER_VALIDATION,e);
        } else if(e instanceof ClassDisabledException){
            return R.failure(R.State.ERR_CLASS_DISABLED,e);
        } else{
            return R.failure(R.State.REE_UNKOWN,e);
        }
    }
}

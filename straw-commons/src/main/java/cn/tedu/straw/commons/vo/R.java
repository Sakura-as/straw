package cn.tedu.straw.commons.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 响应到客户端的JSON数据的封装类
 * @param <T>
 */
@Data
@Accessors(chain = true)
public class R<T> {

    /**
     * 响应状态码
     */
    private Integer state;
    /**
     * 出错时的错误提示信息
     */
    private String massage;
    /**
     * 成功时响应给客户端的数据
     */
    private T data;

    public R(){
        super();
    }

    public static R ok(){
        return new R().setState(1);
    }

    public static R failure(Integer failureState){
        return new R().setState(failureState);
    }

}

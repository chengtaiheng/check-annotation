package annotation.validate.application.advice;

/**
 * @author: 程泰恒
 * @date: 2018/11/2 16:28
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    //捕获IllegalArgumentException异常，并作处理
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public Map<String, Object> IllegalArgumentException(IllegalArgumentException e) {
        Map responseResult = new HashMap<>();
        responseResult.put("code", "668");
        responseResult.put("message", e.getMessage());

        return responseResult;
    }
}

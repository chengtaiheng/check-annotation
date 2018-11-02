package annotation.validate.application.action;

import annotation.validate.application.domain.CheckPhoneModle;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/annotation-check")
public class CheckPhoneAction {

    //这是一个有态度的测试
    @PostMapping
    @ResponseBody
    public Map<String, Object> testAnnotationCheck(@Validated CheckPhoneModle checkPhoneModle, BindingResult bindingResult) {

        //判断是否有错
        if (bindingResult.hasErrors()) {

           //提取全部错误
            List<ObjectError> allErrors = bindingResult.getAllErrors();

            //获取默认的错误信息抛出IllegalArgumentException
            throw new IllegalArgumentException(allErrors.get(0).getDefaultMessage());
        }

        Map<String, Object> map = new HashMap<>();
        map.put("code", "668");
        map.put("message", "程序运转正常");
        return map;
    }
}

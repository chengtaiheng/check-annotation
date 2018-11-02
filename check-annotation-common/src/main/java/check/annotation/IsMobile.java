package check.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author: 程泰恒
 * @date: 2018/10/31 19:47
 */
@Target(ElementType.FIELD)                     //作用域是在字段
@Retention(RetentionPolicy.RUNTIME)            //作用周期是在运行时
@Documented
@Constraint(
        validatedBy = {IsMobileValidator.class} //指定校验类
)
public @interface IsMobile {
    boolean required() default true;

    String message() default "手机号格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

package check.annotation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean require = false;

    //重写初始化方法，把require热属性赋值给本类属性
    public void initialize(IsMobile constraintAnnotation) {
        require = constraintAnnotation.required();

    }

    //使用验证工具做验证
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

       //当为必须时
        if (require) {
            return ValidatorUtils.isMobile(s);
        } else {
            //当为非必须时
            if (StringUtils.isEmpty(s)) {
                return true;
            } else {
                return ValidatorUtils.isMobile(s);
            }
        }
    }
}

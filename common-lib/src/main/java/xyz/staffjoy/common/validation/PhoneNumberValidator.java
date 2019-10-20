package xyz.staffjoy.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义参数校验：
 * 1.实现 ConstraintValidator 接口
 * 2.实现对应校验逻辑
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext context) {
        if (phoneField == null) {
            // can be null
            return true;
        }
        return phoneField.matches("[0-9]+")
                && (phoneField.length() > 8)
                && (phoneField.length() < 14);
    }
}

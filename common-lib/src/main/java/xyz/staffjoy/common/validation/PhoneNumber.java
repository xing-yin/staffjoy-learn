package xyz.staffjoy.common.validation;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * 自定义参数校验注解：实现见 PhoneNumberValidator
 */
@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumber {

    String message() default "Invalid phone number";

    Class[] groups() default {};

    Class[] payload() default {};
}

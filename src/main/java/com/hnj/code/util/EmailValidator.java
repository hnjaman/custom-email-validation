package com.hnj.code.util;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ExampleEmailValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValidator {
    String message() default "Email is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

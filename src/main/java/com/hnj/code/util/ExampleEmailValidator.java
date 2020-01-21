package com.hnj.code.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleEmailValidator implements ConstraintValidator<EmailValidator, String> {

    @Override
    public void initialize(EmailValidator constraintAnnotation) {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext cxt) {

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            String[] result = email.split("@");
            String domain = null;
            if(result.length>0){
                domain = result[1];
            }

            if(domain != null){
                return domain.equalsIgnoreCase("example.com");
            }
        }else {
            return false;
        }

        return false;
    }
}

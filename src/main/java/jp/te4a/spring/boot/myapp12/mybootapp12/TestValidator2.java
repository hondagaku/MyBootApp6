package jp.te4a.spring.boot.myapp12.mybootapp12;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jp.te4a.spring.boot.myapp12.mybootapp12.TestValid2.Writter;

public class TestValidator2 implements ConstraintValidator<Writter,String>{
    String ok;
    @Override
    public void initialize(TestValid2.Writter nv){ 
        ok = nv.ok();
    }
    @Override
    public boolean isValid(String in,ConstraintValidatorContext cxt){
    if(in == null){
    return false;
    }
    System.out.println(in.equals(ok));
    return in.equals(ok);
    }
    }
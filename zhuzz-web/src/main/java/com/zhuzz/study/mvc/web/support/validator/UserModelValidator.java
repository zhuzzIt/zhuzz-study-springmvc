package com.zhuzz.study.mvc.web.support.validator;

import com.zhuzz.study.mvc.web.model.DataBinderTestModel;
import com.zhuzz.study.mvc.web.model.UserModel;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by h3ilang on 2017/5/5.
 */
public class UserModelValidator implements Validator{
    private static final Pattern USERNAME_PATTERN = Pattern.compile("[a-zA-Z]\\w{4,19}");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9]{5,20}");
    private static final Set<String> FORBINDDDEN_WORD_SET = new HashSet<String>();
    static {
        FORBINDDDEN_WORD_SET.add("fuc k"); //删掉空格
        FORBINDDDEN_WORD_SET.add("admin");
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return DataBinderTestModel.class == aClass;
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (o == null ) {
            ValidationUtils.rejectIfEmpty(errors,"username","username.not.empty");
            return;
        }
        DataBinderTestModel user = (DataBinderTestModel) o;
        String username = user.getUsername();
        if (username == null) {
            errors.rejectValue("username","username.not.empty");
            return;
        }else if(!USERNAME_PATTERN.matcher(user.getUsername()).matches()) {
            errors.rejectValue("username", "username.not.illegal");//如果用户名不合法
        }

        for(String forbiddenWord : FORBINDDDEN_WORD_SET) {
            if(username.contains(forbiddenWord)) {
                errors.rejectValue("username", "username.forbidden", new Object[]{forbiddenWord}, "您的用户名包含非法关键词");//用户名包含屏蔽关键字
                break;
            }
        }
        String password = user.getPassword();
        if(password != null && !PASSWORD_PATTERN.matcher(password).matches()) {
            errors.rejectValue("password","password.not.illegal", "密码不合法");//密码不合法
        }
    }
}

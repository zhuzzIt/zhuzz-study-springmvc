package com.zhuzz.study.mvc.web.controller;

import com.zhuzz.study.mvc.web.model.UserModel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;
import org.springframework.web.servlet.mvc.SimpleFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by h3ilang on 2017/4/26.
 */
public class RegisterSimpleFormController extends CancellableFormController {
    @Override
    protected Map referenceData(HttpServletRequest request) throws Exception {
        Map map = new HashMap();
        map.put("cityList", Arrays.asList("山东", "北京", "上海"));
        return map;
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        UserModel user = (UserModel) command;
        System.out.println(user);
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        UserModel user = new UserModel();
        user.setUsername("请输入用户名");
        return user;
    }

    @Override
    protected ModelAndView onCancel(Object command) throws Exception {
        UserModel user = (UserModel) command;
        //TODO 调用业务对象处理
        System.out.println(user);
        return super.onCancel(command);
    }
}

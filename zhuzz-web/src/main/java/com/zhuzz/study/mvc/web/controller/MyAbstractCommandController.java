package com.zhuzz.study.mvc.web.controller;

import com.zhuzz.study.mvc.web.model.UserModel;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by h3ilang on 2017/4/25.
 */
public class MyAbstractCommandController extends AbstractCommandController {
    @Override
    protected ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object command, BindException e) throws Exception {
        UserModel user = (UserModel) command;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("abstractCommand");
        mv.addObject("user",user);
        return mv;
    }
}

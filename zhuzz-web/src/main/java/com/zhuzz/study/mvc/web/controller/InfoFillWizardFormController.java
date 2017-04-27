package com.zhuzz.study.mvc.web.controller;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by h3ilang on 2017/4/26.
 */
public class InfoFillWizardFormController extends AbstractWizardFormController {
    @Override
    protected ModelAndView processFinish(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, BindException e) throws Exception {
        System.out.println("httpServletRequest = [" + httpServletRequest + "], httpServletResponse = [" + httpServletResponse + "], o = [" + o + "], e = [" + e + "]");
        return new ModelAndView("redirect:/success");
    }

    @Override
    protected Map referenceData(HttpServletRequest request, int page) throws Exception {
        Map map = new HashMap();
        if (page == 1) { //如果是填写学校信息页 需要学校类型信息
            map.put("schoolTypeList", Arrays.asList("高中", "中专", "大学"));
        }
        if (page == 2) {//如果是填写工作信息页 需要工作城市信息
            map.put("cityList", Arrays.asList("济南", "北京", "上海"));
        }
        return map;
    }

    @Override
    protected void validatePage(Object command, Errors errors, int page) {
        System.out.println("command = [" + command + "], errors = [" + errors + "], page = [" + page + "]");
    }

    @Override
    protected void postProcessPage(HttpServletRequest request, Object command, Errors errors, int page) throws Exception {
        super.postProcessPage(request, command, errors, page);
    }

    @Override
    protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        System.out.println("request = [" + request + "], response = [" + response + "], command = [" + command + "], errors = [" + errors + "]");
        return new ModelAndView("redirect:/cancel");
    }
}

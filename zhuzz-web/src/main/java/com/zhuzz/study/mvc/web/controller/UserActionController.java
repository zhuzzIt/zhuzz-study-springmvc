package com.zhuzz.study.mvc.web.controller;

import com.zhuzz.study.mvc.web.model.UserModel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created by h3ilang on 2017/4/26.
 */
public class UserActionController extends MultiActionController {

    private String createView;
    private String updateView;
    private String deleteView;
    private String listView;
    private String redirectToListView;

    public String getCreateView() {
        return createView;
    }

    public void setCreateView(String createView) {
        this.createView = createView;
    }

    public String getUpdateView() {
        return updateView;
    }

    public void setUpdateView(String updateView) {
        this.updateView = updateView;
    }

    public String getDeleteView() {
        return deleteView;
    }

    public void setDeleteView(String deleteView) {
        this.deleteView = deleteView;
    }

    public String getListView() {
        return listView;
    }

    public void setListView(String listView) {
        this.listView = listView;
    }

    public String getRedirectToListView() {
        return redirectToListView;
    }

    public void setRedirectToListView(String redirectToListView) {
        this.redirectToListView = redirectToListView;
    }

    public String create(HttpServletRequest request, HttpServletResponse response, UserModel user) {
        if ("GET".equals(request.getMethod())){
            return getCreateView();
        }
        return getRedirectToListView();
    }

    public ModelAndView update(HttpServletRequest request, HttpServletResponse response, UserModel user) {
        if ("GET".equals(request.getMethod())){
            ModelAndView mv = new ModelAndView();
            UserModel result = new UserModel();
            result.setUsername("黑狼");
            mv.addObject("command", result);
            mv.setViewName(getUpdateView());
            return mv;
        }
        return new ModelAndView(getRedirectToListView());
    }

    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response, UserModel user){
        if ("GET".equals(request.getMethod())) {
            ModelAndView mv = new ModelAndView();
            mv.addObject("userList",getUserList());
            mv.setViewName(getDeleteView());
            return mv;
        }
        return new ModelAndView(getRedirectToListView());
    }

    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", getUserList());
        mv.setViewName(getListView());
        return mv;
    }
    //如果使用委托方式，命令对象名称只能是command
    protected String getCommandName(Object command) {
        //命令对象的名字 默认command
        return "command";
    }

    private ArrayList<UserModel> getUserList(){
        ArrayList<UserModel> userList =  new ArrayList<UserModel>();
        UserModel user = new UserModel();
        user.setUsername("one");
        user.setPassword("one");
        userList.add(user);
        return userList;
    }
}

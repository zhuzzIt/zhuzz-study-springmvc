package com.zhuzz.study.mvc.web.model;

import com.zhuzz.study.mvc.web.enums.UserStateEnum;

import java.util.*;

/**
 * Created by h3ilang on 2017/4/27.
 */
public class DataBinderTestModel {
    private String username;

    private String password;
    private boolean bool;//Boolean值测试
    private SchoolInfoModel schooInfo;
    private List hobbyList;//集合测试，此处可以改为数组/Set进行测试
    private Map map;//Map测试
    private PhoneNumberModel phoneNumber;//String->自定义对象的转换测试
    private Date date;//日期类型测试
    private UserStateEnum state;//String——>Enum类型转换测试

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public SchoolInfoModel getSchooInfo() {
        return schooInfo;
    }

    public void setSchooInfo(SchoolInfoModel schooInfo) {
        this.schooInfo = schooInfo;
    }

    public List getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List hobbyList) {
        this.hobbyList = hobbyList;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public PhoneNumberModel getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumberModel phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserStateEnum getState() {
        return state;
    }

    public void setState(UserStateEnum state) {
        this.state = state;
    }
}

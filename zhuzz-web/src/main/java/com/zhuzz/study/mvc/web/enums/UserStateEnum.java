package com.zhuzz.study.mvc.web.enums;

/**
 * Created by h3ilang on 2017/4/27.
 */
public enum UserStateEnum {
    blocked("锁定");

    private String value;

    UserStateEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

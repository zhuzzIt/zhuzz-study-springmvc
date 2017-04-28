package com.zhuzz.study.mvc.web.model;

/**
 * Created by h3ilang on 2017/4/27.
 */
public class PhoneNumberModel {
    private String areaCode;//区号
    private String phoneNumber;//电话号码

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

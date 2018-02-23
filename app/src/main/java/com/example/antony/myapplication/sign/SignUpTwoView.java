package com.example.antony.myapplication.sign;

/**
 * Created by antony on 2018/2/21.
 */

public interface SignUpTwoView {
    void showToastView(String str);//显示Toast
    String getPhoneView();//获得手机号
    void setNullView();//置空手机号
    void startSignUpActivityView();//跳转到注册界面
}

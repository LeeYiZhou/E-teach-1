package com.example.antony.myapplication.sign;

/**
 * Created by antony on 2018/2/20.
 */

public interface SignInView {
    void showToastView(String str);//显示Toast
    String getPhoneView();//获得手机号
    String getPasswordView();//获得密码
    void setNullView();//置空手机号和密码
    void startSignUpActivityView();//跳转到注册界面
}

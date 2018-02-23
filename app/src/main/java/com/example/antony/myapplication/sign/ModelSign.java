package com.example.antony.myapplication.sign;

import com.example.antony.myapplication.data.MyInfo;

/**
 * Created by antony on 2018/2/20.
 */

public interface ModelSign {
    boolean sendVerificationModel(String phone);//发送验证码
    boolean checkPhoneExistModel(String phone);//检查手机号是否存在
    boolean checkVerificationModel(String verification);//检查验证码是否正确
    boolean checkPhoneValidModel(String phone);//检查手机号是否符合要求
    boolean checkPasswordValidModel(String password);//检查密码是否符合要求
    MyInfo signUpModel(String phone,String password);//手机号和密码注册
    MyInfo signInByPhoneModel(String phone, String password);//手机号和密码登陆
    MyInfo signInByQQModel();//QQ登陆
    MyInfo signInByWeiboModel();//微博登陆
    MyInfo signInByWeixinModel();//微信登陆
    MyInfo updatePasswordModel();//修改密码
}

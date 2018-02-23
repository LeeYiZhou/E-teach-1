package com.example.antony.myapplication.sign;

import com.example.antony.myapplication.data.MyInfo;

/**
 * Created by antony on 2018/2/20.
 */

public class ModelSignSource implements ModelSign {

    @Override
    public boolean sendVerificationModel(String phone) {//发送验证码
        return true;
    }

    @Override
    public boolean checkPhoneExistModel(String phone) {//检查手机号是否存在
        return true;
    }

    @Override
    public boolean checkVerificationModel(String verification){//检查验证码是否正确
        return true;
    }

    @Override
    public boolean checkPhoneValidModel(String phone) {//检查手机号是否符合要求
        return true;
    }

    @Override
    public boolean checkPasswordValidModel(String password) {//检查密码是否符合要求
        return true;
    }

    @Override
    public MyInfo signUpModel(String phone, String password) {//手机号和密码注册
        return null;
    }

    @Override
    public MyInfo signInByPhoneModel(String phone, String password) {//手机号和密码登陆
       return null;
    }

    @Override
    public MyInfo signInByQQModel() {//QQ登陆
        return null;
    }

    @Override
    public MyInfo signInByWeiboModel() {//微博登陆
        return null;
    }

    @Override
    public MyInfo signInByWeixinModel() {//微信登陆
        return null;
    }

    @Override
    public MyInfo updatePasswordModel() {//修改密码
        return null;
    }

}

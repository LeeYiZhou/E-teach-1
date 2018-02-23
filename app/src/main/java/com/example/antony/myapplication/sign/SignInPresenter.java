package com.example.antony.myapplication.sign;

/**
 * Created by antony on 2018/2/20.
 */

public class SignInPresenter {
    private ModelSignSource modelSignSource;
    private SignInView signInView;

    SignInPresenter(SignInView signInView){
        this.signInView=signInView;
        modelSignSource =new ModelSignSource();
    }

    public void signInByPhonePresenter() {//手机号和密码登陆
    }

    public void signInByQQPresenter() {//QQ登陆
    }

    public void signInByWeiboPresenter() {//微博登陆
    }

    public void signInByWeixinPresenter() {//微信登陆
    }

    public boolean checkValidPresenter(){//检查手机号和密码是否有效
        return true;
    }
}

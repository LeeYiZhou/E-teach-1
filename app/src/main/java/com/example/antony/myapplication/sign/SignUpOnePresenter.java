package com.example.antony.myapplication.sign;

/**
 * Created by antony on 2018/2/21.
 */

public class SignUpOnePresenter {
    private SignUpOneView signUpOneView;
    private ModelSignSource modelSignSource;

    SignUpOnePresenter(SignUpOneView signUpOneView){
        this.signUpOneView = signUpOneView;
        modelSignSource =new ModelSignSource();
    }

    public void signUpModel() {//手机号和密码注册
    }

    public void updatePasswordModel() {//修改密码

    }

}

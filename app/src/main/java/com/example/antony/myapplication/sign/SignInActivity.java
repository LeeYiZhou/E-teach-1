package com.example.antony.myapplication.sign;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.antony.myapplication.BaseActivity;
import com.example.antony.myapplication.R;

public class SignInActivity extends BaseActivity implements SignInView {

    //各个控件对象，例如：private TextView accountName
    private TextView phone;//手机号
    private TextView password;//密码
    private TextView signInByPhone;//手机号登陆按钮
    private TextView signInByQQ;//qq登陆按钮
    private TextView signInByWeixin;//微信登陆按钮
    private TextView signInByWeibo;//微博登陆按钮

    //自定义函数
    private void initViews(){//初始化各个控件

    }

    private void initListener(){//初始化各个事件

    }

    private void initOthers(){//其他初始化操作，例如pickerView、popupWindow

    }

    //重写BaseActivity中的方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    //重写SignInView中的方法
    @Override
    public void showToastView(String str) {//显示Toast
        Toast.makeText(SignInActivity.this,str,Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getPhoneView() {//获得手机号
        return null;
    }

    @Override
    public String getPasswordView() {//获得密码
        return null;
    }

    @Override
    public void setNullView(){

    }

    @Override
    public void startSignUpActivityView() {//跳转到注册界面
        Intent intent=new Intent(SignInActivity.this,SignUpTwoActivity.class);
        startActivity(intent);
    }

}

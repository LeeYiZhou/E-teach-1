package com.example.antony.myapplication.sign;

import android.os.Bundle;

import com.example.antony.myapplication.BaseActivity;
import com.example.antony.myapplication.R;

public class SignUpTwoActivity extends BaseActivity implements SignUpTwoView {

    //各个控件对象，例如：private TextView accountName

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
        setContentView(R.layout.activity_sign_up_two);
    }

    //重写SignUpPhoneView中的方法
    @Override
    public void showToastView(String str) {//显示Toast
    }

    @Override
    public String getPhoneView() {//获得手机号
        return null;
    }

    @Override
    public void setNullView() {//置空手机号
    }

    @Override
    public void startSignUpActivityView() {//跳转到注册界面
    }
}

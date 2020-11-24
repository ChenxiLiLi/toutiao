package com.bytedance.toutiao.ui.user.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bytedance.toutiao.R;
import com.bytedance.toutiao.base.BaseActivity;
import com.bytedance.toutiao.base.NormalViewModel;
import com.bytedance.toutiao.databinding.ActivityMyEmailBinding;

public class MyEmailActivity extends BaseActivity<NormalViewModel, ActivityMyEmailBinding> {

    @Override
    protected int getContentViewId() {
        return R.layout.activity_my_email;
    }

    @Override
    protected void processLogic() {

    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_email);
    }
}

package com.bytedance.toutiao.ui.user.activity;

import android.content.Intent;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.bytedance.toutiao.R;
import com.bytedance.toutiao.base.BaseActivity;
import com.bytedance.toutiao.base.NormalViewModel;
import com.bytedance.toutiao.databinding.ActivityMyHistoryBinding;
import com.bytedance.toutiao.ui.MainActivity;
import com.bytedance.toutiao.ui.user.adapter.HistoryAdapter;
import com.bytedance.toutiao.ui.user.fragment.FragmentUserInfo;
import com.bytedance.toutiao.ui.user.fragment.FragmentUserVideo;
import com.bytedance.toutiao.viewmodel.MyViewModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MyHistoryActivity extends BaseActivity<MyViewModel, ActivityMyHistoryBinding> {

    private FragmentUserInfo fragment_info;
    private FragmentUserVideo fragment_video;
    private HistoryAdapter historyAdapter;
    private ViewPager viewPager;

    @Override
    protected int getContentViewId() {
        return R.layout.activity_my_history;
    }

    @Override
    protected void processLogic() {
        TabLayout mTabLayout = binding.tabLayout;
        // 添加 tab item
        mTabLayout.addTab(mTabLayout.newTab().setText("资讯"));
        mTabLayout.addTab(mTabLayout.newTab().setText("视频"));

        fragment_info = new FragmentUserInfo();
        fragment_video = new FragmentUserVideo();
        List<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(fragment_info);
        fragmentList.add(fragment_video);
        historyAdapter = new HistoryAdapter(getSupportFragmentManager(),0,fragmentList );
        viewPager = binding.viewPager;
        viewPager.setAdapter(historyAdapter);
        mTabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void setListener() {
        binding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.my_back:
                        finish();
                        break;
                }
            }
        });
    }
}

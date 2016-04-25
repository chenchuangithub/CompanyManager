package com.example.commanager.companymanager.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.commanager.companymanager.R;
import com.example.commanager.companymanager.presenter.MainPresenter;
import com.example.commanager.companymanager.ui.iView.IMainView;

import java.util.List;

/**
 * Created by android_chen on 2016/4/25.
 */
public class MainActivity extends IMainView {
    private FragmentTabHost mFragmentTabHost;
    private List<Class> fragments;
    private MainPresenter mMainPresenter;
    private String[] indicators;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    @Override
    public void initView() {
        mFragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mFragmentTabHost.setup(this, getSupportFragmentManager(), R.id.tabContent);
        initTabhostView();
    }

    @Override
    public void initData() {
        mMainPresenter = MainPresenter.getInstance(this);

        fragments = mMainPresenter.initFragments();
        indicators = mMainPresenter.getIndicators();
    }

    @Override
    public void initTabhostView() {
        int count = fragments.size();
        for (int i = 0; i < count; i++) {
            TabHost.TabSpec tabSpec = mFragmentTabHost.newTabSpec(indicators[i]).setIndicator(initItemView(indicators[i]));
            mFragmentTabHost.addTab(tabSpec, fragments.get(i), null);
            mFragmentTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.select_tab_item);
        }
    }

    private View initItemView(String itemStr) {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View view = layoutInflater.inflate(R.layout.mainactivity_tab_itemview, null, false);
        TextView textView = (TextView) view.findViewById(R.id.main_tab_item);
        textView.setText(itemStr);
        return view;
    }
}

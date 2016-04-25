package com.example.commanager.companymanager.ui.iView;

import com.example.commanager.companymanager.ui.base.MvpView;

/**
 * Created by android_chen on 2016/4/25.
 */
public abstract class IMainView extends MvpView {
    protected abstract void initView();

    protected abstract void initData();

    protected abstract  void initTabhostView();

}

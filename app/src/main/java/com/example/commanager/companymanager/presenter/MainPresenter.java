package com.example.commanager.companymanager.presenter;

import android.support.v4.app.Fragment;

import com.example.commanager.companymanager.R;
import com.example.commanager.companymanager.ui.fragment.CheckFragment;
import com.example.commanager.companymanager.ui.fragment.MyFragment;
import com.example.commanager.companymanager.ui.fragment.TeamFragment;
import com.example.commanager.companymanager.ui.iView.IMainView;

import java.util.ArrayList;

/**
 * Created by android_chen on 2016/4/25.
 */
public class MainPresenter {
    private IMainView iMainView;
    private static MainPresenter instance;
    private MainPresenter(IMainView mainView){
         this.iMainView = mainView;
    }
    public static MainPresenter getInstance(IMainView mainView){
        if(instance == null){
            synchronized (MainPresenter.class){
                if (instance == null){
                    instance = new MainPresenter(mainView);
                }
            }
        }
        return instance;
    }
    public ArrayList<Class> initFragments(){
        ArrayList<Class> list = new ArrayList<>();
        list.add(CheckFragment.class);
        list.add(TeamFragment.class);
        list.add(MyFragment.class);
        return list;
    }
    public String[] getIndicators(){
        return iMainView.getResources().getStringArray(R.array.tab_items);
    }
}

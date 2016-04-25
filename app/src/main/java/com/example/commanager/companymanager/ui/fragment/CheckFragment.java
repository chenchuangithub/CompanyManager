package com.example.commanager.companymanager.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.commanager.companymanager.R;
import com.example.commanager.companymanager.ui.iView.ICheckFragment;

/**
 * Created by android_chen on 2016/4/25.
 */
public class CheckFragment extends ICheckFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check,container,false);
        return view;
    }
}

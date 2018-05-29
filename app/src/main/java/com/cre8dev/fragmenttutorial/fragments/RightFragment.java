package com.cre8dev.fragmenttutorial.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cre8dev.fragmenttutorial.R;

public class RightFragment extends Fragment{
    public static RightFragment newInstance(){
        RightFragment fragment = new RightFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_right, container, false);
        return view;
    }
}
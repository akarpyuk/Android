package com.first.firstprogramm.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public class AbstractTabFragment extends Fragment {

    protected Context context;
    protected View view;
    private String title;


    public AbstractTabFragment() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


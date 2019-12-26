package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectA {
    Rabbit(R.string.rabbit, R.layout.activity_acivity),
    Needle(R.string.needle, R.layout.activity_a_1),
    Sky(R.string.sky, R.layout.activity_a_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectA(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }
    public int getTitleResId() {
        return mTitleResId;
    }
    public int getLayoutResId() {
        return mLayoutResId;
    }


}

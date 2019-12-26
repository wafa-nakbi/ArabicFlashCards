package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectTHH {
    Wolf(R.string.wolf, R.layout.activity_tht_1),
    Taste(R.string.taste, R.layout.activity_tht_2),
    Yum(R.string.yum, R.layout.activity_tht_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTHH(int titleResId, int layoutResId) {
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

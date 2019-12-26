package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectB {
    Cow(R.string.cow, R.layout.activity_b_1),
    Bread(R.string.bread, R.layout.activity_b_3),
    Bear(R.string.bear, R.layout.activity_b_2);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectB(int titleResId, int layoutResId) {
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

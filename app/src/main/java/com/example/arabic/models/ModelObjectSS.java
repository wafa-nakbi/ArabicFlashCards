package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectSS {
    Box(R.string.box, R.layout.activity_ss_1),
    Horse(R.string.horse, R.layout.activity_ss_2),
    Sciss(R.string.sciss, R.layout.activity_ss_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectSS(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectHH {
    Whale(R.string.whale, R.layout.activity_hh_1),
    Swing(R.string.swing, R.layout.activity_hh_2),
    Croc(R.string.croc, R.layout.activity_hh_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectHH(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectM {
    Comb(R.string.comb, R.layout.activity_m_1),
    Apricot(R.string.apricot, R.layout.activity_m_2),
    Foot(R.string.foot, R.layout.activity_m_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectM(int titleResId, int layoutResId) {
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

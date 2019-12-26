package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectS {
    Car(R.string.car, R.layout.activity_s_1),
    Dress(R.string.dress, R.layout.activity_s_2),
    Seagull(R.string.seagull, R.layout.activity_s_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectS(int titleResId, int layoutResId) {
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

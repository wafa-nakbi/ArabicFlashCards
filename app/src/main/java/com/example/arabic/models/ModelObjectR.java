package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectR {
    Pom(R.string.pom, R.layout.activity_r_1),
    Butterfly(R.string.butterfly, R.layout.activity_r_2),
    Pot(R.string.pot, R.layout.activity_r_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectR(int titleResId, int layoutResId) {
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

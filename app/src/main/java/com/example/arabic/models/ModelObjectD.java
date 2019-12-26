package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectD {
    Drug(R.string.drug, R.layout.activity_d_3),
    Frog(R.string.frog, R.layout.activity_d_2),
    Lion(R.string.lion, R.layout.activity_d_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectD(int titleResId, int layoutResId) {
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

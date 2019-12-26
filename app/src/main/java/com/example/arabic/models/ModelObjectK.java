package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectK {
    Dog(R.string.dog, R.layout.activity_k_1),
    Sweep(R.string.sweep, R.layout.activity_k_2),
    King(R.string.king, R.layout.activity_k_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectK(int titleResId, int layoutResId) {
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

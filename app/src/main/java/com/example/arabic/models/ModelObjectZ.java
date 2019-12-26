package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectZ {
    Giraffe(R.string.giraffe, R.layout.activity_z_1),
    Snail(R.string.snail, R.layout.activity_z_2),
    Banana(R.string.banana, R.layout.activity_z_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectZ(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectTHD {
    Tooth(R.string.tooth, R.layout.activity_thd_1),
    Veg(R.string.veg, R.layout.activity_thd_2),
    Egg(R.string.egg, R.layout.activity_thd_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTHD(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectTH {
    Fox(R.string.fox, R.layout.activity_th_1),
    Statue(R.string.statue, R.layout.activity_th_2),
    Traiangle(R.string.triangle, R.layout.activity_th_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTH(int titleResId, int layoutResId) {
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

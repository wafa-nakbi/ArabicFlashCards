package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectF {
    Elephant(R.string.elephant, R.layout.activity_f_1),
    Pepper(R.string.pepper, R.layout.activity_f_2),
    Roof(R.string.roof, R.layout.activity_f_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectF(int titleResId, int layoutResId) {
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

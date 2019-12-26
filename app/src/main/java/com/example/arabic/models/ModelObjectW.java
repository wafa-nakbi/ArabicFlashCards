package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectW {
    Rose(R.string.rose, R.layout.activity_w_1),
    Peacock(R.string.peacock, R.layout.activity_w_2),
    Puppy(R.string.puppy, R.layout.activity_w_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectW(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectY {
    Hand(R.string.hand, R.layout.activity_y_1),
    House(R.string.house, R.layout.activity_y_2),
    Tea(R.string.tea, R.layout.activity_y_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectY(int titleResId, int layoutResId) {
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

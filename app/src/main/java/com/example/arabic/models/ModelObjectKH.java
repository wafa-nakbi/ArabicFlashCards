package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectKH {
    Sheep(R.string.sheep, R.layout.activity_kh_1),
    Palm(R.string.palm, R.layout.activity_kh_2),
    Rocket(R.string.rocket, R.layout.activity_kh_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectKH(int titleResId, int layoutResId) {
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

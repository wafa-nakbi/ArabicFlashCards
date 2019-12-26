package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectKK {
    Monkey(R.string.monkey, R.layout.activity_kk_1),
    Steer(R.string.steer, R.layout.activity_kk_2),
    Team(R.string.team, R.layout.activity_kk_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectKK(int titleResId, int layoutResId) {
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

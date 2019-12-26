package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectN {
    Bee(R.string.bee, R.layout.activity_n_1),
    Saw(R.string.saw, R.layout.activity_n_2),
    Plate(R.string.plate, R.layout.activity_n_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectN(int titleResId, int layoutResId) {
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

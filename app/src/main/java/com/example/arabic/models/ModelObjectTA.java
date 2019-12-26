package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectTA {
    Airplane(R.string.airplane, R.layout.activity_ta_1),
    Train(R.string.train, R.layout.activity_ta_2),
    Cat(R.string.cat, R.layout.activity_ta_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTA(int titleResId, int layoutResId) {
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

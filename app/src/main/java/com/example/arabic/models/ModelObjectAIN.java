package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectAIN{
    Grape(R.string.grape, R.layout.activity_ain_1),
    Candle(R.string.candle, R.layout.activity_ain_2),
    Beam(R.string.beam, R.layout.activity_ain_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectAIN(int titleResId, int layoutResId) {
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

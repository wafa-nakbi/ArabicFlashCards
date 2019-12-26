package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectL {
    Lemon(R.string.lemon, R.layout.activity_l_1),
    Spoon(R.string.spoon, R.layout.activity_l_2),
    Camel(R.string.camel, R.layout.activity_l_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectL(int titleResId, int layoutResId) {
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

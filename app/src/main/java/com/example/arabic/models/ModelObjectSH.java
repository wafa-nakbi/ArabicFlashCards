package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectSH {
    Sun(R.string.sun, R.layout.activity_sh_1),
    Feather(R.string.feather, R.layout.activity_sh_2),
    Bed(R.string.bed, R.layout.activity_sh_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectSH(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectGH {
    Crow(R.string.crow, R.layout.activity_gh_1),
    Parrot(R.string.parrot, R.layout.activity_gh_2),
    Brain(R.string.brain, R.layout.activity_gh_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectGH(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectJ {
    Carrot(R.string.carrot, R.layout.activity_j_1),
    Masjid(R.string.masjid, R.layout.activity_j_2),
    Crown(R.string.crown, R.layout.activity_j_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectJ(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectTHA {
    Envelope(R.string.envelope, R.layout.activity_tha_1),
    Umbrella(R.string.umbrella, R.layout.activity_tha_2),
    Crowd(R.string.crowd, R.layout.activity_tha_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTHA(int titleResId, int layoutResId) {
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

package com.example.arabic.models;

import com.example.arabic.R;

public enum ModelObjectC{
    Apple(R.string.apple, R.layout.activity_t_1),
    Book(R.string.book, R.layout.activity_t_3),
    Turtle(R.string.turtle, R.layout.activity_t_2);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectC(int titleResId, int layoutResId) {
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

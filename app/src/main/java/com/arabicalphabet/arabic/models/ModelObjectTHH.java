package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectTHH {


    Yum(R.string.yum, R.layout.activity_tht_3),
    Taste(R.string.taste, R.layout.activity_tht_2),
    Wolf(R.string.wolf, R.layout.activity_tht_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTHH(int titleResId, int layoutResId) {
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
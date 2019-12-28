package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectB {

    Bear(R.string.bear, R.layout.activity_b_2),
    Bread(R.string.bread, R.layout.activity_b_3),
    Cow(R.string.cow, R.layout.activity_b_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectB(int titleResId, int layoutResId) {
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

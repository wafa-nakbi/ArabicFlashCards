package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectHH {


    Croc(R.string.croc, R.layout.activity_hh_3),
    Swing(R.string.swing, R.layout.activity_hh_2),
    Whale(R.string.whale, R.layout.activity_hh_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectHH(int titleResId, int layoutResId) {
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

package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectSS {


    Sciss(R.string.sciss, R.layout.activity_ss_3),
    Horse(R.string.horse, R.layout.activity_ss_2),
    Box(R.string.box, R.layout.activity_ss_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectSS(int titleResId, int layoutResId) {
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

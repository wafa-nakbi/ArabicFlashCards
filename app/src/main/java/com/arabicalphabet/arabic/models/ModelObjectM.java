package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectM {


    Foot(R.string.foot, R.layout.activity_m_3),
    Apricot(R.string.apricot, R.layout.activity_m_2),
    Comb(R.string.comb, R.layout.activity_m_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectM(int titleResId, int layoutResId) {
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

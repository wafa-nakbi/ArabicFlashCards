package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectR {


    Pot(R.string.pot, R.layout.activity_r_3),
    Butterfly(R.string.butterfly, R.layout.activity_r_2),
    Pom(R.string.pom, R.layout.activity_r_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectR(int titleResId, int layoutResId) {
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

package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectS {


    Seagull(R.string.seagull, R.layout.activity_s_3),
    Dress(R.string.dress, R.layout.activity_s_2),
    Car(R.string.car, R.layout.activity_s_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectS(int titleResId, int layoutResId) {
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

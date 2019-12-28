package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectA {
    Sky(R.string.sky, R.layout.activity_a_3),
    Needle(R.string.needle, R.layout.activity_a_1),
    Rabbit(R.string.rabbit, R.layout.activity_acivity);

    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectA(int titleResId, int layoutResId) {
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

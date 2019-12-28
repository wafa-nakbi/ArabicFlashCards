package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectTHD {


    Egg(R.string.egg, R.layout.activity_thd_3),
    Veg(R.string.veg, R.layout.activity_thd_2),
    Tooth(R.string.tooth, R.layout.activity_thd_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTHD(int titleResId, int layoutResId) {
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

package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectTH {


    Traiangle(R.string.triangle, R.layout.activity_th_3),
    Statue(R.string.statue, R.layout.activity_th_2),
    Fox(R.string.fox, R.layout.activity_th_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTH(int titleResId, int layoutResId) {
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

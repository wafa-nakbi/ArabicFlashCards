package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectSH {


    Bed(R.string.bed, R.layout.activity_sh_3),
    Feather(R.string.feather, R.layout.activity_sh_2),
    Sun(R.string.sun, R.layout.activity_sh_1);

    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectSH(int titleResId, int layoutResId) {
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

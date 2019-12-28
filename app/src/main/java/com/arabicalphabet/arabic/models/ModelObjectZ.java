package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectZ {


    Banana(R.string.banana, R.layout.activity_z_3),
    Snail(R.string.snail, R.layout.activity_z_2),
    Giraffe(R.string.giraffe, R.layout.activity_z_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectZ(int titleResId, int layoutResId) {
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

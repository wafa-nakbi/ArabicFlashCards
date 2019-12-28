package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectK {


    King(R.string.king, R.layout.activity_k_3),
    Sweep(R.string.sweep, R.layout.activity_k_2),
    Dog(R.string.dog, R.layout.activity_k_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectK(int titleResId, int layoutResId) {
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

package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectF {


    Roof(R.string.roof, R.layout.activity_f_3),
    Pepper(R.string.pepper, R.layout.activity_f_2),
    Elephant(R.string.elephant, R.layout.activity_f_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectF(int titleResId, int layoutResId) {
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

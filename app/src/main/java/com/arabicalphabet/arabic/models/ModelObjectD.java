package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectD {


    Lion(R.string.lion, R.layout.activity_d_1),
    Frog(R.string.frog, R.layout.activity_d_2),
    Drug(R.string.drug, R.layout.activity_d_3);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectD(int titleResId, int layoutResId) {
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

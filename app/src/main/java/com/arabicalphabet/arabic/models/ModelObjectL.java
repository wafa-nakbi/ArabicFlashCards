package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectL {


    Camel(R.string.camel, R.layout.activity_l_3),
    Spoon(R.string.spoon, R.layout.activity_l_2),
    Lemon(R.string.lemon, R.layout.activity_l_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectL(int titleResId, int layoutResId) {
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

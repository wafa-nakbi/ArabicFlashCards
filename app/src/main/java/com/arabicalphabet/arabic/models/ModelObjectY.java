package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectY {


    Tea(R.string.tea, R.layout.activity_y_3),
    House(R.string.house, R.layout.activity_y_2),
    Hand(R.string.hand, R.layout.activity_y_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectY(int titleResId, int layoutResId) {
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

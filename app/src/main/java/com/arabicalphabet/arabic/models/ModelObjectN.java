package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectN {


    Plate(R.string.plate, R.layout.activity_n_3),
    Saw(R.string.saw, R.layout.activity_n_2),
    Bee(R.string.bee, R.layout.activity_n_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectN(int titleResId, int layoutResId) {
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

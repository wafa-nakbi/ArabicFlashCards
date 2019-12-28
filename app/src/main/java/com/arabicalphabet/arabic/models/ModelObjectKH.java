package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectKH {


    Rocket(R.string.rocket, R.layout.activity_kh_3),
    Palm(R.string.palm, R.layout.activity_kh_2),
    Sheep(R.string.sheep, R.layout.activity_kh_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectKH(int titleResId, int layoutResId) {
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

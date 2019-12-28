package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectKK {


    Team(R.string.team, R.layout.activity_kk_3),
    Steer(R.string.steer, R.layout.activity_kk_2),
    Monkey(R.string.monkey, R.layout.activity_kk_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectKK(int titleResId, int layoutResId) {
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

package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectGH {


    Brain(R.string.brain, R.layout.activity_gh_3),
    Parrot(R.string.parrot, R.layout.activity_gh_2),
    Crow(R.string.crow, R.layout.activity_gh_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectGH(int titleResId, int layoutResId) {
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

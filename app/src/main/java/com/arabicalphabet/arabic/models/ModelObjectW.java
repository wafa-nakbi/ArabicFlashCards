package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectW {


    Puppy(R.string.puppy, R.layout.activity_w_3),
    Peacock(R.string.peacock, R.layout.activity_w_2),
    Rose(R.string.rose, R.layout.activity_w_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectW(int titleResId, int layoutResId) {
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

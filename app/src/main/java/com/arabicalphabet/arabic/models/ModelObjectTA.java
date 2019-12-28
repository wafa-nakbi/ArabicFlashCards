package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectTA {


    Cat(R.string.cat, R.layout.activity_ta_3),
    Train(R.string.train, R.layout.activity_ta_2),
    Airplane(R.string.airplane, R.layout.activity_ta_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTA(int titleResId, int layoutResId) {
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

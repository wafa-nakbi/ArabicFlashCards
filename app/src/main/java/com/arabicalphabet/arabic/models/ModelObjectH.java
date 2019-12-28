package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectH {




    Park(R.string.park, R.layout.activity_h_4),
    Face(R.string.face, R.layout.activity_h_3),
    Cave(R.string.cave, R.layout.activity_h_2),
    Cres(R.string.cres, R.layout.activity_h_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectH(int titleResId, int layoutResId) {
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

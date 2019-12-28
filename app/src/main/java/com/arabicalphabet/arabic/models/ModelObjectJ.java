package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectJ {


    Crown(R.string.crown, R.layout.activity_j_3),
    Masjid(R.string.masjid, R.layout.activity_j_2),
    Carrot(R.string.carrot, R.layout.activity_j_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectJ(int titleResId, int layoutResId) {
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

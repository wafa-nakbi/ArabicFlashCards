package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectAIN{
    Beam(R.string.beam, R.layout.activity_ain_3),
    Candle(R.string.candle, R.layout.activity_ain_2),
    Grape(R.string.grape, R.layout.activity_ain_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectAIN(int titleResId, int layoutResId) {
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

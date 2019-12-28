package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectTHA {


    Crowd(R.string.crowd, R.layout.activity_tha_3),
    Umbrella(R.string.umbrella, R.layout.activity_tha_2),
    Envelope(R.string.envelope, R.layout.activity_tha_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectTHA(int titleResId, int layoutResId) {
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

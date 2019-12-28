package my.arabicalphabet.arabic.models;

import com.arabicalphabet.arabic.R;

public enum ModelObjectC{


    Turtle(R.string.turtle, R.layout.activity_t_2),
    Book(R.string.book, R.layout.activity_t_3),
    Apple(R.string.apple, R.layout.activity_t_1);
    private int mTitleResId;
    private int mLayoutResId;
    ModelObjectC(int titleResId, int layoutResId) {
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

package com.example.arabic.adapters;
import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v4.view.PagerAdapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.arabic.ActivityGH;
import com.example.arabic.ActivityKK;
import com.example.arabic.MainActivity;
import com.example.arabic.R;
import com.example.arabic.models.ModelObjectF;

public class CustomPagerAdapterF extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;



    public CustomPagerAdapterF(Context context) {
        mContext = context;
    }
    @Override
    public Object instantiateItem(ViewGroup collection, int position) {

            /*final MediaPlayer mp = MediaPlayer.create(mContext, R.raw.rabbit);
            mp.start();
            TextView view = (TextView)collection.getChildAt(1).findViewById(R.id.tvrabbit);
            String formattedText ="<font color='#EE0000'>أ</font>";
            String next ="رنب";
            view.setText(Html.fromHtml(formattedText+next));*/

        ModelObjectF modelObject = ModelObjectF.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        String formattedText ="<font color='#EE0000'>ف</font>";
        switch (res_id){
            case R.layout.activity_f_1:
                TextView view = (TextView)layout.findViewById(R.id.tvelephant);
                //String formattedText ="<font color='#EE0000'>د</font>";
                String next ="يل";
                view.setText(Html.fromHtml(formattedText+next));
                break;
            case R.layout.activity_f_2:
                view = (TextView)layout.findViewById(R.id.tvpepper);
                //formattedText ="<font color='#EE0000'>د</font>";
                view.setText(Html.fromHtml(formattedText+   "ل" + formattedText+ "ل" ));
                break;
            case R.layout.activity_f_3:
                view = (TextView)layout.findViewById(R.id.tvroof);
                //formattedText ="<font color='#EE0000'>د</font>";
                view.setText(Html.fromHtml("سق" + formattedText ));
                final Intent intenttha = new Intent(mContext, ActivityGH.class);
                final Intent intentgh = new Intent(mContext, ActivityKK.class);
                final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.f_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.f_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.f_home);
                btn_a_right.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intenttha);

                    }
                });
                btn_a_left.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentgh);

                    }
                });
                btn_a_main.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });
                break;

        }

        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelObjectF.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectF customPagerEnum = ModelObjectF.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

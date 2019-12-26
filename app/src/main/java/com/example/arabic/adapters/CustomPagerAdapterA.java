package com.example.arabic.adapters;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v4.view.PagerAdapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.arabic.ActivityB;
import com.example.arabic.ActivityY;
import com.example.arabic.MainActivity;
import com.example.arabic.R;
import com.example.arabic.models.ModelObjectA;

import java.util.Locale;

public class CustomPagerAdapterA extends PagerAdapter{
    private Context mContext;
    private TextToSpeech myTTS;
    public int[] a_sound = new int[]{
            R.raw.rabbit,
            R.raw.needle,
            R.raw.sky
    };




    public CustomPagerAdapterA(Context context) {
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


        ModelObjectA modelObject = ModelObjectA.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        switch (res_id){
            case R.layout.activity_acivity:


                TextView view = (TextView)layout.findViewById(R.id.tvrabbit);
                String formattedText ="<font color='#EE0000'>أ</font>";
                String next ="رنب";
                view.setText(Html.fromHtml(formattedText+next));


                break;
            case R.layout.activity_a_1:


                view = (TextView)layout.findViewById(R.id.tvneedle);
                formattedText ="<font color='#EE0000'>إ</font>";
                next ="برة";
                view.setText(Html.fromHtml(formattedText+next));

                break;
            case R.layout.activity_a_3:

                view = (TextView)layout.findViewById(R.id.tvsky);
                formattedText ="<font color='#EE0000'>ء</font>";
                next ="سما";
                view.setText(Html.fromHtml(next+formattedText));
                final Intent intentb = new Intent(mContext, ActivityB.class);
                final Intent intenty = new Intent(mContext, ActivityY.class);
                final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.right_a_3);
                final Button btn_a_left= (Button) layout.findViewById(R.id.left_a_3);
                final Button btn_a_main= (Button) layout.findViewById(R.id.center_a_3);
                btn_a_right.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intenty);

                    }
                });
                btn_a_left.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentb);

                    }
                });
                btn_a_main.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });
               // mp2.start();
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
        return ModelObjectA.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectA customPagerEnum = ModelObjectA.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }


}

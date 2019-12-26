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

import com.example.arabic.ActivityGH;
import com.example.arabic.ActivityTHA;
import com.example.arabic.MainActivity;
import com.example.arabic.R;
import com.example.arabic.models.ModelObjectAIN;

import java.util.Locale;

public class CustomPagerAdapterAIN extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;
    public int[] ain_sound = new int[]{
            R.raw.grape,
            R.raw.candle,
            R.raw.beam
    };



    public CustomPagerAdapterAIN(Context context) {
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


        ModelObjectAIN modelObject = ModelObjectAIN.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        switch (res_id){
            case R.layout.activity_ain_1:
                TextView view = (TextView)layout.findViewById(R.id.tvgrape);
                String formattedText ="<font color='#EE0000'>ع</font>";
                String next ="نب";
                view.setText(Html.fromHtml(formattedText+next));
                break;
            case R.layout.activity_ain_2:
                view = (TextView)layout.findViewById(R.id.tvcandle);
                formattedText ="<font color='#EE0000'>ع</font>";
                next ="ة";
                view.setText(Html.fromHtml("شم"+formattedText+next));
                break;
            case R.layout.activity_ain_3:
                view = (TextView)layout.findViewById(R.id.tvbeam);
                formattedText ="<font color='#EE0000'>ع</font>";
                next ="شعاع";
                view.setText(Html.fromHtml("ش"+formattedText+ "ا" + formattedText));
                final Intent intenttha = new Intent(mContext, ActivityTHA.class);
                final Intent intentgh = new Intent(mContext, ActivityGH.class);
                final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.ain_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.ain_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.ain_home);
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
        return ModelObjectAIN.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectAIN customPagerEnum = ModelObjectAIN.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

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

import com.example.arabic.ActivityTHH;
import com.example.arabic.ActivityZ;
import com.example.arabic.MainActivity;
import com.example.arabic.R;
import com.example.arabic.models.ModelObjectR;

public class CustomPagerAdapterR extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;



    public CustomPagerAdapterR(Context context) {
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

        ModelObjectR modelObject = ModelObjectR.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        String formattedText ="<font color='#EE0000'>ر</font>";
        switch (res_id){
            case R.layout.activity_r_1:
                TextView view = (TextView)layout.findViewById(R.id.tvpom);
                String next ="مان";
                view.setText(Html.fromHtml(formattedText+next));
                break;
            case R.layout.activity_r_2:
                view = (TextView)layout.findViewById(R.id.tvbutterfly);
                view.setText(Html.fromHtml( "ف" + formattedText+ "اشة" ));
                break;
            case R.layout.activity_r_3:
                view = (TextView)layout.findViewById(R.id.tvpot);
                view.setText(Html.fromHtml("قد" + formattedText ));
                final Intent intenttha = new Intent(mContext, ActivityTHH.class);
                final Intent intentgh = new Intent(mContext, ActivityZ.class);
                final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.r_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.r_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.r_home);
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
        return ModelObjectR.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectR customPagerEnum = ModelObjectR.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

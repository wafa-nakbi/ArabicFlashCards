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

import com.example.arabic.ActivityTA;
import com.example.arabic.ActivityAIN;
import com.example.arabic.MainActivity;
import com.example.arabic.R;
import com.example.arabic.models.ModelObjectTHA;

public class CustomPagerAdapterTHA extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;



    public CustomPagerAdapterTHA(Context context) {
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

        ModelObjectTHA modelObject = ModelObjectTHA.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        String formattedText ="<font color='#EE0000'>ظ</font>";
        switch (res_id){
            case R.layout.activity_tha_1:
                TextView view = (TextView)layout.findViewById(R.id.tvenvelope);
                String next ="رف";
                view.setText(Html.fromHtml(formattedText+next));
                break;
            case R.layout.activity_tha_2:
                view = (TextView)layout.findViewById(R.id.tvumbrella);
                view.setText(Html.fromHtml("م" + formattedText + "لة" ));
                break;
            case R.layout.activity_tha_3:
                view = (TextView)layout.findViewById(R.id.tvcrowd);
                view.setText(Html.fromHtml("إكت" + formattedText + "ا" + formattedText ));
                final Intent intenttha = new Intent(mContext, ActivityTA.class);
                final Intent intentgh = new Intent(mContext, ActivityAIN.class);
                final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.tha_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.tha_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.tha_home);
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
        return ModelObjectTHA.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectTHA customPagerEnum = ModelObjectTHA.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}
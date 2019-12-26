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

import com.example.arabic.ActivitySS;
import com.example.arabic.ActivityTA;
import com.example.arabic.MainActivity;
import com.example.arabic.R;
import com.example.arabic.models.ModelObjectTHD;

public class CustomPagerAdapterTHD extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;



    public CustomPagerAdapterTHD(Context context) {
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

        ModelObjectTHD modelObject = ModelObjectTHD.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        String formattedText ="<font color='#EE0000'>ض</font>";
        switch (res_id){
            case R.layout.activity_thd_1:
                TextView view = (TextView)layout.findViewById(R.id.tvtooth);
                String next ="رس";
                view.setText(Html.fromHtml(formattedText+next));
                break;
            case R.layout.activity_thd_2:
                view = (TextView)layout.findViewById(R.id.tvveg);
                view.setText(Html.fromHtml("خ" + formattedText + "روات" ));
                break;
            case R.layout.activity_thd_3:
                view = (TextView)layout.findViewById(R.id.tvegg);
                view.setText(Html.fromHtml("بي" + formattedText  ));
                final Intent intenttha = new Intent(mContext, ActivitySS.class);
                final Intent intentgh = new Intent(mContext, ActivityTA.class);
                final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.thd_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.thd_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.thd_home);
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
        return ModelObjectTHD.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectTHD customPagerEnum = ModelObjectTHD.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

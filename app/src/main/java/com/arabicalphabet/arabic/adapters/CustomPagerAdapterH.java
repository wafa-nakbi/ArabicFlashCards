package my.arabicalphabet.arabic.adapters;
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

import my.arabicalphabet.arabic.ActivityN;
import my.arabicalphabet.arabic.ActivityW;
import my.arabicalphabet.arabic.MainActivity;
import com.arabicalphabet.arabic.R;
import my.arabicalphabet.arabic.models.ModelObjectH;

public class CustomPagerAdapterH extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;



    public CustomPagerAdapterH(Context context) {
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

        ModelObjectH modelObject = ModelObjectH.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        String formattedText ="<font color='#EE0000'>ه</font>";
        final Intent intentmain = new Intent(mContext, MainActivity.class);
        final Button btn_center= (Button) layout.findViewById(R.id.center);
        switch (res_id){
            case R.layout.activity_h_1:
                TextView view = (TextView)layout.findViewById(R.id.tvcres);
                String next ="لال";
                view.setText(Html.fromHtml(formattedText+next));
                btn_center.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });
                break;
            case R.layout.activity_h_2:
                view = (TextView)layout.findViewById(R.id.tvcave);
                view.setText(Html.fromHtml( "ك" + formattedText+ "ف" ));
                btn_center.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });
                break;
            case R.layout.activity_h_3:
                view = (TextView)layout.findViewById(R.id.tvface);
                view.setText(Html.fromHtml("وج" + formattedText ));
                break;
            case R.layout.activity_h_4:
                view = (TextView)layout.findViewById(R.id.tvpark);
                view.setText(Html.fromHtml("منتز" + formattedText ));
                final Intent intenttha = new Intent(mContext, ActivityN.class);
                final Intent intentgh = new Intent(mContext, ActivityW.class);

                final Button btn_a_right= (Button) layout.findViewById(R.id.h_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.h_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.h_home);
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
        //layout.setRotationY(180);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelObjectH.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectH customPagerEnum = ModelObjectH.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

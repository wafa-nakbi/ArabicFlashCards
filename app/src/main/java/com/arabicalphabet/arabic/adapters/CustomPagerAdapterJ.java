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

import my.arabicalphabet.arabic.ActivityHH;
import my.arabicalphabet.arabic.ActivityTHH;
import my.arabicalphabet.arabic.MainActivity;
import com.arabicalphabet.arabic.R;
import my.arabicalphabet.arabic.models.ModelObjectJ;

public class CustomPagerAdapterJ extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;



    public CustomPagerAdapterJ(Context context) {
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

        ModelObjectJ modelObject = ModelObjectJ.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        String formattedText ="<font color='#EE0000'>ج</font>";
        final Button btn_center= (Button) layout.findViewById(R.id.center);
        final Intent intentmain = new Intent(mContext, MainActivity.class);
        switch (res_id){
            case R.layout.activity_j_1:
                TextView view = (TextView)layout.findViewById(R.id.tvcarrot);
                String next ="زر";
                view.setText(Html.fromHtml(formattedText+next));
                btn_center.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });
                break;
            case R.layout.activity_j_2:
                view = (TextView)layout.findViewById(R.id.tvmasjid);
                view.setText(Html.fromHtml( "مس" + formattedText+ "د" ));
                btn_center.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });
                break;
            case R.layout.activity_j_3:
                view = (TextView)layout.findViewById(R.id.tvcrown);
                view.setText(Html.fromHtml("تا" + formattedText ));
                final Intent intenttha = new Intent(mContext, ActivityTHH.class);
                final Intent intentgh = new Intent(mContext, ActivityHH.class);
                //final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.j_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.j_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.j_home);
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
        return ModelObjectJ.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectJ customPagerEnum = ModelObjectJ.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

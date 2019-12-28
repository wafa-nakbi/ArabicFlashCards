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

import my.arabicalphabet.arabic.AcivityA;
import my.arabicalphabet.arabic.ActivityC;
import my.arabicalphabet.arabic.MainActivity;
import com.arabicalphabet.arabic.R;
import my.arabicalphabet.arabic.models.ModelObjectB;

public class CustomPagerAdapterB extends PagerAdapter{
    private Context mContext;
    private TextToSpeech tts;




    public CustomPagerAdapterB(Context context) {
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

        ModelObjectB modelObject = ModelObjectB.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        int res_id= modelObject.getLayoutResId();
        final Button btn_center= (Button) layout.findViewById(R.id.center);
        final Intent intentmain = new Intent(mContext, MainActivity.class);
        switch (res_id){
            case R.layout.activity_b_1:

                TextView view = (TextView)layout.findViewById(R.id.tvcow);
                String formattedText ="<font color='#EE0000'>ب</font>";
                String next ="قرة";
                view.setText(Html.fromHtml(formattedText+next));
                btn_center.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });

                break;
            case R.layout.activity_b_3:
                view = (TextView)layout.findViewById(R.id.tvbread);
                formattedText ="<font color='#EE0000'>ب</font>";
                next ="ز";
                view.setText(Html.fromHtml("خ"+formattedText+next));
                btn_center.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentmain);

                    }
                });

                break;
            case R.layout.activity_b_2:
                view = (TextView)layout.findViewById(R.id.tvbear);
                formattedText ="<font color='#EE0000'>ب</font>";

                view.setText(Html.fromHtml("د"+formattedText));
                final Intent intenttha = new Intent(mContext, ActivityC.class);
                final Intent intentgh = new Intent(mContext, AcivityA.class);
                //final Intent intentmain = new Intent(mContext, MainActivity.class);
                final Button btn_a_right= (Button) layout.findViewById(R.id.b_right);
                final Button btn_a_left= (Button) layout.findViewById(R.id.b_left);
                final Button btn_a_main= (Button) layout.findViewById(R.id.b_home);
                btn_a_right.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intentgh);

                    }
                });
                btn_a_left.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mContext.startActivity(intenttha);

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
        return ModelObjectB.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectB customPagerEnum = ModelObjectB.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}

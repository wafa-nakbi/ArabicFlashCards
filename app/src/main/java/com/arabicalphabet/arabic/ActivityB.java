package my.arabicalphabet.arabic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;

import com.arabicalphabet.arabic.R;

import my.arabicalphabet.arabic.adapters.CustomPagerAdapterB;

public class ActivityB extends AppCompatActivity {

    public int[] b_sound = new int[]{
            R.raw.bear,
            R.raw.bread,
            R.raw.cow
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        //final MediaPlayer mp = MediaPlayer.create(this, b_sound[0]);
        //mp.start();

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setClipToPadding(true);
        viewPager.setOnPageChangeListener(playerb);
        viewPager.setAdapter(new CustomPagerAdapterB(this));
        //viewPager.setRotationY(180);
        viewPager.setCurrentItem(R.id.viewpager,true);
    }
    OnPageChangeListener playerb = new OnPageChangeListener()
    {

        @Override
        public void onPageSelected(int arg0)
        {
            MediaPlayer  mp = MediaPlayer.create(ActivityB.this, b_sound[arg0]);
            mp.start();
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2)
        {
        }

        @Override
        public void onPageScrollStateChanged(int arg0)
        {
        }
    };




}

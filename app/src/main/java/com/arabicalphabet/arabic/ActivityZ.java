package my.arabicalphabet.arabic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;

import com.arabicalphabet.arabic.R;

import my.arabicalphabet.arabic.adapters.CustomPagerAdapterZ;

public class ActivityZ extends AppCompatActivity {

    public int[] a_sound = new int[]{


            R.raw.banana,
            R.raw.snail,
            R.raw.giraffe
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);



        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setClipToPadding(true);
        viewPager.setOnPageChangeListener(player);
        viewPager.setAdapter(new CustomPagerAdapterZ(this));
        //viewPager.setRotationY(180);
        viewPager.setCurrentItem(R.id.viewpager,true);
    }
    OnPageChangeListener player = new OnPageChangeListener()
    {

        @Override
        public void onPageSelected(int arg0)
        {
            MediaPlayer  mp = MediaPlayer.create(ActivityZ.this, a_sound[arg0]);
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

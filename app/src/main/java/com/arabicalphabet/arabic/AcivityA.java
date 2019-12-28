package my.arabicalphabet.arabic;

import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arabicalphabet.arabic.R;

import my.arabicalphabet.arabic.adapters.CustomPagerAdapterA;

public class AcivityA extends AppCompatActivity {

    public int[] a_sound = new int[]{
            R.raw.sky,
            R.raw.needle,
            R.raw.rabbit

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setClipToPadding(true);
        viewPager.setOnPageChangeListener(player);
        viewPager.setAdapter(new CustomPagerAdapterA(this));
        //viewPager.setRotationY(180);
        viewPager.setCurrentItem(R.id.viewpager,true);





    }
    OnPageChangeListener player = new OnPageChangeListener()
    {

        @Override
        public void onPageSelected(int arg0)
        {
            MediaPlayer  mp = MediaPlayer.create(AcivityA.this, a_sound[arg0]);
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
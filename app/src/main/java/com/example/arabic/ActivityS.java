package com.example.arabic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;

import com.example.arabic.adapters.CustomPagerAdapterS;

public class ActivityS extends AppCompatActivity {

    public int[] a_sound = new int[]{
            R.raw.car,
            R.raw.dress,
            R.raw.seagull
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

       final MediaPlayer mp = MediaPlayer.create(this, a_sound[0]);
        mp.start();

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setClipToPadding(true);
        viewPager.setOnPageChangeListener(player);
        viewPager.setAdapter(new CustomPagerAdapterS(this));
    }
    OnPageChangeListener player = new OnPageChangeListener()
    {

        @Override
        public void onPageSelected(int arg0)
        {
            MediaPlayer  mp = MediaPlayer.create(ActivityS.this, a_sound[arg0]);
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
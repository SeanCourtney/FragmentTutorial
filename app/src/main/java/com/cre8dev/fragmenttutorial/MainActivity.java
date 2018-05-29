package com.cre8dev.fragmenttutorial;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cre8dev.fragmenttutorial.fragments.LeftFragment;
import com.cre8dev.fragmenttutorial.fragments.MainFragment;
import com.cre8dev.fragmenttutorial.fragments.RightFragment;

public class MainActivity extends AppCompatActivity {

    MyPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);

        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPager.setCurrentItem(1);
    }

    public static class MyPagerAdapter extends FragmentStatePagerAdapter{
        public MyPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position){
            switch (position){
                case 0:
                    return LeftFragment.newInstance();
                case 1:
                    return MainFragment.newInstance();
                case 2:
                    return RightFragment.newInstance();
            }
            return null;
        }

        @Override
        public int getCount(){
            return 3;
        }
    }



}

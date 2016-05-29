package com.example.liuqun.viewpagerandtabsdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager      pager   = (ViewPager) findViewById(R.id.vpMainWindow);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        assert pager != null;
        pager.setAdapter(adapter);

        TabLayout layout = (TabLayout) findViewById(R.id.tlNavigation);
        assert layout != null;
        layout.setupWithViewPager(pager);
    }
}

package com.example.jinqh.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private FragmentTransaction transaction;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setDefaultFragment();
        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    // 设置默认进来是tab 显示的页面
    private void setDefaultFragment() {
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, new BlankFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            fragmentManager = getSupportFragmentManager();
            transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.content, new BlankFragment());
                    transaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    transaction.replace(R.id.content, new BlankFragment2());
                    transaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    transaction.replace(R.id.content, new BlankFragment3());
                    transaction.commit();
                    return true;
                case R.id.navigation_4:
                    transaction.replace(R.id.content, new BlankFragment4());
                    transaction.commit();
                    return true;
                case R.id.navigation_5:
                    transaction.replace(R.id.content, new BlankFragment5());
                    transaction.commit();
                    return true;
            }
            return false;
        }
    };


}

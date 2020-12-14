package com.example.communication_training_application;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class WordMeaningActivity extends AppCompatActivity {
    private ViewPager viewPager ;
    private ViewPagerAdapter pagerAdapter ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_meaning);

        int cnt = getIntent().getIntExtra("data-count",1);
        int position = getIntent().getIntExtra("data-position", 0);

        viewPager = (ViewPager) findViewById(R.id.viewPager) ;
        pagerAdapter = new ViewPagerAdapter(this, position, cnt) ;
        viewPager.setAdapter(pagerAdapter) ;
        viewPager.setCurrentItem(position);

        Toast toast = Toast.makeText(this.getApplicationContext(),"좌우로 스와이프하여 단어를 학습해 보세요.", Toast.LENGTH_LONG);
        toast.show();


    }
}
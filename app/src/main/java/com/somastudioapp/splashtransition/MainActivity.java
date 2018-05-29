package com.somastudioapp.splashtransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView ;
    private TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.img);
        textView = (TextView) findViewById(R.id.txt);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.style_animation);
        imageView.startAnimation(animation);
        textView.startAnimation(animation);

    }
}

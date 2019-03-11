package com.lifeistech.jiko.countdown;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
   CustomTimer timer;
   TextView countText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countText = (TextView) findViewById(R.id.textView);
        timer = new CustomTimer(60000, countText);
    }

    public void start(View v) {
        timer.startTimer();
    }
    public void stop(View v) {
        timer.cancelTimer();
    }

    public void reset(View v) {
        timer.resetTimer();
    }
}

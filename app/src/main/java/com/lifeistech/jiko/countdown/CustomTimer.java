package com.lifeistech.jiko.countdown;

import android.os.CountDownTimer;
import android.widget.TextView;

public class CustomTimer {
    private TextView timerText;
    private CountDownTimer timer;
    private long defaultTime;
    private long nowTime;
    public CustomTimer(long defaultTime, TextView timerText) {
        this.defaultTime = defaultTime;
        this.nowTime = defaultTime;
        this.timerText = timerText;
    }

    private void initTimer() {
        timer = new CountDownTimer(nowTime, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                nowTime = millisUntilFinished / 1000 * 1000;
                timerText.setText(String.valueOf(nowTime));
            }

            @Override
            public void onFinish() {

            }
        };
    }

    public void startTimer() {
        if (timer == null) {
            initTimer();
            timer.start();
        }
    }

    public void cancelTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    public void resetTimer() {
        if (timer == null) {
            nowTime = defaultTime;
            initTimer();
            timer.start();
        }
    }
}

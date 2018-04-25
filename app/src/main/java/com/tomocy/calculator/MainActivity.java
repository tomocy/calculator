package com.tomocy.calculator;

/**
 * Simple calculator android application
 * Referenced from http://codezine.jp/
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        switch (view.getId()) {
            case R.id.num7Btn:
                TextView textView = findViewById(R.id.dispTextView);
                String txt = "aiueo";
                textView.setText(txt);
        }
    }
}

package com.tomocy.calculator.Displays;

import android.widget.TextView;

public class TextViewDisplay implements Display {

    private TextView disp;

    public TextViewDisplay(TextView txtView) {
        this.disp = txtView;
    }

    @Override
    public void show(String str) {
        this.disp.setText(str);
    }

}

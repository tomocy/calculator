package com.tomocy.calculator.Displays;

import android.widget.TextView;

public class TextViewDisplay extends DisplayAbstract implements Display {

    private TextView disp;

    public TextViewDisplay(TextView txtView) {
        this.disp = txtView;
    }

    @Override
    public void add(String str) {
        this.stack.add(str);
    }

    @Override
    public void show() {
        String str = this.get();
        this.disp.setText(str);
    }

    @Override
    public String get() {
        StringBuffer strBuf = new StringBuffer();
        for (String str: this.stack) {
            strBuf.append(str);
        }

        return strBuf.toString();
    }

    @Override
    public Double getAsDouble() {
        String str = this.get();
        try {
            return Double.parseDouble(str);
        } catch (Exception e) {
            return 0.0;
        }
    }

}

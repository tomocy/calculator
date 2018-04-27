package com.tomocy.calculator.Displays;

import android.widget.TextView;
import com.tomocy.calculator.Number;

public class TextViewDisplay extends DisplayAbstract implements Display {

    private TextView disp;

    public TextViewDisplay(TextView txtView) {
        this.disp = txtView;
    }

    @Override
    public void add(Number num) {
        if (this.stack.size() == 0 && num == Number.ZERO) {
            return;
        }

        this.stack.add(num.toString());
    }

    @Override
    public void show() {
        String str = this.get();
        this.disp.setText(str);
    }

    @Override
    public void show(Double d) {
        String str = Double.toString(d);
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

    @Override
    public void clear() {
        this.stack.clear();
    }
}

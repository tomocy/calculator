package com.tomocy.calculator;

import android.widget.TextView;

import com.tomocy.calculator.Displays.Display;
import com.tomocy.calculator.Displays.TextViewDisplay;
import com.tomocy.calculator.States.State;
import com.tomocy.calculator.States.NumberAState;

public class Calculator implements Context {

    private double a;

    private double b;

    private Operation op;

    private State state;

    private Display disp;

    public Calculator() {
        this.a = 0;
        this.b = 0;
        this.op = null;
        this.state = NumberAState.getInstance();
        this.disp = null;
    }

    @Override
    public void setDisp(Display disp) {
        this.disp = disp;
    }

    @Override
    public void showNum(Number num) {
        this.disp.show(num.toString());
    }
}

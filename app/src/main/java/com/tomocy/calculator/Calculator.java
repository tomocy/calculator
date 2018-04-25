package com.tomocy.calculator;

import com.tomocy.calculator.States.State;
import com.tomocy.calculator.States.NumberAState;

public class Calculator implements Context {

    private double a;

    private double b;

    private Operation op;

    private State state;

    public Calculator() {
        this.a = 0;
        this.b = 0;
        this.op = null;
        this.state = NumberAState.getInstance();
    }

    @Override
    public void clear() {

    }

    @Override
    public void showNum(Number num) {

    }

    @Override
    public void saveNum() {

    }

    @Override
    public void setOp(Operation op) {

    }
}

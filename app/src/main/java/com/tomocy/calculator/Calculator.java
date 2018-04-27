package com.tomocy.calculator;

import com.tomocy.calculator.Displays.Display;
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
    public void onInputNumber(Number num) {
        this.state.onInputNumber(this, num);
    }

    @Override
    public void onInputOperation(Operation op) { this.state.onInputOperation(this, op); }

    @Override
    public void onInputEqual() {
        this.state.onInputEqual(this);
    }

    @Override
    public void onInputClear() { this.state.onInputClear(this); }

    @Override
    public void setDisp(Display disp) {
        this.disp = disp;
    }

    @Override
    public void show() {
        this.disp.show();
    }

    @Override
    public void show(Double d) {
        this.disp.show(d);
    }

    @Override
    public void add(Number num) {
        this.disp.add(num);
    }

    @Override
    public void saveNumA() {
        this.a = this.disp.getAsDouble();
    }

    @Override
    public void setNumA(Double d) { this.a = d; }

    @Override
    public void saveNumB() { this.b = this.disp.getAsDouble(); }

    @Override
    public Double eval() {
        return this.op.eval(this.a, this.b);
    }

    @Override
    public void setOp(Operation op) {
        this.op = op;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void clear() {
        this.disp.clear();
    }

    @Override
    public void clearA() {
        this.a = 0.0;
    }

    @Override
    public void clearB() {
        this.b = 0.0;
    }

    @Override
    public void clearDisp() {
        this.disp.clear();
        this.disp.show();
    }
}

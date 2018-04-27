package com.tomocy.calculator;

import com.tomocy.calculator.Displays.Display;
import com.tomocy.calculator.States.State;
import com.tomocy.calculator.Number;

public interface Context {

    void onInputNumber(Number num);

    void onInputOperation(Operation op);

    void onInputEqual();

    void onInputClear();

    void setDisp(Display disp);

    void show();

    void show(Double d);

    void add(Number num);

    void add(Double d);

    Double eval();

    void saveNumA();

    void setNumA(Double d);

    void saveNumB();

    void setOp(Operation op);

    void setState(State state);

    void clear();

    void clearA();

    void clearB();

    void clearDisp();

    Double getNumA();
}

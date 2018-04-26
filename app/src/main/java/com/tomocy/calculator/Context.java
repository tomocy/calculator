package com.tomocy.calculator;

import com.tomocy.calculator.Displays.Display;
import com.tomocy.calculator.States.State;

public interface Context {

    void onInputNumber(Number num);

    void onInputOperation(Operation op);

    void setDisp(Display disp);

    void showNum(Number num);

    void saveNumA();

    void setOp(Operation op);

    void setState(State state);
}

package com.tomocy.calculator;

import com.tomocy.calculator.Displays.Display;

public interface Context {

    void onInputOperation(Operation op);

    void setDisp(Display disp);

    void showNum(Number num);

    void saveNumA();

    void setOp(Operation op);
}

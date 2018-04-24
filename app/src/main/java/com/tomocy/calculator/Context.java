package com.tomocy.calculator;

public interface Context {

    void clear();

    void showNum(Number num);

    void saveNum();

    void setOp(Operation op);

}

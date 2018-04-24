package com.tomocy.calculator;

public interface State {

    void onInputNumber();

    void onInputOperation();

    void onInputEqual();

    void onInputClaer();

    void onInputAllClear();

}

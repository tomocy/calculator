package com.tomocy.calculator.States;

public interface State {

    void onInputNumber();

    void onInputOperation();

    void onInputEqual();

    void onInputClaer();

    void onInputAllClear();

}

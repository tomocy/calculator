package com.tomocy.calculator.Displays;

import com.tomocy.calculator.Number;

public interface Display {

    void add(Number num);

    void show();

    String get();

    Double getAsDouble();

}

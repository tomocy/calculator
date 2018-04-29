package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;
import com.tomocy.calculator.Operation;

public class CommaState implements State {

    private CommaState() {}

    public static CommaState getInstance() { return CommaStateHolder.INSTANCE; }

    private static class CommaStateHolder {
        private static final CommaState INSTANCE = new CommaState();
    }

    @Override
    public void onInputNumber(Context ctx, Number num) {

    }

    @Override
    public void onInputOperation(Context ctx, Operation op) {

    }

    @Override
    public void onInputEqual(Context ctx) {

    }

    @Override
    public void onInputClear(Context ctx) {

    }
}

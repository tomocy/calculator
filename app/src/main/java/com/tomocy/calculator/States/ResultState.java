package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;

public class ResultState implements State {

    private ResultState() {}

    public static ResultState getInstance() { return ResultStateHolder.INSTANCE; }

    private static class ResultStateHolder {
        private static final ResultState INSTANCE = new ResultState();
    }

    @Override
    public void onInputNumber(Context ctx, Number num) {

    }

    @Override
    public void onInputOperation(Context ctx) {

    }

    @Override
    public void onInputEqual(Context ctx) {

    }
}

package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;
import com.tomocy.calculator.Operation;

public class NumberAState implements State {

    private NumberAState() {}

    public static NumberAState getInstance() {
        return NumberAStateHolder.INSTANCE;
    }

    private static class NumberAStateHolder {
        private static final NumberAState INSTANCE = new NumberAState();
    }

    @Override
    public void onInputNumber(Context ctx, Number num) {
        ctx.showNum(num);
    }

    @Override
    public void onInputOperation(Context ctx, Operation op) {
    }

    @Override
    public void onInputEqual(Context ctx) {

    }

    @Override
    public void onInputClaer(Context ctx) {

    }

    @Override
    public void onInputAllClear(Context ctx) {

    }
}

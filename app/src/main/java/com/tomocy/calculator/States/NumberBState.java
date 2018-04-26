package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;

public class NumberBState implements State {

    private NumberBState() {}

    public static NumberBState getInstance() { return NumberBStateHolder.INSTANCE; }

    private static class NumberBStateHolder {
        private static final NumberBState INSTANCE = new NumberBState();
    }

    @Override
    public void onInputNumber(Context ctx, Number num) {
        ctx.add(num);
        ctx.show();
    }

    @Override
    public void onInputOperation(Context ctx) {

    }
}

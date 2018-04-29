package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;
import com.tomocy.calculator.Operation;

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
    public void onInputOperation(Context ctx, Operation op) {
        ctx.saveNumB();

        Double res = ctx.eval();

        ctx.clear();
        ctx.add(res);
        ctx.show();

        ctx.setNumA(res);
        ctx.setOp(op);

        ctx.setState(OperationState.getInstance());
    }

    @Override
    public void onInputEqual(Context ctx) {
        ctx.saveNumB();

        Double res = ctx.eval();

        ctx.clear();
        ctx.add(res);
        ctx.show();

        ctx.setState(ResultState.getInstance());
    }

    @Override
    public void onInputClear(Context ctx) {
        ctx.clearB();
        ctx.clear();
        ctx.show();
    }
}

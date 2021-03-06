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
        ctx.add(num);
        ctx.show();
    }

    @Override
    public void onInputOperation(Context ctx, Operation op) {
        ctx.setOp(op);
        ctx.saveNumA();
        ctx.setState(OperationState.getInstance());
    }

    @Override
    public void onInputEqual(Context ctx) {
        ctx.setState(ResultState.getInstance());
    }

    @Override
    public void onInputComma(Context ctx) {

    }

    @Override
    public void onInputClear(Context ctx) {
        ctx.clearA();
        ctx.resetDisp();
    }
}

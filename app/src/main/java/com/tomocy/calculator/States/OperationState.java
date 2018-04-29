package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;
import com.tomocy.calculator.Operation;

public class OperationState implements State {

    private OperationState() {}

    public static OperationState getInstance() { return OperationStateHolder.INSTANCE; }

    private static class OperationStateHolder {
        private static final OperationState INSTANCE = new OperationState();
    }

    @Override
    public void onInputNumber(Context ctx, Number num) {
        ctx.clear();
        ctx.add(num);
        ctx.show();
        ctx.setState(NumberBState.getInstance());
    }

    @Override
    public void onInputOperation(Context ctx, Operation op) {
        ctx.setOp(op);
    }

    @Override
    public void onInputEqual(Context ctx) {
        ctx.setState(ResultState.getInstance());
    }

    @Override
    public void onInputClear(Context ctx) {
        ctx.clearOp();
        ctx.setState(NumberAState.getInstance());
    }
}

package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;
import com.tomocy.calculator.Operation;

public class ResultState implements State {

    private ResultState() {}

    public static ResultState getInstance() { return ResultStateHolder.INSTANCE; }

    private static class ResultStateHolder {
        private static final ResultState INSTANCE = new ResultState();
    }

    @Override
    public void onInputNumber(Context ctx, Number num) {
        ctx.clear();
        ctx.add(num);
        ctx.show();
        ctx.setState(NumberAState.getInstance());
    }

    @Override
    public void onInputOperation(Context ctx, Operation op) {

    }

    @Override
    public void onInputEqual(Context ctx) {

    }

    @Override
    public void onInputClear(Context ctx) {
        ctx.clear();
        ctx.clearDisp();
        ctx.setState(NumberAState.getInstance());
    }
}

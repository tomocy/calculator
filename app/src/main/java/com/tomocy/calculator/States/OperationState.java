package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;

public class OperationState implements State {

    private OperationState() {}

    public static OperationState getInstance() { return OperationStateHolder.INSTANCE; }

    private static class OperationStateHolder {
        private static final OperationState INSTANCE = new OperationState();
    }

    @Override
    public void onInputNumber(Context ctx, Number num) {

    }

    @Override
    public void onInputOperation(Context ctx) {

    }
}

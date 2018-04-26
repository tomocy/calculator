package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;

public class OperationState implements State {

    private OperationState() {}

    public OperationState getInstance() { return OperationStateHolder.INSTANCE; }

    private static class OperationStateHolder {
        private static final OperationState INSTANCE = new OperationState();
    }

    @Override
    public void onInputOperation(Context ctx) {

    }
}

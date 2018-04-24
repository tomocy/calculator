package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Operation;

public interface State {

    void onInputNumber(Context ctx, Number num);

    void onInputOperation(Context ctx, Operation op);

    void onInputEqual(Context ctx);

    void onInputClaer(Context ctx);

    void onInputAllClear(Context ctx);

}

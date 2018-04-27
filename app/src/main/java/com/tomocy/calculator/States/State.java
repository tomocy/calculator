package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;
import com.tomocy.calculator.Number;

public interface State {

    void onInputNumber(Context ctx, Number num);

    void onInputOperation(Context ctx);

    void onInputEqual(Context ctx);

    void onInputClear(Context ctx);

}

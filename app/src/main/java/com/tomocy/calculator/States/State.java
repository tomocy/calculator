package com.tomocy.calculator.States;

import com.tomocy.calculator.Context;

public interface State {

    void onInputNumber(Context ctx, Number num);

    void onInputOperation(Context ctx);

    void onInputEqual(Context ctx);

    void onInputClaer(Context ctx);

    void onInputAllClear();

}

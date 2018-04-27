package com.tomocy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.tomocy.calculator.Displays.TextViewDisplay;

public class MainActivity extends AppCompatActivity {

    private Calculator calc;

    public MainActivity() {
        this.calc = new Calculator();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView = findViewById(R.id.dispTextView);
        TextViewDisplay txtViewDisp = new TextViewDisplay(txtView);
        this.calc.setDisp(txtViewDisp);
    }

    public void onClickButton(View view) {
        switch (view.getId()) {
            case R.id.num0Btn:
                this.calc.onInputNumber(Number.ZERO);
                break;
            case R.id.num1Btn:
                this.calc.onInputNumber(Number.ONE);
                break;
            case R.id.num2Btn:
                this.calc.onInputNumber(Number.TWO);
                break;
            case R.id.num3Btn:
                this.calc.onInputNumber(Number.THREE);
                break;
            case R.id.num4Btn:
                this.calc.onInputNumber(Number.FOUR);
                break;
            case R.id.num5Btn:
                this.calc.onInputNumber(Number.FIVE);
                break;
            case R.id.num6Btn:
                this.calc.onInputNumber(Number.SIX);
                break;
            case R.id.num7Btn:
                this.calc.onInputNumber(Number.SEVEN);
                break;
            case R.id.num8Btn:
                this.calc.onInputNumber(Number.EIGHT);
                break;
            case R.id.num9Btn:
                this.calc.onInputNumber(Number.NINE);
                break;
            case R.id.opDivideBtn:
                this.calc.onInputOperation(Operation.DIVIDE);
                break;
            case R.id.opTimesBtn:
                this.calc.onInputOperation(Operation.TIMES);
                break;
            case R.id.opMinusBtn:
                this.calc.onInputOperation(Operation.MINUS);
                break;
            case R.id.opPlusBtn:
                this.calc.onInputOperation(Operation.PLUS);
                break;
            case R.id.equalBtn:
                this.calc.onInputEqual();
                break;
            case R.id.clearBtn:
                this.calc.onInputClear();
                break;
            default:
                Log.d("onClickButton", "Default");
        }
    }
}

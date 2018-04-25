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
            case R.id.num7Btn:
                this.calc.showNum(Number.SEVEN);
                break;
            case R.id.num8Btn:
                this.calc.showNum(Number.EIGHT);
            case R.id.opDivideBtn:
                this.calc.onInputOperation(Operation.DIVIDE);
            case R.id.opTimesBtn:
                this.calc.onInputOperation(Operation.TIMES);
            case R.id.opMinusBtn:
                this.calc.onInputOperation(Operation.MINUS);
            case R.id.opPlusBtn:
                this.calc.onInputOperation(Operation.PLUS);
            default:
                Log.d("onClickButton", "Default");
        }
    }
}

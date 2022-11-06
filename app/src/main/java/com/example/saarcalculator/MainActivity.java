package com.example.saarcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button num0, num1, num2, num3, num4, num5, num6,
            num7, num8, num9, plus, minus, divide,
            multiply, clear, equal;
    EditText saarEditText;
    float valueOne, valueTwo;
    boolean mPlus, mMinus, mMultiply, mDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        clear = (Button) findViewById(R.id.clear);
        equal = (Button) findViewById(R.id.equal);
        saarEditText = (EditText) findViewById(R.id.edt1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText(saarEditText.getText() + "0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saarEditText == null) {
                    saarEditText.setText("");
                } else {
                    valueOne = Float.parseFloat(saarEditText.getText() + "");
                    mPlus = true;
                    saarEditText.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(saarEditText.getText() + "");
                mMinus = true;
                saarEditText.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(saarEditText.getText() + "");
                mMultiply = true;
                saarEditText.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(saarEditText.getText() + "");
                mDivide = true;
                saarEditText.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(saarEditText.getText() + "");
                if (mPlus == true) {
                    saarEditText.setText(valueOne + valueTwo + "");
                    mPlus = false;
                }
                if (mMinus == true) {
                    saarEditText.setText(valueOne - valueTwo + "");
                    mMinus = false;
                }
                if (mMultiply == true) {
                    saarEditText.setText(valueOne * valueTwo + "");
                    mMultiply = false;
                }
                if (mDivide == true) {
                    saarEditText.setText(valueOne / valueTwo + "");
                    mDivide = false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saarEditText.setText("");
            }
        });
    }
}
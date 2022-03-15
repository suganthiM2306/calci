package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etn1;
    private EditText etn2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       etn1 = ( EditText )findViewById(R.id.etn1);
        etn2 = (EditText) findViewById(R.id.etn2);
        result = (TextView) findViewById(R.id.result);
    }


    public void add(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1+n2;
        result.setText(String.valueOf(sum));
    }

    public void div(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int div = n1/n2;
        result.setText(String.valueOf(div));
    }

    public void mul(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int mul = n1*n2;
        result.setText(String.valueOf(mul));
    }

    public void sub(View view) {
        int n1 = Integer.parseInt((etn1.getText().toString()));
        int n2 = Integer.parseInt((etn2.getText().toString()));
        int sub = n1-n2;
        result.setText(String.valueOf(sub));
    }
}
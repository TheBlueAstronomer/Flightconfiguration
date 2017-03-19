package com.antares.jeff.flightconfiguration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(View v) {
        int A, e, b, f, E, B, F, T = 0;
        String res;
        EditText text1 = (EditText) findViewById(R.id.editText);
        EditText text2 = (EditText) findViewById(R.id.editText2);
        EditText text3 = (EditText) findViewById(R.id.editText3);
        EditText text4 = (EditText) findViewById(R.id.editText4);
        A = Integer.parseInt(text1.getText().toString());
        e = Integer.parseInt(text2.getText().toString());
        b = Integer.parseInt(text3.getText().toString());
        f = Integer.parseInt(text4.getText().toString());

        T = e + (2 * b) + (4 * f);
        E = (A * e) / T;
        B = (A * b) / T;
        F = (A * f) / T;

        res = "Economy =" + E + "\nBusiness class =" + B + "\nFirst class =" + F;

        TextView result = (TextView) findViewById(R.id.textView5);
        result.setText(res);

    }

}

package com.example.prog2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        tv1=findViewById(R.id.textView1);
    }
    @SuppressLint("SetTextI18n")
    public void add(View view)
    {
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int result=a1+a2;
        tv1.setText(""+result);
    }
    @SuppressLint("SetTextI18n")
    public void sub(View view)
    {
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int result=a1-a2;
        tv1.setText(""+result);
    }
    @SuppressLint("SetTextI18n")
    public void mul(View view)
    {
        int a1=Integer.parseInt(e1.getText().toString());
        int a2=Integer.parseInt(e2.getText().toString());
        int result=a1*a2;
        tv1.setText(""+result);
    }
    @SuppressLint("SetTextI18n")
    public void div(View view) {
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        int result = a1 / a2;
        tv1.setText("" + result);
    }
}
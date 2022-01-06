package com.example.shapes_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class elipse_calculator extends AppCompatActivity {
    EditText bx;
    EditText ax;
    TextView res;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elipse_calculator);
        bx = (EditText)findViewById(R.id.b);
        ax = (EditText)findViewById(R.id.a);
        res = (TextView)findViewById(R.id.res);
        btn =findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(ax.getText().toString());
                double b = Double.parseDouble(bx.getText().toString());
                double area = Math.PI*a*b;
                res.setText(Double.toString(area));
            }
        });
    }
}
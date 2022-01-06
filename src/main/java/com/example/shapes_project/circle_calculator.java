package com.example.shapes_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class circle_calculator extends AppCompatActivity {
    EditText r;
    TextView res;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_calculator);
        r = (EditText)findViewById(R.id.r) ;
        res = (TextView)findViewById(R.id.res);
        btn =findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Double.parseDouble(r.getText().toString());
                double area = Math.PI* Math.pow(radius,2) ;
                res.setText(Double.toString(area));
            }
        });
    }
}
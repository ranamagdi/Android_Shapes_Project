package com.example.shapes_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class rectangle_calculator extends AppCompatActivity {
    EditText l;
    EditText w;
    TextView res;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_calculator);
            l = (EditText)findViewById(R.id.l);
            w = (EditText)findViewById(R.id.w);
            res = (TextView)findViewById(R.id.res);
            btn =findViewById(R.id.button);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double length = Double.parseDouble(l.getText().toString());
                    double width = Double.parseDouble(w.getText().toString());
                    double area = length*width;
                    res.setText(Double.toString(area));
                }
            });

        }
    }


package com.example.shapes_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Triangle_calculator extends AppCompatActivity {
    EditText b;
    EditText h;
    TextView r;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_calculator);
        b = (EditText)findViewById(R.id.b);
        h = (EditText)findViewById(R.id.h);
        r = (TextView)findViewById(R.id.r);
        btn =findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double base = Double.parseDouble(b.getText().toString());
                double height = Double.parseDouble(h.getText().toString());
                double area = 0.5*base*height;
                r.setText(Double.toString(area));
            }
        });

    }
}

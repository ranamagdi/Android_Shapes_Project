package com.example.shapes_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp = findViewById(R.id.spinner1);
        ArrayList <String> shapes=new ArrayList<>();
        shapes.add(0,"choose shape");
        shapes.add("Rectangle");
        shapes.add("Triangle");
        shapes.add("Circle");
        shapes.add("Ellipse");

        ArrayAdapter<String>dataAdapter;
        dataAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,shapes);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(dataAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if(adapterView.getItemAtPosition(position).equals("choose shape")){


                }
                else {
                    String item=adapterView.getItemAtPosition(position).toString();
                    Toast.makeText(adapterView.getContext(),"Selected:"+item, Toast.LENGTH_SHORT).show();

                    if(adapterView.getItemAtPosition(position).equals("Ellipse")){
                        Intent intent=new Intent(MainActivity.this,elipse_calculator.class);
                        startActivity(intent);
                    }
                    else if(adapterView.getItemAtPosition(position).equals("Rectangle")){
                        Intent intent=new Intent(MainActivity.this,rectangle_calculator.class);
                        startActivity(intent);
                    }
                    else if(adapterView.getItemAtPosition(position).equals("Circle")){
                        Intent intent=new Intent(MainActivity.this,circle_calculator.class);
                        startActivity(intent);
                    }
                    else if(adapterView.getItemAtPosition(position).equals("Triangle")){
                        Intent intent=new Intent(MainActivity.this,Triangle_calculator.class);
                        startActivity(intent);
                    }


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


}
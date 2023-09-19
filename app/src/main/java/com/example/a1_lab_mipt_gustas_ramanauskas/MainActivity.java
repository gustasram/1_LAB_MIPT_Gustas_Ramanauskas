package com.example.a1_lab_mipt_gustas_ramanauskas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btnTextChange;
    Button btnColorChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        btnTextChange = (Button) findViewById(R.id.btnTextChange);
        btnColorChange = (Button) findViewById(R.id.btnColorChange);

        btnTextChange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv.setText("Mygtukas yra paspaustas");
            }
        });

        btnColorChange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setTextSize(30); 
                tv.setTextColor(Color.parseColor("#FF0000"));
            }
        });
    }
}

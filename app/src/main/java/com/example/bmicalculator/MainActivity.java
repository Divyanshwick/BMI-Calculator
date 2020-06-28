package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bmi;
    private EditText w,h;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmi=(Button)findViewById(R.id.btn);
        w=(EditText)findViewById(R.id.weight);
        h=(EditText)findViewById(R.id.height);
        result=(TextView)findViewById(R.id.result);



    }
    public void BMI(View view){
        Double n1=Double.parseDouble(h.getText().toString());
        Double n2=Double.parseDouble(w.getText().toString());
        Double n3=n1/100;//height in meters
        Double res = (n2/(n3*n3));
        result.setText(res.toString());



    }


}

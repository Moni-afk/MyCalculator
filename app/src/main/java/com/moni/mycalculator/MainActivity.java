package com.moni.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText etNum1,etNum2;
    Button btnPlus,btnMinus,btnMulti,btnDiv,btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult=findViewById(R.id.txt_result);
        etNum1=findViewById(R.id.et_number1);
        etNum2=findViewById(R.id.et_number2);
        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMulti=findViewById(R.id.btn_mul);
        btnDiv=findViewById(R.id.btn_div);
        btnReset=findViewById(R.id.btn_reset);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNum1.getText().toString();
                String number2=etNum2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No chalaki.Number input de", Toast.LENGTH_SHORT).show();
                }
             else{
                 Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);
                    double result=value1+value2;
                    //""+dile string e convert hobe
                    txtResult.setText(""+result);

                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNum1.getText().toString();
                String number2=etNum2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No chalaki.Number input de", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);
                    double result=value1-value2;
                    //""+dile string e convert hobe
                    txtResult.setText(""+result);

                }
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNum1.getText().toString();
                String number2=etNum2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No chalaki.Number input de", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);
                    double result=value1*value2;
                    //""+dile string e convert hobe
                    txtResult.setText(""+result);

                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNum1.getText().toString();
                String number2=etNum2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty()){
                    Toast.makeText(MainActivity.this, "No chalaki.Number input de", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);
                    double result=value1/value2;
                    //""+dile string e convert hobe
                    txtResult.setText(""+result);

                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("0");
                etNum1.setText("");
                etNum2.setText("");

            }
        });

    }

   //this is update



}

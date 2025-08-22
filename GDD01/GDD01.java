package com.daniel.gd101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GDD01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnComputer = (Button)findViewById(R.id.btnCompute);
        btnComputer.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText etMoney = (EditText)findViewById(R.id.etMoney);
                EditText etRate = (EditText)findViewById(R.id.etRate);
                EditText etNumber = (EditText)findViewById(R.id.etNumber);
                TextView tvResult = (TextView)findViewById(R.id.tvResult);

                int money = Integer.parseInt(etMoney.getText().toString());
                double mRate = Integer.parseInt(etRate.getText().toString())/100.0/12;
                int number = Integer.parseInt(etNumber.getText().toString());
                int sum = (int)(money*Math.pow(mRate + 1, number));

                String msg = getString(R.string.result) + sum;
                tvResult.setText(msg);
            }
        });
    }
}

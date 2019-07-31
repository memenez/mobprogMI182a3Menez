package com.example.milestokilometersconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioSelect;
    RadioButton radioSelButton;


    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.button);
        btnClick.setOnClickListener(MainActivity.this);
    }
    public void onClick(View v){
        radioSelect = (RadioGroup) findViewById(R.id.radioSel);
        int selectedId = radioSelect.getCheckedRadioButtonId();
        Log.d("myTag", String.valueOf(selectedId));
        radioSelButton = (RadioButton) findViewById(selectedId);

        if(selectedId == 2131165268){
            double convResult = 0.0;
            String getconvNum = ((EditText) findViewById(R.id.convNum)).getText().toString();

            try {
                double convVal = Double.parseDouble(getconvNum);
                convResult = convVal / 1.60934;
                ((TextView) findViewById(R.id.textView5)).setText(String.valueOf("Equivalent Distance in Miles is:"));
                ((TextView) findViewById(R.id.displayRes)).setText(String.valueOf(convResult));
                Log.d("myTag", "Convert Kilometers");
                Toast.makeText(MainActivity.this,
                        radioSelButton.getText(), Toast.LENGTH_SHORT).show();
                Log.d("myTag", "Toasty");


            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if (selectedId == 2131165187){
            double convResult = 0.0;
            String getconvNum = ((EditText) findViewById(R.id.convNum)).getText().toString();

            try {
                double convVal = Double.parseDouble(getconvNum);
                convResult = convVal * 1.60934;
                ((TextView) findViewById(R.id.textView5)).setText(String.valueOf("Equivalent Distance in Kilometers is:"));
                ((TextView) findViewById(R.id.displayRes)).setText(String.valueOf(convResult));
                Log.d("myTag", "Convert Miles");
                Toast.makeText(MainActivity.this,
                        radioSelButton.getText(), Toast.LENGTH_SHORT).show();
                Log.d("myTag", "Toasty");


            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

}

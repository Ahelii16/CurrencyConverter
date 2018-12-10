package com.example.aheli.myapplication;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void pound(View view){
        EditText rupee = (EditText) findViewById(R.id.rupeeVal);
        //float rupee_float = Float.valueOf(rupee.getText().toString());
        //float pound = rupee_float*80;
        Log.i( "Rs. : ", rupee.getText().toString());

        String rupees = rupee.getText().toString();
        Double rupee_double = Double.parseDouble(rupees);
        Double pounds = rupee_double*80;

        String poundString = String.format("%.2f", pounds);
        Log.i("pound: ", poundString);

        Toast.makeText(this, rupees + "in pounds is: " + poundString, Toast.LENGTH_LONG).show();
    }
    public void euro(View view){
        EditText rupee = (EditText) findViewById(R.id.rupeeVal);
        Log.i( "Rs. : ", rupee.getText().toString());

        String rupees = rupee.getText().toString();
        Double rupee_double = Double.parseDouble(rupees);
        Double euro = rupee_double*87.97;

        String euroString = String.format("%.2f", euro);
        Log.i("Euro: ", euroString);

        Toast.makeText(this, rupees + "in Euro is: " + euroString, Toast.LENGTH_LONG).show();
    }
    public void dollar(View view){
        EditText rupee = (EditText) findViewById(R.id.rupeeVal);
        Log.i( "Rs. : ", rupee.getText().toString());

        String rupees = rupee.getText().toString();
        Double rupee_double = Double.parseDouble(rupees);
        Double dollar = rupee_double*72.45;

        String dollarString = String.format("%.2f", dollar);
        Log.i("dollars: ", dollarString);

        Toast.makeText(this, rupees + "in USD is: " + dollarString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
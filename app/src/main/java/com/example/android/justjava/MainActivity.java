package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        display(1);
        displayPrice(1);
    }

    private void displayPrice(int i) {

    }

    private void display(int i) {
        TextView counterView = (TextView) findViewById(R.id.counterValue);
        counterView.setText("" + i);
    }

    public void increment(View view) {
        int quantity = 3;
        display(quantity);
    }

    public void decrement(View view) {
        int quantity = 1;
        display(quantity);
    }
}

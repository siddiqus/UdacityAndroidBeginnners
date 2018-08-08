package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        setQuantity(quantity);
        setPrice(quantity * 5);
    }

    private void setText(int id, String text) {
        final TextView counterView = findViewById(id);
        counterView.setText(text);
    }

    private void setQuantity(int i) {
        setText(R.id.counterValue, Integer.toString(i));
    }

    private void setPrice(int i) {
        final String priceString = NumberFormat.getCurrencyInstance().format(i);
        setText(R.id.priceValue, priceString);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        setQuantity(quantity);
    }

    public void decrement(View view) {
        if (quantity == 0) return;
        quantity = quantity - 1;
        setQuantity(quantity);
    }
}

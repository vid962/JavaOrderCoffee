package com.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity=0;
    int price=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.price_text_view);
        orderSummaryTextView.setText(message);
    }



    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
    int priceOrder=price*quantity;
    String priceMessage= "Total: $"+priceOrder;
    priceMessage=priceMessage+"\n\nThank You!";

    displayMessage(priceMessage);

    }

    /**
     * This method is called when you want increase the amount of order
     */
    public void increment(View view){

                quantity=quantity+1;

        display(quantity);
    }
    /**
     * This method is called when you want decrease the amount of order
     */
    public void decrement(View view){

        quantity=quantity-1;

        display(quantity);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
}
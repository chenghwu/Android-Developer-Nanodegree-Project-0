package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Common function to handle all button clicks for showing toast message
     * @param view
     */
    public void showToast(View view) {
        // Switch based on button ID
        switch (view.getId()) {
            case R.id.popular_movies:
            case R.id.stock_hawk:
            case R.id.build_it_bigger:
            case R.id.make_your_app_material:
            case R.id.go_ubiquitous:
            case R.id.capstone:
                displayToast("This button will launch " +
                             ((Button) view).getText().toString()
                             + " app!");
                break;

            default:
                break;
        }
    }


    // Declare as class variable
    private Toast myAppToast;

    /**
     * Display toast message
     * @param message
     */
    public void displayToast(String message) {
        // Stop any previous toasts
        if (myAppToast != null) {
            myAppToast.cancel();
        }

        // Make and display new toast
        myAppToast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        myAppToast.show();
    }

}

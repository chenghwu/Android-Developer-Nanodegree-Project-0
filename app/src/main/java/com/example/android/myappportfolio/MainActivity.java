package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches the button
     */
    public void startSpotifyStreamer(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify Streamer app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /**
     * Common function to handle all button clicks for showing toast message
     * @param view
     */
    public void showToast(View view) {
        // Switch based on button ID
        switch (view.getId()) {
            case R.id.media_streamer:
            case R.id.super_duo1:
            case R.id.super_duo2:
            case R.id.ant_terminator:
            case R.id.materialize:
            case R.id.capstone:
                displayToast(((Button) view).getText().toString());
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

package com.bsdsolutions.sanjaydixit.myappportfolio;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mToastText;
    private static final String TAG = "MyAppPortfolio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void init() {
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonSelected(1);
                displayMessage(getString(R.string.spotifyStreamerToast));
            }
        });
        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonSelected(1);
                displayMessage(getString(R.string.scoresAppToast));
            }
        });
        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonSelected(1);
                displayMessage(getString(R.string.libraryAppToast));
            }
        });
        button = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonSelected(1);
                displayMessage(getString(R.string.buildItBiggerToast));
            }
        });
        button = (Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonSelected(1);
                displayMessage(getString(R.string.xYZReaderToast));
            }
        });
        button = (Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonSelected(1);
                displayMessage(getString(R.string.capstoneToast));
            }
        });

        mToastText = Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT);
    }

    private void resetButtonColors() {
        Button button = (Button)findViewById(R.id.button1);
        button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorButton));
        button = (Button)findViewById(R.id.button2);
        button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorButton));
        button = (Button)findViewById(R.id.button3);
        button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorButton));
        button = (Button)findViewById(R.id.button4);
        button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorButton));
        button = (Button)findViewById(R.id.button5);
        button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorButton));
        button = (Button)findViewById(R.id.button6);
        button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorButton));
    }

    private void updateButtonSelected(int buttonNumber) {
/*
        resetButtonColors();
        Button button = null;

        switch(buttonNumber) {
            case 1:
                button = (Button)findViewById(R.id.button1);
                break;
            case 2:
                button = (Button)findViewById(R.id.button2);
                break;
            case 3:
                button = (Button)findViewById(R.id.button3);
                break;
            case 4:
                button = (Button)findViewById(R.id.button4);
                break;
            case 5:
                button = (Button)findViewById(R.id.button5);
                break;
            case 6:
                button = (Button)findViewById(R.id.button6);
                break;
            default:
                break;
        }

        if(button != null)
        {
            button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.colorButtonSelected));
        }
*/

    }

    private void displayMessage(final String message) {
        mToastText.setText(message);
        mToastText.show();
    }

}

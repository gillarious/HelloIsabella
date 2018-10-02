package com.example.isabella.helloisabella;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Isabella", "Button clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Isabella", "Button 2 clicked");
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Isabella", "Button 3 clicked");
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Isabella!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Isabella", "Button 4 clicked");
                ((TextView) findViewById(R.id.textView)).setText("Goodbye!");
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.originalGreen));
                ((TextView) findViewById(R.id.textView)).setText("Hello from Isabella!");
            }
        });
    }
}

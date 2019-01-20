package com.example.lateph.ocha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("penting", "hallo");
            }
        });

        final Button b = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("penting", "hallo");
            }
        });

        final Button c = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.i("penting", "hallo");
            }
        });
    }
}

package com.nelumbo.pbs2h17age.testen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView logo = findViewById(R.id.text);

        Button start = findViewById(R.id.buttonstart);
        Button stop = findViewById(R.id.buttonstop);
        
    }
}

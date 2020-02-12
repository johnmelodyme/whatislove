package com.johnmelodyme.youaremyeverything;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * @Author: John Melody Melissa
 * @MADEFOR: SIN DEE <3
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Love";
    private TextView MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting application......");
        MESSAGE = findViewById(R.id.message);

    }
}

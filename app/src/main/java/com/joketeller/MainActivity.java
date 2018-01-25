package com.joketeller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.JokeSmith;
import com.example.JokeWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.text_view1)).setText(new JokeSmith().getJoke());
        ((TextView) findViewById(R.id.textView2)).setText(new JokeWizard().getJoke());
    }
}

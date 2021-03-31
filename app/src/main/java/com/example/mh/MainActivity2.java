package com.example.mh;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView remsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        remsg = (TextView)findViewById(R.id.rcv);
        Intent intent = getIntent();
        if (intent.hasExtra("message")&& null!=intent.getExtras()) {
            String str = intent.getStringExtra("message");
            remsg.setText(str);
        }
    }
}
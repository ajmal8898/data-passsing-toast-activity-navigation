package com.example.mh;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;


public class MainActivity extends AppCompatActivity {
    Button sndbutt;
   EditText sndtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sndbutt = (Button)findViewById(R.id.btn);
        sndtxt = (EditText)findViewById(R.id.txtname);

       sndbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(sndtxt.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "login sucess..",
                            Toast.LENGTH_SHORT).show();
                    String str = sndtxt.getText().toString();
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    intent.putExtra("message", str);
                    startActivity(intent);
                }

            }
        });
    }
}
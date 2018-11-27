package com.example.a.basic2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn2;
    TextView tv;

    Random rnd=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn2=(Button) findViewById(R.id.btn2);
        tv=(TextView) findViewById(R.id.tv);
    }

    public void cretnumber(View view) {
        int x=rnd.nextInt();
                tv.setText("number "+x);

    }

    public void cancnumber(View view) {
        tv.setText("number not found");
    }
}

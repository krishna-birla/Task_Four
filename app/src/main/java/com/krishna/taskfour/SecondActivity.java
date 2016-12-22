package com.krishna.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.krishna.taskfour.MainActivity.f;

public class SecondActivity extends AppCompatActivity {

    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();

        String tv1 = intent.getExtras().getString("location1");
        String tv2 = intent.getExtras().getString("location2");

        tv1 = "Name: " + tv1;
        tv2 = "Age: " + tv2;

        textView2.setText(tv1);
        textView3.setText(tv2);

        if(f==1) {
            Toast.makeText(getApplicationContext(), "Details Saved Successfully", Toast.LENGTH_SHORT).show();
            f = 0;
        }
    }
}

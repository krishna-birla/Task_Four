package com.krishna.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText editText;
    private EditText editText2;
    public static int f=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        editText.setText("");
        editText2.setText("");

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){

        if(editText.getText().toString().equals("") || editText2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Fields with * are mandatory\n\t\t\t\t\t\t\t\tTry Again", Toast.LENGTH_LONG).show();
            editText.setText("");
            editText2.setText("");
        }
        else {
            f=1;
            Intent intent = new Intent(this, SecondActivity.class);
            String a1 = editText.getText().toString();
            String a2 = editText2.getText().toString();

            intent.putExtra("location1", a1);
            intent.putExtra("location2", a2);

            startActivity(intent);
        }
    }
}

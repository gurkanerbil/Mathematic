package com.erbil.libraryex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.erbil.mathematic.Mathematic;

public class MainActivity extends AppCompatActivity {

    Mathematic mathematic;
    EditText editText;
    EditText editText2;
    TextView textView;
    Button button;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button4);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button);

        mathematic = new Mathematic();

        mathematic.onAttach(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.length() > 0 && editText2.length() > 0) {
                    mathematic.toast(mathematic.topla(editText.getText().toString(), editText2.getText().toString()));
                    textView.setText(String.valueOf(mathematic.topla(editText.getText().toString(), editText2.getText().toString())));
                } else {
                    Toast.makeText(MainActivity.this, "Boş bırakma hacı.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.length() > 0 && editText2.length() > 0) {
                    mathematic.toast(mathematic.cikar(editText.getText().toString(), editText2.getText().toString()));
                    textView.setText(String.valueOf(mathematic.cikar(editText.getText().toString(), editText2.getText().toString())));
                } else {
                    Toast.makeText(MainActivity.this, "Boş bırakma hacı.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.length() > 0 && editText2.length() > 0) {
                    mathematic.toast(mathematic.carp(editText.getText().toString(), editText2.getText().toString()));
                    textView.setText(String.valueOf(mathematic.carp(editText.getText().toString(), editText2.getText().toString())));
                } else {
                    Toast.makeText(MainActivity.this, "Boş bırakma hacı.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.length() > 0 && editText2.length() > 0) {
                    mathematic.toast(mathematic.bol(editText.getText().toString(), editText2.getText().toString()));
                    textView.setText(String.valueOf(mathematic.bol(editText.getText().toString(), editText2.getText().toString())));
                } else {
                    Toast.makeText(MainActivity.this, "Boş bırakma hacı.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

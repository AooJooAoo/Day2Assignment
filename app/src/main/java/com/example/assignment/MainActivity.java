package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText editName = findViewById(R.id.name);
                String name = editName.getText().toString();
                
                EditText editNum = findViewById(R.id.studentNumber);
                String stuNum = editNum.getText().toString();
                /*
                Uri nameU, stuNumU;
                nameU = Uri.parse(name);
                stuNumU = Uri.parse(stuNum);
                */
                Intent ok = new Intent(MainActivity.this, Second.class);
                ok.putExtra("name", name);
                ok.putExtra("studentNumber", stuNum);
                startActivity(ok);
            }
        });
    }
}
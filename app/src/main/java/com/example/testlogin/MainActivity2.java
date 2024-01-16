package com.example.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    EditText txt1,txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.button);
        txt1=findViewById(R.id.editTextTextPersonName);
        txt2=findViewById(R.id.editTextTextPassword);

        SharedPreferences pref=getSharedPreferences("myfile", Context.MODE_PRIVATE);
        boolean b=pref.getBoolean("is_regi",false);
        if (b)
        {
            Intent intent=new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intent);
            finish();

        }

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String name=txt1.getText().toString();
                String password=txt2.getText().toString();

                SharedPreferences pref=getSharedPreferences("myfile", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed=pref.edit();
                ed.putString("name",name);
                ed.putString("password",password);
                ed.putBoolean("is_regi" ,true);
                ed.apply();
                Toast.makeText(MainActivity2.this, "Data saved", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);




            }
        });

    }
}

package com.example.testlogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.id1)
        {
            Toast.makeText(this, "selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else {
            if (item.getItemId()==R.id.icon12)
            {
                Toast.makeText(this, "your account are logout :"+item.getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
                finish();

            }

        }
//        else if (item.getItemId()==R.id.submenu1)
//        {
//            Toast.makeText(this, "selected :"+item.getTitle(), Toast.LENGTH_SHORT).show();
//        }
        return super.onOptionsItemSelected(item);
    }

}
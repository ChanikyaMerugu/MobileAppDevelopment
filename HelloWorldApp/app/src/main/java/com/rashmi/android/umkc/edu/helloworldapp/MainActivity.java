package com.rashmi.android.umkc.edu.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View v){

        EditText a = (EditText)findViewById(R.id.editText);
        String user = a.getText().toString();

        EditText b = (EditText)findViewById(R.id.editText3);
        String pwd = b.getText().toString();

        if(user.equals("admin")&&pwd.equals("admin")){
            Intent i = new Intent(MainActivity.this,home.class);
            startActivity(i);
        }
        else if(user.equals("")&&pwd.equals("")){
            Toast tem = Toast.makeText(MainActivity.this,"fields are empty",Toast.LENGTH_SHORT);
            tem.show();
        }
        else{
            Toast term = Toast.makeText(MainActivity.this,"Invalid credentials",Toast.LENGTH_SHORT);
            term.show();
        }

    }


}

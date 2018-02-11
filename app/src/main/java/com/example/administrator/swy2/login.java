package com.example.administrator.swy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void buclick(View view){
        EditText usertxt=(EditText)findViewById(R.id.lusername);
        EditText passtxt=(EditText)findViewById(R.id.lpassword);
        Intent myintent=new Intent(this,register.class);

        Bundle b=new Bundle();
        b.putString("username",usertxt.getText().toString());
        b.putString("password",passtxt.getText().toString());
        myintent.putExtras(b);

        //myintent.putExtra("username",usertxt.getText().toString());
        //myintent.putExtra("password",passtxt.getText().toString());

        startActivity(myintent);


    }
}

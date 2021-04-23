package com.erp.payrocket;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Toaster(String msg){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

    public void pressme(View view){
        Intent secondScreen = new Intent(this, Home.class);
        EditText editTextusername = findViewById(R.id.editTextTextuserN);
        EditText editTextaddress = findViewById(R.id.editTextTextPassword);

        String userName = editTextusername.getText().toString();
        String userPass = editTextaddress.getText().toString();

        if(userName.equals("admin") && userPass.equals("admin")){

            startActivity(secondScreen);
        }
        else {
            Toaster("Incorrect User or Pass");
        }


    }

    public void forgotCred(View view){
        Intent forgotScreen = new Intent(this, forgot.class);
        startActivity(forgotScreen);
    }


}
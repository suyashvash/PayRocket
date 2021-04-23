package com.erp.payrocket;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class payementDone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payement_done);



        Intent Payscreen = getIntent();

        ImageView rocket = findViewById(R.id.imageView11);



        ObjectAnimator animatorR = ObjectAnimator.ofFloat(rocket,"rotation",0f,360f);
        animatorR.setDuration(500);

        animatorR.start();





        if(Payscreen.getStringExtra(PaymentScreen.source).equals("payScreen")){

        String Name = Payscreen.getStringExtra(PaymentScreen.RName);
        String Num = Payscreen.getStringExtra(PaymentScreen.Rnum);
        String Amount = Payscreen.getStringExtra(PaymentScreen.RAmnt);
        String Message = Payscreen.getStringExtra(PaymentScreen.RMsg);

        TextView AmntTxt = findViewById(R.id.amnt);
        TextView RecName = findViewById(R.id.RecNum);
        TextView RecMSg = findViewById(R.id.RecMsg);


        AmntTxt.setText(Amount);
        RecName.setText(Name);
        RecMSg.setText(Message);
        }

        else if(Payscreen.getStringExtra(PaymentScreen.source).equals("feesScreen")){
            String Name = Payscreen.getStringExtra(feePay.RName);

            String Amount = Payscreen.getStringExtra(feePay.RAmnt);
            String Message = Payscreen.getStringExtra(feePay.RMsg);

            TextView AmntTxt = findViewById(R.id.amnt);
            TextView RecName = findViewById(R.id.RecNum);
            TextView RecMSg = findViewById(R.id.RecMsg);


            AmntTxt.setText(Amount);
            RecName.setText(Name);
            RecMSg.setText(Message);

        }
    }




}
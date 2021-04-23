package com.erp.payrocket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentScreen extends AppCompatActivity {

    public static  final String source = "Pay";
    public static final String RName = "Name";
    public static final String Rnum = "Number";
    public static final String RAmnt = "Amount";
    public static final String RMsg = "Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_screen);
    }

    public void Toaster(String arg){
        Context context = getApplicationContext();
        CharSequence text = arg;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void doPayment(View view){

        EditText recName = findViewById(R.id.recName);
        EditText recNum = findViewById(R.id.recNum);
        EditText recAmount = findViewById(R.id.recAmount);
        EditText recMsg = findViewById(R.id.recMsg);

        String Name = recName.getText().toString();
        String Number = recNum.getText().toString();

        String Amount = recAmount.getText().toString();
        String FormattedAmt = "Rs. "+ Amount;
        String Msg = recMsg.getText().toString();
        String FormattedMsg = '"'+ Msg +'"';

        if(Name.equals("") || Number.equals("") || Amount.equals("")){
            Toaster("Please fill All the Fields !");
        }
        else{


            Intent payDone = new Intent(this, payementDone.class);

            recNum.setText("");
            recAmount.setText("");
            recMsg.setText("");
            recName.setText("");

            payDone.putExtra(source,"payScreen");
            payDone.putExtra(RName, Name);
            payDone.putExtra(RAmnt, FormattedAmt);
            payDone.putExtra(Rnum,Number);
            payDone.putExtra(RMsg, FormattedMsg);
            startActivity(payDone);
        }






    }
}
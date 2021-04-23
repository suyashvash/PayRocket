package com.erp.payrocket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class feePay extends AppCompatActivity {
    public static  final String source = "Pay";
    public static final String RName = "Name";
    public static final String Rnum = "Number";
    public static final String RAmnt = "Amount";
    public static final String RMsg = "Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_pay);
    }

    public void Toaster(String arg){
        Context context = getApplicationContext();
        CharSequence text = arg;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void feePay(View view){

        EditText schoolName = findViewById(R.id.schoolName);
        EditText schoolNumber = findViewById(R.id.schoolNumber);
        EditText fees = findViewById(R.id.fees);
        EditText studentName = findViewById(R.id.studentName);

        String Name = schoolName.getText().toString();
        String Number = schoolNumber.getText().toString();

        String Amount = fees.getText().toString();
        String FormattedAmt = "Rs. "+ Amount;
        String Studentname = studentName.getText().toString();


        if(Name.equals("") || Number.equals("") || Amount.equals("") || Studentname.equals("")){
            Toaster("Please fill All the Fields !");
        }
        else{


            Intent feesDone = new Intent(this, payementDone.class);

            schoolName.setText("");
            schoolNumber.setText("");
            fees.setText("");
            studentName.setText("");

            feesDone.putExtra(source,"feesScreen");
            feesDone.putExtra(RName, Name);

            feesDone.putExtra(RAmnt, FormattedAmt);
            feesDone.putExtra(RMsg, Studentname);
            startActivity(feesDone);


        }






    }
}
package com.erp.payrocket.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import com.erp.payrocket.Passbook;
import com.erp.payrocket.PaymentScreen;
import com.erp.payrocket.R;
import com.erp.payrocket.feePay;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment  {



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Button button = (Button) root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent payment = new Intent(HomeFragment.this.getActivity(), PaymentScreen.class);
                startActivity(payment);
            }
        });


        Button passbutton = (Button) root.findViewById(R.id.passbook);
        passbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent pb = new Intent(HomeFragment.this.getActivity(), Passbook.class);
                startActivity(pb);
            }
        });


        Button feesBtton = (Button) root.findViewById(R.id.button5);
        feesBtton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent pb = new Intent(HomeFragment.this.getActivity(), feePay.class);
                startActivity(pb);
            }
        });




        ConstraintLayout movie = root.findViewById(R.id.movieBook);
        movie.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),"Booking Movies will be Added soon !",Toast.LENGTH_SHORT).show();
            }
        });

        ConstraintLayout travel = root.findViewById(R.id.travel);
        travel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),"Booking Travel will be Added soon !",Toast.LENGTH_SHORT).show();
            }
        });

        ConstraintLayout food = root.findViewById(R.id.orderFood);
        food.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),"Ordering Food will be Added soon !",Toast.LENGTH_SHORT).show();
            }
        });

        ConstraintLayout bills = root.findViewById(R.id.Paybill);
        bills.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(),"Paying Bills will be Added soon !",Toast.LENGTH_SHORT).show();
            }
        });





        return root;
    }








}
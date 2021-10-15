package com.example.everupdemo;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import java.io.IOException;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListAdapter.MyViewHolder> {
    private List<AllCustomers> dataList;
    Context context;
    Activity activity;
    public CustomerListAdapter(Activity activity, Context context, List<AllCustomers> dataList)
//    public CustomerListAdapter(Activity activity, Context context)
    {
        this.activity=activity;
        this.context=context;
        this.dataList=dataList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public CustomerListAdapter.MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_item,parent,false);
        return new CustomerListAdapter.MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CustomerListAdapter.MyViewHolder holder, final int position) {
        final AllCustomers data = dataList.get(position);

        holder.name.setText(data.name);
        holder.tax_number.setText(data.vatNumber);
        holder.address.setText(data.address);
        holder.email.setText(data.email);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name,tax_number,address,email;

        public MyViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            tax_number=itemView.findViewById(R.id.tax_number);
            address=itemView.findViewById(R.id.address);
            email=itemView.findViewById(R.id.email);

        }
    }



}

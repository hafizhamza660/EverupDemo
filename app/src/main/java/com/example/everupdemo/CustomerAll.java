package com.example.everupdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CustomerAll extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    private CustomerListAdapter customerListAdapter;
    Activity activity;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_all);
        activity=this;
        context=this;

        recyclerView = findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        new UserLoginTask().execute();
    }

    public class UserLoginTask extends AsyncTask<Void,Void,Boolean>
    {


        @Override
        protected Boolean doInBackground(Void... voids) {
            String barerToken ="iN8FukBEKclTe1vJNRFTNg==";

            String bHeader = "Bearer "+ barerToken;



            Call<List<AllCustomers>> getAllCustomersCall = ApiClass.getAllCustomersA().getCustomer(bHeader);
            getAllCustomersCall.enqueue(new Callback<List<AllCustomers>>() {
                @Override
                public void onResponse(Call<List<AllCustomers>> call, Response<List<AllCustomers>> response) {
                    if (response.isSuccessful())
                    {
                        Log.d("Tag","DoneAPi "+response.body().get(0).user.id);
                        customerListAdapter = new CustomerListAdapter(activity, context, response.body());
                        recyclerView.setAdapter(customerListAdapter);

                    }
                }

                @Override
                public void onFailure(Call<List<AllCustomers>> call, Throwable t) {

                }
            });

            return null;
        }
    }
}
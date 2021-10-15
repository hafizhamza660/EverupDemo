package com.example.everupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button login_btn;
    Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl("https://www.everup.net/api/users/")
            .addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit = builder.build();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_btn = findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new UserLoginTask().execute();
            }
        });


    }

    public class UserLoginTask extends AsyncTask<Void,Void,Boolean>
    {
//        private final String emailS;
//        private final String passwordS;
//
//        public UserLoginTask(String emailS, String passwordS) {
//            this.emailS = emailS;
//            this.passwordS = passwordS;
//        }

        @Override
        protected Boolean doInBackground(Void... voids) {
            LoginInterface loginInterface = retrofit.create(LoginInterface.class);
//            String username= emailS;
//            String pass = passwordS;
            String username= "demo@everup.net";
            String pass = "testerdemo";

            String base=  username+":"+pass;
            String authHeader = "Basic "+ Base64.encodeToString(base.getBytes(),Base64.NO_WRAP);

//
//            String barerToken ="2pNqatODzvDSb+ng5PDohA==";
////            String bHeader = "Bearer "+ Base64.encodeToString(barerToken.getBytes(),Base64.NO_WRAP);
//            String bHeader = "Bearer "+ barerToken;

            Call<LoginResponse> loginResponseCall = ApiClass.getLoginInterface().getLogin(authHeader);
            loginResponseCall.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if (response.isSuccessful())
                    {
                        Log.d("Tag","DoneAPi " +response.body().user);
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {

                }
            });

//            Call<List<AllCustomers>> getAllCustomersCall = ApiClass.getAllCustomersA().getCustomer(bHeader);
//            getAllCustomersCall.enqueue(new Callback<List<AllCustomers>>() {
//                @Override
//                public void onResponse(Call<List<AllCustomers>> call, Response<List<AllCustomers>> response) {
//                    if (response.isSuccessful())
//                    {
//                        Log.d("Tag","DoneAPi "+response.body().get(0).user.id);
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<List<AllCustomers>> call, Throwable t) {
//
//                }
//            });

            return null;
        }
    }
}
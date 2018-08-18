package com.example.esteplogic_android.posttorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String basic_key = "abc123";
    public static String TAG = "MAINACT";
    public static final String ROOT_URL = "http://demo3817260.mockable.io";
    ListView listview;

    List<Book> movieList;

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        movieList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RecyclerAdapter(getApplicationContext(),movieList);
        recyclerView.setAdapter(recyclerAdapter);

        // listview = (ListView) findViewById(R.id.listview);
        getHeroes();

    }

    private void getHeroes() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        RegisterAPI api = retrofit.create(RegisterAPI.class);

        Call<Example> call = api.insertUser(basic_key);
        call.enqueue(new Callback<Example>()
        {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response)
            {
                Example example = response.body();
                Log.d("LOG", "example===" + example);
                String result = "";
                recyclerAdapter.setMovieList(example.books);
                    recyclerAdapter.setMovieList(example.books);

             //PRINT RESPONSE

                String response_str = new Gson().toJson(response.body());
                Log.d("LOG", "RESPONSE11++response_str===" + response_str);
                Log.d("LOG", "RESPONSE22++raw===" + response.raw().toString());

            }
            @Override
            public void onFailure(Call<Example> call, Throwable t)
            {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
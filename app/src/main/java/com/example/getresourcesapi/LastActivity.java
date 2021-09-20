package com.example.getresourcesapi;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;

public class LastActivity extends AppCompatActivity {
    TextView mTvName, mTvYear;
    private RelativeLayout mainLayout;
    private ProgressBar progressBar;
    //private ArrayList<Data> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        mTvYear = findViewById(R.id.tvYear);
        mTvName = findViewById(R.id.tvName);
        mainLayout = findViewById(R.id.mainLayout);
        progressBar = findViewById(R.id.progressBar);
        int id = getIntent().getIntExtra("id", 1);
        callApi(id);


    }

    private void callApi(int id) {
        ApiService apiService = NetWork.getInstance().create(ApiService.class);
        apiService.getResponse(id).enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.body() != null) {
                    Response model = response.body();
                    progressBar.setVisibility(View.GONE);
                    mTvName.setText(model.getData().getName());
                    mTvYear.setText(model.getData().getYear()+"");
                    mainLayout.setBackgroundColor(Color.parseColor(model.getData().getColor()));

                }

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
}
package com.example.getresourcesapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mEtID;
    private Button mBtnGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtID = findViewById(R.id.etID);
        mBtnGet = findViewById(R.id.btnGet);


        mBtnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LastActivity.class);
                intent.putExtra("id", Integer.parseInt(mEtID.getText().toString()));
                startActivity(intent);
            }
        });

    }
}
package com.example.nurabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MainActivity extends AppCompatActivity {

    TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);

        if (getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null){
                mainText.setText(bundle.getString("data"));
                return;
            }
            mainText.setText(getIntent().getStringExtra("data"));
            //bundle must contain all info sent in "data" field of the notification
        }

//        String ref = FirebaseInstanceId.getInstance().getToken();
//        Log.d("tokennya", ref);
    }
}

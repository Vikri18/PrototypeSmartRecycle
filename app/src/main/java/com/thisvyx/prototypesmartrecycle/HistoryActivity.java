package com.thisvyx.prototypesmartrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoryActivity extends AppCompatActivity implements View.OnClickListener{

    CardView btnViewHistory1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        btnViewHistory1 = (CardView) findViewById(R.id.btn_view1);

        btnViewHistory1.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btn_view1: intent =new Intent(this,ViewHistoryActivity.class); startActivity(intent); break;

        }
    }
}
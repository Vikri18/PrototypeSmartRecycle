package com.thisvyx.prototypesmartrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView menuHome, menuCamera, menuHistory, menuInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //cardview -- menu
        menuHome = (CardView) findViewById(R.id.cv_menu_home);
        menuCamera = (CardView) findViewById(R.id.cv_menu_camera);
        menuHistory = (CardView) findViewById(R.id.cv_menu_history);
        menuInfo = (CardView) findViewById(R.id.cv_menu_info);

        menuHome.setOnClickListener((View.OnClickListener) this);
        menuCamera.setOnClickListener((View.OnClickListener) this);
        menuHistory.setOnClickListener((View.OnClickListener) this);
        menuInfo.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.cv_menu_home: intent =new Intent(this,HomeActivity.class); startActivity(intent); break;
            case R.id.cv_menu_camera: intent =new Intent(this,MainActivity.class); startActivity(intent); break;
            case R.id.cv_menu_history: intent =new Intent(this,HistoryActivity.class); startActivity(intent); break;
            case R.id.cv_menu_info: intent =new Intent(this,InfoActivity.class); startActivity(intent); break;
        }
    }
}
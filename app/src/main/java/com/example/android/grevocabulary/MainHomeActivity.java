package com.example.android.grevocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
    }

    public void goToMainPage(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void goToAboutPage(View view){
        Intent intent=new Intent(this,MainAboutActivity.class);
        startActivity(intent);
    }
}

package com.codeclan.frostgravewarbandmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class WarBandManagerActivity extends AppCompatActivity {

    Button buttonManage;
    Button buttonNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_band_manager);

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mainToolbar);

        buttonManage = (Button)findViewById(R.id.buttonManage);
        buttonNew = (Button)findViewById(R.id.buttonNew);
    }

    public void onButtonClickedManage(View Button){
        Intent manage = new Intent(this, ManageWarBandsActivity.class);
        startActivity(manage);
    }

    public void onButtonClickedNew(View Button){
        Intent create = new Intent(this, NewWarBandActivity.class);
        startActivity(create);
    }

}

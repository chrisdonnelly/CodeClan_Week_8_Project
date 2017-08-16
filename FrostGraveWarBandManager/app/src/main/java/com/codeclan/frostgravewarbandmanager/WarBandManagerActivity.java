package com.codeclan.frostgravewarbandmanager;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.action_favorite) {
            Intent intent = new Intent (this, WarBandManagerActivity.class);
            startActivity(intent);
            return true;
        }
        else if (item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent (this, NewWarBandActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
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

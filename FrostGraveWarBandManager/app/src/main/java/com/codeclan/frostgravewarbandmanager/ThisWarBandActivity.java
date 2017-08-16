package com.codeclan.frostgravewarbandmanager;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class ThisWarBandActivity extends AppCompatActivity implements RecruitDialogFragment.RecruitDialogListener {

    Button buttonRecruit;
    Wizard thisWizard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_this_war_band);

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mainToolbar);

        buttonRecruit = (Button) findViewById(R.id.recruit_soldier);

        thisWizard = (Wizard) getIntent().getSerializableExtra("wizard");

        TextView this_wizard = (TextView) findViewById(R.id.this_wizard);

        this_wizard.setText(thisWizard.getName());

        TextView this_school = (TextView) findViewById(R.id.this_school);

        this_school.setText(String.format("Wizard Type: %s", thisWizard.getSchool()));

        TextView this_gold = (TextView) findViewById(R.id.this_gold);

        this_gold.setText(String.format("%s Gold", String.valueOf(thisWizard.getGold())));

        SoldierAdapter soldierAdapter = new SoldierAdapter(this, thisWizard.soldiers);

        ListView thisView = (ListView) findViewById(R.id.soldier_list);

        thisView.setAdapter(soldierAdapter);
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

    public void onButtonClickedRecruit(View Button) {
        RecruitDialogFragment recruitDialogFragment = new RecruitDialogFragment();
        recruitDialogFragment.show(getFragmentManager(), "recruit soldiers");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog, ArrayList<Soldier> selectedSoldiers) {
        for (Soldier soldier : selectedSoldiers) {
            int gold = thisWizard.getGold();
            int cost = soldier.getCost();
            if (gold >= cost) {
                thisWizard.addSoldier(soldier);
                thisWizard.transact(cost);
                TextView this_gold = (TextView) findViewById(R.id.this_gold);
                this_gold.setText(String.format("%s Gold", String.valueOf(thisWizard.getGold())));
            } else {
                Toast.makeText(this, "You cannot afford to recruit " + soldier.getName(), Toast.LENGTH_LONG).show();
            }
        }

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        String myWizards = sharedPref.getString("MyWizards", new ArrayList<Wizard>().toString());

        Gson gson = new Gson();

        TypeToken<ArrayList<Wizard>> wizardArrayList = new TypeToken<ArrayList<Wizard>>(){};

        ArrayList<Wizard> wizards = gson.fromJson(myWizards, wizardArrayList.getType());

        for (Wizard wizard : wizards) {
            if (wizard.getName().equals(thisWizard.getName())) {
                int indexpos = wizards.indexOf(wizard);
                wizards.set(indexpos, thisWizard);
                }
            }

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("MyWizards", gson.toJson(wizards));

        editor.apply();

        Toast.makeText(this, "Soldiers addded!", Toast.LENGTH_LONG).show();

        SoldierAdapter soldierAdapter = new SoldierAdapter(this, thisWizard.soldiers);

        ListView thisView = (ListView) findViewById(R.id.soldier_list);

        thisView.setAdapter(soldierAdapter);
    }



}

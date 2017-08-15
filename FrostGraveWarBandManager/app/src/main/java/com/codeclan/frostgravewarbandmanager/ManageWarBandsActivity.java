package com.codeclan.frostgravewarbandmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Map;

public class ManageWarBandsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_war_bands);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String myWizards = sharedPref.getString("MyWizards", new ArrayList<Wizard>().toString());

        Gson gson = new Gson();

        TypeToken<ArrayList<Wizard>> wizardArrayList = new TypeToken<ArrayList<Wizard>>(){};
        ArrayList<Wizard> wizards = gson.fromJson(myWizards, wizardArrayList.getType());

        Log.d("list", wizards.toString());

        WarbandsAdapter warAdapter = new WarbandsAdapter(this, wizards);

        ListView thisView = (ListView) findViewById(R.id.warbands_list);

        thisView.setAdapter(warAdapter);


//        TextView list = (TextView)findViewById(R.id.warband_list);
//        String wizardString = " ";
//
//        for(Wizard w : wizards){
//            wizardString += w.getName() + " the " + w.getSchool() + " " + w.getGold() + " Gold" + "\n";
//        }
//
//        list.setText(wizardString);




//        SharedPreferences prefs = this.getSharedPreferences(
//                "SAVED_WIZARDS", Context.MODE_PRIVATE);
//
//        Map<String, ?> allWarbands = prefs.getAll();
//
//        for (Map.Entry<String, ?> entry : allWarbands.entrySet()) {
//
//            TextView warbandList = (TextView) findViewById(R.id.warband_list);
//
//            warbandList.setText(entry.getValue().toString());
//        }


    }

}

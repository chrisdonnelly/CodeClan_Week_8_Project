package com.codeclan.frostgravewarbandmanager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;

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
    }

    public void getWarband(View listItem){
        Wizard wizard = (Wizard) listItem.getTag();

        Intent intent = new Intent (this, ThisWarBandActivity.class);
        intent.putExtra("wizard", wizard);

        startActivity(intent);
    }

}

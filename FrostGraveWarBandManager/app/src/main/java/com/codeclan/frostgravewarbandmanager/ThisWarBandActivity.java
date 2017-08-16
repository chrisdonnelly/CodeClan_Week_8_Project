package com.codeclan.frostgravewarbandmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThisWarBandActivity extends AppCompatActivity {

    SpellList spellList;
    SoldierList soldierList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_this_war_band);


        Wizard thisWizard = (Wizard) getIntent().getSerializableExtra("wizard");

        TextView this_wizard = (TextView)findViewById(R.id.this_wizard);

        this_wizard.setText(thisWizard.getName());

        TextView this_school = (TextView)findViewById(R.id.this_school);

        this_school.setText(thisWizard.getSchool());

        TextView this_gold = (TextView)findViewById(R.id.this_gold);

        this_gold.setText(String.valueOf(thisWizard.getGold()) + " Gold");
    }
}

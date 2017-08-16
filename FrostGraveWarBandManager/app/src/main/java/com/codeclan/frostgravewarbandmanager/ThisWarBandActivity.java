package com.codeclan.frostgravewarbandmanager;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThisWarBandActivity extends AppCompatActivity implements RecruitDialogFragment.RecruitDialogListener{

    SoldierList soldierList;
    Button buttonRecruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_this_war_band);

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mainToolbar);

        buttonRecruit = (Button)findViewById(R.id.recruit_soldier);

        Wizard thisWizard = (Wizard) getIntent().getSerializableExtra("wizard");

        TextView this_wizard = (TextView)findViewById(R.id.this_wizard);

        this_wizard.setText(thisWizard.getName());

        TextView this_school = (TextView)findViewById(R.id.this_school);

        this_school.setText(thisWizard.getSchool());

        TextView this_gold = (TextView)findViewById(R.id.this_gold);

        this_gold.setText(String.valueOf(thisWizard.getGold()) + " Gold");
    }

    public void onButtonClickedRecruit(View Button) {
        RecruitDialogFragment recruitDialogFragment = new RecruitDialogFragment();
        recruitDialogFragment.show(getFragmentManager(), "recruit soldiers");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog, int items) {
        RecruitDialogFragment recruitDialogFragment = new RecruitDialogFragment();
        recruitDialogFragment.show(getFragmentManager(), "soldier choice");
    }

}

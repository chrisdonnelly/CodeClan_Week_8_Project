package com.codeclan.frostgravewarbandmanager;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NewWarBandActivity extends AppCompatActivity implements ChooseSchoolDialogFragment.NoticeDialogListener {

    EditText wizardNameEditText;
    String school;
    Button choose;
    Button save;
    WizardSchools wizardSchools;
    TextView magic_school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_war_band);

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.my_toolbar);

        setSupportActionBar(mainToolbar);

        wizardSchools = new WizardSchools();
        wizardSchools.getList();

        wizardNameEditText = (EditText) findViewById(R.id.wizardName);

        choose = (Button) findViewById(R.id.choose_school);

        save = (Button) findViewById(R.id.new_wizard_save);
    }

    public void onButtonClickedChoose(View Button) {
        ChooseSchoolDialogFragment chooseSchoolFragment = new ChooseSchoolDialogFragment();
        chooseSchoolFragment.show(getFragmentManager(), "school choice");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog, int schoolChoice) {
        Log.d("where am I", String.valueOf(schoolChoice));
        school = wizardSchools.getName(schoolChoice);
        TextView magic_school = (TextView) findViewById(R.id.magic_school);
        magic_school.setText(school);
    }

    public void onButtonClickedSave(View Button) {

        String wizardName = wizardNameEditText.getText().toString();

        Wizard wizard = new Wizard(wizardName, school);

        Log.d("check wizard",wizard.getName());
        Log.d("check wizard",wizard.getSchool());

        Intent intent = new Intent (this, MyWarBandsActivity.class);
        intent.putExtra("wizard", wizard);

        startActivity(intent);
    }

}

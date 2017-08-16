package com.codeclan.frostgravewarbandmanager;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_favorite) {
            Intent intent = new Intent(this, WarBandManagerActivity.class);
            startActivity(intent);
            return true;
        } else if (item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent(this, NewWarBandActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void onButtonClickedChoose(View Button) {
        ChooseSchoolDialogFragment chooseSchoolFragment = new ChooseSchoolDialogFragment();
        chooseSchoolFragment.show(getFragmentManager(), "school choice");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog, int schoolChoice) {
        school = wizardSchools.getName(schoolChoice);
        TextView magic_school = (TextView) findViewById(R.id.magic_school);
        magic_school.setText(school);
    }

    public void onButtonClickedSave(View Button) {

        String wizardName = wizardNameEditText.getText().toString();

        Wizard wizard = new Wizard(wizardName, school);

        Intent intent = new Intent (this, MyWarBandsActivity.class);
        intent.putExtra("wizard", wizard);

        startActivity(intent);
    }

}

package com.codeclan.frostgravewarbandmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;

public class WarbandsAdapter extends ArrayAdapter<Wizard> {

    public WarbandsAdapter(Context context, ArrayList<Wizard> wizards) {
        super(context, 0, wizards);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.wizards_item, parent, false);
        }

        Wizard currentWizard = getItem(position);

        TextView warband_wizard = listItemView.findViewById(R.id.warband_wizard);

        warband_wizard.setText(currentWizard.getName());

        TextView warband_school = listItemView.findViewById(R.id.warband_school);

        warband_school.setText(currentWizard.getSchool());

        TextView warband_gold = listItemView.findViewById(R.id.warband_gold);

        warband_gold.setText(String.valueOf(currentWizard.getGold()) + " Gold");

        listItemView.setTag(currentWizard);

        return listItemView;
    }
}
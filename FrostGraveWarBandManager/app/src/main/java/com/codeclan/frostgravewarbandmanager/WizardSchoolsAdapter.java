package com.codeclan.frostgravewarbandmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.ArrayList;

public class WizardSchoolsAdapter extends ArrayAdapter<School> {

    public WizardSchoolsAdapter(Context context, ArrayList<School> schools) {super(context, 0, schools);}

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.schools_item, parent, false);
        }

        School currentSchool = getItem(position);

//        TextView school_name = (TextView) listItemView.findViewById(R.id.school_name);

        TextView school_name = new RadioButton(getContext());

        school_name.setText(currentSchool.getSchoolName());

//        listItemView.setTag(currentSchool);

        return school_name;
    }
}

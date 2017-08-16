package com.codeclan.frostgravewarbandmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class SoldierAdapter extends ArrayAdapter<Soldier> {

    public SoldierAdapter(Context context, ArrayList<Soldier> roster) {super(context, 0, roster);}

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.soldier_item, parent, false);
        }

        Soldier currentSoldier = getItem(position);

        TextView soldier_name = listItemView.findViewById(R.id.soldier_name);

        soldier_name.setText(currentSoldier.getName() + " the");

        TextView soldier_type = listItemView.findViewById(R.id.soldier_type);

        soldier_type.setText(currentSoldier.getType());

        listItemView.setTag(currentSoldier);

        return listItemView;
    }

}

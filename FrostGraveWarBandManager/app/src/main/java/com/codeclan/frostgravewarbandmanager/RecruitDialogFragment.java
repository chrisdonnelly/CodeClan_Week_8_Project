package com.codeclan.frostgravewarbandmanager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

public class RecruitDialogFragment extends DialogFragment {

    SoldierList soldierList;
    ArrayList<Soldier> roster;
    ArrayList<Soldier> selectedSoldiers;
    Soldier recruitedSoldier;
    RecruitDialogListener rListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        soldierList = new SoldierList();
        roster = soldierList.getRoster();

        selectedSoldiers= new ArrayList<Soldier>();

        String[] primitiveSoldiers = new String[2];
        int count = 0;
        for (Soldier soldier : roster){
            primitiveSoldiers[count] = soldier.getName();
            count++;
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle(R.string.pick_soldiers)

                .setMultiChoiceItems(primitiveSoldiers, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i, boolean isChecked) {
                        if (isChecked) {
                            Soldier recruitedSoldier = roster.get(i);
                            selectedSoldiers.add(recruitedSoldier);
                        } else if (selectedSoldiers.contains(recruitedSoldier)) {
                            selectedSoldiers.remove(i);
                        }
                    }
                })
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        return builder.create();
    }

    public interface RecruitDialogListener {
        public void onDialogPositiveClick(DialogFragment dialog, int i);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            rListener = (RecruitDialogFragment.RecruitDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement NoticeDialogListener");
        }
    }






}






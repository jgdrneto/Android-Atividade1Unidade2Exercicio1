package com.example.neto.trab1uni2exer1;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class TimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        final Calendar calendar = Calendar.getInstance();

        int HH = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(),this,HH,min,true);
    }

    @Override
    public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
        String msg = hourOfDay + ":" + minute;

        TextView dataHora = getActivity().findViewById(R.id.dataHora);

        String stringDH = dataHora.getText().toString();

        msg = stringDH.substring(0,stringDH.indexOf(" ")+1) + msg;

        dataHora.setText(msg);

        //Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
    }
}

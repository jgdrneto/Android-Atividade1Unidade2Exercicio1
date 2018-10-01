package com.example.neto.trab1uni2exer1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        final Calendar calendar = Calendar.getInstance();

        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH);
        int dd = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),this, yy,mm,dd);
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
        String msg = dayOfMonth + "/" + (month+1) + "/" + year ;

        TextView dataHora = getActivity().findViewById(R.id.dataHora);

        String stringDH = dataHora.getText().toString();

        msg = msg+stringDH.substring(stringDH.indexOf(" "),stringDH.length());

        dataHora.setText(msg);



        //Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}

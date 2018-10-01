package com.example.neto.trab1uni2exer1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView dataHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataHora = findViewById(R.id.dataHora);

        final Calendar calendar = Calendar.getInstance();

        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH);
        int dd = calendar.get(Calendar.DAY_OF_MONTH);
        int HH = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);

        dataHora.setText(dd + "/" + (mm+1) + "/" + yy + " " + HH +":"+min);

    }

    public void openDate(View view) {
        DatePicker datePicker = new DatePicker();

        datePicker.show(getSupportFragmentManager(), "datePicker");
    }

    public void openTime(View view) {
        TimePicker timePicker = new TimePicker();
        timePicker.show(getSupportFragmentManager(),"timePicker");
    }
}

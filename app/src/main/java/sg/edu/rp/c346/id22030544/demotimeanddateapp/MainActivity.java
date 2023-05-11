package sg.edu.rp.c346.id22030544.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayTime;
    Button btnDisplayDate;
    TextView tvDisplay;
    Button btnReset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textView);
        btnReset = findViewById(R.id.buttonReset);



        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String text = "Time is " + tp.getHour() + ":" + tp.getMinute();
               tvDisplay.setText("Time is " + tp.getHour() + ":" + tp.getMinute());
//                tvDisplay.setText(text);



            }

        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("Date is " + dp.getDayOfMonth() +"/" + (dp.getMonth() + 1) + "/" + dp.getYear());



            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setHour(0);
                tp.setMinute(0);
               dp.updateDate(2020,0,1);
            }
        });


    }
}
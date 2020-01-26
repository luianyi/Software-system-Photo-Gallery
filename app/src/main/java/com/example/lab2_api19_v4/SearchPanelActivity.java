package com.example.lab2_api19_v4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class SearchPanelActivity extends AppCompatActivity {

    private EditText fromDate;
    private EditText toDate;
    private Calendar fromCalendar;
    private Calendar toCalendar;
    private DatePickerDialog.OnDateSetListener fromListener;
    private DatePickerDialog.OnDateSetListener toListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_panel);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

       fromDate = (EditText) findViewById(R.id.startTimeeditText);
       toDate   = (EditText) findViewById(R.id.endTimeeditText);
    }

    /** Called when the user taps the Search button */
    public void startSearching(View view) {
        // open a third activity to display all the pictures within the search limit

        // copying reference code, to get the time and data data and
        Intent intent = new Intent(this, DisplayPhotoActivity.class);
        //Intent i = new Intent();
        intent.putExtra("STARTDATE", fromDate.getText().toString());
        intent.putExtra("ENDDATE", toDate.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
        //startActivity(intent);


    }


}

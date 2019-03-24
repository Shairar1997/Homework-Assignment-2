package com.example.homeworkassignment2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ClassSchedule mClass;
    private TextView mWeek;
    private TextView mLecture;
    private TextView mLab;

    private Button mSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mWeek = findViewById(R.id.tvName);
        mLecture = findViewById(R.id.tvShortDescription);
        mLab = findViewById(R.id.tvDescription);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
        mClass = ClassSchedule.getDummyClass().get(position);
        setTitle(mClass.getWeekNo());
        mLecture.setText(mClass.getActivity1());
        mLab.setText(mClass.getActivity2());

        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchClass(mClass.getWeekNo());
            }
        });
    }

    private void searchClass(String name) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=" + name));
        startActivity(intent);
    }
}

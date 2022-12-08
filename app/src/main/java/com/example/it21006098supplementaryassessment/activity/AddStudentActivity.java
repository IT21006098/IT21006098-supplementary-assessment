package com.example.it21006098supplementaryassessment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.it21006098supplementaryassessment.R;

public class AddStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }

    public void showAll(View view) {
        startActivity(new Intent(AddStudentActivity.this, StudentListActivity.class));
    }

    public void save(View view) {
    }
}
package com.example.it21006098supplementaryassessment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.it21006098supplementaryassessment.R;
import com.example.it21006098supplementaryassessment.db.DBHelper;
import com.example.it21006098supplementaryassessment.model.Student;

import java.util.ArrayList;

public class StudentListActivity extends AppCompatActivity {

    TextView tvTotal;
    RecyclerView recyclerView;

    ArrayList<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        tvTotal = findViewById(R.id.tvTotal);

        DBHelper dbHelper = new DBHelper(this);

        students = dbHelper.getAllStudents();
        tvTotal.setText("Total Students : " + students.size());

        for( Student s : students)
        {
            System.out.println(s.getName());
        }
    }
}
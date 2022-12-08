package com.example.it21006098supplementaryassessment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.it21006098supplementaryassessment.R;
import com.example.it21006098supplementaryassessment.model.Student;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentVH> {

    ArrayList<Student> students;
    Context context;

    public StudentAdapter(ArrayList<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_student, parent, false);
        StudentVH svh = new StudentVH(view);
        return svh;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentVH holder, int position) {

        final Student s = students.get(position);
        holder.tvName.setText(s.getName());
        holder.tvCourse.setText(s.getCourse());
        holder.tvMobile.setText(s.getMobile());
        holder.tvTotal.setText(String.valueOf(s.getTotalFee()));
        holder.tvPaid.setText(String.valueOf(s.getFeePaid()));

        holder.cardUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, s.getName() + " will be updated!!!", Toast.LENGTH_SHORT).show();
            }
        });

        holder.cardDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, s.getName() + " will be deleted!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentVH extends RecyclerView.ViewHolder {

        TextView tvName, tvCourse, tvMobile, tvTotal, tvPaid;
        CardView cardUpdate, cardDelete;

        public StudentVH(@NonNull View v) {
            super(v);

            tvName = v.findViewById(R.id.tvName);
            tvCourse = v.findViewById(R.id.tvCourse);
            tvMobile = v.findViewById(R.id.tvMobile);
            tvTotal = v.findViewById(R.id.tvTotal);
            tvPaid = v.findViewById(R.id.tvPaid);

            cardDelete = v.findViewById(R.id.cardUpdate);
            cardUpdate = v.findViewById(R.id.cardUpdate);

        }
    }
}


package com.jetpack.databanding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.jetpack.databanding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setStudent(getStudent());

        StudentClickHandler studentClickHandler = new StudentClickHandler(getApplicationContext());
        activityMainBinding.setClickHandler(studentClickHandler);

    }

    public Student getStudent(){
        Student student = new Student();
        student.setId(112);
        student.setName("Golu");
        return student;
    }

    public class StudentClickHandler {

        private Context context;

        public StudentClickHandler(Context context) {
            this.context = context;
        }


        public void getIdClicked(View view){
            Toast.makeText(context, "getId Clicked", Toast.LENGTH_SHORT).show();
        }

        public void getNameClicked(View view){
            Toast.makeText(context, "getName Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}

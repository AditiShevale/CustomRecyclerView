package com.example.aditi.task22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ListAdapter mListAdapter;
    List<Details> mDetails = new ArrayList<>();
    EditText mname;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);

        mname=findViewById(R.id.name);

        /*Details details=new Details("Aditi");
        mDetails.add(details);
        details=new Details("shevale");
        mDetails.add(details);*/

        mListAdapter = new ListAdapter(mDetails);

        RecyclerView.LayoutManager mLayoutManager =
                new LinearLayoutManager(getApplicationContext());

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mListAdapter);
        mButton=findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = mname.getText().toString();

                Details details = new Details(a);
                Toast.makeText(MainActivity.this,
                        String.valueOf(details.getName()), Toast.LENGTH_SHORT).show();
                mDetails.add(details);
            }
        });






    }
}

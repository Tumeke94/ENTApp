package com.example.tumeke.entapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by tumeke on 6/1/17.
 */

public class ExamActivity extends AppCompatActivity {
    ListView listView;
    String disciplines[] = {"Math", "English", "Kazakh Language", "Russian Language"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.disciplineList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ExamActivity.this, android.R.layout.simple_list_item_1, disciplines);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String) listView.getItemAtPosition(position);
                startActivity(new Intent(getApplicationContext(), ExamDetailActivity.class));
            }
        });
    }
}

package com.example.test_androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ListView mlListView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ml_tablelayout);

        mlListView = (ListView) findViewById(R.id.mlTextView);
        mlListView.setAdapter(new MLAdapter(this));
        mlListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"您点击了第"+i+"项",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new JsonTask(this, this).execute(JSON_FILE);

        List<String> Mountain = Arrays.asList(

        recyclerView=findViewById(R.id.recycler_view);
        MountainAdapter mountainAdapter = new MountainAdapter(Mountain);
        recyclerView.setAdapter(mountainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}

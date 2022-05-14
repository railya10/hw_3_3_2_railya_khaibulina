package com.example.hw_3_3_2_railya_khaibulina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("123456");
        numbers.add("178475");
        numbers.add("930278");
        numbers.add("830574");
        numbers.add("038583");
        numbers.add("047593");
        numbers.add("027586");
        numbers.add("028766");
        numbers.add("024769");
        numbers.add("638537");
        numbers.add("892785");
        numbers.add("927739");
        numbers.add("027579");
        numbers.add("038578");
        numbers.add("028584");
        numbers.add("028786");
        numbers.add("027479");
        numbers.add("274850");
        numbers.add("028479");

        NumberAdapter adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);

    }
}
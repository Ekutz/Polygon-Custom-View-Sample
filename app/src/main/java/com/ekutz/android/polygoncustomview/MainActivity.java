package com.ekutz.android.polygoncustomview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    PolygonRecyclerView recyclerView;
    List<TwoStrings> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setWidgets();

        setData();

        setRecyclerView();
    }

    private void setWidgets() {
        recyclerView = (PolygonRecyclerView)findViewById(R.id.polygonRecycler);
    }

    private void setData() {
        data = new ArrayList<>();
        data.add(new TwoStrings("0", "빈값"));
        data.add(new TwoStrings("1", "첫번째"));
        data.add(new TwoStrings("2", "두번째"));
        data.add(new TwoStrings("3", "세번째"));
        data.add(new TwoStrings("4", "네번째"));
        data.add(new TwoStrings("5", "다섯번째"));
        data.add(new TwoStrings("6", "여섯번째"));
        data.add(new TwoStrings("7", "일곱번째"));
        data.add(new TwoStrings("8", "여덟번째"));
        data.add(new TwoStrings("9", "아홉번째"));
        data.add(new TwoStrings("10", "열번째"));
        data.add(new TwoStrings("11", "빈값"));
    }

    private void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        CustomAdapter adapter = new CustomAdapter(MainActivity.this, data);
        recyclerView.setAdapter(adapter);
    }
}

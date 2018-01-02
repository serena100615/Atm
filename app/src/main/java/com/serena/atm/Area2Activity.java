package com.serena.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] Tai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area2);
        ListView Taipie = (ListView) findViewById(R.id.areaT);
        Tai = new String[]{"信義區","大安區" ,"士林區"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,Tai);
        Taipie.setAdapter(adapter);
        Taipie.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        if(pos==0){
            String pos1 = "信義區";
            getIntent().putExtra("AREA_C",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(pos==1){
            String pos1 = "大安區";
            getIntent().putExtra("AREA_C",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(pos==2){
            String pos1 = "士林區";
            getIntent().putExtra("AREA_C",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
    }
}

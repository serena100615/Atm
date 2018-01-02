package com.serena.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area1Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] NT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area1);
        ListView New = (ListView) findViewById(R.id.areaN);
        NT = new String[]{"永和區","板橋區" ,"新莊區"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,NT);
        New.setAdapter(adapter);
        New.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        if(pos==0){
            String pos1 = "永和區";
            getIntent().putExtra("AREA_B",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(pos==1){
            String pos1 = "板橋區";
            getIntent().putExtra("AREA_B",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(pos==2){
            String pos1 = "新莊區";
            getIntent().putExtra("AREA_B",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }

    }

}

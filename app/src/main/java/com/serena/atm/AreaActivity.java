package com.serena.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AreaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private String[] KL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ListView Kee = (ListView) findViewById(R.id.areaK);
        KL = new String[]{"中正區","暖暖區" ,"八堵區"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,KL);
        Kee.setAdapter(adapter);
        Kee.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        if(pos==0){
            String pos1 = "中正區";
            getIntent().putExtra("AREA_A",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(pos==1){
            String pos1 = "暖暖區";
            getIntent().putExtra("AREA_A",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(pos==2){
            String pos1 = "八堵區";
            getIntent().putExtra("AREA_A",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }

    }
}

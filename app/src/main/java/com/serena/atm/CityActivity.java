package com.serena.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public final static int REQUEST_AREA_K= 6;
    public final static int REQUEST_AREA_N= 55;
    public final static int REQUEST_AREA_T= 46;
    private static final String TAG = CityActivity.class.getSimpleName();
    private String[] cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView city = (ListView) findViewById(R.id.city);
        cities = new String[]{"基隆市","新北市" ,"台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,cities);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int postion, long l) {
        Log.d(TAG,"onItemClick:"+postion+"/"+cities[postion]);
        if(postion==0){
            Intent intent = new Intent(this,AreaActivity.class);
            startActivityForResult(intent ,REQUEST_AREA_K);
        }
        if(postion==1){
            Intent intent = new Intent(this,Area1Activity.class);
            startActivityForResult(intent ,REQUEST_AREA_N);
        }
        if(postion==2){
            Intent intent = new Intent(this,Area2Activity.class);
            startActivityForResult(intent ,REQUEST_AREA_T);
        }
    }
    @Override
    public void onActivityResult (int requestCode, int resultCode , Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==REQUEST_AREA_K){
            if(resultCode==RESULT_OK){
                String a = data.getStringExtra("AREA_A");
                Toast.makeText(this,"基隆市"+a,Toast.LENGTH_LONG).show();
            }else{
                finish();
            }
        }
        if(requestCode==REQUEST_AREA_N){
            if(resultCode==RESULT_OK){

            }else{
                finish();
            }
        }
        if(requestCode==REQUEST_AREA_T){
            if(resultCode==RESULT_OK){

            }else{
                finish();
            }
        }
    }
}

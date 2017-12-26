package com.serena.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {
    private Spinner city;
    private Spinner addre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        city = (Spinner) findViewById(R.id.city);
        addre = (Spinner) findViewById(R.id.addr);

        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.citys, android.R.layout.simple_list_item_1);
        city.setAdapter(adapter);
        city.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,int position,long id){
                        String[] data = null;
                        if(position==0){
                            data = new String[]{"中正區","暖暖區","八堵區"};
                        }
                        if(position==1){
                            data = new String[]{"永和區","板橋區","新莊區"};
                        }
                        if(position==2){
                            data = new String[]{"信義區","大安區","士林區"};
                        }
                        ArrayAdapter adapter1 = new ArrayAdapter(AddrActivity.this,android.R.layout.simple_list_item_1,data);
                        addre.setAdapter(adapter1);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent){

                    }
                }
        );


    }
}

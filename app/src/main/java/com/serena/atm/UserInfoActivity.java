package com.serena.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    private static final String TAG = UserInfoActivity.class.getSimpleName();
    private EditText name;
    private EditText phone;
    private Spinner ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ages= (Spinner) findViewById(R.id.ages);
//        ArrayList<String> data = new ArrayList<>();
//        for(int i = 15;i<=40;i++){
//            data.add(i+"");
//        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ages, android.R.layout.simple_list_item_1);

        ages.setAdapter(adapter);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        String na = getSharedPreferences("atm",MODE_PRIVATE).getString("NAME","");
        name.setText(na);
        String pho = getSharedPreferences("atm",MODE_PRIVATE).getString("PHONE","");
        phone.setText(pho);
    }
    public void ok(View view){
        Log.d(TAG,"ok"+ages.getSelectedItem().toString());
        int age = Integer.parseInt(ages.getSelectedItem().toString());

        String na = name.getText().toString();
        String pho = phone.getText().toString();
        getIntent().putExtra("INFO_NAME",na);
        getIntent().putExtra("INFO_PHONE",pho);
        setResult(RESULT_OK,getIntent());
        finish();
    }
}

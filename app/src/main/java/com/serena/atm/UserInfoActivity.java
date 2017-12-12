package com.serena.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void ok(View view){
        EditText name = (EditText) findViewById(R.id.name);
        EditText phone = (EditText) findViewById(R.id.phone);
        String na = name.getText().toString();
        String pho = phone.getText().toString();
        getIntent().putExtra("INFO_NAME",na);
        getIntent().putExtra("INFO_PHONE",pho);
        setResult(RESULT_OK,getIntent());
        finish();
    }
}

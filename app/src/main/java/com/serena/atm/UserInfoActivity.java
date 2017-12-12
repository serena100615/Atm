package com.serena.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {
    private EditText name;
    private EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        String na = getSharedPreferences("atm",MODE_PRIVATE).getString("NAME","");
        name.setText(na);
        String pho = getSharedPreferences("atm",MODE_PRIVATE).getString("PHONE","");
        phone.setText(pho);
    }
    public void ok(View view){

        String na = name.getText().toString();
        String pho = phone.getText().toString();
        getIntent().putExtra("INFO_NAME",na);
        getIntent().putExtra("INFO_PHONE",pho);
        setResult(RESULT_OK,getIntent());
        finish();
    }
}

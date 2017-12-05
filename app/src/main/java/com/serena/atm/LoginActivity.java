package com.serena.atm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void Login (View view){
        EditText userid = (EditText) findViewById(R.id.userid);
        EditText passwd = (EditText) findViewById(R.id .passwd);
        String uid = userid.getText().toString();
        String pawd = passwd.getText().toString();
        if("jack".equals(uid) && "1234".equals(pawd)){
            Toast.makeText(this,"登入成功",Toast.LENGTH_LONG).show();
            getIntent().putExtra("LOGIN_USERID",uid);
            getIntent().putExtra("LOGIN_PASSWD",pawd);
            setResult(RESULT_OK,getIntent());
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("Atm")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK",null)
                    .show();

        }
    }
    public void cancel (View view){

    }
}

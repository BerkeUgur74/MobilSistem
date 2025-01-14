package com.example.isimsehiroyunu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }


    public void btnAnasayfaAyar(View v){
        if (v.getId() == R.id.btnNormalOyun) {
            aktiviteyeGec("NormalOyun");
        } else if (v.getId() == R.id.btnSureliOyun) {
            aktiviteyeGec("SureliOyun");
        } else if (v.getId() == R.id.btnCikis) {
            cikisYap();
        }

    }

    public void aktiviteyeGec(String aktiviteIsmi){
        if (aktiviteIsmi.equals("NormalOyun"))
            intent = new Intent(this, NormalOyunActivity.class);
        else
            intent = new Intent(this, SureliOyunActivity.class);


        startActivity(intent);
    }

    private void cikisYap(){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}

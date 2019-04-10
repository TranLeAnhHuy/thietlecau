package com.example.huy.design;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thietke_dialog extends AppCompatActivity {
    //Button btn_CauDamThepLienHop , btn_CauDamKhongLienHop;
    Button btn_DamThep, btn_CauBeTongCotThep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thietke_dialog);
        btn_DamThep = (Button) findViewById(R.id.btn_DamThep);
        btn_CauBeTongCotThep = (Button) findViewById(R.id.btn_BeTongCotThep);
        thietKe();
    }

    public void thietKe() {


}}

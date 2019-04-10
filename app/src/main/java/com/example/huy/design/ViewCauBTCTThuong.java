package com.example.huy.design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewCauBTCTThuong extends AppCompatActivity {
    ImageView imv_I, imv_T,imv_ban,imv_back;
    TextView txt_I, txt_T,txt_ban,txt_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cau_btctthuong);
        addControls();
        addEvent();
    }
    public void addControls(){
        imv_T.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });


    }
    public void addEvent(){
        imv_back=(ImageView) findViewById(R.id.imv_back);
        imv_I=(ImageView) findViewById(R.id.imv_I);
        imv_T=(ImageView) findViewById(R.id.imv_T);
        imv_ban=(ImageView) findViewById(R.id.imv_ban);
        txt_back=(TextView) findViewById(R.id.txt_back);
        txt_I=(TextView) findViewById(R.id.txt_I);
        txt_T=(TextView) findViewById(R.id.txt_T);
        txt_ban=(TextView) findViewById(R.id.txt_ban);

    }
}

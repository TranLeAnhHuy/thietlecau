package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewKiemToan extends AppCompatActivity {
    TextView txtKT1,txtKT2,txtKT3,txtKT4,txtKT5,txtKT6,txtKT7,txtKT8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_kiem_toan);
        /////////////////////////////////////////////////////////////////////
        txtKT1=(TextView) findViewById(R.id.txtKT1);
        txtKT2=(TextView) findViewById(R.id.txtKT2);
        txtKT3=(TextView) findViewById(R.id.txtKT3);
        txtKT4=(TextView) findViewById(R.id.txtKT4);
        txtKT5=(TextView) findViewById(R.id.txtKT5);
        txtKT6=(TextView) findViewById(R.id.txtKT6);
        txtKT7=(TextView) findViewById(R.id.txtKT7);
        txtKT8=(TextView) findViewById(R.id.txtKT8);


        //
        Intent LHintent = getIntent();
        Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
        // MOOIN LỰC TĨNH TẢI GD1
//        txtMmaxCD1GD1.setText(roundString(LHbundle.getDouble("M14"), 4));

        txtKT1.setText(LHbundle.getString("txtKT1"));
        txtKT2.setText(LHbundle.getString("txtKT2"));
        txtKT3.setText(LHbundle.getString("txtKT3"));
        txtKT4.setText(LHbundle.getString("txtKT4"));
        txtKT5.setText(LHbundle.getString("txtKT5"));
        txtKT6.setText(LHbundle.getString("txtKT6"));
        txtKT7.setText(LHbundle.getString("txtKT7"));
        txtKT8.setText(LHbundle.getString("txtKT8"));



    }
}

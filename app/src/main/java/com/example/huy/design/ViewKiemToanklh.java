package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewKiemToanklh extends AppCompatActivity {
    TextView txtKT1,txtKT2,txtKT3,txtKT4,txtKT5,txtKT6,txtKT7,txtKT8,txtKT9,txtKT10;
    TextView txtKT11, txtKT12, txtKT13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_kiem_toanklh);
        txtKT1=(TextView) findViewById(R.id.txtKT1);
        txtKT2=(TextView) findViewById(R.id.txtKT2);
        txtKT3=(TextView) findViewById(R.id.txtKT3);
        txtKT4=(TextView) findViewById(R.id.txtKT4);
        txtKT5=(TextView) findViewById(R.id.txtKT5);
        txtKT6=(TextView) findViewById(R.id.txtKT6);
        txtKT7=(TextView) findViewById(R.id.txtKT7);
        txtKT8=(TextView) findViewById(R.id.txtKT8);
        txtKT9=(TextView) findViewById(R.id.txtKT9);
        txtKT10=(TextView) findViewById(R.id.txtKT10);
        txtKT11=(TextView) findViewById(R.id.txtKT11);
        txtKT12=(TextView) findViewById(R.id.txtKT12);
        txtKT13=(TextView) findViewById(R.id.txtKT13);
        Intent KLHintent = getIntent();
        Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
        // MOOIN LỰC TĨNH TẢI GD1
//        txtMmaxCD1GD1.setText(roundString(LHbundle.getDouble("M14"), 4));

        txtKT1.setText(KLHbundle.getString("txtKT1"));
        txtKT2.setText(KLHbundle.getString("txtKT2"));
        txtKT3.setText(KLHbundle.getString("txtKT3"));
        txtKT4.setText(KLHbundle.getString("txtKT4"));
        txtKT5.setText(KLHbundle.getString("txtKT5"));
        txtKT6.setText(KLHbundle.getString("txtKT6"));
        txtKT7.setText(KLHbundle.getString("txtKT7"));
        txtKT8.setText(KLHbundle.getString("txtKT8"));
        txtKT9.setText(KLHbundle.getString("txtKT9"));
        txtKT10.setText(KLHbundle.getString("txtKT10"));
        txtKT11.setText(KLHbundle.getString("txtKT11"));
        txtKT12.setText(KLHbundle.getString("txtKT12"));
        txtKT13.setText(KLHbundle.getString("txtKT13"));

    }
}

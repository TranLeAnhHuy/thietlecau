package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewMoreBMC extends AppCompatActivity {
    TextView txtBMC1,txtBMC2,txtBMC3,txtBMC4,txtBMC5,txtBMC6,txtBMC7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_bmc);
        txtBMC1=(TextView) findViewById(R.id.txtBMC1);
        txtBMC2=(TextView) findViewById(R.id.txtBMC2);
        txtBMC3=(TextView) findViewById(R.id.txtBMC3);
        txtBMC4=(TextView) findViewById(R.id.txtBMC4);
        txtBMC5=(TextView) findViewById(R.id.txtBMC5);
        txtBMC6=(TextView) findViewById(R.id.txtBMC6);
        txtBMC7=(TextView) findViewById(R.id.txtBMC7);
        Intent LHintent = getIntent();
        Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
        txtBMC1.setText(LHbundle.getString("txtBMC1"));
        txtBMC2.setText(LHbundle.getString("txtBMC2"));
        txtBMC3.setText(LHbundle.getString("txtBMC3"));
        txtBMC4.setText(LHbundle.getString("txtBMC4"));
        txtBMC5.setText(LHbundle.getString("txtBMC5"));
        txtBMC6.setText(LHbundle.getString("txtBMC6"));
        txtBMC7.setText(LHbundle.getString("txtBMC7"));

    }
}

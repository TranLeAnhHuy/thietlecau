package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewMoreBMCklh extends AppCompatActivity {
    TextView txtBMC1,txtBMC2,txtBMC3,txtBMC4,txtBMC5,txtBMC6,txtBMC7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_bmcklh);
        txtBMC1=(TextView) findViewById(R.id.txtBMC1);
        txtBMC2=(TextView) findViewById(R.id.txtBMC2);
        txtBMC3=(TextView) findViewById(R.id.txtBMC3);
        txtBMC4=(TextView) findViewById(R.id.txtBMC4);
        txtBMC5=(TextView) findViewById(R.id.txtBMC5);
        txtBMC6=(TextView) findViewById(R.id.txtBMC6);
        txtBMC7=(TextView) findViewById(R.id.txtBMC7);
        Intent KLHintent = getIntent();
        Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
        txtBMC1.setText(KLHbundle.getString("txtBMC1"));
        txtBMC2.setText(KLHbundle.getString("txtBMC2"));
        txtBMC3.setText(KLHbundle.getString("txtBMC3"));
        txtBMC4.setText(KLHbundle.getString("txtBMC4"));
        txtBMC5.setText(KLHbundle.getString("txtBMC5"));
        txtBMC6.setText(KLHbundle.getString("txtBMC6"));
        txtBMC7.setText(KLHbundle.getString("txtBMC7"));
    }
}

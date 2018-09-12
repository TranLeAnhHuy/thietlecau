package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KQKhongLienHop extends AppCompatActivity {
    TextView txtAnc,txtSnct, txtYncd,txtYnct,txtInc,txtSncd,txtBsDT, txtBsDN, txtAltDT, txtAltDN, txtSlttDT;
    TextView txtSlttDN,txtYltdDT, txtYltdDN, txtYlttDT, txtYlttDN, txtIltDT, txtIltDN ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kqkhong_lien_hop);
        addConrols();
        addEvents();


    }
    public void addEvents(){
        //Láy kết quả
        Intent KLHintent= getIntent();
        Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
        txtAnc.setText(""+ KLHbundle.getDouble("Anc"));
        txtSnct.setText(""+ KLHbundle.getDouble("Snct"));
        txtYncd.setText(""+ KLHbundle.getDouble("Yncd"));
        txtYnct.setText(""+ KLHbundle.getDouble("Ynct"));
        txtInc.setText(""+ KLHbundle.getDouble("Inc"));
        txtSncd.setText(""+ KLHbundle.getDouble("Sncd"));
        txtBsDT.setText(""+ KLHbundle.getDouble("BsDT"));
        txtBsDN.setText(""+ KLHbundle.getDouble(" BsDN"));
        txtAltDT.setText(""+ KLHbundle.getDouble("AltDT"));
        txtAltDN.setText(""+ KLHbundle.getDouble(" AltDN"));
        txtSlttDT.setText(""+ KLHbundle.getDouble(" SlttDT"));
        txtSlttDN.setText(""+ KLHbundle.getDouble(" SlttDN"));
        txtYltdDT.setText(""+ KLHbundle.getDouble("YltdDT"));
        txtYltdDN.setText(""+ KLHbundle.getDouble("YltdDN"));
        txtYlttDT.setText(""+ KLHbundle.getDouble("YlttDT"));
        txtYlttDN.setText(""+ KLHbundle.getDouble("YlttDN"));
        txtIltDT.setText(""+ KLHbundle.getDouble("IltDT"));
        txtIltDN.setText(""+ KLHbundle.getDouble("IltDN"));



    }
    public void  addConrols(){
        txtAnc=(TextView) findViewById(R.id.txtAnc);
        txtSnct=(TextView) findViewById(R.id.txtSnct);
        txtYncd=(TextView) findViewById(R.id.txtYncd);
        txtYnct=(TextView) findViewById(R.id.txtYnct);
        txtInc=(TextView) findViewById(R.id.txtInc);
        txtSncd=(TextView) findViewById(R.id.txtSncd);
        //liên hợp dài hạn
        txtBsDT=(TextView) findViewById(R.id.txtBsDT);
        txtBsDN=(TextView) findViewById(R.id.txtBsDN);
        txtAltDT=(TextView) findViewById(R.id.txtAltDT);
        txtAltDN=(TextView) findViewById(R.id.txtAltDN);
        txtSlttDT=(TextView) findViewById(R.id.txtSlttDT);
        txtSlttDN=(TextView) findViewById(R.id.txtSlttDN);
        txtYltdDT=(TextView) findViewById(R.id.txtYltdDT);
        txtYltdDN=(TextView) findViewById(R.id.txtYltdDN);
        txtYlttDT=(TextView) findViewById(R.id.txtYlttDT);
        txtYlttDN=(TextView) findViewById(R.id.txtYlttDN);
        txtIltDT=(TextView) findViewById(R.id.txtIltDT);
        txtIltDN=(TextView) findViewById(R.id.txtIltDN);












    }

}

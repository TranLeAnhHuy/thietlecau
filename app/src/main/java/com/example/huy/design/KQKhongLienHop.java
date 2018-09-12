package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KQKhongLienHop extends AppCompatActivity {
    TextView txtAnc, txtSnct, txtYncd, txtYnct, txtInc, txtSncd, txtBsDT, txtBsDN, txtAltDT, txtAltDN, txtSlttDT;
    TextView txtSlttDN, txtYltdDT, txtYltdDN, txtYlttDT, txtYlttDN, txtIltDT, txtIltDN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kqkhong_lien_hop);
        addConrols();
        addEvents();


    }

    public void addEvents() {
        //Láy kết quả
        Intent KLHintent = getIntent();
        Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
        txtAnc.setText(String.valueOf(KLHbundle.getDouble("Anc")).length() > 6 ? String.valueOf(KLHbundle.getDouble("Anc")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("Anc")));
        txtSnct.setText(String.valueOf(KLHbundle.getDouble("Snct")).length() > 6 ? String.valueOf(KLHbundle.getDouble("Snct")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("Snct")));
        txtYncd.setText(String.valueOf(KLHbundle.getDouble("Yncd")).length() > 6 ? String.valueOf(KLHbundle.getDouble("Yncd")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("Yncd")));
        txtYnct.setText(String.valueOf(KLHbundle.getDouble("Ynct")).length() > 6 ? String.valueOf(KLHbundle.getDouble("Ynct")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("Ynct")));
        txtInc.setText(String.valueOf(KLHbundle.getDouble("Inc")).length() > 6 ? String.valueOf(KLHbundle.getDouble("Inc")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("Inc")));
        txtSncd.setText(String.valueOf( KLHbundle.getDouble("Sncd")).length() > 6 ? String.valueOf(KLHbundle.getDouble("Sncd")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("Sncd")));
        txtBsDT.setText(String.valueOf( KLHbundle.getDouble("BsDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("BsDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("BsDT")));
        txtBsDN.setText(String.valueOf(KLHbundle.getDouble("BsDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("BsDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("BsDN")));
        txtAltDT.setText(String.valueOf(KLHbundle.getDouble("AltDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("AltDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("AltDT")));
        txtAltDN.setText(String.valueOf( KLHbundle.getDouble("AltDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("AltDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("AltDN")));
        txtSlttDT.setText(String.valueOf(KLHbundle.getDouble("SlttDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("SlttDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble(" SlttDT")));
        txtSlttDN.setText(String.valueOf( KLHbundle.getDouble("SlttDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("SlttDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("SlttDN")));
        txtYltdDT.setText(String.valueOf( KLHbundle.getDouble("YltdDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YltdDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YltdDT")));
        txtYltdDN.setText(String.valueOf( KLHbundle.getDouble("YltdDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YltdDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YltdDN")));
        txtYlttDT.setText(String.valueOf( KLHbundle.getDouble("YlttDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YlttDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YlttDT")));
        txtYlttDN.setText(String.valueOf( KLHbundle.getDouble("YlttDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YlttDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YlttDN")));
        txtIltDT.setText(String.valueOf( KLHbundle.getDouble("IltDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("IltDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("IltDT")));
        txtIltDN.setText(String.valueOf( KLHbundle.getDouble("IltDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("IltDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("IltDN")));


    }

    public void addConrols() {
        txtAnc = (TextView) findViewById(R.id.txtAnc);
        txtSnct = (TextView) findViewById(R.id.txtSnct);
        txtYncd = (TextView) findViewById(R.id.txtYncd);
        txtYnct = (TextView) findViewById(R.id.txtYnct);
        txtInc = (TextView) findViewById(R.id.txtInc);
        txtSncd = (TextView) findViewById(R.id.txtSncd);
        //liên hợp dài hạn
        txtBsDT = (TextView) findViewById(R.id.txtBsDT);
        txtBsDN = (TextView) findViewById(R.id.txtBsDN);
        txtAltDT = (TextView) findViewById(R.id.txtAltDT);
        txtAltDN = (TextView) findViewById(R.id.txtAltDN);
        txtSlttDT = (TextView) findViewById(R.id.txtSlttDT);
        txtSlttDN = (TextView) findViewById(R.id.txtSlttDN);
        txtYltdDT = (TextView) findViewById(R.id.txtYltdDT);
        txtYltdDN = (TextView) findViewById(R.id.txtYltdDN);
        txtYlttDT = (TextView) findViewById(R.id.txtYlttDT);
        txtYlttDN = (TextView) findViewById(R.id.txtYlttDN);
        txtIltDT = (TextView) findViewById(R.id.txtIltDT);
        txtIltDN = (TextView) findViewById(R.id.txtIltDN);


    }

}

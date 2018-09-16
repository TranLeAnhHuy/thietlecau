package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.SuperscriptSpan;
import android.widget.TextView;

//LIÊN HỢP
public class KQKhongLienHop extends AppCompatActivity {
    TextView txtAnc, txtSnct, txtYncd, txtYnct, txtInc, txtSncd;
    TextView txtBsDT, txtBsDN, txtAltDT, txtAltDN, txtSlttDT, txtSlttDN, txtYltdDT, txtYltdDN, txtYlttDT, txtYlttDN, txtIltDT, txtIltDN;
    TextView txtBssDT, txtBssDN, txtAstDT, txtAstDN, txtSsttDT, txtSsttDN, txtYstdDT, txtYstdDN, txtYsttDT, txtYsttDN, txtIstDT, txtIstDN;
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
        txtAnc.setText(roundString(KLHbundle.getDouble("Anc"), 4));
        txtSnct.setText(roundString(KLHbundle.getDouble("Snct"), 4));
        txtYncd.setText(roundString(KLHbundle.getDouble("Yncd"), 4));
        txtYnct.setText(roundString(KLHbundle.getDouble("Ynct"), 4));
        txtInc.setText(roundString(KLHbundle.getDouble("Inc"), 4));
        txtSncd.setText(roundString(KLHbundle.getDouble("Sncd"), 4));
        //dài hạn
        txtBsDT.setText(roundString(KLHbundle.getDouble("BsDT"), 4));
        txtBsDN.setText(roundString(KLHbundle.getDouble("BsDN"), 4));
        txtAltDT.setText(roundString(KLHbundle.getDouble("AltDT"), 4));
        txtAltDN.setText(roundString(KLHbundle.getDouble("AltDN"), 4));
        txtSlttDT.setText(roundString(KLHbundle.getDouble("SlttDT"), 4));
        txtSlttDN.setText(roundString(KLHbundle.getDouble("SlttDN"), 4));
        txtYltdDT.setText(roundString(KLHbundle.getDouble("YltdDT"), 4));
        txtYltdDN.setText(roundString(KLHbundle.getDouble("YltdDN"), 4));
        txtYlttDT.setText(roundString(KLHbundle.getDouble("YlttDT"), 4));
        txtYlttDN.setText(roundString(KLHbundle.getDouble("YlttDN"), 4));
        txtIltDT.setText(roundString(KLHbundle.getDouble("IltDT"), 4));
        txtIltDN.setText(roundString(KLHbundle.getDouble("IltDN"), 4));
        //ngắn hạn
        txtBssDT.setText(roundString(KLHbundle.getDouble("BssDT"), 4));
        txtBssDN.setText(roundString(KLHbundle.getDouble("BssDN"), 4));
        txtAstDT.setText(roundString(KLHbundle.getDouble("AstDT"), 4));
        txtAstDN.setText(roundString(KLHbundle.getDouble("AstDN"), 4));
        txtSsttDT.setText(roundString(KLHbundle.getDouble("SsttDT"), 4));
        txtSsttDN.setText(roundString(KLHbundle.getDouble("SsttDN"), 4));
        txtYstdDT.setText(roundString(KLHbundle.getDouble("YstdDT"), 4));
        txtYstdDN.setText(roundString(KLHbundle.getDouble("YstdDN"), 4));
        txtYsttDT.setText(roundString(KLHbundle.getDouble("YsttDT"), 4));
        txtYsttDN.setText(roundString(KLHbundle.getDouble("YsttDN"), 4));
        txtIstDT.setText(roundString(KLHbundle.getDouble("IstDT"), 4));
        txtIstDN.setText(roundString(KLHbundle.getDouble("IstDN"), 4));

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
        //liên hợp ngắn hạn
        txtBssDT = (TextView) findViewById(R.id.txtBssDT);
        txtBssDN = (TextView) findViewById(R.id.txtBssDN);
        txtAstDT = (TextView) findViewById(R.id.txtAstDT);
        txtAstDN = (TextView) findViewById(R.id.txtAstDN);
        txtSsttDT = (TextView) findViewById(R.id.txtSsttDT);
        txtSsttDN = (TextView) findViewById(R.id.txtSsttDN);
        txtYstdDT = (TextView) findViewById(R.id.txtYstdDT);
        txtYstdDN = (TextView) findViewById(R.id.txtYstdDN);
        txtYsttDT = (TextView) findViewById(R.id.txtYsttDT);
        txtYsttDN = (TextView) findViewById(R.id.txtYsttDN);
        txtIstDT = (TextView) findViewById(R.id.txtIstDT);
        txtIstDN = (TextView) findViewById(R.id.txtIstDN);


    }

    public static SpannableString roundString(double value, int places) {
        double kq = round(value, places);
        if (kq > 1000000) {
            String s = String.valueOf(kq);
            int count;
            double kqMoi;
            if (s.contains("E")) {
                count = Integer.valueOf(s.substring(s.indexOf("E") + 1, s.length()));
                kqMoi = round(Double.valueOf(s.substring(0, 6)), 4);
            } else {
                if (s.contains(".")) {
                    count = s.indexOf(".") - 1;
                } else {
                    count = s.length() - 1;
                }
                kqMoi = round(kq / (long) Math.pow(10, count), 4);
            }

            SpannableString sp = new SpannableString(kqMoi + "*10" + count);
            sp.setSpan(new SuperscriptSpan(), sp.length() - String.valueOf(count).length(), sp.length(), 0);

            return sp;
        } else {
            return new SpannableString(String.valueOf(kq));
        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}

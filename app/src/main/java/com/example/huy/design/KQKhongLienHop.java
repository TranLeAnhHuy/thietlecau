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
    TextView txtBsDT, txtBsDN, txtAltDT, txtAltDN, txtSlttDT,txtSlttDN, txtYltdDT, txtYltdDN, txtYlttDT, txtYlttDN, txtIltDT, txtIltDN;
    TextView txtBssDT, txtBssDN, txtAstDT, txtAstDN, txtSsttDT,txtSsttDN, txtYstdDT, txtYstdDN, txtYsttDT, txtYsttDN, txtIstDT, txtIstDN;


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
       //dài hạn
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
        //ngắn hạn
        txtBssDT.setText(String.valueOf( KLHbundle.getDouble("BssDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("BssDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("BssDT")));
        txtBssDN.setText(String.valueOf(KLHbundle.getDouble("BssDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("BssDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("BssDN")));
        txtAstDT.setText(String.valueOf(KLHbundle.getDouble("AstDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("AstDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("AstDT")));
        txtAstDN.setText(String.valueOf( KLHbundle.getDouble("AstDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("AstDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("AstDN")));
        txtSsttDT.setText(String.valueOf(KLHbundle.getDouble("SsttDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("SsttDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble(" SsttDT")));
        txtSsttDN.setText(String.valueOf( KLHbundle.getDouble("SsttDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("SsttDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("SsttDN")));
        txtYstdDT.setText(String.valueOf( KLHbundle.getDouble("YstdDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YstdDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YstdDT")));
        txtYstdDN.setText(String.valueOf( KLHbundle.getDouble("YstdDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YstdDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YstdDN")));
        txtYsttDT.setText(String.valueOf( KLHbundle.getDouble("YsttDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YsttDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YsttDT")));
        txtYsttDN.setText(String.valueOf( KLHbundle.getDouble("YsttDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("YsttDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("YsttDN")));
        txtIstDT.setText(String.valueOf( KLHbundle.getDouble("IstDT")).length() > 6 ? String.valueOf(KLHbundle.getDouble("IstDT")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("IstDT")));
        txtIstDN.setText(String.valueOf( KLHbundle.getDouble("IstDN")).length() > 6 ? String.valueOf(KLHbundle.getDouble("IstDN")).substring(0, 6) : String.valueOf(KLHbundle.getDouble("IstDN")));

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

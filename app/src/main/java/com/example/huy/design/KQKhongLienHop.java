package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.TextView;

//LIÊN HỢP
public class KQKhongLienHop extends AppCompatActivity {
    TextView txtAnc, txtSnct, txtYncd, txtYnct, txtInc, txtSncd;
    TextView txtBsDT, txtBsDN, txtAltDT, txtAltDN, txtSlttDT, txtSlttDN, txtYltdDT, txtYltdDN, txtYlttDT, txtYlttDN, txtIltDT, txtIltDN;
    TextView txtBssDT, txtBssDN, txtAstDT, txtAstDN, txtSsttDT, txtSsttDN, txtYstdDT, txtYstdDN, txtYsttDT, txtYsttDN, txtIstDT, txtIstDN;
    TextView txtDC1DN, txtDC1DT, txtDC2DT, txtDC2DN, txtDCDT,txtDCDN;
    TextView txtmgSIM, txtmgMIM, txtmgDTM,txtmgMEM1lan, txtmgMEM2lan, txtmgDNM,txtmgSIV, txtmgMIV, txtmgDTV, txtmgMEV1lan, txtmgMEV2lan, txtmgDNV;
    TextView txtmgPLDT, txtmgPLDN;
    TextView txtMmaxCD1GD1, txtMmaxSDGD1, txtQmaxCD1GD1, txtQmaxSDGD1 ;
    TextView txtViewMoreQGD1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kqkhong_lien_hop);///LIÊN HỢP
        addConrols();
        addEvents();


    }

    public void addEvents() {
        //Láy kết quả
        Intent LHintent = getIntent();
        Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
        txtAnc.setText(roundString(LHbundle.getDouble("Anc"), 4));
        txtSnct.setText(roundString(LHbundle.getDouble("Snct"), 4));
        txtYncd.setText(roundString(LHbundle.getDouble("Yncd"), 4));
        txtYnct.setText(roundString(LHbundle.getDouble("Ynct"), 4));
        txtInc.setText(roundString(LHbundle.getDouble("Inc"), 4));
        txtSncd.setText(roundString(LHbundle.getDouble("Sncd"), 4));
        //dài hạn
        txtBsDT.setText(roundString(LHbundle.getDouble("BsDT"), 4));
        txtBsDN.setText(roundString(LHbundle.getDouble("BsDN"), 4));
        txtAltDT.setText(roundString(LHbundle.getDouble("AltDT"), 4));
        txtAltDN.setText(roundString(LHbundle.getDouble("AltDN"), 4));
        txtSlttDT.setText(roundString(LHbundle.getDouble("SlttDT"), 4));
        txtSlttDN.setText(roundString(LHbundle.getDouble("SlttDN"), 4));
        txtYltdDT.setText(roundString(LHbundle.getDouble("YltdDT"), 4));
        txtYltdDN.setText(roundString(LHbundle.getDouble("YltdDN"), 4));
        txtYlttDT.setText(roundString(LHbundle.getDouble("YlttDT"), 4));
        txtYlttDN.setText(roundString(LHbundle.getDouble("YlttDN"), 4));
        txtIltDT.setText(roundString(LHbundle.getDouble("IltDT"), 4));
        txtIltDN.setText(roundString(LHbundle.getDouble("IltDN"), 4));
        //ngắn hạn
        txtBssDT.setText(roundString(LHbundle.getDouble("BssDT"), 4));
        txtBssDN.setText(roundString(LHbundle.getDouble("BssDN"), 4));
        txtAstDT.setText(roundString(LHbundle.getDouble("AstDT"), 4));
        txtAstDN.setText(roundString(LHbundle.getDouble("AstDN"), 4));
        txtSsttDT.setText(roundString(LHbundle.getDouble("SsttDT"), 4));
        txtSsttDN.setText(roundString(LHbundle.getDouble("SsttDN"), 4));
        txtYstdDT.setText(roundString(LHbundle.getDouble("YstdDT"), 4));
        txtYstdDN.setText(roundString(LHbundle.getDouble("YstdDN"), 4));
        txtYsttDT.setText(roundString(LHbundle.getDouble("YsttDT"), 4));
        txtYsttDN.setText(roundString(LHbundle.getDouble("YsttDN"), 4));
        txtIstDT.setText(roundString(LHbundle.getDouble("IstDT"), 4));
        txtIstDN.setText(roundString(LHbundle.getDouble("IstDN"), 4));
        // TĨNH
        txtDC1DN.setText(roundString(LHbundle.getDouble("DC1"), 4));
        txtDC1DT.setText(roundString(LHbundle.getDouble("DC1"), 4));
        txtDC2DN.setText(roundString(LHbundle.getDouble("DC2DN"), 4));
        txtDC2DT.setText(roundString(LHbundle.getDouble("DC2DT"), 4));
        txtDCDN.setText(roundString(LHbundle.getDouble("DCDN"), 4));
        txtDCDT.setText(roundString(LHbundle.getDouble("DCDT"), 4));
        // hệ số phân phối ngang
        txtmgSIV.setText(roundString(LHbundle.getDouble("mgSIV"), 4));
        txtmgMIV.setText(roundString(LHbundle.getDouble("mgMIV"), 4));
        txtmgMEV2lan.setText(roundString(LHbundle.getDouble("mgMEV2lan"), 4));
        txtmgSIM.setText(roundString(LHbundle.getDouble("mgSIM"), 4));
        txtmgMIM.setText(roundString(LHbundle.getDouble("mgMIM"), 4));
        txtmgMEM2lan.setText(roundString(LHbundle.getDouble("mgMEM2lan"), 4));
        txtmgDTM.setText(roundString(LHbundle.getDouble("mgDTM"), 4));
        txtmgDTV.setText(roundString(LHbundle.getDouble("mgDTV"), 4));
        txtmgMEV1lan.setText(roundString(LHbundle.getDouble("mgMEV1lan="), 4));
        txtmgDNV.setText(roundString(LHbundle.getDouble("mgDNV"), 4));
        txtmgMEM1lan.setText(roundString(LHbundle.getDouble("mgMEM1lan"), 4));
        txtmgDNM.setText(roundString(LHbundle.getDouble("mgDNM"), 4));
        txtmgPLDT.setText(roundString(LHbundle.getDouble("mgPLDT"), 4));
        txtmgPLDN.setText(roundString(LHbundle.getDouble("mgPLDN"), 4));
        // MOOIN LỰC TĨNH TẢI GD1
        txtMmaxCD1GD1.setText(roundString(LHbundle.getDouble("M14"), 4));
        txtMmaxSDGD1.setText(roundString(LHbundle.getDouble("M18"), 4));
        txtQmaxCD1GD1.setText(roundString(LHbundle.getDouble("Q14"), 4));
        txtQmaxSDGD1.setText(roundString(LHbundle.getDouble("Q18"), 4));




        //txt.setText(roundString(LHbundle.getDouble(""), 4));
        viewMoreNoiLucGD1();
    }
   public void viewMoreNoiLucGD1(){
       txtViewMoreQGD1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               setContentView(R.layout.activity_view_more_noi_luc_gd1);
           }
       });

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
        //tĩnh
        txtDC1DN = (TextView) findViewById(R.id.txtDC1DN);
        txtDC1DT = (TextView) findViewById(R.id.txtDC1DT);
        txtDC2DN = (TextView) findViewById(R.id.txtDC2DN);
        txtDC2DT = (TextView) findViewById(R.id.txtDC2DT);
        txtDCDN = (TextView) findViewById(R.id.txtDCDN);
        txtDCDT = (TextView) findViewById(R.id.txtDCDT);
        // hệ số phân phối ngang
        txtmgDTV= (TextView) findViewById(R.id.txtmgDTV);
        txtmgSIM = (TextView) findViewById(R.id.txtmgSIM);
        txtmgMIM = (TextView) findViewById(R.id.txtmgMIM);
        txtmgDTM= (TextView) findViewById(R.id.txtmgDTM);
        txtmgMEM1lan= (TextView) findViewById(R.id.txtmgMEM1lan);
        txtmgMEM2lan= (TextView) findViewById(R.id.txtmgMEM2lan);
        txtmgDNM= (TextView) findViewById(R.id.txtmgDNM);
        txtmgSIV = (TextView) findViewById(R.id.txtmgSIV);
        txtmgMIV= (TextView) findViewById(R.id.txtmgMIV);
        txtmgMEV1lan= (TextView) findViewById(R.id.txtmgMEV1lan);
        txtmgMEV2lan= (TextView) findViewById(R.id.txtmgMEV2lan);
        txtmgDNV = (TextView) findViewById(R.id.txtmgDNV);
        txtmgPLDN = (TextView) findViewById(R.id.txtmgPLDN);
        txtmgPLDT = (TextView) findViewById(R.id.txtmgPLDT);
        //txt = (TextView) findViewById(R.id.txt);

        // nội lực tĩnh tải gd1
        txtMmaxCD1GD1 = (TextView) findViewById(R.id.txtMmaxCD1GD1);
        txtMmaxSDGD1 = (TextView) findViewById(R.id.txtMmaxSDGD1);
        txtQmaxCD1GD1 = (TextView) findViewById(R.id.txtQmaxCD1GD1);
        txtQmaxSDGD1 = (TextView) findViewById(R.id.txtQmaxSDGD1);
        txtViewMoreQGD1= (TextView) findViewById(R.id.txtViewMoreQGD1);








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

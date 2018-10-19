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
    TextView txtDC1DN, txtDC1DT, txtDC2DT, txtDC2DN, txtDCDT, txtDCDN;
    TextView txtmgSIM, txtmgMIM, txtmgDTM, txtmgMEM1lan, txtmgMEM2lan, txtmgDNM, txtmgSIV, txtmgMIV, txtmgDTV, txtmgMEV1lan, txtmgMEV2lan, txtmgDNV;
    TextView txtmgPLDT, txtmgPLDN;
    TextView txtMmaxCD1GD1, txtMmaxSDGD1, txtQmaxCD1GD1, txtQmaxSDGD1;
    TextView txtViewMoreQGD1;
    TextView txtftmaxCD1GD1,txtfdmaxCD1GD1,txtftmaxSDGD1,txtfdmaxSDGD1,txtViewMorefGD1;
    TextView txtMmaxCD1GD2, txtMmaxSDGD2, txtQmaxCD1GD2, txtQmaxSDGD2;
    TextView txtViewMoreQGD2,txtViewMorefGD2;
    TextView txtfdmaxDTSDGD2,txtftmaxDTSDGD2,txtfdmaxDTCD1GD2,txtftmaxDTCD1GD2;
    TextView txtfdmaxDNSDGD2,txtftmaxDNSDGD2,txtfdmaxDNCD1GD2,txtftmaxDNCD1GD2;
    TextView txtMmax3CD1,txtMmax3SD, txtQmax3CD1,txtQmax3SD,txtViewMoreMV3;
    TextView txtMmax4DNSD,txtMmax4DTSD,txtMmax4DNCD1,txtMmax4DTCD1, txtViewMoreMV4;

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
        // ứng suất tĩnh tải GD1   txtftmaxCD1GD1,txtfdmaxCD1GD1,txtftmaxSDGD1,txtfdmaxSDGD1,txtViewMorefGD1;
        txtftmaxCD1GD1.setText(roundString(LHbundle.getDouble("f14"), 4));
        txtfdmaxCD1GD1.setText(roundString(LHbundle.getDouble("f18"), 4));
        txtftmaxSDGD1.setText(roundString(LHbundle.getDouble("f112"), 4));
        txtfdmaxSDGD1.setText(roundString(LHbundle.getDouble("f116"), 4));
        // MOOIN LỰC TĨNH TẢI GD2
        txtMmaxCD1GD2.setText(roundString(LHbundle.getDouble("M24"), 4));
        txtMmaxSDGD2.setText(roundString(LHbundle.getDouble("M28"), 4));
        txtQmaxCD1GD2.setText(roundString(LHbundle.getDouble("Q24"), 4));
        txtQmaxSDGD2.setText(roundString(LHbundle.getDouble("Q28"), 4));
//        txtfdmaxDTSDGD2,txtftmaxDTSDGD2,txtfdmaxDTCD1GD2,txtftmaxDTCD1GD2;
        txtfdmaxDTSDGD2.setText(roundString(LHbundle.getDouble("f216"), 4));
        txtftmaxDTSDGD2.setText(roundString(LHbundle.getDouble("f212"), 4));
        txtfdmaxDTCD1GD2.setText(roundString(LHbundle.getDouble("f28"), 4));
        txtftmaxDTCD1GD2.setText(roundString(LHbundle.getDouble("f24"), 4));

        txtfdmaxDNSDGD2.setText(roundString(LHbundle.getDouble("f232"), 4));
        txtftmaxDNSDGD2.setText(roundString(LHbundle.getDouble("f228"), 4));
        txtfdmaxDNCD1GD2.setText(roundString(LHbundle.getDouble("f224"), 4));
        txtftmaxDNCD1GD2.setText(roundString(LHbundle.getDouble("f220"), 4));

        //txtMmax3CD1,txtMmax3SD, txtQmax3CD1,txtQmax3SD;
        txtMmax3CD1.setText(roundString(LHbundle.getDouble("M34"), 4));
        txtMmax3SD.setText(roundString(LHbundle.getDouble("M38"), 4));
        txtQmax3CD1.setText(roundString(LHbundle.getDouble("Q34"), 4));
        txtQmax3SD.setText(roundString(LHbundle.getDouble("Q38"), 4));
        //txtMmax4DNSD,txtMmax4DTSD,txtMmax4DNCD1,txtMmax4DTCD1, txtViewMoreMV4;
        txtMmax4DNSD.setText(roundString(LHbundle.getDouble("M416"), 4));
        txtMmax4DTSD.setText(roundString(LHbundle.getDouble("M412"), 4));
        txtMmax4DNCD1.setText(roundString(LHbundle.getDouble("M48"), 4));
        txtMmax4DTCD1.setText(roundString(LHbundle.getDouble("M44"), 4));



//        .setText(roundString(LHbundle.getDouble(""), 4));




        //txt.setText(roundString(LHbundle.getDouble(""), 4));
        viewMoreNoiLucGD1();
        viewMorefGD1();
        viewMoreNoiLucGD2();
        viewMorefGD2();
        viewMoreNoiLuc3();
        viewMoreNoiLuc4();

    }
    public void viewMoreNoiLuc4(){
        txtViewMoreMV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNoiLuc4bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLuc4.class);
                ViewMoreNoiLuc4bundle.putExtra("M41", LHbundle.getDouble("M41"));
                ViewMoreNoiLuc4bundle.putExtra("M42", LHbundle.getDouble("M42"));
                ViewMoreNoiLuc4bundle.putExtra("M43", LHbundle.getDouble("M43"));
                ViewMoreNoiLuc4bundle.putExtra("M44", LHbundle.getDouble("M44"));
                ViewMoreNoiLuc4bundle.putExtra("M45", LHbundle.getDouble("M45"));
                ViewMoreNoiLuc4bundle.putExtra("M46", LHbundle.getDouble("M46"));
                ViewMoreNoiLuc4bundle.putExtra("M47", LHbundle.getDouble("M47"));
                ViewMoreNoiLuc4bundle.putExtra("M48", LHbundle.getDouble("M48"));
                ViewMoreNoiLuc4bundle.putExtra("M49", LHbundle.getDouble("M49"));
                ViewMoreNoiLuc4bundle.putExtra("M410", LHbundle.getDouble("M410"));
                ViewMoreNoiLuc4bundle.putExtra("M411", LHbundle.getDouble("M411"));
                ViewMoreNoiLuc4bundle.putExtra("M412", LHbundle.getDouble("M412"));
                ViewMoreNoiLuc4bundle.putExtra("M413", LHbundle.getDouble("M413"));
                ViewMoreNoiLuc4bundle.putExtra("M414", LHbundle.getDouble("M414"));
                ViewMoreNoiLuc4bundle.putExtra("M415", LHbundle.getDouble("M415"));
                ViewMoreNoiLuc4bundle.putExtra("M416", LHbundle.getDouble("M416"));
                ViewMoreNoiLuc4bundle.putExtra("Q41", LHbundle.getDouble("Q41"));
                ViewMoreNoiLuc4bundle.putExtra("Q42", LHbundle.getDouble("Q42"));
                ViewMoreNoiLuc4bundle.putExtra("Q43", LHbundle.getDouble("Q43"));
                ViewMoreNoiLuc4bundle.putExtra("Q44", LHbundle.getDouble("Q44"));
                ViewMoreNoiLuc4bundle.putExtra("Q45", LHbundle.getDouble("Q45"));
                ViewMoreNoiLuc4bundle.putExtra("Q46", LHbundle.getDouble("Q46"));
                ViewMoreNoiLuc4bundle.putExtra("Q47", LHbundle.getDouble("Q47"));
                ViewMoreNoiLuc4bundle.putExtra("Q48", LHbundle.getDouble("Q48"));
                ViewMoreNoiLuc4bundle.putExtra("Q49", LHbundle.getDouble("Q49"));
                ViewMoreNoiLuc4bundle.putExtra("Q410", LHbundle.getDouble("Q410"));
                ViewMoreNoiLuc4bundle.putExtra("Q411", LHbundle.getDouble("Q411"));
                ViewMoreNoiLuc4bundle.putExtra("Q412", LHbundle.getDouble("Q412"));
                ViewMoreNoiLuc4bundle.putExtra("Q413", LHbundle.getDouble("Q413"));
                ViewMoreNoiLuc4bundle.putExtra("Q414", LHbundle.getDouble("Q414"));
                ViewMoreNoiLuc4bundle.putExtra("Q415", LHbundle.getDouble("Q415"));
                ViewMoreNoiLuc4bundle.putExtra("Q416", LHbundle.getDouble("Q416"));
                ViewMoreNoiLuc4bundle.putExtra("Q417", LHbundle.getDouble("Q417"));
                ViewMoreNoiLuc4bundle.putExtra("Q418", LHbundle.getDouble("Q418"));
                ViewMoreNoiLuc4bundle.putExtra("Q419", LHbundle.getDouble("Q419"));
                ViewMoreNoiLuc4bundle.putExtra("Q420", LHbundle.getDouble("Q420"));
                ViewMoreNoiLuc4bundle.putExtra("Q421", LHbundle.getDouble("Q421"));
                ViewMoreNoiLuc4bundle.putExtra("Q422", LHbundle.getDouble("Q422"));
                ViewMoreNoiLuc4bundle.putExtra("Q423", LHbundle.getDouble("Q423"));
                ViewMoreNoiLuc4bundle.putExtra("Q424", LHbundle.getDouble("Q424"));
                ViewMoreNoiLuc4bundle.putExtra("Q425", LHbundle.getDouble("Q425"));
                ViewMoreNoiLuc4bundle.putExtra("Q426", LHbundle.getDouble("Q426"));
                ViewMoreNoiLuc4bundle.putExtra("Q427", LHbundle.getDouble("Q427"));
                ViewMoreNoiLuc4bundle.putExtra("Q428", LHbundle.getDouble("Q428"));
                ViewMoreNoiLuc4bundle.putExtra("Q429", LHbundle.getDouble("Q429"));
                ViewMoreNoiLuc4bundle.putExtra("Q430", LHbundle.getDouble("Q430"));
                ViewMoreNoiLuc4bundle.putExtra("Q431", LHbundle.getDouble("Q431"));
                ViewMoreNoiLuc4bundle.putExtra("Q432", LHbundle.getDouble("Q432"));
                ViewMoreNoiLuc4bundle.putExtra("Q433", LHbundle.getDouble("Q433"));
                ViewMoreNoiLuc4bundle.putExtra("Q434", LHbundle.getDouble("Q434"));
                ViewMoreNoiLuc4bundle.putExtra("Q435", LHbundle.getDouble("Q435"));
                ViewMoreNoiLuc4bundle.putExtra("Q436", LHbundle.getDouble("Q436"));
                ViewMoreNoiLuc4bundle.putExtra("Q437", LHbundle.getDouble("Q437"));
                ViewMoreNoiLuc4bundle.putExtra("Q438", LHbundle.getDouble("Q438"));
                ViewMoreNoiLuc4bundle.putExtra("Q439", LHbundle.getDouble("Q439"));
                ViewMoreNoiLuc4bundle.putExtra("Q440", LHbundle.getDouble("Q440"));

                startActivity(ViewMoreNoiLuc4bundle);

            }
        });
    }
    public void viewMoreNoiLuc3(){
        txtViewMoreMV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNoiLuc3bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLuc3.class);
                ViewMoreNoiLuc3bundle.putExtra("M31", LHbundle.getDouble("M31"));
                ViewMoreNoiLuc3bundle.putExtra("M32", LHbundle.getDouble("M32"));
                ViewMoreNoiLuc3bundle.putExtra("M33", LHbundle.getDouble("M33"));
                ViewMoreNoiLuc3bundle.putExtra("M34", LHbundle.getDouble("M34"));
                ViewMoreNoiLuc3bundle.putExtra("M35", LHbundle.getDouble("M35"));
                ViewMoreNoiLuc3bundle.putExtra("M36", LHbundle.getDouble("M36"));
                ViewMoreNoiLuc3bundle.putExtra("M37", LHbundle.getDouble("M37"));
                ViewMoreNoiLuc3bundle.putExtra("M38", LHbundle.getDouble("M38"));
                ViewMoreNoiLuc3bundle.putExtra("Q31", LHbundle.getDouble("Q31"));
                ViewMoreNoiLuc3bundle.putExtra("Q32", LHbundle.getDouble("Q32"));
                ViewMoreNoiLuc3bundle.putExtra("Q33", LHbundle.getDouble("Q33"));
                ViewMoreNoiLuc3bundle.putExtra("Q34", LHbundle.getDouble("Q34"));
                ViewMoreNoiLuc3bundle.putExtra("Q35", LHbundle.getDouble("Q35"));
                ViewMoreNoiLuc3bundle.putExtra("Q36", LHbundle.getDouble("Q36"));
                ViewMoreNoiLuc3bundle.putExtra("Q37", LHbundle.getDouble("Q37"));
                ViewMoreNoiLuc3bundle.putExtra("Q38", LHbundle.getDouble("Q38"));


                startActivity(ViewMoreNoiLuc3bundle);
            }
        });
    }
    public void viewMorefGD2(){
        txtViewMorefGD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreUngSuatGD2bundle = new Intent(KQKhongLienHop.this, ViewMoreUngSuatGD2.class);
                ViewMoreUngSuatGD2bundle.putExtra("f21", LHbundle.getDouble("f21"));
                ViewMoreUngSuatGD2bundle.putExtra("f22", LHbundle.getDouble("f22"));
                ViewMoreUngSuatGD2bundle.putExtra("f23", LHbundle.getDouble("f23"));
                ViewMoreUngSuatGD2bundle.putExtra("f24", LHbundle.getDouble("f24"));
                ViewMoreUngSuatGD2bundle.putExtra("f25", LHbundle.getDouble("f25"));
                ViewMoreUngSuatGD2bundle.putExtra("f26", LHbundle.getDouble("f26"));
                ViewMoreUngSuatGD2bundle.putExtra("f27", LHbundle.getDouble("f27"));
                ViewMoreUngSuatGD2bundle.putExtra("f28", LHbundle.getDouble("f28"));
                ViewMoreUngSuatGD2bundle.putExtra("f29", LHbundle.getDouble("f29"));
                ViewMoreUngSuatGD2bundle.putExtra("f210", LHbundle.getDouble("f210"));
                ViewMoreUngSuatGD2bundle.putExtra("f211", LHbundle.getDouble("f211"));
                ViewMoreUngSuatGD2bundle.putExtra("f212", LHbundle.getDouble("f212"));
                ViewMoreUngSuatGD2bundle.putExtra("f213", LHbundle.getDouble("f213"));
                ViewMoreUngSuatGD2bundle.putExtra("f214", LHbundle.getDouble("f214"));
                ViewMoreUngSuatGD2bundle.putExtra("f215", LHbundle.getDouble("f215"));
                ViewMoreUngSuatGD2bundle.putExtra("f216", LHbundle.getDouble("f216"));
                ViewMoreUngSuatGD2bundle.putExtra("f217", LHbundle.getDouble("f217"));
                ViewMoreUngSuatGD2bundle.putExtra("f218", LHbundle.getDouble("f218"));
                ViewMoreUngSuatGD2bundle.putExtra("f219", LHbundle.getDouble("f219"));
                ViewMoreUngSuatGD2bundle.putExtra("f220", LHbundle.getDouble("f220"));
                ViewMoreUngSuatGD2bundle.putExtra("f221", LHbundle.getDouble("f221"));
                ViewMoreUngSuatGD2bundle.putExtra("f222", LHbundle.getDouble("f222"));
                ViewMoreUngSuatGD2bundle.putExtra("f223", LHbundle.getDouble("f223"));
                ViewMoreUngSuatGD2bundle.putExtra("f224", LHbundle.getDouble("f224"));
                ViewMoreUngSuatGD2bundle.putExtra("f225", LHbundle.getDouble("f225"));
                ViewMoreUngSuatGD2bundle.putExtra("f226", LHbundle.getDouble("f226"));
                ViewMoreUngSuatGD2bundle.putExtra("f227", LHbundle.getDouble("f227"));
                ViewMoreUngSuatGD2bundle.putExtra("f228", LHbundle.getDouble("f228"));
                ViewMoreUngSuatGD2bundle.putExtra("f229", LHbundle.getDouble("f229"));
                ViewMoreUngSuatGD2bundle.putExtra("f230", LHbundle.getDouble("f230"));
                ViewMoreUngSuatGD2bundle.putExtra("f231", LHbundle.getDouble("f231"));
                ViewMoreUngSuatGD2bundle.putExtra("f232", LHbundle.getDouble("f232"));

                startActivity(ViewMoreUngSuatGD2bundle);
            }
        });

    }
    public void viewMoreNoiLucGD2(){
        txtViewMoreQGD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNOILUCGD2bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLucGD2.class);
                //TODO lấy dữ liệu tính toán ráp vào, tạm thời a để 11,13
                ViewMoreNOILUCGD2bundle.putExtra("M21", LHbundle.getDouble("M21"));
                ViewMoreNOILUCGD2bundle.putExtra("M22", LHbundle.getDouble("M22"));
                ViewMoreNOILUCGD2bundle.putExtra("M23", LHbundle.getDouble("M23"));
                ViewMoreNOILUCGD2bundle.putExtra("M24", LHbundle.getDouble("M24"));
                ViewMoreNOILUCGD2bundle.putExtra("M25", LHbundle.getDouble("M25"));
                ViewMoreNOILUCGD2bundle.putExtra("M26", LHbundle.getDouble("M26"));
                ViewMoreNOILUCGD2bundle.putExtra("M27", LHbundle.getDouble("M27"));
                ViewMoreNOILUCGD2bundle.putExtra("M28", LHbundle.getDouble("M28"));
                ViewMoreNOILUCGD2bundle.putExtra("Q21", LHbundle.getDouble("Q21"));
                ViewMoreNOILUCGD2bundle.putExtra("Q22", LHbundle.getDouble("Q22"));
                ViewMoreNOILUCGD2bundle.putExtra("Q23", LHbundle.getDouble("Q23"));
                ViewMoreNOILUCGD2bundle.putExtra("Q24", LHbundle.getDouble("Q24"));
                ViewMoreNOILUCGD2bundle.putExtra("Q25", LHbundle.getDouble("Q25"));
                ViewMoreNOILUCGD2bundle.putExtra("Q26", LHbundle.getDouble("Q26"));
                ViewMoreNOILUCGD2bundle.putExtra("Q27", LHbundle.getDouble("Q27"));
                ViewMoreNOILUCGD2bundle.putExtra("Q28", LHbundle.getDouble("Q28"));
                startActivity(ViewMoreNOILUCGD2bundle);

            }
        });

    }

    public void viewMorefGD1(){
        txtViewMorefGD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreUNGSUATGD1bundle = new Intent(KQKhongLienHop.this, ViewMoreUngSuatGD1.class);
                ViewMoreUNGSUATGD1bundle.putExtra("f11", LHbundle.getDouble("f11"));
                ViewMoreUNGSUATGD1bundle.putExtra("f12", LHbundle.getDouble("f12"));
                ViewMoreUNGSUATGD1bundle.putExtra("f13", LHbundle.getDouble("f13"));
                ViewMoreUNGSUATGD1bundle.putExtra("f14", LHbundle.getDouble("f14"));
                ViewMoreUNGSUATGD1bundle.putExtra("f15", LHbundle.getDouble("f15"));
                ViewMoreUNGSUATGD1bundle.putExtra("f16", LHbundle.getDouble("f16"));
                ViewMoreUNGSUATGD1bundle.putExtra("f17", LHbundle.getDouble("f17"));
                ViewMoreUNGSUATGD1bundle.putExtra("f18", LHbundle.getDouble("f18"));
                ViewMoreUNGSUATGD1bundle.putExtra("f19", LHbundle.getDouble("f19"));
                ViewMoreUNGSUATGD1bundle.putExtra("f110", LHbundle.getDouble("f110"));
                ViewMoreUNGSUATGD1bundle.putExtra("f111", LHbundle.getDouble("f111"));
                ViewMoreUNGSUATGD1bundle.putExtra("f112", LHbundle.getDouble("f112"));
                ViewMoreUNGSUATGD1bundle.putExtra("f113", LHbundle.getDouble("f113"));
                ViewMoreUNGSUATGD1bundle.putExtra("f114", LHbundle.getDouble("f114"));
                ViewMoreUNGSUATGD1bundle.putExtra("f115", LHbundle.getDouble("f115"));
                ViewMoreUNGSUATGD1bundle.putExtra("f116", LHbundle.getDouble("f116"));


                startActivity(ViewMoreUNGSUATGD1bundle);

            }
        });

    }

    public void viewMoreNoiLucGD1() {
        txtViewMoreQGD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNOILUCGD1bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLucGD1.class);
                //TODO lấy dữ liệu tính toán ráp vào, tạm thời a để 11,13
                ViewMoreNOILUCGD1bundle.putExtra("M11", LHbundle.getDouble("M11"));
                ViewMoreNOILUCGD1bundle.putExtra("M12", LHbundle.getDouble("M12"));
                ViewMoreNOILUCGD1bundle.putExtra("M13", LHbundle.getDouble("M13"));
                ViewMoreNOILUCGD1bundle.putExtra("M14", LHbundle.getDouble("M14"));
                ViewMoreNOILUCGD1bundle.putExtra("M15", LHbundle.getDouble("M15"));
                ViewMoreNOILUCGD1bundle.putExtra("M16", LHbundle.getDouble("M16"));
                ViewMoreNOILUCGD1bundle.putExtra("M17", LHbundle.getDouble("M17"));
                ViewMoreNOILUCGD1bundle.putExtra("M18", LHbundle.getDouble("M18"));
                ViewMoreNOILUCGD1bundle.putExtra("Q11", LHbundle.getDouble("Q11"));
                ViewMoreNOILUCGD1bundle.putExtra("Q12", LHbundle.getDouble("Q12"));
                ViewMoreNOILUCGD1bundle.putExtra("Q13", LHbundle.getDouble("Q13"));
                ViewMoreNOILUCGD1bundle.putExtra("Q14", LHbundle.getDouble("Q14"));
                ViewMoreNOILUCGD1bundle.putExtra("Q15", LHbundle.getDouble("Q15"));
                ViewMoreNOILUCGD1bundle.putExtra("Q16", LHbundle.getDouble("Q16"));
                ViewMoreNOILUCGD1bundle.putExtra("Q17", LHbundle.getDouble("Q17"));
                ViewMoreNOILUCGD1bundle.putExtra("Q18", LHbundle.getDouble("Q18"));
                startActivity(ViewMoreNOILUCGD1bundle);

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
        txtmgDTV = (TextView) findViewById(R.id.txtmgDTV);
        txtmgSIM = (TextView) findViewById(R.id.txtmgSIM);
        txtmgMIM = (TextView) findViewById(R.id.txtmgMIM);
        txtmgDTM = (TextView) findViewById(R.id.txtmgDTM);
        txtmgMEM1lan = (TextView) findViewById(R.id.txtmgMEM1lan);
        txtmgMEM2lan = (TextView) findViewById(R.id.txtmgMEM2lan);
        txtmgDNM = (TextView) findViewById(R.id.txtmgDNM);
        txtmgSIV = (TextView) findViewById(R.id.txtmgSIV);
        txtmgMIV = (TextView) findViewById(R.id.txtmgMIV);
        txtmgMEV1lan = (TextView) findViewById(R.id.txtmgMEV1lan);
        txtmgMEV2lan = (TextView) findViewById(R.id.txtmgMEV2lan);
        txtmgDNV = (TextView) findViewById(R.id.txtmgDNV);
        txtmgPLDN = (TextView) findViewById(R.id.txtmgPLDN);
        txtmgPLDT = (TextView) findViewById(R.id.txtmgPLDT);
        //txt = (TextView) findViewById(R.id.txt);

        // nội lực tĩnh tải gd1
        txtMmaxCD1GD1 = (TextView) findViewById(R.id.txtMmaxCD1GD1);
        txtMmaxSDGD1 = (TextView) findViewById(R.id.txtMmaxSDGD1);
        txtQmaxCD1GD1 = (TextView) findViewById(R.id.txtQmaxCD1GD1);
        txtQmaxSDGD1 = (TextView) findViewById(R.id.txtQmaxSDGD1);
        txtViewMoreQGD1 = (TextView) findViewById(R.id.txtViewMoreQGD1);
        // ứng suất tĩnh tải dg1
        txtftmaxCD1GD1 = (TextView) findViewById(R.id.txtftmaxCD1GD1);
        txtfdmaxCD1GD1 = (TextView) findViewById(R.id.txtfdmaxCD1GD1);
        txtftmaxSDGD1 = (TextView) findViewById(R.id.txtftmaxSDGD1);
        txtfdmaxSDGD1 = (TextView) findViewById(R.id.txtfdmaxSDGD1);
        txtViewMorefGD1= (TextView) findViewById(R.id.txtViewMorefGD1);
        // nội lực tĩnh tải gd2
        txtMmaxCD1GD2 = (TextView) findViewById(R.id.txtMmaxCD1GD2);
        txtMmaxSDGD2 = (TextView) findViewById(R.id.txtMmaxSDGD2);
        txtQmaxCD1GD2 = (TextView) findViewById(R.id.txtQmaxCD1GD2);
        txtQmaxSDGD2 = (TextView) findViewById(R.id.txtQmaxSDGD2);
        txtViewMoreQGD2 = (TextView) findViewById(R.id.txtViewMoreQGD2);
        txtViewMorefGD2=(TextView) findViewById(R.id.txtViewMorefGD2);
//        txtfdmaxDTSDGD2,txtftmaxDTSDGD2,txtfdmaxDTCD1GD2,txtftmaxDTCD1GD2;
        txtfdmaxDTSDGD2 =(TextView) findViewById(R.id.txtfdmaxDTSDGD2);
        txtftmaxDTSDGD2=(TextView) findViewById(R.id.txtftmaxDTSDGD2);
        txtfdmaxDTCD1GD2=(TextView) findViewById(R.id.txtfdmaxDTCD1GD2);
        txtftmaxDTCD1GD2 =(TextView) findViewById(R.id.txtftmaxDTCD1GD2);
        txtfdmaxDNSDGD2 =(TextView) findViewById(R.id.txtfdmaxDNSDGD2);
        txtftmaxDNSDGD2=(TextView) findViewById(R.id.txtftmaxDNSDGD2);
        txtfdmaxDNCD1GD2=(TextView) findViewById(R.id.txtfdmaxDNCD1GD2);
        txtftmaxDNCD1GD2 =(TextView) findViewById(R.id.txtftmaxDNCD1GD2);

        //txtMmax3CD1,txtMmax3SD, txtQmax3CD1,txtQmax3SD;
        txtMmax3CD1=(TextView) findViewById(R.id.txtMmax3CD1);
        txtMmax3SD=(TextView) findViewById(R.id.txtMmax3SD);
        txtQmax3CD1=(TextView) findViewById(R.id.txtQmax3CD1);
        txtQmax3SD=(TextView) findViewById(R.id.txtQmax3SD);
        txtViewMoreMV3=(TextView) findViewById(R.id.txtViewMoreMV3);
        //txtMmax4DNSD,txtMmax4DTSD,txtMmax4DNCD1,txtMmax4DTCD1, txtViewMoreMV4;
        txtMmax4DNSD=(TextView) findViewById(R.id.txtMmax4DNSD);
        txtMmax4DTSD=(TextView) findViewById(R.id.txtMmax4DTSD);
        txtMmax4DNCD1=(TextView) findViewById(R.id.txtMmax4DNCD1);
        txtMmax4DTCD1 =(TextView) findViewById(R.id.txtMmax4DTCD1);
        txtViewMoreMV4 =(TextView) findViewById(R.id.txtViewMoreMV4);
//           =(TextView) findViewById(R.id.);



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

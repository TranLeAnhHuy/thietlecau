package com.example.huy.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.TextView;

//LIÊN HỢP
public class KQKhongLienHop extends AppCompatActivity {
    TextView txtAnc, txtSnct, txtYncd, txtYnct, txtInc, txtSncd,edtChieuCaoSuon;
    TextView txtBsDT, txtBsDN, txtAltDT, txtAltDN, txtSlttDT, txtSlttDN, txtYltdDT, txtYltdDN,
            txtYlttDT, txtYlttDN, txtIltDT, txtIltDN;
    TextView txtBssDT, txtBssDN, txtAstDT, txtAstDN, txtSsttDT, txtSsttDN, txtYstdDT, txtYstdDN,
            txtYsttDT, txtYsttDN, txtIstDT, txtIstDN;
    TextView txtDC1DN, txtDC1DT, txtDC2DT, txtDC2DN, txtDCDT, txtDCDN;
    TextView txtmgSIM, txtmgMIM, txtmgDTM, txtmgMEM1lan, txtmgMEM2lan, txtmgDNM, txtmgSIV, txtmgMIV,
            txtmgDTV, txtmgMEV1lan, txtmgMEV2lan, txtmgDNV;
    TextView txtmgPLDT, txtmgPLDN;
    TextView txtMmaxCD1GD1, txtMmaxSDGD1, txtQmaxCD1GD1, txtQmaxSDGD1;
    TextView txtViewMoreQGD1;
    TextView txtftmaxCD1GD1, txtfdmaxCD1GD1, txtftmaxSDGD1, txtfdmaxSDGD1, txtViewMorefGD1;
    TextView txtMmaxCD1GD2, txtMmaxSDGD2, txtQmaxCD1GD2, txtQmaxSDGD2;
    TextView txtViewMoreQGD2, txtViewMorefGD2;
    TextView txtfdmaxDTSDGD2, txtftmaxDTSDGD2, txtfdmaxDTCD1GD2, txtftmaxDTCD1GD2;
    TextView txtfdmaxDNSDGD2, txtftmaxDNSDGD2, txtfdmaxDNCD1GD2, txtftmaxDNCD1GD2;
    TextView txtMmax3CD1, txtMmax3SD, txtQmax3CD1, txtQmax3SD, txtViewMoreMV3;
    TextView txtMmax4DNSD, txtMmax4DTSD, txtMmax4DNCD1, txtMmax4DTCD1, txtViewMoreMV4;
    TextView txtM52, txtM51, txtf51, txtf52, txtf53, txtf54;
    TextView txtM64, txtQ64, txtViewMoreMV6;
    TextView txtViewMoreMV7;
    TextView txtM74, txtM78, txtM712, txtM716, txtM720, txtM724;
    TextView txtQ71, txtQ76, txtQ711, txtQ716, txtQ721, txtQ726;
    TextView txtviewNoiLuc;
    TextView  txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    TextView txtbmc1,txtbmc2,txtbmc3,txtbmc4,txtbmc5,txtbmc6,txtbmc7;
    TextView txtViewKiemToan, txtViewBMC;

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
//        edtChieuCaoSuon.setText(roundString(LHbundle.getDouble("Dw"),4));
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

        txtM74.setText(roundString(LHbundle.getDouble("M74"), 4));
        txtM78.setText(roundString(LHbundle.getDouble("M78"), 4));
        txtM712.setText(roundString(LHbundle.getDouble("M712"), 4));
        txtM716.setText(roundString(LHbundle.getDouble("M716"), 4));
        txtM720.setText(roundString(LHbundle.getDouble("M720"), 4));
        txtM724.setText(roundString(LHbundle.getDouble("M724"), 4));
        txtQ71.setText(roundString(LHbundle.getDouble("Q71"), 4));
        txtQ76.setText(roundString(LHbundle.getDouble("Q76"), 4));
        txtQ711.setText(roundString(LHbundle.getDouble("Q711"), 4));
        txtQ716.setText(roundString(LHbundle.getDouble("Q716"), 4));
        txtQ721.setText(roundString(LHbundle.getDouble("Q721"), 4));
        txtQ726.setText(roundString(LHbundle.getDouble("Q726"), 4));
        txt1.setText(LHbundle.getString("txt1"));
        txt2.setText(LHbundle.getString("txt2"));
        txt3.setText(LHbundle.getString("txt3"));
        txt4.setText(LHbundle.getString("txt4"));
        txt5.setText(LHbundle.getString("txt5"));
        txt6.setText(LHbundle.getString("txt6"));
        txt7.setText(LHbundle.getString("txt7"));
        txtbmc1.setText(LHbundle.getString("txtbmc1"));
        txtbmc2.setText(LHbundle.getString("txtbmc2"));
        txtbmc3.setText(LHbundle.getString("txtbmc3"));
        txtbmc4.setText(LHbundle.getString("txtbmc4"));
        txtbmc5.setText(LHbundle.getString("txtbmc5"));
        txtbmc6.setText(LHbundle.getString("txtbmc6"));
        txtbmc7.setText(LHbundle.getString("txtbmc7"));

        viewNoiLuc7();
        viewNoiLuc();
        viewKiemToan();
        viewBMC();
    }
    public void  viewBMC(){
        txtViewBMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");

                Intent ViewBMCbundle = new Intent(KQKhongLienHop.this, ViewMoreBMC.class);
                Bundle BMCBundle = new Bundle();
                BMCBundle.putString("txtBMC1", LHbundle.getString("txtBMC1"));
                BMCBundle.putString("txtBMC2", LHbundle.getString("txtBMC2"));
                BMCBundle.putString("txtBMC3", LHbundle.getString("txtBMC3"));
                BMCBundle.putString("txtBMC4", LHbundle.getString("txtBMC4"));
                BMCBundle.putString("txtBMC5", LHbundle.getString("txtBMC5"));
                BMCBundle.putString("txtBMC6", LHbundle.getString("txtBMC6"));
                BMCBundle.putString("txtBMC7", LHbundle.getString("txtBMC7"));

                ViewBMCbundle.putExtra("LHbundle", BMCBundle);
                startActivity(ViewBMCbundle);

            }
        });
    }


    public void viewKiemToan(){
        txtViewKiemToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");

                Intent ViewKiemToanbundle = new Intent(KQKhongLienHop.this, ViewKiemToan.class);
                Bundle KTBundle = new Bundle();
                KTBundle.putString("txtKT1", LHbundle.getString("txtKT1"));
                KTBundle.putString("txtKT2", LHbundle.getString("txtKT2"));
                KTBundle.putString("txtKT3", LHbundle.getString("txtKT3"));
                KTBundle.putString("txtKT4", LHbundle.getString("txtKT4"));
                KTBundle.putString("txtKT5", LHbundle.getString("txtKT5"));
                KTBundle.putString("txtKT6", LHbundle.getString("txtKT6"));
                KTBundle.putString("txtKT7", LHbundle.getString("txtKT7"));
                KTBundle.putString("txtKT8", LHbundle.getString("txtKT8"));
                KTBundle.putString("txtKT9", LHbundle.getString("txtKT9"));
                KTBundle.putString("txtKT10", LHbundle.getString("txtKT10"));
                KTBundle.putString("txtKT11", LHbundle.getString("txtKT11"));
                KTBundle.putString("txtKT12", LHbundle.getString("txtKT12"));
                KTBundle.putString("txtKT13", LHbundle.getString("txtKT13"));

                ViewKiemToanbundle.putExtra("LHbundle", KTBundle);
                startActivity(ViewKiemToanbundle);
            }
        });
    }

    public void viewNoiLuc() {
        txtviewNoiLuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");

                Intent ViewNoiLucbundle = new Intent(KQKhongLienHop.this, ViewNoiLuc.class);
                //nội lực 1
                ///

                Bundle newBundle = new Bundle();
                newBundle.putDouble("M11", LHbundle.getDouble("M11"));
                newBundle.putDouble("M12", LHbundle.getDouble("M12"));
                newBundle.putDouble("M13", LHbundle.getDouble("M13"));
                newBundle.putDouble("M14", LHbundle.getDouble("M14"));
                newBundle.putDouble("M15", LHbundle.getDouble("M15"));
                newBundle.putDouble("M16", LHbundle.getDouble("M16"));
                newBundle.putDouble("M17", LHbundle.getDouble("M17"));
                newBundle.putDouble("M18", LHbundle.getDouble("M18"));
                newBundle.putDouble("Q11", LHbundle.getDouble("Q11"));
                newBundle.putDouble("Q12", LHbundle.getDouble("Q12"));
                newBundle.putDouble("Q13", LHbundle.getDouble("Q13"));
                newBundle.putDouble("Q14", LHbundle.getDouble("Q14"));
                newBundle.putDouble("Q15", LHbundle.getDouble("Q15"));
                newBundle.putDouble("Q16", LHbundle.getDouble("Q16"));
                newBundle.putDouble("Q17", LHbundle.getDouble("Q17"));
                newBundle.putDouble("Q18", LHbundle.getDouble("Q18"));
                // ứng suất 1
                newBundle.putDouble("f11", LHbundle.getDouble("f11"));
                newBundle.putDouble("f12", LHbundle.getDouble("f12"));
                newBundle.putDouble("f13", LHbundle.getDouble("f13"));
                newBundle.putDouble("f14", LHbundle.getDouble("f14"));
                newBundle.putDouble("f15", LHbundle.getDouble("f15"));
                newBundle.putDouble("f16", LHbundle.getDouble("f16"));
                newBundle.putDouble("f17", LHbundle.getDouble("f17"));
                newBundle.putDouble("f18", LHbundle.getDouble("f18"));
                newBundle.putDouble("f19", LHbundle.getDouble("f19"));
                newBundle.putDouble("f110", LHbundle.getDouble("f110"));
                newBundle.putDouble("f111", LHbundle.getDouble("f111"));
                newBundle.putDouble("f112", LHbundle.getDouble("f112"));
                newBundle.putDouble("f113", LHbundle.getDouble("f113"));
                newBundle.putDouble("f114", LHbundle.getDouble("f114"));
                newBundle.putDouble("f115", LHbundle.getDouble("f115"));
                newBundle.putDouble("f116", LHbundle.getDouble("f116"));

                // nội lực 2
                newBundle.putDouble("M21", LHbundle.getDouble("M21"));
                newBundle.putDouble("M22", LHbundle.getDouble("M22"));
                newBundle.putDouble("M23", LHbundle.getDouble("M23"));
                newBundle.putDouble("M24", LHbundle.getDouble("M24"));
                newBundle.putDouble("M25", LHbundle.getDouble("M25"));
                newBundle.putDouble("M26", LHbundle.getDouble("M26"));
                newBundle.putDouble("M27", LHbundle.getDouble("M27"));
                newBundle.putDouble("M28", LHbundle.getDouble("M28"));
                newBundle.putDouble("Q21", LHbundle.getDouble("Q21"));
                newBundle.putDouble("Q22", LHbundle.getDouble("Q22"));
                newBundle.putDouble("Q23", LHbundle.getDouble("Q23"));
                newBundle.putDouble("Q24", LHbundle.getDouble("Q24"));
                newBundle.putDouble("Q25", LHbundle.getDouble("Q25"));
                newBundle.putDouble("Q26", LHbundle.getDouble("Q26"));
                newBundle.putDouble("Q27", LHbundle.getDouble("Q27"));
                newBundle.putDouble("Q28", LHbundle.getDouble("Q28"));
                //ứng suất 2
                newBundle.putDouble("f21", LHbundle.getDouble("f21"));
                newBundle.putDouble("f22", LHbundle.getDouble("f22"));
                newBundle.putDouble("f23", LHbundle.getDouble("f23"));
                newBundle.putDouble("f24", LHbundle.getDouble("f24"));
                newBundle.putDouble("f25", LHbundle.getDouble("f25"));
                newBundle.putDouble("f26", LHbundle.getDouble("f26"));
                newBundle.putDouble("f27", LHbundle.getDouble("f27"));
                newBundle.putDouble("f28", LHbundle.getDouble("f28"));
                newBundle.putDouble("f29", LHbundle.getDouble("f29"));
                newBundle.putDouble("f210", LHbundle.getDouble("f210"));
                newBundle.putDouble("f211", LHbundle.getDouble("f211"));
                newBundle.putDouble("f212", LHbundle.getDouble("f212"));
                newBundle.putDouble("f213", LHbundle.getDouble("f213"));
                newBundle.putDouble("f214", LHbundle.getDouble("f214"));
                newBundle.putDouble("f215", LHbundle.getDouble("f215"));
                newBundle.putDouble("f216", LHbundle.getDouble("f216"));
                newBundle.putDouble("f217", LHbundle.getDouble("f217"));
                newBundle.putDouble("f218", LHbundle.getDouble("f218"));
                newBundle.putDouble("f219", LHbundle.getDouble("f219"));
                newBundle.putDouble("f220", LHbundle.getDouble("f220"));
                newBundle.putDouble("f221", LHbundle.getDouble("f221"));
                newBundle.putDouble("f222", LHbundle.getDouble("f222"));
                newBundle.putDouble("f223", LHbundle.getDouble("f223"));
                newBundle.putDouble("f224", LHbundle.getDouble("f224"));
                newBundle.putDouble("f225", LHbundle.getDouble("f225"));
                newBundle.putDouble("f226", LHbundle.getDouble("f226"));
                newBundle.putDouble("f227", LHbundle.getDouble("f227"));
                newBundle.putDouble("f228", LHbundle.getDouble("f228"));
                newBundle.putDouble("f229", LHbundle.getDouble("f229"));
                newBundle.putDouble("f230", LHbundle.getDouble("f230"));
                newBundle.putDouble("f231", LHbundle.getDouble("f231"));
                newBundle.putDouble("f232", LHbundle.getDouble("f232"));

                // nội lực 3
                newBundle.putDouble("M31", LHbundle.getDouble("M31"));
                newBundle.putDouble("M32", LHbundle.getDouble("M32"));
                newBundle.putDouble("M33", LHbundle.getDouble("M33"));
                newBundle.putDouble("M34", LHbundle.getDouble("M34"));
                newBundle.putDouble("M35", LHbundle.getDouble("M35"));
                newBundle.putDouble("M36", LHbundle.getDouble("M36"));
                newBundle.putDouble("M37", LHbundle.getDouble("M37"));
                newBundle.putDouble("M38", LHbundle.getDouble("M38"));
                newBundle.putDouble("Q31", LHbundle.getDouble("Q31"));
                newBundle.putDouble("Q32", LHbundle.getDouble("Q32"));
                newBundle.putDouble("Q33", LHbundle.getDouble("Q33"));
                newBundle.putDouble("Q34", LHbundle.getDouble("Q34"));
                newBundle.putDouble("Q35", LHbundle.getDouble("Q35"));
                newBundle.putDouble("Q36", LHbundle.getDouble("Q36"));
                newBundle.putDouble("Q37", LHbundle.getDouble("Q37"));
                newBundle.putDouble("Q38", LHbundle.getDouble("Q38"));
                // nội lực 4
                newBundle.putDouble("M41", LHbundle.getDouble("M41"));
                newBundle.putDouble("M42", LHbundle.getDouble("M42"));
                newBundle.putDouble("M43", LHbundle.getDouble("M43"));
                newBundle.putDouble("M44", LHbundle.getDouble("M44"));
                newBundle.putDouble("M45", LHbundle.getDouble("M45"));
                newBundle.putDouble("M46", LHbundle.getDouble("M46"));
                newBundle.putDouble("M47", LHbundle.getDouble("M47"));
                newBundle.putDouble("M48", LHbundle.getDouble("M48"));
                newBundle.putDouble("M49", LHbundle.getDouble("M49"));
                newBundle.putDouble("M410", LHbundle.getDouble("M410"));
                newBundle.putDouble("M411", LHbundle.getDouble("M411"));
                newBundle.putDouble("M412", LHbundle.getDouble("M412"));
                newBundle.putDouble("M413", LHbundle.getDouble("M413"));
                newBundle.putDouble("M414", LHbundle.getDouble("M414"));
                newBundle.putDouble("M415", LHbundle.getDouble("M415"));
                newBundle.putDouble("M416", LHbundle.getDouble("M416"));
                newBundle.putDouble("Q41", LHbundle.getDouble("Q41"));
                newBundle.putDouble("Q42", LHbundle.getDouble("Q42"));
                newBundle.putDouble("Q43", LHbundle.getDouble("Q43"));
                newBundle.putDouble("Q44", LHbundle.getDouble("Q44"));
                newBundle.putDouble("Q45", LHbundle.getDouble("Q45"));
                newBundle.putDouble("Q46", LHbundle.getDouble("Q46"));
                newBundle.putDouble("Q47", LHbundle.getDouble("Q47"));
                newBundle.putDouble("Q48", LHbundle.getDouble("Q48"));
                newBundle.putDouble("Q49", LHbundle.getDouble("Q49"));
                newBundle.putDouble("Q410", LHbundle.getDouble("Q410"));
                newBundle.putDouble("Q411", LHbundle.getDouble("Q411"));
                newBundle.putDouble("Q412", LHbundle.getDouble("Q412"));
                newBundle.putDouble("Q413", LHbundle.getDouble("Q413"));
                newBundle.putDouble("Q414", LHbundle.getDouble("Q414"));
                newBundle.putDouble("Q415", LHbundle.getDouble("Q415"));
                newBundle.putDouble("Q416", LHbundle.getDouble("Q416"));
                newBundle.putDouble("Q417", LHbundle.getDouble("Q417"));
                newBundle.putDouble("Q418", LHbundle.getDouble("Q418"));
                newBundle.putDouble("Q419", LHbundle.getDouble("Q419"));
                newBundle.putDouble("Q420", LHbundle.getDouble("Q420"));
                newBundle.putDouble("Q421", LHbundle.getDouble("Q421"));
                newBundle.putDouble("Q422", LHbundle.getDouble("Q422"));
                newBundle.putDouble("Q423", LHbundle.getDouble("Q423"));
                newBundle.putDouble("Q424", LHbundle.getDouble("Q424"));
                newBundle.putDouble("Q425", LHbundle.getDouble("Q425"));
                newBundle.putDouble("Q426", LHbundle.getDouble("Q426"));
                newBundle.putDouble("Q427", LHbundle.getDouble("Q427"));
                newBundle.putDouble("Q428", LHbundle.getDouble("Q428"));
                newBundle.putDouble("Q429", LHbundle.getDouble("Q429"));
                newBundle.putDouble("Q430", LHbundle.getDouble("Q430"));
                newBundle.putDouble("Q431", LHbundle.getDouble("Q431"));
                newBundle.putDouble("Q432", LHbundle.getDouble("Q432"));
                newBundle.putDouble("Q433", LHbundle.getDouble("Q433"));
                newBundle.putDouble("Q434", LHbundle.getDouble("Q434"));
                newBundle.putDouble("Q435", LHbundle.getDouble("Q435"));
                newBundle.putDouble("Q436", LHbundle.getDouble("Q436"));
                newBundle.putDouble("Q437", LHbundle.getDouble("Q437"));
                newBundle.putDouble("Q438", LHbundle.getDouble("Q438"));
                newBundle.putDouble("Q439", LHbundle.getDouble("Q439"));
                newBundle.putDouble("Q440", LHbundle.getDouble("Q440"));
                // nội lực 5
                newBundle.putDouble("M51", LHbundle.getDouble("M51"));
                newBundle.putDouble("M52", LHbundle.getDouble("M52"));
                newBundle.putDouble("f51", LHbundle.getDouble("f51"));
                newBundle.putDouble("f52", LHbundle.getDouble("f52"));
                newBundle.putDouble("f53", LHbundle.getDouble("f53"));
                newBundle.putDouble("f54", LHbundle.getDouble("f54"));

                // nội lực 6
                newBundle.putDouble("M61", LHbundle.getDouble("M61"));
                newBundle.putDouble("M62", LHbundle.getDouble("M62"));
                newBundle.putDouble("M63", LHbundle.getDouble("M63"));
                newBundle.putDouble("M64", LHbundle.getDouble("M64"));
                newBundle.putDouble("Q61", LHbundle.getDouble("Q61"));
                newBundle.putDouble("Q62", LHbundle.getDouble("Q62"));
                newBundle.putDouble("Q63", LHbundle.getDouble("Q63"));
                newBundle.putDouble("Q64", LHbundle.getDouble("Q64"));
                newBundle.putDouble("Q65", LHbundle.getDouble("Q65"));
                newBundle.putDouble("Q66", LHbundle.getDouble("Q66"));
                newBundle.putDouble("Q67", LHbundle.getDouble("Q67"));
                newBundle.putDouble("Q68", LHbundle.getDouble("Q68"));
                newBundle.putDouble("Q69", LHbundle.getDouble("Q69"));
                newBundle.putDouble("Q610", LHbundle.getDouble("Q610"));

                ///nội lực 7
                newBundle.putDouble("M71", LHbundle.getDouble("M71"));
                newBundle.putDouble("M72", LHbundle.getDouble("M72"));
                newBundle.putDouble("M73", LHbundle.getDouble("M73"));
                newBundle.putDouble("M74", LHbundle.getDouble("M74"));
                newBundle.putDouble("M75", LHbundle.getDouble("M75"));
                newBundle.putDouble("M76", LHbundle.getDouble("M76"));
                newBundle.putDouble("M77", LHbundle.getDouble("M77"));
                newBundle.putDouble("M78", LHbundle.getDouble("M78"));
                newBundle.putDouble("M79", LHbundle.getDouble("M79"));
                newBundle.putDouble("M710", LHbundle.getDouble("M710"));
                newBundle.putDouble("M711", LHbundle.getDouble("M711"));
                newBundle.putDouble("M712", LHbundle.getDouble("M712"));
                newBundle.putDouble("M713", LHbundle.getDouble("M713"));
                newBundle.putDouble("M714", LHbundle.getDouble("M714"));
                newBundle.putDouble("M715", LHbundle.getDouble("M715"));
                newBundle.putDouble("M716", LHbundle.getDouble("M716"));
                newBundle.putDouble("M717", LHbundle.getDouble("M717"));
                newBundle.putDouble("M718", LHbundle.getDouble("M718"));
                newBundle.putDouble("M719", LHbundle.getDouble("M719"));
                newBundle.putDouble("M720", LHbundle.getDouble("M720"));
                newBundle.putDouble("M721", LHbundle.getDouble("M721"));
                newBundle.putDouble("M722", LHbundle.getDouble("M722"));
                newBundle.putDouble("M723", LHbundle.getDouble("M723"));
                newBundle.putDouble("M724", LHbundle.getDouble("M724"));

                newBundle.putDouble("Q71", LHbundle.getDouble("Q71"));
                newBundle.putDouble("Q72", LHbundle.getDouble("Q72"));
                newBundle.putDouble("Q73", LHbundle.getDouble("Q73"));
                newBundle.putDouble("Q74", LHbundle.getDouble("Q74"));
                newBundle.putDouble("Q75", LHbundle.getDouble("Q75"));
                newBundle.putDouble("Q76", LHbundle.getDouble("Q76"));
                newBundle.putDouble("Q77", LHbundle.getDouble("Q77"));
                newBundle.putDouble("Q78", LHbundle.getDouble("Q78"));
                newBundle.putDouble("Q79", LHbundle.getDouble("Q79"));
                newBundle.putDouble("Q710", LHbundle.getDouble("Q710"));
                newBundle.putDouble("Q711", LHbundle.getDouble("Q711"));
                newBundle.putDouble("Q712", LHbundle.getDouble("Q712"));
                newBundle.putDouble("Q713", LHbundle.getDouble("Q713"));
                newBundle.putDouble("Q714", LHbundle.getDouble("Q714"));
                newBundle.putDouble("Q715", LHbundle.getDouble("Q715"));
                newBundle.putDouble("Q716", LHbundle.getDouble("Q716"));
                newBundle.putDouble("Q717", LHbundle.getDouble("Q717"));
                newBundle.putDouble("Q718", LHbundle.getDouble("Q718"));
                newBundle.putDouble("Q719", LHbundle.getDouble("Q719"));
                newBundle.putDouble("Q720", LHbundle.getDouble("Q720"));
                newBundle.putDouble("Q721", LHbundle.getDouble("Q721"));
                newBundle.putDouble("Q722", LHbundle.getDouble("Q722"));
                newBundle.putDouble("Q723", LHbundle.getDouble("Q723"));
                newBundle.putDouble("Q724", LHbundle.getDouble("Q724"));
                newBundle.putDouble("Q725", LHbundle.getDouble("Q725"));
                newBundle.putDouble("Q726", LHbundle.getDouble("Q726"));
                newBundle.putDouble("Q727", LHbundle.getDouble("Q727"));
                newBundle.putDouble("Q728", LHbundle.getDouble("Q728"));
                newBundle.putDouble("Q729", LHbundle.getDouble("Q729"));
                newBundle.putDouble("Q730", LHbundle.getDouble("Q730"));


                ViewNoiLucbundle.putExtra("LHbundle", newBundle);
                startActivity(ViewNoiLucbundle);
            }
        });
    }
    //    public void kiemToan(){


    public void viewNoiLuc7() {
        txtViewMoreMV7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNoiLuc7bundle =
                        new Intent(KQKhongLienHop.this, ViewMoreNoiLuc7.class);
                ViewMoreNoiLuc7bundle.putExtra("M71", LHbundle.getDouble("M71"));
                ViewMoreNoiLuc7bundle.putExtra("M72", LHbundle.getDouble("M72"));
                ViewMoreNoiLuc7bundle.putExtra("M73", LHbundle.getDouble("M73"));
                ViewMoreNoiLuc7bundle.putExtra("M74", LHbundle.getDouble("M74"));
                ViewMoreNoiLuc7bundle.putExtra("M75", LHbundle.getDouble("M75"));
                ViewMoreNoiLuc7bundle.putExtra("M76", LHbundle.getDouble("M76"));
                ViewMoreNoiLuc7bundle.putExtra("M77", LHbundle.getDouble("M77"));
                ViewMoreNoiLuc7bundle.putExtra("M78", LHbundle.getDouble("M78"));
                ViewMoreNoiLuc7bundle.putExtra("M79", LHbundle.getDouble("M79"));
                ViewMoreNoiLuc7bundle.putExtra("M710", LHbundle.getDouble("M710"));
                ViewMoreNoiLuc7bundle.putExtra("M711", LHbundle.getDouble("M711"));
                ViewMoreNoiLuc7bundle.putExtra("M712", LHbundle.getDouble("M712"));
                ViewMoreNoiLuc7bundle.putExtra("M713", LHbundle.getDouble("M713"));
                ViewMoreNoiLuc7bundle.putExtra("M714", LHbundle.getDouble("M714"));
                ViewMoreNoiLuc7bundle.putExtra("M715", LHbundle.getDouble("M715"));
                ViewMoreNoiLuc7bundle.putExtra("M716", LHbundle.getDouble("M716"));
                ViewMoreNoiLuc7bundle.putExtra("M717", LHbundle.getDouble("M717"));
                ViewMoreNoiLuc7bundle.putExtra("M718", LHbundle.getDouble("M718"));
                ViewMoreNoiLuc7bundle.putExtra("M719", LHbundle.getDouble("M719"));
                ViewMoreNoiLuc7bundle.putExtra("M720", LHbundle.getDouble("M720"));
                ViewMoreNoiLuc7bundle.putExtra("M721", LHbundle.getDouble("M721"));
                ViewMoreNoiLuc7bundle.putExtra("M722", LHbundle.getDouble("M722"));
                ViewMoreNoiLuc7bundle.putExtra("M723", LHbundle.getDouble("M723"));
                ViewMoreNoiLuc7bundle.putExtra("M724", LHbundle.getDouble("M724"));

                ViewMoreNoiLuc7bundle.putExtra("Q71", LHbundle.getDouble("Q71"));
                ViewMoreNoiLuc7bundle.putExtra("Q72", LHbundle.getDouble("Q72"));
                ViewMoreNoiLuc7bundle.putExtra("Q73", LHbundle.getDouble("Q73"));
                ViewMoreNoiLuc7bundle.putExtra("Q74", LHbundle.getDouble("Q74"));
                ViewMoreNoiLuc7bundle.putExtra("Q75", LHbundle.getDouble("Q75"));
                ViewMoreNoiLuc7bundle.putExtra("Q76", LHbundle.getDouble("Q76"));
                ViewMoreNoiLuc7bundle.putExtra("Q77", LHbundle.getDouble("Q77"));
                ViewMoreNoiLuc7bundle.putExtra("Q78", LHbundle.getDouble("Q78"));
                ViewMoreNoiLuc7bundle.putExtra("Q79", LHbundle.getDouble("Q79"));
                ViewMoreNoiLuc7bundle.putExtra("Q710", LHbundle.getDouble("Q710"));
                ViewMoreNoiLuc7bundle.putExtra("Q711", LHbundle.getDouble("Q711"));
                ViewMoreNoiLuc7bundle.putExtra("Q712", LHbundle.getDouble("Q712"));
                ViewMoreNoiLuc7bundle.putExtra("Q713", LHbundle.getDouble("Q713"));
                ViewMoreNoiLuc7bundle.putExtra("Q714", LHbundle.getDouble("Q714"));
                ViewMoreNoiLuc7bundle.putExtra("Q715", LHbundle.getDouble("Q715"));
                ViewMoreNoiLuc7bundle.putExtra("Q716", LHbundle.getDouble("Q716"));
                ViewMoreNoiLuc7bundle.putExtra("Q717", LHbundle.getDouble("Q717"));
                ViewMoreNoiLuc7bundle.putExtra("Q718", LHbundle.getDouble("Q718"));
                ViewMoreNoiLuc7bundle.putExtra("Q719", LHbundle.getDouble("Q719"));
                ViewMoreNoiLuc7bundle.putExtra("Q720", LHbundle.getDouble("Q720"));
                ViewMoreNoiLuc7bundle.putExtra("Q721", LHbundle.getDouble("Q721"));
                ViewMoreNoiLuc7bundle.putExtra("Q722", LHbundle.getDouble("Q722"));
                ViewMoreNoiLuc7bundle.putExtra("Q723", LHbundle.getDouble("Q723"));
                ViewMoreNoiLuc7bundle.putExtra("Q724", LHbundle.getDouble("Q724"));
                ViewMoreNoiLuc7bundle.putExtra("Q725", LHbundle.getDouble("Q725"));
                ViewMoreNoiLuc7bundle.putExtra("Q726", LHbundle.getDouble("Q726"));
                ViewMoreNoiLuc7bundle.putExtra("Q727", LHbundle.getDouble("Q727"));
                ViewMoreNoiLuc7bundle.putExtra("Q728", LHbundle.getDouble("Q728"));
                ViewMoreNoiLuc7bundle.putExtra("Q729", LHbundle.getDouble("Q729"));
                ViewMoreNoiLuc7bundle.putExtra("Q730", LHbundle.getDouble("Q730"));

                startActivity(ViewMoreNoiLuc7bundle);
            }
        });
    }


    public void addConrols() {
        edtChieuCaoSuon= (TextView) findViewById(R.id.edtChieuCaoSuon);
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
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt3=(TextView)findViewById(R.id.txt3);
        txt4=(TextView)findViewById(R.id.txt4);
        txt5=(TextView)findViewById(R.id.txt5);
        txt6=(TextView)findViewById(R.id.txt6);
        txt7=(TextView)findViewById(R.id.txt7);
        txtbmc1 = (TextView) findViewById(R.id.txtbmc1);
        txtbmc2 = (TextView) findViewById(R.id.txtbmc2);
        txtbmc3 = (TextView) findViewById(R.id.txtbmc3);
        txtbmc4 = (TextView) findViewById(R.id.txtbmc4);
        txtbmc5 = (TextView) findViewById(R.id.txtbmc5);
        txtbmc6 = (TextView) findViewById(R.id.txtbmc6);
        txtbmc7 = (TextView) findViewById(R.id.txtbmc7);



        // tổng
        txtViewMoreMV7 = (TextView) findViewById(R.id.txtViewMoreMV7);
        //       TextView txtM74,txtM78,txtM712,txtM716,txtM720,txtM724;
        //        TextView txtQ71,txtQ76,txtQ711,txtQ716,txtQ721,txtQ721;
        txtM74 = (TextView) findViewById(R.id.txtM74);
        txtM78 = (TextView) findViewById(R.id.txtM78);
        txtM712 = (TextView) findViewById(R.id.txtM712);
        txtM716 = (TextView) findViewById(R.id.txtM716);
        txtM720 = (TextView) findViewById(R.id.txtM720);
        txtM724 = (TextView) findViewById(R.id.txtM724);
        txtQ71 = (TextView) findViewById(R.id.txtQ71);
        txtQ76 = (TextView) findViewById(R.id.txtQ76);
        txtQ711 = (TextView) findViewById(R.id.txtQ711);
        txtQ716 = (TextView) findViewById(R.id.txtQ716);
        txtQ721 = (TextView) findViewById(R.id.txtQ721);
        txtQ726 = (TextView) findViewById(R.id.txtQ726);
        txtviewNoiLuc = (TextView) findViewById(R.id.txtviewNoiLuc);
        ////////////////////KIỂM TOÁN////////////////////////////////////////

        ///
        txtViewKiemToan = (TextView) findViewById(R.id.txtViewKiemToan);
        txtViewBMC = (TextView) findViewById(R.id.txtViewBMC);





        //           =(TextView) findViewById(R.id.);
        //

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
            sp.setSpan(new SuperscriptSpan(), sp.length() - String.valueOf(count).length(),
                    sp.length(), 0);

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

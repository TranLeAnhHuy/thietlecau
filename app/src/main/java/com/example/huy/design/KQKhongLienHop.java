package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.huy.design.ViewNoiLuc.roundString;

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
    TextView txtM52,txtM51,txtf51,txtf52,txtf53,txtf54;
    TextView txtM64,txtQ64,txtViewMoreMV6;
    TextView txtViewMoreMV7;
    TextView txtM74,txtM78,txtM712,txtM716,txtM720,txtM724;
    TextView txtQ71,txtQ76,txtQ711,txtQ716,txtQ721,txtQ726;
    TextView txtviewNoiLuc;


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
//        // MOOIN LỰC TĨNH TẢI GD1
//        txtMmaxCD1GD1.setText(roundString(LHbundle.getDouble("M14"), 4));
//        txtMmaxSDGD1.setText(roundString(LHbundle.getDouble("M18"), 4));
//        txtQmaxCD1GD1.setText(roundString(LHbundle.getDouble("Q14"), 4));
//        txtQmaxSDGD1.setText(roundString(LHbundle.getDouble("Q18"), 4));
//        // ứng suất tĩnh tải GD1   txtftmaxCD1GD1,txtfdmaxCD1GD1,txtftmaxSDGD1,txtfdmaxSDGD1,txtViewMorefGD1;
//        txtftmaxCD1GD1.setText(roundString(LHbundle.getDouble("f14"), 4));
//        txtfdmaxCD1GD1.setText(roundString(LHbundle.getDouble("f18"), 4));
//        txtftmaxSDGD1.setText(roundString(LHbundle.getDouble("f112"), 4));
//        txtfdmaxSDGD1.setText(roundString(LHbundle.getDouble("f116"), 4));
//        // MOOIN LỰC TĨNH TẢI GD2
//        txtMmaxCD1GD2.setText(roundString(LHbundle.getDouble("M24"), 4));
//        txtMmaxSDGD2.setText(roundString(LHbundle.getDouble("M28"), 4));
//        txtQmaxCD1GD2.setText(roundString(LHbundle.getDouble("Q24"), 4));
//        txtQmaxSDGD2.setText(roundString(LHbundle.getDouble("Q28"), 4));
////        txtfdmaxDTSDGD2,txtftmaxDTSDGD2,txtfdmaxDTCD1GD2,txtftmaxDTCD1GD2;
//        txtfdmaxDTSDGD2.setText(roundString(LHbundle.getDouble("f216"), 4));
//        txtftmaxDTSDGD2.setText(roundString(LHbundle.getDouble("f212"), 4));
//        txtfdmaxDTCD1GD2.setText(roundString(LHbundle.getDouble("f28"), 4));
//        txtftmaxDTCD1GD2.setText(roundString(LHbundle.getDouble("f24"), 4));
//
//        txtfdmaxDNSDGD2.setText(roundString(LHbundle.getDouble("f232"), 4));
//        txtftmaxDNSDGD2.setText(roundString(LHbundle.getDouble("f228"), 4));
//        txtfdmaxDNCD1GD2.setText(roundString(LHbundle.getDouble("f224"), 4));
//        txtftmaxDNCD1GD2.setText(roundString(LHbundle.getDouble("f220"), 4));
//
//        //txtMmax3CD1,txtMmax3SD, txtQmax3CD1,txtQmax3SD;
//        txtMmax3CD1.setText(roundString(LHbundle.getDouble("M34"), 4));
//        txtMmax3SD.setText(roundString(LHbundle.getDouble("M38"), 4));
//        txtQmax3CD1.setText(roundString(LHbundle.getDouble("Q34"), 4));
//        txtQmax3SD.setText(roundString(LHbundle.getDouble("Q38"), 4));
//        //txtMmax4DNSD,txtMmax4DTSD,txtMmax4DNCD1,txtMmax4DTCD1, txtViewMoreMV4;
//        txtMmax4DNSD.setText(roundString(LHbundle.getDouble("M416"), 4));
//        txtMmax4DTSD.setText(roundString(LHbundle.getDouble("M412"), 4));
//        txtMmax4DNCD1.setText(roundString(LHbundle.getDouble("M48"), 4));
//        txtMmax4DTCD1.setText(roundString(LHbundle.getDouble("M44"), 4));
//        txtM51.setText(roundString(LHbundle.getDouble("M51"), 4));
//        txtM52.setText(roundString(LHbundle.getDouble("M52"), 4));
//        txtf51.setText(roundString(LHbundle.getDouble("f51"), 4));
//        txtf52.setText(roundString(LHbundle.getDouble("f52"), 4));
//        txtf53.setText(roundString(LHbundle.getDouble("f53"), 4));
//        txtf54.setText(roundString(LHbundle.getDouble("f54"), 4));
//        // mỏi
//        txtM64.setText(roundString(LHbundle.getDouble("M64"), 4));
//        txtQ64.setText(roundString(LHbundle.getDouble("Q61"), 4));
//        TextView txtM74,txtM78,txtM712,txtM716,txtM720,txtM724;
//        TextView txtQ71,txtQ76,txtQ711,txtQ716,txtQ721,txtQ721;
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







//        .setText(roundString(LHbundle.getDouble(""), 4));




        //txt.setText(roundString(LHbundle.getDouble(""), 4));
//        viewMoreNoiLucGD1();
//        viewMorefGD1();
//        viewMoreNoiLucGD2();
//        viewMorefGD2();
//        viewMoreNoiLuc3();
//        viewMoreNoiLuc4();
//        viewMoreNoiLuc6();
        viewNoiLuc7();
        viewNoiLuc();


    }
    public void  viewNoiLuc(){
        txtviewNoiLuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewNoiLucbundle = new Intent(KQKhongLienHop.this, ViewNoiLuc.class);
                //nội lực 1
                ///
                ViewNoiLucbundle.putExtra("M11", LHbundle.getDouble("M11"));
                ViewNoiLucbundle.putExtra("M12", LHbundle.getDouble("M12"));
                ViewNoiLucbundle.putExtra("M13", LHbundle.getDouble("M13"));
                ViewNoiLucbundle.putExtra("M14", LHbundle.getDouble("M14"));
                ViewNoiLucbundle.putExtra("M15", LHbundle.getDouble("M15"));
                ViewNoiLucbundle.putExtra("M16", LHbundle.getDouble("M16"));
                ViewNoiLucbundle.putExtra("M17", LHbundle.getDouble("M17"));
                ViewNoiLucbundle.putExtra("M18", LHbundle.getDouble("M18"));
                ViewNoiLucbundle.putExtra("Q11", LHbundle.getDouble("Q11"));
                ViewNoiLucbundle.putExtra("Q12", LHbundle.getDouble("Q12"));
                ViewNoiLucbundle.putExtra("Q13", LHbundle.getDouble("Q13"));
                ViewNoiLucbundle.putExtra("Q14", LHbundle.getDouble("Q14"));
                ViewNoiLucbundle.putExtra("Q15", LHbundle.getDouble("Q15"));
                ViewNoiLucbundle.putExtra("Q16", LHbundle.getDouble("Q16"));
                ViewNoiLucbundle.putExtra("Q17", LHbundle.getDouble("Q17"));
                ViewNoiLucbundle.putExtra("Q18", LHbundle.getDouble("Q18"));
                // ứng suất 1
                ViewNoiLucbundle.putExtra("f11", LHbundle.getDouble("f11"));
                ViewNoiLucbundle.putExtra("f12", LHbundle.getDouble("f12"));
                ViewNoiLucbundle.putExtra("f13", LHbundle.getDouble("f13"));
                ViewNoiLucbundle.putExtra("f14", LHbundle.getDouble("f14"));
                ViewNoiLucbundle.putExtra("f15", LHbundle.getDouble("f15"));
                ViewNoiLucbundle.putExtra("f16", LHbundle.getDouble("f16"));
                ViewNoiLucbundle.putExtra("f17", LHbundle.getDouble("f17"));
                ViewNoiLucbundle.putExtra("f18", LHbundle.getDouble("f18"));
                ViewNoiLucbundle.putExtra("f19", LHbundle.getDouble("f19"));
                ViewNoiLucbundle.putExtra("f110", LHbundle.getDouble("f110"));
                ViewNoiLucbundle.putExtra("f111", LHbundle.getDouble("f111"));
                ViewNoiLucbundle.putExtra("f112", LHbundle.getDouble("f112"));
                ViewNoiLucbundle.putExtra("f113", LHbundle.getDouble("f113"));
                ViewNoiLucbundle.putExtra("f114", LHbundle.getDouble("f114"));
                ViewNoiLucbundle.putExtra("f115", LHbundle.getDouble("f115"));
                ViewNoiLucbundle.putExtra("f116", LHbundle.getDouble("f116"));

                // nội lực 2
                ViewNoiLucbundle.putExtra("M21", LHbundle.getDouble("M21"));
                ViewNoiLucbundle.putExtra("M22", LHbundle.getDouble("M22"));
                ViewNoiLucbundle.putExtra("M23", LHbundle.getDouble("M23"));
                ViewNoiLucbundle.putExtra("M24", LHbundle.getDouble("M24"));
                ViewNoiLucbundle.putExtra("M25", LHbundle.getDouble("M25"));
                ViewNoiLucbundle.putExtra("M26", LHbundle.getDouble("M26"));
                ViewNoiLucbundle.putExtra("M27", LHbundle.getDouble("M27"));
                ViewNoiLucbundle.putExtra("M28", LHbundle.getDouble("M28"));
                ViewNoiLucbundle.putExtra("Q21", LHbundle.getDouble("Q21"));
                ViewNoiLucbundle.putExtra("Q22", LHbundle.getDouble("Q22"));
                ViewNoiLucbundle.putExtra("Q23", LHbundle.getDouble("Q23"));
                ViewNoiLucbundle.putExtra("Q24", LHbundle.getDouble("Q24"));
                ViewNoiLucbundle.putExtra("Q25", LHbundle.getDouble("Q25"));
                ViewNoiLucbundle.putExtra("Q26", LHbundle.getDouble("Q26"));
                ViewNoiLucbundle.putExtra("Q27", LHbundle.getDouble("Q27"));
                ViewNoiLucbundle.putExtra("Q28", LHbundle.getDouble("Q28"));
                //ứng suất 2
                ViewNoiLucbundle.putExtra("f21", LHbundle.getDouble("f21"));
                ViewNoiLucbundle.putExtra("f22", LHbundle.getDouble("f22"));
                ViewNoiLucbundle.putExtra("f23", LHbundle.getDouble("f23"));
                ViewNoiLucbundle.putExtra("f24", LHbundle.getDouble("f24"));
                ViewNoiLucbundle.putExtra("f25", LHbundle.getDouble("f25"));
                ViewNoiLucbundle.putExtra("f26", LHbundle.getDouble("f26"));
                ViewNoiLucbundle.putExtra("f27", LHbundle.getDouble("f27"));
                ViewNoiLucbundle.putExtra("f28", LHbundle.getDouble("f28"));
                ViewNoiLucbundle.putExtra("f29", LHbundle.getDouble("f29"));
                ViewNoiLucbundle.putExtra("f210", LHbundle.getDouble("f210"));
                ViewNoiLucbundle.putExtra("f211", LHbundle.getDouble("f211"));
                ViewNoiLucbundle.putExtra("f212", LHbundle.getDouble("f212"));
                ViewNoiLucbundle.putExtra("f213", LHbundle.getDouble("f213"));
                ViewNoiLucbundle.putExtra("f214", LHbundle.getDouble("f214"));
                ViewNoiLucbundle.putExtra("f215", LHbundle.getDouble("f215"));
                ViewNoiLucbundle.putExtra("f216", LHbundle.getDouble("f216"));
                ViewNoiLucbundle.putExtra("f217", LHbundle.getDouble("f217"));
                ViewNoiLucbundle.putExtra("f218", LHbundle.getDouble("f218"));
                ViewNoiLucbundle.putExtra("f219", LHbundle.getDouble("f219"));
                ViewNoiLucbundle.putExtra("f220", LHbundle.getDouble("f220"));
                ViewNoiLucbundle.putExtra("f221", LHbundle.getDouble("f221"));
                ViewNoiLucbundle.putExtra("f222", LHbundle.getDouble("f222"));
                ViewNoiLucbundle.putExtra("f223", LHbundle.getDouble("f223"));
                ViewNoiLucbundle.putExtra("f224", LHbundle.getDouble("f224"));
                ViewNoiLucbundle.putExtra("f225", LHbundle.getDouble("f225"));
                ViewNoiLucbundle.putExtra("f226", LHbundle.getDouble("f226"));
                ViewNoiLucbundle.putExtra("f227", LHbundle.getDouble("f227"));
                ViewNoiLucbundle.putExtra("f228", LHbundle.getDouble("f228"));
                ViewNoiLucbundle.putExtra("f229", LHbundle.getDouble("f229"));
                ViewNoiLucbundle.putExtra("f230", LHbundle.getDouble("f230"));
                ViewNoiLucbundle.putExtra("f231", LHbundle.getDouble("f231"));
                ViewNoiLucbundle.putExtra("f232", LHbundle.getDouble("f232"));

                // nội lực 3
                ViewNoiLucbundle.putExtra("M31", LHbundle.getDouble("M31"));
                ViewNoiLucbundle.putExtra("M32", LHbundle.getDouble("M32"));
                ViewNoiLucbundle.putExtra("M33", LHbundle.getDouble("M33"));
                ViewNoiLucbundle.putExtra("M34", LHbundle.getDouble("M34"));
                ViewNoiLucbundle.putExtra("M35", LHbundle.getDouble("M35"));
                ViewNoiLucbundle.putExtra("M36", LHbundle.getDouble("M36"));
                ViewNoiLucbundle.putExtra("M37", LHbundle.getDouble("M37"));
                ViewNoiLucbundle.putExtra("M38", LHbundle.getDouble("M38"));
                ViewNoiLucbundle.putExtra("Q31", LHbundle.getDouble("Q31"));
                ViewNoiLucbundle.putExtra("Q32", LHbundle.getDouble("Q32"));
                ViewNoiLucbundle.putExtra("Q33", LHbundle.getDouble("Q33"));
                ViewNoiLucbundle.putExtra("Q34", LHbundle.getDouble("Q34"));
                ViewNoiLucbundle.putExtra("Q35", LHbundle.getDouble("Q35"));
                ViewNoiLucbundle.putExtra("Q36", LHbundle.getDouble("Q36"));
                ViewNoiLucbundle.putExtra("Q37", LHbundle.getDouble("Q37"));
                ViewNoiLucbundle.putExtra("Q38", LHbundle.getDouble("Q38"));
                // nội lực 4
                ViewNoiLucbundle.putExtra("M41", LHbundle.getDouble("M41"));
                ViewNoiLucbundle.putExtra("M42", LHbundle.getDouble("M42"));
                ViewNoiLucbundle.putExtra("M43", LHbundle.getDouble("M43"));
                ViewNoiLucbundle.putExtra("M44", LHbundle.getDouble("M44"));
                ViewNoiLucbundle.putExtra("M45", LHbundle.getDouble("M45"));
                ViewNoiLucbundle.putExtra("M46", LHbundle.getDouble("M46"));
                ViewNoiLucbundle.putExtra("M47", LHbundle.getDouble("M47"));
                ViewNoiLucbundle.putExtra("M48", LHbundle.getDouble("M48"));
                ViewNoiLucbundle.putExtra("M49", LHbundle.getDouble("M49"));
                ViewNoiLucbundle.putExtra("M410", LHbundle.getDouble("M410"));
                ViewNoiLucbundle.putExtra("M411", LHbundle.getDouble("M411"));
                ViewNoiLucbundle.putExtra("M412", LHbundle.getDouble("M412"));
                ViewNoiLucbundle.putExtra("M413", LHbundle.getDouble("M413"));
                ViewNoiLucbundle.putExtra("M414", LHbundle.getDouble("M414"));
                ViewNoiLucbundle.putExtra("M415", LHbundle.getDouble("M415"));
                ViewNoiLucbundle.putExtra("M416", LHbundle.getDouble("M416"));
                ViewNoiLucbundle.putExtra("Q41", LHbundle.getDouble("Q41"));
                ViewNoiLucbundle.putExtra("Q42", LHbundle.getDouble("Q42"));
                ViewNoiLucbundle.putExtra("Q43", LHbundle.getDouble("Q43"));
                ViewNoiLucbundle.putExtra("Q44", LHbundle.getDouble("Q44"));
                ViewNoiLucbundle.putExtra("Q45", LHbundle.getDouble("Q45"));
                ViewNoiLucbundle.putExtra("Q46", LHbundle.getDouble("Q46"));
                ViewNoiLucbundle.putExtra("Q47", LHbundle.getDouble("Q47"));
                ViewNoiLucbundle.putExtra("Q48", LHbundle.getDouble("Q48"));
                ViewNoiLucbundle.putExtra("Q49", LHbundle.getDouble("Q49"));
                ViewNoiLucbundle.putExtra("Q410", LHbundle.getDouble("Q410"));
                ViewNoiLucbundle.putExtra("Q411", LHbundle.getDouble("Q411"));
                ViewNoiLucbundle.putExtra("Q412", LHbundle.getDouble("Q412"));
                ViewNoiLucbundle.putExtra("Q413", LHbundle.getDouble("Q413"));
                ViewNoiLucbundle.putExtra("Q414", LHbundle.getDouble("Q414"));
                ViewNoiLucbundle.putExtra("Q415", LHbundle.getDouble("Q415"));
                ViewNoiLucbundle.putExtra("Q416", LHbundle.getDouble("Q416"));
                ViewNoiLucbundle.putExtra("Q417", LHbundle.getDouble("Q417"));
                ViewNoiLucbundle.putExtra("Q418", LHbundle.getDouble("Q418"));
                ViewNoiLucbundle.putExtra("Q419", LHbundle.getDouble("Q419"));
                ViewNoiLucbundle.putExtra("Q420", LHbundle.getDouble("Q420"));
                ViewNoiLucbundle.putExtra("Q421", LHbundle.getDouble("Q421"));
                ViewNoiLucbundle.putExtra("Q422", LHbundle.getDouble("Q422"));
                ViewNoiLucbundle.putExtra("Q423", LHbundle.getDouble("Q423"));
                ViewNoiLucbundle.putExtra("Q424", LHbundle.getDouble("Q424"));
                ViewNoiLucbundle.putExtra("Q425", LHbundle.getDouble("Q425"));
                ViewNoiLucbundle.putExtra("Q426", LHbundle.getDouble("Q426"));
                ViewNoiLucbundle.putExtra("Q427", LHbundle.getDouble("Q427"));
                ViewNoiLucbundle.putExtra("Q428", LHbundle.getDouble("Q428"));
                ViewNoiLucbundle.putExtra("Q429", LHbundle.getDouble("Q429"));
                ViewNoiLucbundle.putExtra("Q430", LHbundle.getDouble("Q430"));
                ViewNoiLucbundle.putExtra("Q431", LHbundle.getDouble("Q431"));
                ViewNoiLucbundle.putExtra("Q432", LHbundle.getDouble("Q432"));
                ViewNoiLucbundle.putExtra("Q433", LHbundle.getDouble("Q433"));
                ViewNoiLucbundle.putExtra("Q434", LHbundle.getDouble("Q434"));
                ViewNoiLucbundle.putExtra("Q435", LHbundle.getDouble("Q435"));
                ViewNoiLucbundle.putExtra("Q436", LHbundle.getDouble("Q436"));
                ViewNoiLucbundle.putExtra("Q437", LHbundle.getDouble("Q437"));
                ViewNoiLucbundle.putExtra("Q438", LHbundle.getDouble("Q438"));
                ViewNoiLucbundle.putExtra("Q439", LHbundle.getDouble("Q439"));
                ViewNoiLucbundle.putExtra("Q440", LHbundle.getDouble("Q440"));
                // nội lực 5
                ViewNoiLucbundle.putExtra("M51", LHbundle.getDouble("M51"));
                ViewNoiLucbundle.putExtra("M52", LHbundle.getDouble("M52"));
                ViewNoiLucbundle.putExtra("f51", LHbundle.getDouble("f51"));
                ViewNoiLucbundle.putExtra("f52", LHbundle.getDouble("f52"));
                ViewNoiLucbundle.putExtra("f53", LHbundle.getDouble("f53"));
                ViewNoiLucbundle.putExtra("f54", LHbundle.getDouble("f54"));


                // nội lực 6
                ViewNoiLucbundle.putExtra("M61", LHbundle.getDouble("M61"));
                ViewNoiLucbundle.putExtra("M62", LHbundle.getDouble("M62"));
                ViewNoiLucbundle.putExtra("M63", LHbundle.getDouble("M63"));
                ViewNoiLucbundle.putExtra("M64", LHbundle.getDouble("M64"));
                ViewNoiLucbundle.putExtra("Q61", LHbundle.getDouble("Q61"));
                ViewNoiLucbundle.putExtra("Q62", LHbundle.getDouble("Q62"));
                ViewNoiLucbundle.putExtra("Q63", LHbundle.getDouble("Q63"));
                ViewNoiLucbundle.putExtra("Q64", LHbundle.getDouble("Q64"));
                ViewNoiLucbundle.putExtra("Q65", LHbundle.getDouble("Q65"));
                ViewNoiLucbundle.putExtra("Q66", LHbundle.getDouble("Q66"));
                ViewNoiLucbundle.putExtra("Q67", LHbundle.getDouble("Q67"));
                ViewNoiLucbundle.putExtra("Q68", LHbundle.getDouble("Q68"));
                ViewNoiLucbundle.putExtra("Q69", LHbundle.getDouble("Q69"));
                ViewNoiLucbundle.putExtra("Q610", LHbundle.getDouble("Q610"));


                ///nội lực 7
                ViewNoiLucbundle.putExtra("M71", LHbundle.getDouble("M71"));
                ViewNoiLucbundle.putExtra("M72", LHbundle.getDouble("M72"));
                ViewNoiLucbundle.putExtra("M73", LHbundle.getDouble("M73"));
                ViewNoiLucbundle.putExtra("M74", LHbundle.getDouble("M74"));
                ViewNoiLucbundle.putExtra("M75", LHbundle.getDouble("M75"));
                ViewNoiLucbundle.putExtra("M76", LHbundle.getDouble("M76"));
                ViewNoiLucbundle.putExtra("M77", LHbundle.getDouble("M77"));
                ViewNoiLucbundle.putExtra("M78", LHbundle.getDouble("M78"));
                ViewNoiLucbundle.putExtra("M79", LHbundle.getDouble("M79"));
                ViewNoiLucbundle.putExtra("M710", LHbundle.getDouble("M710"));
                ViewNoiLucbundle.putExtra("M711", LHbundle.getDouble("M711"));
                ViewNoiLucbundle.putExtra("M712", LHbundle.getDouble("M712"));
                ViewNoiLucbundle.putExtra("M713", LHbundle.getDouble("M713"));
                ViewNoiLucbundle.putExtra("M714", LHbundle.getDouble("M714"));
                ViewNoiLucbundle.putExtra("M715", LHbundle.getDouble("M715"));
                ViewNoiLucbundle.putExtra("M716", LHbundle.getDouble("M716"));
                ViewNoiLucbundle.putExtra("M717", LHbundle.getDouble("M717"));
                ViewNoiLucbundle.putExtra("M718", LHbundle.getDouble("M718"));
                ViewNoiLucbundle.putExtra("M719", LHbundle.getDouble("M719"));
                ViewNoiLucbundle.putExtra("M720", LHbundle.getDouble("M720"));
                ViewNoiLucbundle.putExtra("M721", LHbundle.getDouble("M721"));
                ViewNoiLucbundle.putExtra("M722", LHbundle.getDouble("M722"));
                ViewNoiLucbundle.putExtra("M723", LHbundle.getDouble("M723"));
                ViewNoiLucbundle.putExtra("M724", LHbundle.getDouble("M724"));

                ViewNoiLucbundle.putExtra("Q71", LHbundle.getDouble("Q71"));
                ViewNoiLucbundle.putExtra("Q72", LHbundle.getDouble("Q72"));
                ViewNoiLucbundle.putExtra("Q73", LHbundle.getDouble("Q73"));
                ViewNoiLucbundle.putExtra("Q74", LHbundle.getDouble("Q74"));
                ViewNoiLucbundle.putExtra("Q75", LHbundle.getDouble("Q75"));
                ViewNoiLucbundle.putExtra("Q76", LHbundle.getDouble("Q76"));
                ViewNoiLucbundle.putExtra("Q77", LHbundle.getDouble("Q77"));
                ViewNoiLucbundle.putExtra("Q78", LHbundle.getDouble("Q78"));
                ViewNoiLucbundle.putExtra("Q79", LHbundle.getDouble("Q79"));
                ViewNoiLucbundle.putExtra("Q710", LHbundle.getDouble("Q710"));
                ViewNoiLucbundle.putExtra("Q711", LHbundle.getDouble("Q711"));
                ViewNoiLucbundle.putExtra("Q712", LHbundle.getDouble("Q712"));
                ViewNoiLucbundle.putExtra("Q713", LHbundle.getDouble("Q713"));
                ViewNoiLucbundle.putExtra("Q714", LHbundle.getDouble("Q714"));
                ViewNoiLucbundle.putExtra("Q715", LHbundle.getDouble("Q715"));
                ViewNoiLucbundle.putExtra("Q716", LHbundle.getDouble("Q716"));
                ViewNoiLucbundle.putExtra("Q717", LHbundle.getDouble("Q717"));
                ViewNoiLucbundle.putExtra("Q718", LHbundle.getDouble("Q718"));
                ViewNoiLucbundle.putExtra("Q719", LHbundle.getDouble("Q719"));
                ViewNoiLucbundle.putExtra("Q720", LHbundle.getDouble("Q720"));
                ViewNoiLucbundle.putExtra("Q721", LHbundle.getDouble("Q721"));
                ViewNoiLucbundle.putExtra("Q722", LHbundle.getDouble("Q722"));
                ViewNoiLucbundle.putExtra("Q723", LHbundle.getDouble("Q723"));
                ViewNoiLucbundle.putExtra("Q724", LHbundle.getDouble("Q724"));
                ViewNoiLucbundle.putExtra("Q725", LHbundle.getDouble("Q725"));
                ViewNoiLucbundle.putExtra("Q726", LHbundle.getDouble("Q726"));
                ViewNoiLucbundle.putExtra("Q727", LHbundle.getDouble("Q727"));
                ViewNoiLucbundle.putExtra("Q728", LHbundle.getDouble("Q728"));
                ViewNoiLucbundle.putExtra("Q729", LHbundle.getDouble("Q729"));
                ViewNoiLucbundle.putExtra("Q730", LHbundle.getDouble("Q730"));

                startActivity(ViewNoiLucbundle);

            }
        });

    }
//    public void kiemToan(){
//        edtd0.addTextChangedListener(new TextWatcher() {
//                        @Override
//                        public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//                        }
//
//                        @Override
//                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//                        }
//
//                        @Override
//                        public void afterTextChanged(Editable s) {
//                            // code khi text thay đôi
//
//                            // đóng gói và truyền dữ liệu
//                            Intent d0intent = new Intent(KQKhongLienHop.this, nhaplieuthietke.class);
//                            Bundle d0bundle = new Bundle();
//                            d0bundle.putDouble("d0", d0);
//                            d0intent.putExtra("d0bundle", d0bundle);
//                            startActivity(d0intent);
//                        }
//                    });

    public void  viewNoiLuc7(){
        txtViewMoreMV7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNoiLuc7bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLuc7.class);
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
//    public void  viewMoreNoiLuc6(){
//        txtViewMoreMV6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreNoiLuc6bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLuc6.class);
//                ViewMoreNoiLuc6bundle.putExtra("M61", LHbundle.getDouble("M61"));
//                ViewMoreNoiLuc6bundle.putExtra("M62", LHbundle.getDouble("M62"));
//                ViewMoreNoiLuc6bundle.putExtra("M63", LHbundle.getDouble("M63"));
//                ViewMoreNoiLuc6bundle.putExtra("M64", LHbundle.getDouble("M64"));
//                ViewMoreNoiLuc6bundle.putExtra("Q61", LHbundle.getDouble("Q61"));
//                ViewMoreNoiLuc6bundle.putExtra("Q62", LHbundle.getDouble("Q62"));
//                ViewMoreNoiLuc6bundle.putExtra("Q63", LHbundle.getDouble("Q63"));
//                ViewMoreNoiLuc6bundle.putExtra("Q64", LHbundle.getDouble("Q64"));
//                ViewMoreNoiLuc6bundle.putExtra("Q65", LHbundle.getDouble("Q65"));
//                ViewMoreNoiLuc6bundle.putExtra("Q66", LHbundle.getDouble("Q66"));
//                ViewMoreNoiLuc6bundle.putExtra("Q67", LHbundle.getDouble("Q67"));
//                ViewMoreNoiLuc6bundle.putExtra("Q68", LHbundle.getDouble("Q68"));
//                ViewMoreNoiLuc6bundle.putExtra("Q69", LHbundle.getDouble("Q69"));
//                ViewMoreNoiLuc6bundle.putExtra("Q610", LHbundle.getDouble("Q610"));
//
//
//
//                startActivity(ViewMoreNoiLuc6bundle);
//
//
//            }
//        });
//
//    }
//    public void viewMoreNoiLuc4(){
//        txtViewMoreMV4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreNoiLuc4bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLuc4.class);
//                ViewMoreNoiLuc4bundle.putExtra("M41", LHbundle.getDouble("M41"));
//                ViewMoreNoiLuc4bundle.putExtra("M42", LHbundle.getDouble("M42"));
//                ViewMoreNoiLuc4bundle.putExtra("M43", LHbundle.getDouble("M43"));
//                ViewMoreNoiLuc4bundle.putExtra("M44", LHbundle.getDouble("M44"));
//                ViewMoreNoiLuc4bundle.putExtra("M45", LHbundle.getDouble("M45"));
//                ViewMoreNoiLuc4bundle.putExtra("M46", LHbundle.getDouble("M46"));
//                ViewMoreNoiLuc4bundle.putExtra("M47", LHbundle.getDouble("M47"));
//                ViewMoreNoiLuc4bundle.putExtra("M48", LHbundle.getDouble("M48"));
//                ViewMoreNoiLuc4bundle.putExtra("M49", LHbundle.getDouble("M49"));
//                ViewMoreNoiLuc4bundle.putExtra("M410", LHbundle.getDouble("M410"));
//                ViewMoreNoiLuc4bundle.putExtra("M411", LHbundle.getDouble("M411"));
//                ViewMoreNoiLuc4bundle.putExtra("M412", LHbundle.getDouble("M412"));
//                ViewMoreNoiLuc4bundle.putExtra("M413", LHbundle.getDouble("M413"));
//                ViewMoreNoiLuc4bundle.putExtra("M414", LHbundle.getDouble("M414"));
//                ViewMoreNoiLuc4bundle.putExtra("M415", LHbundle.getDouble("M415"));
//                ViewMoreNoiLuc4bundle.putExtra("M416", LHbundle.getDouble("M416"));
//                ViewMoreNoiLuc4bundle.putExtra("Q41", LHbundle.getDouble("Q41"));
//                ViewMoreNoiLuc4bundle.putExtra("Q42", LHbundle.getDouble("Q42"));
//                ViewMoreNoiLuc4bundle.putExtra("Q43", LHbundle.getDouble("Q43"));
//                ViewMoreNoiLuc4bundle.putExtra("Q44", LHbundle.getDouble("Q44"));
//                ViewMoreNoiLuc4bundle.putExtra("Q45", LHbundle.getDouble("Q45"));
//                ViewMoreNoiLuc4bundle.putExtra("Q46", LHbundle.getDouble("Q46"));
//                ViewMoreNoiLuc4bundle.putExtra("Q47", LHbundle.getDouble("Q47"));
//                ViewMoreNoiLuc4bundle.putExtra("Q48", LHbundle.getDouble("Q48"));
//                ViewMoreNoiLuc4bundle.putExtra("Q49", LHbundle.getDouble("Q49"));
//                ViewMoreNoiLuc4bundle.putExtra("Q410", LHbundle.getDouble("Q410"));
//                ViewMoreNoiLuc4bundle.putExtra("Q411", LHbundle.getDouble("Q411"));
//                ViewMoreNoiLuc4bundle.putExtra("Q412", LHbundle.getDouble("Q412"));
//                ViewMoreNoiLuc4bundle.putExtra("Q413", LHbundle.getDouble("Q413"));
//                ViewMoreNoiLuc4bundle.putExtra("Q414", LHbundle.getDouble("Q414"));
//                ViewMoreNoiLuc4bundle.putExtra("Q415", LHbundle.getDouble("Q415"));
//                ViewMoreNoiLuc4bundle.putExtra("Q416", LHbundle.getDouble("Q416"));
//                ViewMoreNoiLuc4bundle.putExtra("Q417", LHbundle.getDouble("Q417"));
//                ViewMoreNoiLuc4bundle.putExtra("Q418", LHbundle.getDouble("Q418"));
//                ViewMoreNoiLuc4bundle.putExtra("Q419", LHbundle.getDouble("Q419"));
//                ViewMoreNoiLuc4bundle.putExtra("Q420", LHbundle.getDouble("Q420"));
//                ViewMoreNoiLuc4bundle.putExtra("Q421", LHbundle.getDouble("Q421"));
//                ViewMoreNoiLuc4bundle.putExtra("Q422", LHbundle.getDouble("Q422"));
//                ViewMoreNoiLuc4bundle.putExtra("Q423", LHbundle.getDouble("Q423"));
//                ViewMoreNoiLuc4bundle.putExtra("Q424", LHbundle.getDouble("Q424"));
//                ViewMoreNoiLuc4bundle.putExtra("Q425", LHbundle.getDouble("Q425"));
//                ViewMoreNoiLuc4bundle.putExtra("Q426", LHbundle.getDouble("Q426"));
//                ViewMoreNoiLuc4bundle.putExtra("Q427", LHbundle.getDouble("Q427"));
//                ViewMoreNoiLuc4bundle.putExtra("Q428", LHbundle.getDouble("Q428"));
//                ViewMoreNoiLuc4bundle.putExtra("Q429", LHbundle.getDouble("Q429"));
//                ViewMoreNoiLuc4bundle.putExtra("Q430", LHbundle.getDouble("Q430"));
//                ViewMoreNoiLuc4bundle.putExtra("Q431", LHbundle.getDouble("Q431"));
//                ViewMoreNoiLuc4bundle.putExtra("Q432", LHbundle.getDouble("Q432"));
//                ViewMoreNoiLuc4bundle.putExtra("Q433", LHbundle.getDouble("Q433"));
//                ViewMoreNoiLuc4bundle.putExtra("Q434", LHbundle.getDouble("Q434"));
//                ViewMoreNoiLuc4bundle.putExtra("Q435", LHbundle.getDouble("Q435"));
//                ViewMoreNoiLuc4bundle.putExtra("Q436", LHbundle.getDouble("Q436"));
//                ViewMoreNoiLuc4bundle.putExtra("Q437", LHbundle.getDouble("Q437"));
//                ViewMoreNoiLuc4bundle.putExtra("Q438", LHbundle.getDouble("Q438"));
//                ViewMoreNoiLuc4bundle.putExtra("Q439", LHbundle.getDouble("Q439"));
//                ViewMoreNoiLuc4bundle.putExtra("Q440", LHbundle.getDouble("Q440"));
//
//                startActivity(ViewMoreNoiLuc4bundle);
//
//            }
//        });
//    }
//    public void viewMoreNoiLuc3(){
//        txtViewMoreMV3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreNoiLuc3bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLuc3.class);
//                ViewMoreNoiLuc3bundle.putExtra("M31", LHbundle.getDouble("M31"));
//                ViewMoreNoiLuc3bundle.putExtra("M32", LHbundle.getDouble("M32"));
//                ViewMoreNoiLuc3bundle.putExtra("M33", LHbundle.getDouble("M33"));
//                ViewMoreNoiLuc3bundle.putExtra("M34", LHbundle.getDouble("M34"));
//                ViewMoreNoiLuc3bundle.putExtra("M35", LHbundle.getDouble("M35"));
//                ViewMoreNoiLuc3bundle.putExtra("M36", LHbundle.getDouble("M36"));
//                ViewMoreNoiLuc3bundle.putExtra("M37", LHbundle.getDouble("M37"));
//                ViewMoreNoiLuc3bundle.putExtra("M38", LHbundle.getDouble("M38"));
//                ViewMoreNoiLuc3bundle.putExtra("Q31", LHbundle.getDouble("Q31"));
//                ViewMoreNoiLuc3bundle.putExtra("Q32", LHbundle.getDouble("Q32"));
//                ViewMoreNoiLuc3bundle.putExtra("Q33", LHbundle.getDouble("Q33"));
//                ViewMoreNoiLuc3bundle.putExtra("Q34", LHbundle.getDouble("Q34"));
//                ViewMoreNoiLuc3bundle.putExtra("Q35", LHbundle.getDouble("Q35"));
//                ViewMoreNoiLuc3bundle.putExtra("Q36", LHbundle.getDouble("Q36"));
//                ViewMoreNoiLuc3bundle.putExtra("Q37", LHbundle.getDouble("Q37"));
//                ViewMoreNoiLuc3bundle.putExtra("Q38", LHbundle.getDouble("Q38"));
//
//
//                startActivity(ViewMoreNoiLuc3bundle);
//            }
//        });
//    }
//    public void viewMorefGD2(){
//        txtViewMorefGD2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreUngSuatGD2bundle = new Intent(KQKhongLienHop.this, ViewMoreUngSuatGD2.class);
//                ViewMoreUngSuatGD2bundle.putExtra("f21", LHbundle.getDouble("f21"));
//                ViewMoreUngSuatGD2bundle.putExtra("f22", LHbundle.getDouble("f22"));
//                ViewMoreUngSuatGD2bundle.putExtra("f23", LHbundle.getDouble("f23"));
//                ViewMoreUngSuatGD2bundle.putExtra("f24", LHbundle.getDouble("f24"));
//                ViewMoreUngSuatGD2bundle.putExtra("f25", LHbundle.getDouble("f25"));
//                ViewMoreUngSuatGD2bundle.putExtra("f26", LHbundle.getDouble("f26"));
//                ViewMoreUngSuatGD2bundle.putExtra("f27", LHbundle.getDouble("f27"));
//                ViewMoreUngSuatGD2bundle.putExtra("f28", LHbundle.getDouble("f28"));
//                ViewMoreUngSuatGD2bundle.putExtra("f29", LHbundle.getDouble("f29"));
//                ViewMoreUngSuatGD2bundle.putExtra("f210", LHbundle.getDouble("f210"));
//                ViewMoreUngSuatGD2bundle.putExtra("f211", LHbundle.getDouble("f211"));
//                ViewMoreUngSuatGD2bundle.putExtra("f212", LHbundle.getDouble("f212"));
//                ViewMoreUngSuatGD2bundle.putExtra("f213", LHbundle.getDouble("f213"));
//                ViewMoreUngSuatGD2bundle.putExtra("f214", LHbundle.getDouble("f214"));
//                ViewMoreUngSuatGD2bundle.putExtra("f215", LHbundle.getDouble("f215"));
//                ViewMoreUngSuatGD2bundle.putExtra("f216", LHbundle.getDouble("f216"));
//                ViewMoreUngSuatGD2bundle.putExtra("f217", LHbundle.getDouble("f217"));
//                ViewMoreUngSuatGD2bundle.putExtra("f218", LHbundle.getDouble("f218"));
//                ViewMoreUngSuatGD2bundle.putExtra("f219", LHbundle.getDouble("f219"));
//                ViewMoreUngSuatGD2bundle.putExtra("f220", LHbundle.getDouble("f220"));
//                ViewMoreUngSuatGD2bundle.putExtra("f221", LHbundle.getDouble("f221"));
//                ViewMoreUngSuatGD2bundle.putExtra("f222", LHbundle.getDouble("f222"));
//                ViewMoreUngSuatGD2bundle.putExtra("f223", LHbundle.getDouble("f223"));
//                ViewMoreUngSuatGD2bundle.putExtra("f224", LHbundle.getDouble("f224"));
//                ViewMoreUngSuatGD2bundle.putExtra("f225", LHbundle.getDouble("f225"));
//                ViewMoreUngSuatGD2bundle.putExtra("f226", LHbundle.getDouble("f226"));
//                ViewMoreUngSuatGD2bundle.putExtra("f227", LHbundle.getDouble("f227"));
//                ViewMoreUngSuatGD2bundle.putExtra("f228", LHbundle.getDouble("f228"));
//                ViewMoreUngSuatGD2bundle.putExtra("f229", LHbundle.getDouble("f229"));
//                ViewMoreUngSuatGD2bundle.putExtra("f230", LHbundle.getDouble("f230"));
//                ViewMoreUngSuatGD2bundle.putExtra("f231", LHbundle.getDouble("f231"));
//                ViewMoreUngSuatGD2bundle.putExtra("f232", LHbundle.getDouble("f232"));
//
//                startActivity(ViewMoreUngSuatGD2bundle);
//            }
//        });
//
//    }
//    public void viewMoreNoiLucGD2(){
//        txtViewMoreQGD2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreNOILUCGD2bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLucGD2.class);
//                //TODO lấy dữ liệu tính toán ráp vào, tạm thời a để 11,13
//                ViewMoreNOILUCGD2bundle.putExtra("M21", LHbundle.getDouble("M21"));
//                ViewMoreNOILUCGD2bundle.putExtra("M22", LHbundle.getDouble("M22"));
//                ViewMoreNOILUCGD2bundle.putExtra("M23", LHbundle.getDouble("M23"));
//                ViewMoreNOILUCGD2bundle.putExtra("M24", LHbundle.getDouble("M24"));
//                ViewMoreNOILUCGD2bundle.putExtra("M25", LHbundle.getDouble("M25"));
//                ViewMoreNOILUCGD2bundle.putExtra("M26", LHbundle.getDouble("M26"));
//                ViewMoreNOILUCGD2bundle.putExtra("M27", LHbundle.getDouble("M27"));
//                ViewMoreNOILUCGD2bundle.putExtra("M28", LHbundle.getDouble("M28"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q21", LHbundle.getDouble("Q21"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q22", LHbundle.getDouble("Q22"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q23", LHbundle.getDouble("Q23"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q24", LHbundle.getDouble("Q24"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q25", LHbundle.getDouble("Q25"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q26", LHbundle.getDouble("Q26"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q27", LHbundle.getDouble("Q27"));
//                ViewMoreNOILUCGD2bundle.putExtra("Q28", LHbundle.getDouble("Q28"));
//                startActivity(ViewMoreNOILUCGD2bundle);
//
//            }
//        });
//
//    }
//
//    public void viewMorefGD1(){
//        txtViewMorefGD1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreUNGSUATGD1bundle = new Intent(KQKhongLienHop.this, ViewMoreUngSuatGD1.class);
//                ViewMoreUNGSUATGD1bundle.putExtra("f11", LHbundle.getDouble("f11"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f12", LHbundle.getDouble("f12"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f13", LHbundle.getDouble("f13"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f14", LHbundle.getDouble("f14"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f15", LHbundle.getDouble("f15"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f16", LHbundle.getDouble("f16"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f17", LHbundle.getDouble("f17"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f18", LHbundle.getDouble("f18"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f19", LHbundle.getDouble("f19"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f110", LHbundle.getDouble("f110"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f111", LHbundle.getDouble("f111"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f112", LHbundle.getDouble("f112"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f113", LHbundle.getDouble("f113"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f114", LHbundle.getDouble("f114"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f115", LHbundle.getDouble("f115"));
//                ViewMoreUNGSUATGD1bundle.putExtra("f116", LHbundle.getDouble("f116"));
//
//
//                startActivity(ViewMoreUNGSUATGD1bundle);
//
//            }
//        });
//
//    }
//
//    public void viewMoreNoiLucGD1() {
//        txtViewMoreQGD1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreNOILUCGD1bundle = new Intent(KQKhongLienHop.this, ViewMoreNoiLucGD1.class);
//                //TODO lấy dữ liệu tính toán ráp vào, tạm thời a để 11,13
//                ViewMoreNOILUCGD1bundle.putExtra("M11", LHbundle.getDouble("M11"));
//                ViewMoreNOILUCGD1bundle.putExtra("M12", LHbundle.getDouble("M12"));
//                ViewMoreNOILUCGD1bundle.putExtra("M13", LHbundle.getDouble("M13"));
//                ViewMoreNOILUCGD1bundle.putExtra("M14", LHbundle.getDouble("M14"));
//                ViewMoreNOILUCGD1bundle.putExtra("M15", LHbundle.getDouble("M15"));
//                ViewMoreNOILUCGD1bundle.putExtra("M16", LHbundle.getDouble("M16"));
//                ViewMoreNOILUCGD1bundle.putExtra("M17", LHbundle.getDouble("M17"));
//                ViewMoreNOILUCGD1bundle.putExtra("M18", LHbundle.getDouble("M18"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q11", LHbundle.getDouble("Q11"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q12", LHbundle.getDouble("Q12"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q13", LHbundle.getDouble("Q13"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q14", LHbundle.getDouble("Q14"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q15", LHbundle.getDouble("Q15"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q16", LHbundle.getDouble("Q16"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q17", LHbundle.getDouble("Q17"));
//                ViewMoreNOILUCGD1bundle.putExtra("Q18", LHbundle.getDouble("Q18"));
//                startActivity(ViewMoreNOILUCGD1bundle);
//
//            }
//        });
//
//    }

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
//
//        // nội lực tĩnh tải gd1
//        txtMmaxCD1GD1 = (TextView) findViewById(R.id.txtMmaxCD1GD1);
//        txtMmaxSDGD1 = (TextView) findViewById(R.id.txtMmaxSDGD1);
//        txtQmaxCD1GD1 = (TextView) findViewById(R.id.txtQmaxCD1GD1);
//        txtQmaxSDGD1 = (TextView) findViewById(R.id.txtQmaxSDGD1);
//        txtViewMoreQGD1 = (TextView) findViewById(R.id.txtViewMoreQGD1);
//        // ứng suất tĩnh tải dg1
//        txtftmaxCD1GD1 = (TextView) findViewById(R.id.txtftmaxCD1GD1);
//        txtfdmaxCD1GD1 = (TextView) findViewById(R.id.txtfdmaxCD1GD1);
//        txtftmaxSDGD1 = (TextView) findViewById(R.id.txtftmaxSDGD1);
//        txtfdmaxSDGD1 = (TextView) findViewById(R.id.txtfdmaxSDGD1);
//        txtViewMorefGD1= (TextView) findViewById(R.id.txtViewMorefGD1);
//        // nội lực tĩnh tải gd2
//        txtMmaxCD1GD2 = (TextView) findViewById(R.id.txtMmaxCD1GD2);
//        txtMmaxSDGD2 = (TextView) findViewById(R.id.txtMmaxSDGD2);
//        txtQmaxCD1GD2 = (TextView) findViewById(R.id.txtQmaxCD1GD2);
//        txtQmaxSDGD2 = (TextView) findViewById(R.id.txtQmaxSDGD2);
//        txtViewMoreQGD2 = (TextView) findViewById(R.id.txtViewMoreQGD2);
//        txtViewMorefGD2=(TextView) findViewById(R.id.txtViewMorefGD2);
////        txtfdmaxDTSDGD2,txtftmaxDTSDGD2,txtfdmaxDTCD1GD2,txtftmaxDTCD1GD2;
//        txtfdmaxDTSDGD2 =(TextView) findViewById(R.id.txtfdmaxDTSDGD2);
//        txtftmaxDTSDGD2=(TextView) findViewById(R.id.txtftmaxDTSDGD2);
//        txtfdmaxDTCD1GD2=(TextView) findViewById(R.id.txtfdmaxDTCD1GD2);
//        txtftmaxDTCD1GD2 =(TextView) findViewById(R.id.txtftmaxDTCD1GD2);
//        txtfdmaxDNSDGD2 =(TextView) findViewById(R.id.txtfdmaxDNSDGD2);
//        txtftmaxDNSDGD2=(TextView) findViewById(R.id.txtftmaxDNSDGD2);
//        txtfdmaxDNCD1GD2=(TextView) findViewById(R.id.txtfdmaxDNCD1GD2);
//        txtftmaxDNCD1GD2 =(TextView) findViewById(R.id.txtftmaxDNCD1GD2);
//
//        //txtMmax3CD1,txtMmax3SD, txtQmax3CD1,txtQmax3SD;
//        txtMmax3CD1=(TextView) findViewById(R.id.txtMmax3CD1);
//        txtMmax3SD=(TextView) findViewById(R.id.txtMmax3SD);
//        txtQmax3CD1=(TextView) findViewById(R.id.txtQmax3CD1);
//        txtQmax3SD=(TextView) findViewById(R.id.txtQmax3SD);
//        txtViewMoreMV3=(TextView) findViewById(R.id.txtViewMoreMV3);
//        //txtMmax4DNSD,txtMmax4DTSD,txtMmax4DNCD1,txtMmax4DTCD1, txtViewMoreMV4;
//        txtMmax4DNSD=(TextView) findViewById(R.id.txtMmax4DNSD);
//        txtMmax4DTSD=(TextView) findViewById(R.id.txtMmax4DTSD);
//        txtMmax4DNCD1=(TextView) findViewById(R.id.txtMmax4DNCD1);
//        txtMmax4DTCD1 =(TextView) findViewById(R.id.txtMmax4DTCD1);
//        txtViewMoreMV4 =(TextView) findViewById(R.id.txtViewMoreMV4);
//        // co ngót nhiệt độ
//        txtM52=(TextView) findViewById(R.id.txtM52);
//        txtM51=(TextView) findViewById(R.id.txtM51);
//        txtf51=(TextView) findViewById(R.id.txtf51);
//        txtf52 =(TextView) findViewById(R.id.txtf52);
//        txtf53 =(TextView) findViewById(R.id.txtf53);
//        txtf54 =(TextView) findViewById(R.id.txtf54);
//           // mỏi
//        txtM64=(TextView) findViewById(R.id.txtM64);
//        txtQ64=(TextView) findViewById(R.id.txtV64);
//        txtViewMoreMV6=(TextView) findViewById(R.id.txtViewMoreMV6);

        // tổng
        txtViewMoreMV7 =(TextView) findViewById(R.id.txtViewMoreMV7);
        //       TextView txtM74,txtM78,txtM712,txtM716,txtM720,txtM724;
//        TextView txtQ71,txtQ76,txtQ711,txtQ716,txtQ721,txtQ721;
        txtM74=(TextView) findViewById(R.id.txtM74);
        txtM78 =(TextView) findViewById(R.id.txtM78);
        txtM712=(TextView) findViewById(R.id.txtM712);
        txtM716=(TextView) findViewById(R.id.txtM716);
        txtM720=(TextView) findViewById(R.id.txtM720);
        txtM724=(TextView) findViewById(R.id.txtM724);
        txtQ71=(TextView) findViewById(R.id.txtQ71);
        txtQ76=(TextView) findViewById(R.id.txtQ76);
        txtQ711=(TextView) findViewById(R.id.txtQ711);
        txtQ716=(TextView) findViewById(R.id.txtQ716);
        txtQ721=(TextView) findViewById(R.id.txtQ721);
        txtQ726=(TextView) findViewById(R.id.txtQ726);
        txtviewNoiLuc= (TextView) findViewById(R.id. txtviewNoiLuc);

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

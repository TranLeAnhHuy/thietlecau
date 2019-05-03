package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.TextView;

public class KQLienHop extends AppCompatActivity {
    TextView txtAnc, txtSnct, txtYncd, txtYnct, txtInc, txtSncd;
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
    TextView txtviewNoiLuc,txtViewKiemToan;
   // TextView txtbmc1,txtbmc2,txtbmc3,txtbmc4,txtbmc5,txtbmc6,txtbmc7;
    TextView  txt1,txt2,txt3,txt4,txt5,txt6,txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kqlien_hop);
        addConrols();
        addEvents();
    }
    public void addEvents() {
        Intent KLHintent = getIntent();
        Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");

        txtAnc.setText(roundString(KLHbundle.getDouble("Anc"), 4));

        txtSnct.setText(roundString(KLHbundle.getDouble("Snct"), 4));
        txtYncd.setText(roundString(KLHbundle.getDouble("Yncd"), 4));
        txtYnct.setText(roundString(KLHbundle.getDouble("Ynct"), 4));
        txtInc.setText(roundString(KLHbundle.getDouble("Inc"), 4));
        txtSncd.setText(roundString(KLHbundle.getDouble("Sncd"), 4));
        // TĨNH
        txtDC1DN.setText(roundString(KLHbundle.getDouble("DC1"), 4));
        txtDC1DT.setText(roundString(KLHbundle.getDouble("DC1"), 4));
        txtDC2DN.setText(roundString(KLHbundle.getDouble("DC2DN"), 4));
        txtDC2DT.setText(roundString(KLHbundle.getDouble("DC2DT"), 4));
        txtDCDN.setText(roundString(KLHbundle.getDouble("DCDN"), 4));
        txtDCDT.setText(roundString(KLHbundle.getDouble("DCDT"), 4));
        // hệ số phân phối ngang
        txtmgSIV.setText(roundString(KLHbundle.getDouble("mgSIV"), 4));
        txtmgMIV.setText(roundString(KLHbundle.getDouble("mgMIV"), 4));
        txtmgMEV2lan.setText(roundString(KLHbundle.getDouble("mgMEV2lan"), 4));
        txtmgSIM.setText(roundString(KLHbundle.getDouble("mgSIM"), 4));
        txtmgMIM.setText(roundString(KLHbundle.getDouble("mgMIM"), 4));
        txtmgMEM2lan.setText(roundString(KLHbundle.getDouble("mgMEM2lan"), 4));
        txtmgDTM.setText(roundString(KLHbundle.getDouble("mgDTM"), 4));
        txtmgDTV.setText(roundString(KLHbundle.getDouble("mgDTV"), 4));
        txtmgMEV1lan.setText(roundString(KLHbundle.getDouble("mgMEV1lan="), 4));
        txtmgDNV.setText(roundString(KLHbundle.getDouble("mgDNV"), 4));
        txtmgMEM1lan.setText(roundString(KLHbundle.getDouble("mgMEM1lan"), 4));
        txtmgDNM.setText(roundString(KLHbundle.getDouble("mgDNM"), 4));
        txtmgPLDT.setText(roundString(KLHbundle.getDouble("mgPLDT"), 4));
        txtmgPLDN.setText(roundString(KLHbundle.getDouble("mgPLDN"), 4));

        txtM74.setText(roundString(KLHbundle.getDouble("M74klh"), 4));
        txtM78.setText(roundString(KLHbundle.getDouble("M78klh"), 4));
        txtM712.setText(roundString(KLHbundle.getDouble("M712klh"), 4));
        txtM716.setText(roundString(KLHbundle.getDouble("M716klh"), 4));
        txtM720.setText(roundString(KLHbundle.getDouble("M720klh"), 4));
        txtM724.setText(roundString(KLHbundle.getDouble("M724klh"), 4));
        txtQ71.setText(roundString(KLHbundle.getDouble("Q71klh"), 4));
        txtQ76.setText(roundString(KLHbundle.getDouble("Q76klh"), 4));
        txtQ711.setText(roundString(KLHbundle.getDouble("Q711klh"), 4));
        txtQ716.setText(roundString(KLHbundle.getDouble("Q716klh"), 4));
        txtQ721.setText(roundString(KLHbundle.getDouble("Q721klh"), 4));
        txtQ726.setText(roundString(KLHbundle.getDouble("Q726klh"), 4));
//        txtbmc1.setText(KLHbundle.getString("txtbmc1"));
//        txtbmc2.setText(KLHbundle.getString("txtbmc2"));
//        txtbmc3.setText(KLHbundle.getString("txtbmc3"));
//        txtbmc4.setText(KLHbundle.getString("txtbmc4"));
//        txtbmc5.setText(KLHbundle.getString("txtbmc5"));
//        txtbmc6.setText(KLHbundle.getString("txtbmc6"));
//        txtbmc7.setText(KLHbundle.getString("txtbmc7"));
        txt1.setText(KLHbundle.getString("txt1"));
        txt2.setText(KLHbundle.getString("txt2"));
        txt3.setText(KLHbundle.getString("txt3"));
        txt4.setText(KLHbundle.getString("txt4"));
        txt5.setText(KLHbundle.getString("txt5"));
        txt6.setText(KLHbundle.getString("txt6"));
      /////  txt7.setText(KLHbundle.getString("txt7"));

        viewNoiLuc7();
        viewNoiLuc();
        //viewBMC();
        viewKiemToan();

    }
    public void viewKiemToan(){
        txtViewKiemToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KLHintent = getIntent();
                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");

                Intent ViewKiemToanbundle = new Intent(KQLienHop.this, ViewKiemToanklh.class);
                Bundle KTBundleklh = new Bundle();
                KTBundleklh.putString("txtKT1", KLHbundle.getString("txtKT1"));
                KTBundleklh.putString("txtKT2", KLHbundle.getString("txtKT2"));
                KTBundleklh.putString("txtKT3", KLHbundle.getString("txtKT3"));
                KTBundleklh.putString("txtKT4", KLHbundle.getString("txtKT4"));
                KTBundleklh.putString("txtKT5", KLHbundle.getString("txtKT5"));
                KTBundleklh.putString("txtKT6", KLHbundle.getString("txtKT6"));
                KTBundleklh.putString("txtKT7", KLHbundle.getString("txtKT7"));
                KTBundleklh.putString("txtKT8", KLHbundle.getString("txtKT8"));
                KTBundleklh.putString("txtKT9", KLHbundle.getString("txtKT9"));
                KTBundleklh.putString("txtKT10", KLHbundle.getString("txtKT10"));
                KTBundleklh.putString("txtKT11", KLHbundle.getString("txtKT11"));
                KTBundleklh.putString("txtKT12", KLHbundle.getString("txtKT12"));
                KTBundleklh.putString("txtKT13", KLHbundle.getString("txtKT13"));

                ViewKiemToanbundle.putExtra("KLHbundle", KTBundleklh);
                startActivity(ViewKiemToanbundle);
            }
        });
    }
//    public void  viewBMC(){
//        txtViewBMC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent KLHintent = getIntent();
//                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
//
//                Intent ViewBMCbundle = new Intent(KQLienHop.this, ViewMoreBMCklh.class);
//                Bundle BMCBundle = new Bundle();
//                BMCBundle.putString("txtBMC1", KLHbundle.getString("txtBMC1"));
//                BMCBundle.putString("txtBMC2", KLHbundle.getString("txtBMC2"));
//                BMCBundle.putString("txtBMC3", KLHbundle.getString("txtBMC3"));
//                BMCBundle.putString("txtBMC4", KLHbundle.getString("txtBMC4"));
//                BMCBundle.putString("txtBMC5", KLHbundle.getString("txtBMC5"));
//                BMCBundle.putString("txtBMC6", KLHbundle.getString("txtBMC6"));
//                BMCBundle.putString("txtBMC7", KLHbundle.getString("txtBMC7"));
//
//                ViewBMCbundle.putExtra("KLHbundle", BMCBundle);
//                startActivity(ViewBMCbundle);
//
//            }
//        });
//    }
    public void viewNoiLuc7() {
        txtViewMoreMV7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KLHintent = getIntent();
                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
                Intent ViewMoreNoiLuc7bundleklh =
                        new Intent(KQLienHop.this, ViewMoreNoiLuc7klh.class);
                ViewMoreNoiLuc7bundleklh.putExtra("M71klh", KLHbundle.getDouble("M71klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M72klh", KLHbundle.getDouble("M72klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M73klh", KLHbundle.getDouble("M73klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M74klh", KLHbundle.getDouble("M74klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M75klh", KLHbundle.getDouble("M75klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M76klh", KLHbundle.getDouble("M76klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M77klh", KLHbundle.getDouble("M77klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M78klh", KLHbundle.getDouble("M78klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M79klh", KLHbundle.getDouble("M79klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M710klh", KLHbundle.getDouble("M710klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M711klh", KLHbundle.getDouble("M711klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M712klh", KLHbundle.getDouble("M712klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M713klh", KLHbundle.getDouble("M713klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M714klh", KLHbundle.getDouble("M714klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M715klh", KLHbundle.getDouble("M715klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M716klh", KLHbundle.getDouble("M716klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M717klh", KLHbundle.getDouble("M717klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M718klh", KLHbundle.getDouble("M718klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M719klh", KLHbundle.getDouble("M719klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M720klh", KLHbundle.getDouble("M720klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M721klh", KLHbundle.getDouble("M721klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M722klh", KLHbundle.getDouble("M722klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M723klh", KLHbundle.getDouble("M723klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("M724klh", KLHbundle.getDouble("M724klh"));

                ViewMoreNoiLuc7bundleklh.putExtra("Q71klh", KLHbundle.getDouble("Q71klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q72klh", KLHbundle.getDouble("Q72klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q73klh", KLHbundle.getDouble("Q73klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q74klh", KLHbundle.getDouble("Q74klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q75klh", KLHbundle.getDouble("Q75klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q76klh", KLHbundle.getDouble("Q76klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q77klh", KLHbundle.getDouble("Q77klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q78klh", KLHbundle.getDouble("Q78klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q79klh", KLHbundle.getDouble("Q79klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q710klh", KLHbundle.getDouble("Q710klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q711klh", KLHbundle.getDouble("Q711klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q712klh", KLHbundle.getDouble("Q712klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q713klh", KLHbundle.getDouble("Q713klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q714klh", KLHbundle.getDouble("Q714klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q715klh", KLHbundle.getDouble("Q715klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q716klh", KLHbundle.getDouble("Q716klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q717klh", KLHbundle.getDouble("Q717klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q718klh", KLHbundle.getDouble("Q718klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q719klh", KLHbundle.getDouble("Q719klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q720klh", KLHbundle.getDouble("Q720klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q721klh", KLHbundle.getDouble("Q721klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q722klh", KLHbundle.getDouble("Q722klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q723klh", KLHbundle.getDouble("Q723klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q724klh", KLHbundle.getDouble("Q724klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q725klh", KLHbundle.getDouble("Q725klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q726klh", KLHbundle.getDouble("Q726klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q727klh", KLHbundle.getDouble("Q727klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q728klh", KLHbundle.getDouble("Q728klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q729klh", KLHbundle.getDouble("Q729klh"));
                ViewMoreNoiLuc7bundleklh.putExtra("Q730klh", KLHbundle.getDouble("Q730klh"));

                startActivity(ViewMoreNoiLuc7bundleklh);
            }
        });
    }
    public void viewNoiLuc() {
        txtviewNoiLuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KLHintent = getIntent();
                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");

                Intent ViewNoiLucbundle = new Intent(KQLienHop.this, ViewNoiLucklh.class);
                //nội lực 1
                ///

                Bundle newBundle = new Bundle();
                newBundle.putDouble("M11", KLHbundle.getDouble("M11"));
                newBundle.putDouble("M12", KLHbundle.getDouble("M12"));
                newBundle.putDouble("M13", KLHbundle.getDouble("M13"));
                newBundle.putDouble("M14", KLHbundle.getDouble("M14"));
                newBundle.putDouble("M15", KLHbundle.getDouble("M15"));
                newBundle.putDouble("M16", KLHbundle.getDouble("M16"));
                newBundle.putDouble("M17", KLHbundle.getDouble("M17"));
                newBundle.putDouble("M18", KLHbundle.getDouble("M18"));
                newBundle.putDouble("Q11", KLHbundle.getDouble("Q11"));
                newBundle.putDouble("Q12", KLHbundle.getDouble("Q12"));
                newBundle.putDouble("Q13", KLHbundle.getDouble("Q13"));
                newBundle.putDouble("Q14", KLHbundle.getDouble("Q14"));
                newBundle.putDouble("Q15", KLHbundle.getDouble("Q15"));
                newBundle.putDouble("Q16", KLHbundle.getDouble("Q16"));
                newBundle.putDouble("Q17", KLHbundle.getDouble("Q17"));
                newBundle.putDouble("Q18", KLHbundle.getDouble("Q18"));
                // ứng suất 1
                newBundle.putDouble("f11", KLHbundle.getDouble("f11"));
                newBundle.putDouble("f12", KLHbundle.getDouble("f12"));
                newBundle.putDouble("f13", KLHbundle.getDouble("f13"));
                newBundle.putDouble("f14", KLHbundle.getDouble("f14"));
                newBundle.putDouble("f15", KLHbundle.getDouble("f15"));
                newBundle.putDouble("f16", KLHbundle.getDouble("f16"));
                newBundle.putDouble("f17", KLHbundle.getDouble("f17"));
                newBundle.putDouble("f18", KLHbundle.getDouble("f18"));
                newBundle.putDouble("f19", KLHbundle.getDouble("f19"));
                newBundle.putDouble("f110", KLHbundle.getDouble("f110"));
                newBundle.putDouble("f111", KLHbundle.getDouble("f111"));
                newBundle.putDouble("f112", KLHbundle.getDouble("f112"));
                newBundle.putDouble("f113", KLHbundle.getDouble("f113"));
                newBundle.putDouble("f114", KLHbundle.getDouble("f114"));
                newBundle.putDouble("f115", KLHbundle.getDouble("f115"));
                newBundle.putDouble("f116", KLHbundle.getDouble("f116"));



                newBundle.putDouble("M41", KLHbundle.getDouble("M41"));
                newBundle.putDouble("M42", KLHbundle.getDouble("M42"));
                newBundle.putDouble("M43", KLHbundle.getDouble("M43"));
                newBundle.putDouble("M44", KLHbundle.getDouble("M44"));
                newBundle.putDouble("M45", KLHbundle.getDouble("M45"));
                newBundle.putDouble("M46", KLHbundle.getDouble("M46"));
                newBundle.putDouble("M47", KLHbundle.getDouble("M47"));
                newBundle.putDouble("M48", KLHbundle.getDouble("M48"));
                newBundle.putDouble("M49", KLHbundle.getDouble("M49"));
                newBundle.putDouble("M410",KLHbundle.getDouble("M410"));
                newBundle.putDouble("M411", KLHbundle.getDouble("M411"));
                newBundle.putDouble("M412", KLHbundle.getDouble("M412"));
                newBundle.putDouble("M413", KLHbundle.getDouble("M413"));
                newBundle.putDouble("M414", KLHbundle.getDouble("M414"));
                newBundle.putDouble("M415", KLHbundle.getDouble("M415"));
                newBundle.putDouble("M416", KLHbundle.getDouble("M416"));
                newBundle.putDouble("Q41", KLHbundle.getDouble("Q41"));
                newBundle.putDouble("Q42", KLHbundle.getDouble("Q42"));
                newBundle.putDouble("Q43", KLHbundle.getDouble("Q43"));
                newBundle.putDouble("Q44", KLHbundle.getDouble("Q44"));
                newBundle.putDouble("Q45", KLHbundle.getDouble("Q45"));
                newBundle.putDouble("Q46", KLHbundle.getDouble("Q46"));
                newBundle.putDouble("Q47", KLHbundle.getDouble("Q47"));
                newBundle.putDouble("Q48", KLHbundle.getDouble("Q48"));
                newBundle.putDouble("Q49", KLHbundle.getDouble("Q49"));
                newBundle.putDouble("Q410", KLHbundle.getDouble("Q410"));
                newBundle.putDouble("Q411", KLHbundle.getDouble("Q411"));
                newBundle.putDouble("Q412", KLHbundle.getDouble("Q412"));
                newBundle.putDouble("Q413", KLHbundle.getDouble("Q413"));
                newBundle.putDouble("Q414", KLHbundle.getDouble("Q414"));
                newBundle.putDouble("Q415", KLHbundle.getDouble("Q415"));
                newBundle.putDouble("Q416", KLHbundle.getDouble("Q416"));
                newBundle.putDouble("Q417", KLHbundle.getDouble("Q417"));
                newBundle.putDouble("Q418", KLHbundle.getDouble("Q418"));
                newBundle.putDouble("Q419", KLHbundle.getDouble("Q419"));
                newBundle.putDouble("Q420", KLHbundle.getDouble("Q420"));
                newBundle.putDouble("Q421", KLHbundle.getDouble("Q421"));
                newBundle.putDouble("Q422", KLHbundle.getDouble("Q422"));
                newBundle.putDouble("Q423", KLHbundle.getDouble("Q423"));
                newBundle.putDouble("Q424", KLHbundle.getDouble("Q424"));
                newBundle.putDouble("Q425", KLHbundle.getDouble("Q425"));
                newBundle.putDouble("Q426", KLHbundle.getDouble("Q426"));
                newBundle.putDouble("Q427", KLHbundle.getDouble("Q427"));
                newBundle.putDouble("Q428", KLHbundle.getDouble("Q428"));
                newBundle.putDouble("Q429", KLHbundle.getDouble("Q429"));
                newBundle.putDouble("Q430", KLHbundle.getDouble("Q430"));
                newBundle.putDouble("Q431", KLHbundle.getDouble("Q431"));
                newBundle.putDouble("Q432", KLHbundle.getDouble("Q432"));
                newBundle.putDouble("Q433", KLHbundle.getDouble("Q433"));
                newBundle.putDouble("Q434", KLHbundle.getDouble("Q434"));
                newBundle.putDouble("Q435", KLHbundle.getDouble("Q435"));
                newBundle.putDouble("Q436", KLHbundle.getDouble("Q436"));
                newBundle.putDouble("Q437", KLHbundle.getDouble("Q437"));
                newBundle.putDouble("Q438", KLHbundle.getDouble("Q438"));
                newBundle.putDouble("Q439", KLHbundle.getDouble("Q439"));
                newBundle.putDouble("Q440", KLHbundle.getDouble("Q440"));
                // nội lực 5
                newBundle.putDouble("M51", KLHbundle.getDouble("M51"));
                newBundle.putDouble("M52", KLHbundle.getDouble("M52"));
                newBundle.putDouble("f51",KLHbundle.getDouble("f51"));
                newBundle.putDouble("f52", KLHbundle.getDouble("f52"));
                newBundle.putDouble("f53", KLHbundle.getDouble("f53"));
                newBundle.putDouble("f54", KLHbundle.getDouble("f54"));

                // nội lực 6
                newBundle.putDouble("M61", KLHbundle.getDouble("M61"));
                newBundle.putDouble("M62", KLHbundle.getDouble("M62"));
                newBundle.putDouble("M63", KLHbundle.getDouble("M63"));
                newBundle.putDouble("M64", KLHbundle.getDouble("M64"));
                newBundle.putDouble("Q61", KLHbundle.getDouble("Q61"));
                newBundle.putDouble("Q62", KLHbundle.getDouble("Q62"));
                newBundle.putDouble("Q63", KLHbundle.getDouble("Q63"));
                newBundle.putDouble("Q64", KLHbundle.getDouble("Q64"));
                newBundle.putDouble("Q65", KLHbundle.getDouble("Q65"));
                newBundle.putDouble("Q66", KLHbundle.getDouble("Q66"));
                newBundle.putDouble("Q67", KLHbundle.getDouble("Q67"));
                newBundle.putDouble("Q68", KLHbundle.getDouble("Q68"));
                newBundle.putDouble("Q69", KLHbundle.getDouble("Q69"));
                newBundle.putDouble("Q610",KLHbundle.getDouble("Q610"));

                ///nội lực 7
                newBundle.putDouble("M71klh", KLHbundle.getDouble("M71klh"));
                newBundle.putDouble("M72klh", KLHbundle.getDouble("M72klh"));
                newBundle.putDouble("M73klh", KLHbundle.getDouble("M73klh"));
                newBundle.putDouble("M74klh",KLHbundle.getDouble("M74klh"));
                newBundle.putDouble("M75klh", KLHbundle.getDouble("M75klh"));
                newBundle.putDouble("M76klh", KLHbundle.getDouble("M76klh"));
                newBundle.putDouble("M77klh", KLHbundle.getDouble("M77klh"));
                newBundle.putDouble("M78klh", KLHbundle.getDouble("M78klh"));
                newBundle.putDouble("M79klh", KLHbundle.getDouble("M79klh"));
                newBundle.putDouble("M710klh", KLHbundle.getDouble("M710klh"));
                newBundle.putDouble("M711klh", KLHbundle.getDouble("M711klh"));
                newBundle.putDouble("M712klh", KLHbundle.getDouble("M712klh"));
                newBundle.putDouble("M713klh", KLHbundle.getDouble("M713klh"));
                newBundle.putDouble("M714klh", KLHbundle.getDouble("M714klh"));
                newBundle.putDouble("M715klh", KLHbundle.getDouble("M715klh"));
                newBundle.putDouble("M716klh", KLHbundle.getDouble("M716klh"));
                newBundle.putDouble("M717klh", KLHbundle.getDouble("M717klh"));
                newBundle.putDouble("M718klh", KLHbundle.getDouble("M718klh"));
                newBundle.putDouble("M719klh", KLHbundle.getDouble("M719klh"));
                newBundle.putDouble("M720klh", KLHbundle.getDouble("M720klh"));
                newBundle.putDouble("M721klh", KLHbundle.getDouble("M721klh"));
                newBundle.putDouble("M722klh", KLHbundle.getDouble("M722klh"));
                newBundle.putDouble("M723klh", KLHbundle.getDouble("M723klh"));
                newBundle.putDouble("M724klh", KLHbundle.getDouble("M724klh"));

                newBundle.putDouble("Q71klh", KLHbundle.getDouble("Q71klh"));
                newBundle.putDouble("Q72klh", KLHbundle.getDouble("Q72klh"));
                newBundle.putDouble("Q73klh", KLHbundle.getDouble("Q73klh"));
                newBundle.putDouble("Q74klh", KLHbundle.getDouble("Q74klh"));
                newBundle.putDouble("Q75klh",KLHbundle.getDouble("Q75klh"));
                newBundle.putDouble("Q76klh", KLHbundle.getDouble("Q76klh"));
                newBundle.putDouble("Q77klh", KLHbundle.getDouble("Q77klh"));
                newBundle.putDouble("Q78klh", KLHbundle.getDouble("Q78klh"));
                newBundle.putDouble("Q79klh", KLHbundle.getDouble("Q79klh"));
                newBundle.putDouble("Q710klh",KLHbundle.getDouble("Q710klh"));
                newBundle.putDouble("Q711klh", KLHbundle.getDouble("Q711klh"));
                newBundle.putDouble("Q712klh", KLHbundle.getDouble("Q712klh"));
                newBundle.putDouble("Q713klh", KLHbundle.getDouble("Q713klh"));
                newBundle.putDouble("Q714klh", KLHbundle.getDouble("Q714klh"));
                newBundle.putDouble("Q715klh", KLHbundle.getDouble("Q715klh"));
                newBundle.putDouble("Q716klh", KLHbundle.getDouble("Q716klh"));
                newBundle.putDouble("Q717klh", KLHbundle.getDouble("Q717klh"));
                newBundle.putDouble("Q718klh", KLHbundle.getDouble("Q718klh"));
                newBundle.putDouble("Q719klh", KLHbundle.getDouble("Q719klh"));
                newBundle.putDouble("Q720klh", KLHbundle.getDouble("Q720klh"));
                newBundle.putDouble("Q721klh",KLHbundle.getDouble("Q721klh"));
                newBundle.putDouble("Q722klh", KLHbundle.getDouble("Q722klh"));
                newBundle.putDouble("Q723klh", KLHbundle.getDouble("Q723klh"));
                newBundle.putDouble("Q724klh", KLHbundle.getDouble("Q724klh"));
                newBundle.putDouble("Q725klh", KLHbundle.getDouble("Q725klh"));
                newBundle.putDouble("Q726klh", KLHbundle.getDouble("Q726klh"));
                newBundle.putDouble("Q727klh", KLHbundle.getDouble("Q727klh"));
                newBundle.putDouble("Q728klh", KLHbundle.getDouble("Q728klh"));
                newBundle.putDouble("Q729klh", KLHbundle.getDouble("Q729klh"));
                newBundle.putDouble("Q730klh", KLHbundle.getDouble("Q730klh"));


                ViewNoiLucbundle.putExtra("KLHbundle", newBundle);
                startActivity(ViewNoiLucbundle);
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
        txtViewMoreMV7 = (TextView) findViewById(R.id.txtViewMoreMV7);
//        txtbmc1 = (TextView) findViewById(R.id.txtbmc1);
//        txtbmc2 = (TextView) findViewById(R.id.txtbmc2);
//        txtbmc3 = (TextView) findViewById(R.id.txtbmc3);
//        txtbmc4 = (TextView) findViewById(R.id.txtbmc4);
//        txtbmc5 = (TextView) findViewById(R.id.txtbmc5);
//        txtbmc6 = (TextView) findViewById(R.id.txtbmc6);
//        txtbmc7 = (TextView) findViewById(R.id.txtbmc7);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt3=(TextView)findViewById(R.id.txt3);
        txt4=(TextView)findViewById(R.id.txt4);
        txt5=(TextView)findViewById(R.id.txt5);
        txt6=(TextView)findViewById(R.id.txt6);

        //txtViewBMC = (TextView) findViewById(R.id.txtViewBMC);
        txtViewKiemToan = (TextView) findViewById(R.id.txtViewKiemToan);

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

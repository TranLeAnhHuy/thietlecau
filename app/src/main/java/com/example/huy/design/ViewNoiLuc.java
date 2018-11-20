package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.TextView;

public class ViewNoiLuc extends AppCompatActivity {

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


    // kiểm toán
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_noi_luc);
//        txtviewNoiLuc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {


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
        // co ngót nhiệt độ
        txtM52=(TextView) findViewById(R.id.txtM52);
        txtM51=(TextView) findViewById(R.id.txtM51);
        txtf51=(TextView) findViewById(R.id.txtf51);
        txtf52 =(TextView) findViewById(R.id.txtf52);
        txtf53 =(TextView) findViewById(R.id.txtf53);
        txtf54 =(TextView) findViewById(R.id.txtf54);
        // mỏi
        txtM64=(TextView) findViewById(R.id.txtM64);
        txtQ64=(TextView) findViewById(R.id.txtV64);
        txtViewMoreMV6=(TextView) findViewById(R.id.txtViewMoreMV6);


        viewMoreNoiLucGD1();
        viewMorefGD1();
        viewMoreNoiLucGD2();
        viewMorefGD2();
        viewMoreNoiLuc3();
        viewMoreNoiLuc4();
        viewMoreNoiLuc6();
//        viewNoiLuc7();
        //Láy kết quả
        Intent LHintent = getIntent();
        Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
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
        txtM51.setText(roundString(LHbundle.getDouble("M51"), 4));
        txtM52.setText(roundString(LHbundle.getDouble("M52"), 4));
        txtf51.setText(roundString(LHbundle.getDouble("f51"), 4));
        txtf52.setText(roundString(LHbundle.getDouble("f52"), 4));
        txtf53.setText(roundString(LHbundle.getDouble("f53"), 4));
        txtf54.setText(roundString(LHbundle.getDouble("f54"), 4));
        // mỏi
        txtM64.setText(roundString(LHbundle.getDouble("M64"), 4));
        txtQ64.setText(roundString(LHbundle.getDouble("Q61"), 4));
//        TextView txtM74,txtM78,txtM712,txtM716,txtM720,txtM724;
//        TextView txtQ71,txtQ76,txtQ711,txtQ716,txtQ721,txtQ721;
//        txtM74.setText(roundString(LHbundle.getDouble("M74"), 4));
//        txtM78.setText(roundString(LHbundle.getDouble("M78"), 4));
//        txtM712.setText(roundString(LHbundle.getDouble("M712"), 4));
//        txtM716.setText(roundString(LHbundle.getDouble("M716"), 4));
//        txtM720.setText(roundString(LHbundle.getDouble("M720"), 4));
//        txtM724.setText(roundString(LHbundle.getDouble("M724"), 4));
//        txtQ71.setText(roundString(LHbundle.getDouble("Q71"), 4));
//        txtQ76.setText(roundString(LHbundle.getDouble("Q76"), 4));
//        txtQ711.setText(roundString(LHbundle.getDouble("Q711"), 4));
//        txtQ716.setText(roundString(LHbundle.getDouble("Q716"), 4));
//        txtQ721.setText(roundString(LHbundle.getDouble("Q721"), 4));
//        txtQ726.setText(roundString(LHbundle.getDouble("Q726"), 4));
    }
//    public void  viewNoiLuc7(){
//        txtViewMoreMV7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent LHintent = getIntent();
//                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
//                Intent ViewMoreNoiLuc7bundle = new Intent(ViewNoiLuc.this, ViewMoreNoiLuc7.class);
//                ViewMoreNoiLuc7bundle.putExtra("M71", LHbundle.getDouble("M71"));
//                ViewMoreNoiLuc7bundle.putExtra("M72", LHbundle.getDouble("M72"));
//                ViewMoreNoiLuc7bundle.putExtra("M73", LHbundle.getDouble("M73"));
//                ViewMoreNoiLuc7bundle.putExtra("M74", LHbundle.getDouble("M74"));
//                ViewMoreNoiLuc7bundle.putExtra("M75", LHbundle.getDouble("M75"));
//                ViewMoreNoiLuc7bundle.putExtra("M76", LHbundle.getDouble("M76"));
//                ViewMoreNoiLuc7bundle.putExtra("M77", LHbundle.getDouble("M77"));
//                ViewMoreNoiLuc7bundle.putExtra("M78", LHbundle.getDouble("M78"));
//                ViewMoreNoiLuc7bundle.putExtra("M79", LHbundle.getDouble("M79"));
//                ViewMoreNoiLuc7bundle.putExtra("M710", LHbundle.getDouble("M710"));
//                ViewMoreNoiLuc7bundle.putExtra("M711", LHbundle.getDouble("M711"));
//                ViewMoreNoiLuc7bundle.putExtra("M712", LHbundle.getDouble("M712"));
//                ViewMoreNoiLuc7bundle.putExtra("M713", LHbundle.getDouble("M713"));
//                ViewMoreNoiLuc7bundle.putExtra("M714", LHbundle.getDouble("M714"));
//                ViewMoreNoiLuc7bundle.putExtra("M715", LHbundle.getDouble("M715"));
//                ViewMoreNoiLuc7bundle.putExtra("M716", LHbundle.getDouble("M716"));
//                ViewMoreNoiLuc7bundle.putExtra("M717", LHbundle.getDouble("M717"));
//                ViewMoreNoiLuc7bundle.putExtra("M718", LHbundle.getDouble("M718"));
//                ViewMoreNoiLuc7bundle.putExtra("M719", LHbundle.getDouble("M719"));
//                ViewMoreNoiLuc7bundle.putExtra("M720", LHbundle.getDouble("M720"));
//                ViewMoreNoiLuc7bundle.putExtra("M721", LHbundle.getDouble("M721"));
//                ViewMoreNoiLuc7bundle.putExtra("M722", LHbundle.getDouble("M722"));
//                ViewMoreNoiLuc7bundle.putExtra("M723", LHbundle.getDouble("M723"));
//                ViewMoreNoiLuc7bundle.putExtra("M724", LHbundle.getDouble("M724"));
//
//                ViewMoreNoiLuc7bundle.putExtra("Q71", LHbundle.getDouble("Q71"));
//                ViewMoreNoiLuc7bundle.putExtra("Q72", LHbundle.getDouble("Q72"));
//                ViewMoreNoiLuc7bundle.putExtra("Q73", LHbundle.getDouble("Q73"));
//                ViewMoreNoiLuc7bundle.putExtra("Q74", LHbundle.getDouble("Q74"));
//                ViewMoreNoiLuc7bundle.putExtra("Q75", LHbundle.getDouble("Q75"));
//                ViewMoreNoiLuc7bundle.putExtra("Q76", LHbundle.getDouble("Q76"));
//                ViewMoreNoiLuc7bundle.putExtra("Q77", LHbundle.getDouble("Q77"));
//                ViewMoreNoiLuc7bundle.putExtra("Q78", LHbundle.getDouble("Q78"));
//                ViewMoreNoiLuc7bundle.putExtra("Q79", LHbundle.getDouble("Q79"));
//                ViewMoreNoiLuc7bundle.putExtra("Q710", LHbundle.getDouble("Q710"));
//                ViewMoreNoiLuc7bundle.putExtra("Q711", LHbundle.getDouble("Q711"));
//                ViewMoreNoiLuc7bundle.putExtra("Q712", LHbundle.getDouble("Q712"));
//                ViewMoreNoiLuc7bundle.putExtra("Q713", LHbundle.getDouble("Q713"));
//                ViewMoreNoiLuc7bundle.putExtra("Q714", LHbundle.getDouble("Q714"));
//                ViewMoreNoiLuc7bundle.putExtra("Q715", LHbundle.getDouble("Q715"));
//                ViewMoreNoiLuc7bundle.putExtra("Q716", LHbundle.getDouble("Q716"));
//                ViewMoreNoiLuc7bundle.putExtra("Q717", LHbundle.getDouble("Q717"));
//                ViewMoreNoiLuc7bundle.putExtra("Q718", LHbundle.getDouble("Q718"));
//                ViewMoreNoiLuc7bundle.putExtra("Q719", LHbundle.getDouble("Q719"));
//                ViewMoreNoiLuc7bundle.putExtra("Q720", LHbundle.getDouble("Q720"));
//                ViewMoreNoiLuc7bundle.putExtra("Q721", LHbundle.getDouble("Q721"));
//                ViewMoreNoiLuc7bundle.putExtra("Q722", LHbundle.getDouble("Q722"));
//                ViewMoreNoiLuc7bundle.putExtra("Q723", LHbundle.getDouble("Q723"));
//                ViewMoreNoiLuc7bundle.putExtra("Q724", LHbundle.getDouble("Q724"));
//                ViewMoreNoiLuc7bundle.putExtra("Q725", LHbundle.getDouble("Q725"));
//                ViewMoreNoiLuc7bundle.putExtra("Q726", LHbundle.getDouble("Q726"));
//                ViewMoreNoiLuc7bundle.putExtra("Q727", LHbundle.getDouble("Q727"));
//                ViewMoreNoiLuc7bundle.putExtra("Q728", LHbundle.getDouble("Q728"));
//                ViewMoreNoiLuc7bundle.putExtra("Q729", LHbundle.getDouble("Q729"));
//                ViewMoreNoiLuc7bundle.putExtra("Q730", LHbundle.getDouble("Q730"));
//
//                startActivity(ViewMoreNoiLuc7bundle);
//
//            }
//        });
//    }
    public void  viewMoreNoiLuc6(){
        txtViewMoreMV6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNoiLuc6bundle = new Intent(ViewNoiLuc.this, ViewMoreNoiLuc6.class);
                ViewMoreNoiLuc6bundle.putExtra("M61", LHbundle.getDouble("M61"));
                ViewMoreNoiLuc6bundle.putExtra("M62", LHbundle.getDouble("M62"));
                ViewMoreNoiLuc6bundle.putExtra("M63", LHbundle.getDouble("M63"));
                ViewMoreNoiLuc6bundle.putExtra("M64", LHbundle.getDouble("M64"));
                ViewMoreNoiLuc6bundle.putExtra("Q61", LHbundle.getDouble("Q61"));
                ViewMoreNoiLuc6bundle.putExtra("Q62", LHbundle.getDouble("Q62"));
                ViewMoreNoiLuc6bundle.putExtra("Q63", LHbundle.getDouble("Q63"));
                ViewMoreNoiLuc6bundle.putExtra("Q64", LHbundle.getDouble("Q64"));
                ViewMoreNoiLuc6bundle.putExtra("Q65", LHbundle.getDouble("Q65"));
                ViewMoreNoiLuc6bundle.putExtra("Q66", LHbundle.getDouble("Q66"));
                ViewMoreNoiLuc6bundle.putExtra("Q67", LHbundle.getDouble("Q67"));
                ViewMoreNoiLuc6bundle.putExtra("Q68", LHbundle.getDouble("Q68"));
                ViewMoreNoiLuc6bundle.putExtra("Q69", LHbundle.getDouble("Q69"));
                ViewMoreNoiLuc6bundle.putExtra("Q610", LHbundle.getDouble("Q610"));



                startActivity(ViewMoreNoiLuc6bundle);


            }
        });

    }
    public void viewMoreNoiLuc4(){
        txtViewMoreMV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LHintent = getIntent();
                Bundle LHbundle = LHintent.getBundleExtra("LHbundle");
                Intent ViewMoreNoiLuc4bundle = new Intent(ViewNoiLuc.this, ViewMoreNoiLuc4.class);
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
                Intent ViewMoreNoiLuc3bundle = new Intent(ViewNoiLuc.this, ViewMoreNoiLuc3.class);
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
                Intent ViewMoreUngSuatGD2bundle = new Intent(ViewNoiLuc.this, ViewMoreUngSuatGD2.class);
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
                Intent ViewMoreNOILUCGD2bundle = new Intent(ViewNoiLuc.this, ViewMoreNoiLucGD2.class);
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
                Intent ViewMoreUNGSUATGD1bundle = new Intent(ViewNoiLuc.this, ViewMoreUngSuatGD1.class);
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
                Intent ViewMoreNOILUCGD1bundle = new Intent(ViewNoiLuc.this, ViewMoreNoiLucGD1.class);
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

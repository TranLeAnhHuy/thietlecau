package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.TextView;

import static com.example.huy.design.ViewNoiLuc.round;

public class ViewNoiLucklh extends AppCompatActivity {
    TextView txtMmaxCD1GD1, txtMmaxSDGD1, txtQmaxCD1GD1, txtQmaxSDGD1;
    TextView txtViewMoreQGD1;
    TextView txtftmaxCD1GD1, txtfdmaxCD1GD1, txtftmaxSDGD1, txtfdmaxSDGD1, txtViewMorefGD1;

    TextView txtMmax4DNSD, txtMmax4DTSD, txtMmax4DNCD1, txtMmax4DTCD1, txtViewMoreMV4;
    TextView txtM52, txtM51, txtf51, txtf52, txtf53, txtf54;
    TextView txtM64, txtQ64, txtViewMoreMV6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_noi_lucklh);


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

        //txtMmax3CD1,txtMmax3SD, txtQmax3CD1,txtQmax3SD;

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

        viewMoreNoiLuc4();
        viewMoreNoiLuc6();
//        viewNoiLuc7();
        //Láy kết quả
        Intent KLHintent = getIntent();
        Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
        // MOOIN LỰC TĨNH TẢI GD1
        txtMmaxCD1GD1.setText(roundString(KLHbundle.getDouble("M14"), 4));
        txtMmaxSDGD1.setText(roundString(KLHbundle.getDouble("M18"), 4));
        txtQmaxCD1GD1.setText(roundString(KLHbundle.getDouble("Q14"), 4));
        txtQmaxSDGD1.setText(roundString(KLHbundle.getDouble("Q18"), 4));
        // ứng suất tĩnh tải GD1   txtftmaxCD1GD1,txtfdmaxCD1GD1,txtftmaxSDGD1,txtfdmaxSDGD1,txtViewMorefGD1;
        txtftmaxCD1GD1.setText(roundString(KLHbundle.getDouble("f14"), 4));
        txtfdmaxCD1GD1.setText(roundString(KLHbundle.getDouble("f18"), 4));
        txtftmaxSDGD1.setText(roundString(KLHbundle.getDouble("f112"), 4));
        txtfdmaxSDGD1.setText(roundString(KLHbundle.getDouble("f116"), 4));

        //txtMmax4DNSD,txtMmax4DTSD,txtMmax4DNCD1,txtMmax4DTCD1, txtViewMoreMV4;
        txtMmax4DNSD.setText(roundString(KLHbundle.getDouble("M416"), 4));
        txtMmax4DTSD.setText(roundString(KLHbundle.getDouble("M412"), 4));
        txtMmax4DNCD1.setText(roundString(KLHbundle.getDouble("M48"), 4));
        txtMmax4DTCD1.setText(roundString(KLHbundle.getDouble("M44"), 4));
        txtM51.setText(roundString(KLHbundle.getDouble("M51"), 4));
        txtM52.setText(roundString(KLHbundle.getDouble("M52"), 4));
        txtf51.setText(roundString(KLHbundle.getDouble("f51"), 4));
        txtf52.setText(roundString(KLHbundle.getDouble("f52"), 4));
        txtf53.setText(roundString(KLHbundle.getDouble("f53"), 4));
        txtf54.setText(roundString(KLHbundle.getDouble("f54"), 4));
        // mỏi
        txtM64.setText(roundString(KLHbundle.getDouble("M64"), 4));
        txtQ64.setText(roundString(KLHbundle.getDouble("Q61"), 4));

    }

    public void  viewMoreNoiLuc6(){
        txtViewMoreMV6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KLHintent = getIntent();
                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
                Intent ViewMoreNoiLuc6bundleklh = new Intent(ViewNoiLucklh.this, ViewMoreNoiLuc6klh.class);
                ViewMoreNoiLuc6bundleklh.putExtra("M61", KLHbundle.getDouble("M61"));
                ViewMoreNoiLuc6bundleklh.putExtra("M62", KLHbundle.getDouble("M62"));
                ViewMoreNoiLuc6bundleklh.putExtra("M63", KLHbundle.getDouble("M63"));
                ViewMoreNoiLuc6bundleklh.putExtra("M64", KLHbundle.getDouble("M64"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q61", KLHbundle.getDouble("Q61"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q62", KLHbundle.getDouble("Q62"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q63", KLHbundle.getDouble("Q63"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q64", KLHbundle.getDouble("Q64"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q65", KLHbundle.getDouble("Q65"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q66", KLHbundle.getDouble("Q66"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q67", KLHbundle.getDouble("Q67"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q68", KLHbundle.getDouble("Q68"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q69", KLHbundle.getDouble("Q69"));
                ViewMoreNoiLuc6bundleklh.putExtra("Q610", KLHbundle.getDouble("Q610"));



                startActivity(ViewMoreNoiLuc6bundleklh);


            }
        });

    }
    public void viewMoreNoiLuc4(){
        txtViewMoreMV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KLHintent = getIntent();
                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
                Intent ViewMoreNoiLuc4bundleklh = new Intent(ViewNoiLucklh.this, ViewMoreNoiLuc4klh.class);
                ViewMoreNoiLuc4bundleklh.putExtra("M41", KLHbundle.getDouble("M41"));
                ViewMoreNoiLuc4bundleklh.putExtra("M42", KLHbundle.getDouble("M42"));
                ViewMoreNoiLuc4bundleklh.putExtra("M43", KLHbundle.getDouble("M43"));
                ViewMoreNoiLuc4bundleklh.putExtra("M44", KLHbundle.getDouble("M44"));
                ViewMoreNoiLuc4bundleklh.putExtra("M45", KLHbundle.getDouble("M45"));
                ViewMoreNoiLuc4bundleklh.putExtra("M46", KLHbundle.getDouble("M46"));
                ViewMoreNoiLuc4bundleklh.putExtra("M47", KLHbundle.getDouble("M47"));
                ViewMoreNoiLuc4bundleklh.putExtra("M48", KLHbundle.getDouble("M48"));
                ViewMoreNoiLuc4bundleklh.putExtra("M49", KLHbundle.getDouble("M49"));
                ViewMoreNoiLuc4bundleklh.putExtra("M410", KLHbundle.getDouble("M410"));
                ViewMoreNoiLuc4bundleklh.putExtra("M411", KLHbundle.getDouble("M411"));
                ViewMoreNoiLuc4bundleklh.putExtra("M412", KLHbundle.getDouble("M412"));
                ViewMoreNoiLuc4bundleklh.putExtra("M413", KLHbundle.getDouble("M413"));
                ViewMoreNoiLuc4bundleklh.putExtra("M414", KLHbundle.getDouble("M414"));
                ViewMoreNoiLuc4bundleklh.putExtra("M415", KLHbundle.getDouble("M415"));
                ViewMoreNoiLuc4bundleklh.putExtra("M416", KLHbundle.getDouble("M416"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q41", KLHbundle.getDouble("Q41"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q42", KLHbundle.getDouble("Q42"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q43", KLHbundle.getDouble("Q43"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q44", KLHbundle.getDouble("Q44"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q45", KLHbundle.getDouble("Q45"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q46", KLHbundle.getDouble("Q46"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q47", KLHbundle.getDouble("Q47"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q48", KLHbundle.getDouble("Q48"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q49", KLHbundle.getDouble("Q49"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q410", KLHbundle.getDouble("Q410"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q411", KLHbundle.getDouble("Q411"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q412", KLHbundle.getDouble("Q412"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q413", KLHbundle.getDouble("Q413"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q414", KLHbundle.getDouble("Q414"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q415", KLHbundle.getDouble("Q415"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q416", KLHbundle.getDouble("Q416"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q417", KLHbundle.getDouble("Q417"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q418", KLHbundle.getDouble("Q418"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q419", KLHbundle.getDouble("Q419"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q420", KLHbundle.getDouble("Q420"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q421", KLHbundle.getDouble("Q421"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q422", KLHbundle.getDouble("Q422"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q423", KLHbundle.getDouble("Q423"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q424", KLHbundle.getDouble("Q424"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q425", KLHbundle.getDouble("Q425"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q426", KLHbundle.getDouble("Q426"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q427", KLHbundle.getDouble("Q427"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q428", KLHbundle.getDouble("Q428"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q429",KLHbundle.getDouble("Q429"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q430", KLHbundle.getDouble("Q430"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q431", KLHbundle.getDouble("Q431"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q432", KLHbundle.getDouble("Q432"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q433", KLHbundle.getDouble("Q433"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q434", KLHbundle.getDouble("Q434"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q435", KLHbundle.getDouble("Q435"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q436", KLHbundle.getDouble("Q436"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q437", KLHbundle.getDouble("Q437"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q438", KLHbundle.getDouble("Q438"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q439", KLHbundle.getDouble("Q439"));
                ViewMoreNoiLuc4bundleklh.putExtra("Q440", KLHbundle.getDouble("Q440"));

                startActivity(ViewMoreNoiLuc4bundleklh);

            }
        });
    }


    public void viewMorefGD1(){
        txtViewMorefGD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KLHintent = getIntent();
                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
                Intent ViewMoreUNGSUATGD1bundleklh = new Intent(ViewNoiLucklh.this, ViewMoreUngSuatGD1klh.class);
                ViewMoreUNGSUATGD1bundleklh.putExtra("f11", KLHbundle.getDouble("f11"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f12", KLHbundle.getDouble("f12"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f13", KLHbundle.getDouble("f13"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f14", KLHbundle.getDouble("f14"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f15", KLHbundle.getDouble("f15"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f16", KLHbundle.getDouble("f16"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f17", KLHbundle.getDouble("f17"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f18", KLHbundle.getDouble("f18"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f19", KLHbundle.getDouble("f19"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f110", KLHbundle.getDouble("f110"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f111", KLHbundle.getDouble("f111"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f112", KLHbundle.getDouble("f112"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f113", KLHbundle.getDouble("f113"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f114", KLHbundle.getDouble("f114"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f115", KLHbundle.getDouble("f115"));
                ViewMoreUNGSUATGD1bundleklh.putExtra("f116", KLHbundle.getDouble("f116"));


                startActivity(ViewMoreUNGSUATGD1bundleklh);

            }
        });

    }


    public void viewMoreNoiLucGD1() {
        txtViewMoreQGD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KLHintent = getIntent();
                Bundle KLHbundle = KLHintent.getBundleExtra("KLHbundle");
                Intent ViewMoreNOILUCGD1bundleklh = new Intent(ViewNoiLucklh.this, ViewMoreNoiLucGD1klh.class);
                //TODO lấy dữ liệu tính toán ráp vào, tạm thời a để 11,13
                ViewMoreNOILUCGD1bundleklh.putExtra("M11", KLHbundle.getDouble("M11"));
                ViewMoreNOILUCGD1bundleklh.putExtra("M12", KLHbundle.getDouble("M12"));
                ViewMoreNOILUCGD1bundleklh.putExtra("M13", KLHbundle.getDouble("M13"));
                ViewMoreNOILUCGD1bundleklh.putExtra("M14", KLHbundle.getDouble("M14"));
                ViewMoreNOILUCGD1bundleklh.putExtra("M15", KLHbundle.getDouble("M15"));
                ViewMoreNOILUCGD1bundleklh.putExtra("M16", KLHbundle.getDouble("M16"));
                ViewMoreNOILUCGD1bundleklh.putExtra("M17", KLHbundle.getDouble("M17"));
                ViewMoreNOILUCGD1bundleklh.putExtra("M18", KLHbundle.getDouble("M18"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q11", KLHbundle.getDouble("Q11"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q12", KLHbundle.getDouble("Q12"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q13", KLHbundle.getDouble("Q13"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q14", KLHbundle.getDouble("Q14"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q15", KLHbundle.getDouble("Q15"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q16", KLHbundle.getDouble("Q16"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q17", KLHbundle.getDouble("Q17"));
                ViewMoreNOILUCGD1bundleklh.putExtra("Q18", KLHbundle.getDouble("Q18"));
                startActivity(ViewMoreNOILUCGD1bundleklh);

            }
        });

    }
    public static SpannableString roundString ( double value, int places){
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

    public static double round ( double value, int places){
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}


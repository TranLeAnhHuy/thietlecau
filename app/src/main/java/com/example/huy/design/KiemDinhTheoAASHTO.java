package com.example.huy.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.applandeo.FilePicker;
import com.applandeo.constants.FileType;
import com.applandeo.listeners.OnSelectFileListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class KiemDinhTheoAASHTO extends AppCompatActivity {
    Button btnNhapFile;
    TextView txtViewTxt;
    File myFile;
    StringBuilder text = new StringBuilder();
    String s,s1,s2;

    String sen1,sen2,sen3,sen4,sen5,sen6,sen7,sen8,sen9,sen10,sen11,sen12;
    //
    Spinner spncauthep,spnphic, spnphis,spnphiLL;
    double phic,phis,phi=0.9,phiLL;
    int lastedSelectedphic = 0;
    int lastedSelectedcauthep = 0;
    int lastedSelectedphis = 0;
    int lastedSelectedphiLL = 0;
    String arrcauthep[] = {"liên hợp","Không Liên hợp"};
    String arrphic[] = {"Xấu","Tốt", "Khá", };
    String arrphis[]={"Cầu dầm/bản","Cấu kiện hàn","Cấu kiện đinh tán","Cấu kiện tai treo","Cầu 3 dầm chủ","Cầu 4 dầm chủ"};
    String arrphiLL[]={"Lưu lượng > 5000","Không biết lưu lượng","Lưu lượng = 1000","Lưu lượng < 100"};

    EditText edtNlan,edtmgLL,edtmgLLlt,edtts, edttv, edtbft, edttft, edttw, edtDw, edtbfc,edttfc,edtFy,edtfc,edtdtt,edtn1,edtdtd,edtn2,edtFyct,edtst,edtsd ;
    EditText edtLs, edtDW, edtS,edtde,edtDC;
    Button btnTinhToan;
    double Nlan,mgLLtt,mgLLlt,bi,ts, tv, bft, tft, tw, Dw, bfc,tfc,Fy,fc,dtt,n1,dtd,n2,Fyct,st,sd,Ls,S,de ;
    ///
    double DC,DW;
    /// momen dẻo
    double lienhop;
    double khonglienhop;
    double Ast,Sst;
    double bi1,bi2,bi3,bii,bc2,bc3,bcc,bc,be,bc1;
    double Mp;
    double Ps,Pc,Pt,Pw,Prt,Prb,Dcp;
    /// HL 93
    double M3truc_lan,M2truc_lan,M90;
    String txtHL93_inv,txtHL93_ope;
    double Y1,Y2,I1,I2;
    double  BssDT,BssDN,AstDT,  AstDN,SsttDT ,SsttDN,YstdDT,YstdDN, YsttDT, YsttDN, IstDT,IstDN,Ystd,Ist,Y3,I3;
    double SlttDT,SlttDN,YltdDT,YltdDN,YlttDT,YlttDN,IltDT, IltDN,Yltd,Ilt;
    double n, Anc,Snct,Yncd,D,Ynct,Inc, Sncd,BsDT,BsDN,AltDT,AltDN;
    ////////////inventory
    double RFltCD1_3truc_inventory,RFttCD1_3truc_inventory,RFltSD2_3truc_inventory,RFttSD2_3truc_inventory,
            RFltmoi_3truc_inventory,RFttmoi_3truc_inventory;
    double RFltCD1_2truc_inventory,RFttCD1_2truc_inventory,RFltSD2_2truc_inventory,
            RFttSD2_2truc_inventory,RFltmoi_2truc_inventory,RFttmoi_2truc_inventory;
    String txtkqRF_inv;


    ////////////////////////operating
    double RFltCD1_3truc_operating,RFttCD1_3truc_operating,RFltSD2_3truc_operating,RFttSD2_3truc_operating;
    double RFltCD1_2truc_operating,RFttCD1_2truc_operating,RFltSD2_2truc_operating,
            RFttSD2_2truc_operating;
    String txtkqRF_ope;

    ///////////////// legal load
    double Mtype3,Mtype3s2,Mtype33,RFltCD1_type3_legal,RFttCD1_type3_legal,RFltSD2_type3_legal,RFttSD2_type3_legal;
    double RFltCD1_type3s2_legal,RFttCD1_type3s2_legal,RFltSD2_type3s2_legal,RFttSD2_type3s2_legal;
    double RFltCD1_type33_legal,RFttCD1_type33_legal,RFltSD2_type33_legal,RFttSD2_type33_legal;
    double Mtype3s2_4truc,Mtype3s2_3truc,Mtype33_6truc,Mtype33_4truc ;
    double RFltCD1_type3s2_4truc_legal,RFttCD1_type3s2_4truc_legal,RFltSD2_type3s2_4truc_legal,RFttSD2_type3s2_4truc_legal,RFltCD1_type3s2_3truc_legal,
            RFttCD1_type3s2_3truc_legal,RFltSD2_type3s2_3truc_legal,RFttSD2_type3s2_3truc_legal;
    double RFltCD1_type33_6truc_legal,RFttCD1_type33_6truc_legal,RFltSD2_type33_6truc_legal,RFttSD2_type33_6truc_legal,RFltCD1_type33_4truc_legal,
            RFttCD1_type33_4truc_legal,RFltSD2_type33_4truc_legal,RFttSD2_type33_4truc_legal;
    String txtkqRF_legal_3,txtkqRF_legal_3s2,txtkqRF_legal_33,txtLegal3,txtLegal3s2,txtLegal33,txtLegal;
    double Tmax_type3,Tmax_type3s2,Tmax_type33;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiem_dinh_theo_aashto);
        addControls();
        addEvents();

    }
    public void addEvents(){

        Spinner();
        NhapFie();
        TinhToan();


    }

    public void NhapLieu(){

        try {
            DC = Double.parseDouble(edtDC.getText().toString());

            if (DC < 0) {

                edtDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDC.setError("Hãy nhập giá trị");
        }

        //   Mtt,Nlan,mgLL,bi,ts, tv, bft, tft, tw, Dw, bfc,tfc,Fy,fc,dtt,n1,dtd,n2,Fyct,st,sd ;
        try {
            DW = Double.parseDouble(edtDW.getText().toString());

            if (DW < 0) {

                edtDW.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDW.setError("Hãy nhập giá trị");
        }
//        try {
//            ppntt = Double.parseDouble(edtppntt.getText().toString());
//
//            if (ppntt < 0) {
//
//                edtppntt.setError("Lỗi: Nhập số lớn hơn 0");
//            }
//        } catch (Exception e) {
//            edtppntt.setError("Hãy nhập giá trị");
//        }
        try {
            Nlan = Double.parseDouble(edtNlan.getText().toString());

            if (Nlan < 0) {

                edtNlan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtNlan.setError("Hãy nhập giá trị");
        }
        try {
            mgLLtt = Double.parseDouble(edtmgLL.getText().toString());

            if (mgLLtt < 0) {

                edtmgLL.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtmgLL.setError("Hãy nhập giá trị");
        }
        try {
            mgLLlt = Double.parseDouble(edtmgLLlt.getText().toString());

            if (mgLLlt < 0) {

                edtmgLLlt.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtmgLLlt.setError("Hãy nhập giá trị");
        }
        try {
            S= Double.parseDouble(edtS.getText().toString());

            if (S < 0) {

                edtS.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtS.setError("Hãy nhập giá trị");
        }
        try {
            ts= Double.parseDouble(edtts.getText().toString());

            if (ts < 0) {

                edtts.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtts.setError("Hãy nhập giá trị");
        }
        try {
            tv= Double.parseDouble(edttv.getText().toString());

            if (tv< 0) {

                edttv.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edttv.setError("Hãy nhập giá trị");
        }

        try {
            bft= Double.parseDouble(edtbft.getText().toString());

            if ( bft< 0) {

                edtbft.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtbft.setError("Hãy nhập giá trị");
        }
        try {
            tft= Double.parseDouble(edttft.getText().toString());

            if (tft< 0) {

                edttft.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edttft.setError("Hãy nhập giá trị");
        }
        try {
            tw= Double.parseDouble(edttw.getText().toString());

            if (tw< 0) {

                edttw.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edttw.setError("Hãy nhập giá trị");
        }
        try {
            Dw= Double.parseDouble(edtDw.getText().toString());

            if (Dw< 0) {

                edtDw.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDw.setError("Hãy nhập giá trị");
        }
        try {
            bfc= Double.parseDouble(edtbfc.getText().toString());

            if (bfc< 0) {

                edtbfc.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtbfc.setError("Hãy nhập giá trị");
        }
        //    bft, tft, tw, Dw, bfc,tfc,Fy,fc,dtt,n1,dtd,n2,Fyct,st,sd ;
        try {
            tfc= Double.parseDouble(edttfc.getText().toString());

            if (tfc< 0) {

                edttfc.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edttfc.setError("Hãy nhập giá trị");
        }
        try {
            Fy= Double.parseDouble(edtFy.getText().toString());

            if (Fy< 0) {

                edtFy.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtFy.setError("Hãy nhập giá trị");
        }
        try {
            fc= Double.parseDouble(edtfc.getText().toString());

            if (fc< 0) {

                edtfc.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtfc.setError("Hãy nhập giá trị");
        }
        try {
            dtt= Double.parseDouble(edtdtt.getText().toString());

            if (dtt< 0) {

                edtdtt.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtdtt.setError("Hãy nhập giá trị");
        }
        try {
            n1= Double.parseDouble(edtn1.getText().toString());

            if (n1< 0) {

                edtn1.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtn1.setError("Hãy nhập giá trị");
        }
        try {
            dtd= Double.parseDouble(edtdtd.getText().toString());

            if (dtd< 0) {

                edtdtd.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtdtd.setError("Hãy nhập giá trị");
        }
        try {
            n2= Double.parseDouble(edtn2.getText().toString());

            if (n2< 0) {

                edtn2.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtn2.setError("Hãy nhập giá trị");
        }
        try {
            Fyct= Double.parseDouble(edtFyct.getText().toString());

            if (Fyct< 0) {

                edtFyct.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtFyct.setError("Hãy nhập giá trị");
        }
        try {
            st= Double.parseDouble(edtst.getText().toString());

            if (st< 0) {

                edtst.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtst.setError("Hãy nhập giá trị");
        }
        try {
            sd= Double.parseDouble(edtsd.getText().toString());

            if (sd< 0) {

                edtsd.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtsd.setError("Hãy nhập giá trị");
        }
        try {
            Ls= Double.parseDouble(edtLs.getText().toString());

            if (Ls< 0) {

                edtLs.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtLs.setError("Hãy nhập giá trị");
        }
        //Chiều dài phần hẫng
        try {
            de = Double.parseDouble(edtde.getText().toString());

            if (de < 0) {

                edtde.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtde.setError("Hãy nhập giá trị");
        }
    }
    public void addControls(){
        btnNhapFile=(Button) findViewById(R.id.btnNhapFile);
        txtViewTxt=(TextView) findViewById(R.id.txtViewTxt);
        ///////////
        spncauthep = (Spinner) findViewById(R.id.spncauthep);
        spnphic = (Spinner) findViewById(R.id.spnphic);
        spnphis = (Spinner) findViewById(R.id.spnphis);
        //spnphi = (Spinner) findViewById(R.id.spnphi);
        spnphiLL = (Spinner) findViewById(R.id.spnphiL);
     //   edtppntt=(EditText)findViewById(R.id.edtppntt);
        edtNlan=(EditText)findViewById(R.id.edtNlan);
        edtmgLL=(EditText)findViewById(R.id.edtmgLL);
        edtmgLLlt=(EditText)findViewById(R.id.edtmgLLlt);
        edtS=(EditText)findViewById(R.id.edtS);
        edtts=(EditText)findViewById(R.id.edtts);
        edttv=(EditText)findViewById(R.id.edttv);
        edtbft=(EditText)findViewById(R.id.edtbft);
        edttft=(EditText)findViewById(R.id.edttft);
        edttw=(EditText)findViewById(R.id.edttw);
        edtDw=(EditText)findViewById(R.id.edtDw);
        edtbfc=(EditText)findViewById(R.id.edtbfc);
        edttfc=(EditText)findViewById(R.id.edttfc);
        edtFy=(EditText)findViewById(R.id.edtFy);
        edtfc=(EditText)findViewById(R.id.edtfc);
        edtdtt=(EditText)findViewById(R.id.edtdtt);
        edtn1=(EditText)findViewById(R.id.edtn1);
        edtdtd=(EditText)findViewById(R.id.edtdtd);
        edtn2=(EditText)findViewById(R.id.edtn2);
        edtFyct=(EditText)findViewById(R.id.edtFyct);
        edtst=(EditText)findViewById(R.id.edtst);
        edtsd=(EditText)findViewById(R.id.edtsd);
        edtLs=(EditText)findViewById(R.id.edtLs);
        edtDW=(EditText)findViewById(R.id.edtDW);
        edtDC=(EditText)findViewById(R.id.edtDC);
        btnTinhToan = (Button) findViewById(R.id.btnTinhToan);
        edtde=(EditText) findViewById(R.id.edtde);





//        try {
//            = Double.parseDouble(edt.getText().toString());
//
//            if (< 0) {
//
//                edt.setError("Lỗi: Nhập số lớn hơn 0");
//            }
//        } catch (Exception e) {
//            edt.setError("Hãy nhập giá trị");
//        }
    }
    public void TinhToan(){
        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NhapLieu();

              /// spinner liên hợp hoặc không liên h
                if(lastedSelectedcauthep == 0){
                    LienHop();

                }else if(lastedSelectedcauthep == 1){
                    KhongLienHop();

                }


                kiemdinhHL93_INVENTORY();
                Intent cauthep_KDintent = new Intent(KiemDinhTheoAASHTO.this, KQ_kiemdinh_cauthep.class);
                Bundle cauthep_KDbundle = new Bundle();
                cauthep_KDbundle.putString("txtHL93_inv",txtHL93_inv);
                cauthep_KDbundle.putString("txtkqRF_inv",txtkqRF_inv);
                cauthep_KDbundle.putString("txtHL93_ope",txtHL93_ope);
                cauthep_KDbundle.putString("txtkqRF_ope",txtkqRF_ope);
                cauthep_KDbundle.putString("txtLegal3",txtLegal3);
                cauthep_KDbundle.putString("txtkqRF_legal_3",txtkqRF_legal_3);
                cauthep_KDbundle.putString("txtLegal3s2",txtLegal3s2);
                cauthep_KDbundle.putString("txtkqRF_legal_3s2",txtkqRF_legal_3s2);
                cauthep_KDbundle.putString("txtLegal33",txtLegal33);
                cauthep_KDbundle.putString("txtkqRF_legal_33",txtkqRF_legal_33);
                cauthep_KDbundle.putString("txtLegal",txtLegal);

                // LHbundle.putDouble("M4",M4 );
                cauthep_KDintent.putExtra("cauthep_KDbundle", cauthep_KDbundle);
                startActivity(cauthep_KDintent);

            }
        });
    }
    public void LienHop(){

        bi1 = (1000 * Ls) / 4.;
        bi2 = 12 * ts + Math.max(tw, 0.5 * bft);
        bi3 = S;
        bii = Math.min(bi1, bi2);
        bi = Math.min(bii, bi3);
        bc1 = 1000 * Ls / 8.;
        bc2 = 6 * ts + Math.max((tw / 2), (bft / 4));
        bc3 = de;
        bcc = Math.min(bc1, bc2);
        bc = (0.5 * bi) + Math.min(bcc, bc3);
        be=Math.min(bi,bc);

        Ps=0.85*fc*be*ts;
        Pc=Fy*bft*tft;
        Pt= Fy*bfc*tfc;
        Pw= Fy*Dw*tw;
        Prt= Fyct* n1* 3.14*dtt*dtt *0.25;
        Prb= Fyct*n2* 3.14*dtd*dtd *0.25;

        // xác định trục trung hòa dẻo
        if ((Pt + Pw) > (Ps + Pc + Prt + Prb)) {
            Dcp = (Dw / 2.) * ((Pt + Pw - Pc - Ps - Prt - Prb) / Pw);
            Mp=((Ps*(0.5*ts+tv+tft+Dcp)+(Prt*(ts+tv+Dcp-st+tft))+(Prb*(Dcp+tv+sd+tft))+(Pc*(0.5*tft+Dcp))+(Pt*(Dw-Dcp+0.5*tfc))+(Pw*(Math.abs(0.5*Dw-Dcp)))))/(1000000.);
            //  txtKT4 = "Pt+Pw=" + "" + (float) Math.round((Pt + Pw) * 1000) / 1000 + ">" + "Ps+Pc+Prt+Prb= " + (float) Math.round(((Pt + Pw - Pc - Ps - Prt - Prb) / Pw) * 1000) / 1000 + "\nDcp=" + "" + (float) Math.round((Dcp * 1000) / 1000) + "\n   Trục trung hòa dẻo nằm ở bản bụng";
            // Toast.makeText(nhaplieuthietke.this,"Trục trung hòa dẻo nằm ở bản bụng",Toast.LENGTH_LONG).show();
        } else if ((Pt + Pw < Ps + Pc + Prt + Prb && Pt + Pw + Pc > Ps + Prt + Prb)) {
            Dcp = (tft / 2.) * ((Pt + Pw + Pc - Ps - Prt - Prb) / Pc);
            Mp=((Ps*(0.5*ts+tv+Dcp))+(Prt*(ts+tv+Dcp-st))+(Prb*(Dcp+tv+sd))+(Pc*tft)+(Pt*(tft-Dcp+Dw+0.5*tfc))+(Pw*(tft-Dcp+0.5*Dw)))/(1000000.);

            //  txtKT4 = "Pt+Pw=" + "" + (float) Math.round((Pt + Pw) * 1000) / 1000 + "<" + "Ps+Pc+Prt+Prb= " + (float) Math.round((Ps + Pc + Prt + Prb) * 1000) / 1000 + "\nDcp=" + "" + (float) Math.round((Dcp * 1000) / 1000) + "\n   Trục trung hòa dẻo nằm ở bản cánh trên";
            // Toast.makeText(nhaplieuthietke.this,"Trục trung hòa dẻo nằm ở bản cánh trên",Toast.LENGTH_LONG).show();
        } else if (Ps>Pc+Pw+Pt) {
            Dcp  =(ts/Ps)*(Pc+Pt+Pw);
            Mp=((Ps*Dcp*Dcp*0.5/ts)+(Prt*(Dcp-st))+(Prb*(ts-Dcp-sd))+(Pc*(ts-Dcp+tv+0.5*tft))+(Pt*(ts-Dcp+tv+tft+Dw+0.5*tfc))+(Pw*(ts-Dcp+tv+tft+0.5*Dw)))/(1000000.);
            //  txtKT4 = "Trục trung hòa dẻo nằm ở bản bê tông";
            /// Toast.makeText(nhaplieuthietke.this,"Trục trung hòa dẻo nằm ở bản bê tông",Toast.LENGTH_LONG).show();
        }
        // momen dẻo
        //Mp = (Ps * (Dcp + tft + tv + ts / 2.) + Prt * (Dcp + tft + tv + ts - st) + Prb * (Dcp + tft + tv + ts + sd) + Pc * (Dcp + tft / 2.) + Pt * (Dw - Dcp + tfc / 2.) + Pw * (Math.abs(-Dcp + Dw / 2.))) * (1.0 / 1000000.);
        //double a=  Dcp+1;

        if(fc>= 16. && fc<20.){
            n=10.;
        }else if(fc>= 20.&& fc<25.){
            n=9.;
        }else if(fc>=25 && fc<32.){
            n=8;
        }else if(fc>=32 && fc<= 41){
            n=7.;
        }else {
            n=6.;
        }

        // nguyên
        Anc=bft*tft+ Dw*tw+ bfc*tfc;
        D=Dw+tfc+tft;
        Snct = (((bft * tft) * (D - (tft / 2.))) + ((Dw * tw) * (D - tft - (Dw / 2.))) + ((bfc * tfc) * (tfc / 2.)));
        Y1=Yncd = (Snct / Anc);
        Ynct = (D - Yncd);
        I1= Inc = ((bft * (Math.pow(tft, 3)) / 12) + (bft * tft) * Math.pow((Ynct - 0.5 * tft), 2) + (bfc * Math.pow(tfc, 3) / 12) + (bfc * tfc) * Math.pow((Yncd - 0.5 * tfc), 2) + (tw * Math.pow(Dw, 3) / 12) + (tw * Dw) + (tw * Dw) * Math.pow((0.5 * Dw + tfc - Yncd), 2));
        Sncd = (Anc * Ynct);
        //dài
        BsDT = (bi / (3 * n));
        BsDN = (bc / (3 * n));
        AltDT = (Anc + BsDT * ts);
        AltDN = (Anc + BsDN * ts);
        SlttDT = (bft * tft * (D - (tft / 2)) + Dw * tw * (tfc + 0.5 * Dw) + bfc * tfc * 0.5 * tfc + BsDT * ts * (D + 0.5 * ts));
        SlttDN = (bft * tft * (D - (tft / 2)) + Dw * tw * (tfc + 0.5 * Dw) + bfc * tfc * 0.5 * tfc + BsDN * ts * (D + 0.5 * ts));
        //Yltd
        YltdDT = (SlttDT / AltDT);
        YltdDN = (SlttDN / AltDN);
        //Yltt
        YlttDT = Math.ceil(D - YltdDT);
        YlttDN = Math.ceil(D - YltdDN);
        //Ilt
        IltDT = Inc + Anc * Math.pow(YltdDT - Yncd, 2) + (BsDT * Math.pow(ts, 3) / 12) + BsDT * ts * Math.pow(0.5 * ts + YlttDT + tv, 2);
        IltDN = Inc + Anc * Math.pow(YltdDN - Yncd, 2) + (BsDN * Math.pow(ts, 3) / 12) + BsDN * ts * Math.pow(0.5 * ts + YlttDN + tv, 2);
        ///
        Y2=Yltd=Math.max(YltdDN,YltdDT);
        I2=Ilt=Math.max(IltDN,IltDT);
        //ngắn
        //Bss

        Ast= Anc+(be/n)*ts;
        Snct=(bft*tft)*(D-0.5*tft)+(Dw*tw)*(D-tft-0.5*Dw)+(bfc*tfc)*0.5*tfc;
        Sst=Snct+(be/n)*ts*(D+tv+0.5*ts)+(bft*tv*(0.5*tv+D)/n);
        Ystd=Sst/Ast;
        Yltd=Dw+tft+tfc-Ystd;
        Ist=Inc+Anc*Math.pow(Ystd-Yncd,2)+(be*Math.pow(ts,3)/(12.*n))+(be/n)*ts*Math.pow(0.5*ts+tv+Yltd,2)+(((bft*Math.pow(tv,3)/12.)+bft*tv*(Math.pow(0.5*tv+Yltd,2)))/n);

        I3=Ist;
        Y3=Ystd;
        double as=Ist;

    }
    public void KhongLienHop(){
        /// KHÔNG KIÊN HỢP

        Mp=(Fy*tft*bft*(0.5*(Dw+tft+tfc)-0.5*tft)+Fy*tfc*bfc*(0.5*(Dw+tft+tfc)-0.5*tfc)+2*Fy*tw*Dw*Dw/8.)/1000000.;

        Anc=bft*tft+ Dw*tw+ bfc*tfc;
        D=Dw+tfc+tft;
        Snct = (((bft * tft) * (D - (tft / 2.))) + ((Dw * tw) * (D - tft - (Dw / 2.))) + ((bfc * tfc) * (tfc / 2.)));
        Y3=Y2= Y1=Yncd = (Snct / Anc);
        Ynct = (D - Yncd);
        I3=I2 = I1= Inc = ((bft * (Math.pow(tft, 3)) / 12) + (bft * tft) * Math.pow((Ynct - 0.5 * tft), 2) + (bfc * Math.pow(tfc, 3) / 12) + (bfc * tfc) * Math.pow((Yncd - 0.5 * tfc), 2) + (tw * Math.pow(Dw, 3) / 12) + (tw * Dw) + (tw * Dw) * Math.pow((0.5 * Dw + tfc - Yncd), 2));



    }
    public void kiemdinhHL93_INVENTORY(){

       // tính DC
       // DC=(bft*tft+tw*Dw+bfc*tfc)*78.5*1.1/1000000.;
        // tính momen
        if(0.5*Ls-4.3>0){
            M3truc_lan= (1./4.)*Ls*142.34+(1./2.)*((Ls/2.)-4.267)*142.34+(1./2.)*((Ls/2.)-4.267)*35.59+(93./80.) *Ls*Ls;
            M2truc_lan= (1./4.)*Ls*111.21+0.5*(0.5*Ls-1.219)*111.21+(93./80.)*Ls*Ls;
        }else if(0.5*Ls-4.3<=0){
            M3truc_lan=(0.25*Ls*142.34)+(93.*Ls*Ls/80.);

        }else if(0.5*Ls-1.2<=0){
            M2truc_lan=(0.25*Ls*111.21)+(93.*Ls*Ls/80.);
        }

       if(mgLLtt<=0){
            RFttCD1_3truc_inventory=0;
            RFttSD2_3truc_inventory=0;
            RFttmoi_3truc_inventory=0;
            RFttCD1_2truc_inventory=0;
            RFttSD2_2truc_inventory=0;
            RFttmoi_2truc_inventory=0;
           RFltCD1_3truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                   /(1.75*Nlan*1.33*mgLLlt*M3truc_lan);
           RFltSD2_3truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M3truc_lan*Y3*1000000./I3);
           RFltmoi_3truc_inventory= ((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLlt*M3truc_lan);
           RFltCD1_2truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                   /(1.75*Nlan*1.33*mgLLlt*M2truc_lan);

           RFltSD2_2truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M2truc_lan*Y3*1000000./I3);
           // RF thuần túy
           RFltmoi_2truc_inventory= ((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLlt*M2truc_lan);
            txtkqRF_inv="                 Kiểm tra tại TH HL93-INVENTORY            "+
                    "\n Hãy nhập hệ số ppn thực tế khác 0"
                    +"\n RF TTCĐ1 lý thuyết xe 3 trục   = "+ (float) Math.round(( RFltCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục    = "+ (float) Math.round(( RFttCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 3 trục  = "+ (float) Math.round(( RFltSD2_3truc_inventory) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 3 trục    = "+ (float) Math.round(( RFttSD2_3truc_inventory) * 100) / 100
                    +"\n RF TT mỏi lý thuyết xe 3 trục = "+ (float) Math.round(( RFltmoi_3truc_inventory) * 100) / 100
                    +"\n RF TT mỏi thực tế xe 3 trục   = "+ (float) Math.round(( RFttmoi_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục  = "+ (float) Math.round(( RFltCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục    = "+ (float) Math.round(( RFttCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 2 trục  = "+ (float) Math.round(( RFltSD2_2truc_inventory) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 2 trục    = "+ (float) Math.round(( RFttSD2_2truc_inventory) * 100) / 100
                    +"\n RF TT mỏi lý thuyết xe 2 trục = "+ (float) Math.round(( RFltmoi_2truc_inventory) * 100) / 100
                    +"\n RF TT mỏi thực tế xe 2 trục   = "+ (float) Math.round(( RFttmoi_2truc_inventory) * 100) / 100
            ;
        }else if(mgLLlt<=0){

            RFltCD1_3truc_inventory=0;
            RFltSD2_3truc_inventory=0;
            RFltmoi_3truc_inventory=0;
            RFltCD1_2truc_inventory=0;
            RFltSD2_2truc_inventory=0;
            RFltmoi_2truc_inventory=0;
            RFttCD1_3truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.75*Nlan*1.33*mgLLtt*M3truc_lan);
            RFttSD2_3truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M3truc_lan*Y3*1000000./I3);
            RFttmoi_3truc_inventory=((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLtt*M3truc_lan);

            RFttCD1_2truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.75*Nlan*1.33*mgLLtt*M2truc_lan);
            RFttSD2_2truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M2truc_lan*Y3*1000000./I3);
            RFttmoi_2truc_inventory=((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLtt*M2truc_lan);
            txtkqRF_inv="                 Kiểm tra tại TH HL93-INVENTORY            "+
                    "\n Hãy nhập hệ số ppn thực tế khác 0"
                    +"\n RF TTCĐ1 lý thuyết xe 3 trục   = "+ (float) Math.round(( RFltCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục    = "+ (float) Math.round(( RFttCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 3 trục  = "+ (float) Math.round(( RFltSD2_3truc_inventory) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 3 trục    = "+ (float) Math.round(( RFttSD2_3truc_inventory) * 100) / 100
                    +"\n RF TT mỏi lý thuyết xe 3 trục = "+ (float) Math.round(( RFltmoi_3truc_inventory) * 100) / 100
                    +"\n RF TT mỏi thực tế xe 3 trục   = "+ (float) Math.round(( RFttmoi_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục  = "+ (float) Math.round(( RFltCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục    = "+ (float) Math.round(( RFttCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 2 trục  = "+ (float) Math.round(( RFltSD2_2truc_inventory) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 2 trục    = "+ (float) Math.round(( RFttSD2_2truc_inventory) * 100) / 100
                    +"\n RF TT mỏi lý thuyết xe 2 trục = "+ (float) Math.round(( RFltmoi_2truc_inventory) * 100) / 100
                    +"\n RF TT mỏi thực tế xe 2 trục   = "+ (float) Math.round(( RFttmoi_2truc_inventory) * 100) / 100;
        }
        else {
           RFltCD1_3truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                   /(1.75*Nlan*1.33*mgLLlt*M3truc_lan);
           RFltSD2_3truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M3truc_lan*Y3*1000000./I3);
           RFltmoi_3truc_inventory= ((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLlt*M3truc_lan);
           RFltCD1_2truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                   /(1.75*Nlan*1.33*mgLLlt*M2truc_lan);

           RFltSD2_2truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M2truc_lan*Y3*1000000./I3);
           // RF thuần túy
           RFltmoi_2truc_inventory= ((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLlt*M2truc_lan);
            RFttCD1_3truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.75*Nlan*1.33*mgLLtt*M3truc_lan);
            RFttSD2_3truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M3truc_lan*Y3*1000000./I3);
            RFttmoi_3truc_inventory=((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLtt*M3truc_lan);

            RFttCD1_2truc_inventory=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.75*Nlan*1.33*mgLLtt*M2truc_lan);
            RFttSD2_2truc_inventory=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M2truc_lan*Y3*1000000./I3);
            RFttmoi_2truc_inventory=((phic*phis*phi*Mp)-(DC*Ls*Ls/8.)-(DW*Ls*Ls/8.))/(0.75*Nlan*1.33*mgLLtt*M2truc_lan);
            txtkqRF_inv="                 Kiểm tra tại TH HL93-INVENTORY            "+
                    "\n RF TTCĐ1 lý thuyết xe 3 trục   = "+ (float) Math.round(( RFltCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục    = "+ (float) Math.round(( RFttCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 3 trục  = "+ (float) Math.round(( RFltSD2_3truc_inventory) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 3 trục    = "+ (float) Math.round(( RFttSD2_3truc_inventory) * 100) / 100
                    +"\n RF TT mỏi lý thuyết xe 3 trục = "+ (float) Math.round(( RFltmoi_3truc_inventory) * 100) / 100
                    +"\n RF TT mỏi thực tế xe 3 trục   = "+ (float) Math.round(( RFttmoi_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục  = "+ (float) Math.round(( RFltCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục    = "+ (float) Math.round(( RFttCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 2 trục  = "+ (float) Math.round(( RFltSD2_2truc_inventory) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 2 trục    = "+ (float) Math.round(( RFttSD2_2truc_inventory) * 100) / 100
                    +"\n RF TT mỏi lý thuyết xe 2 trục = "+ (float) Math.round(( RFltmoi_2truc_inventory) * 100) / 100
                    +"\n RF TT mỏi thực tế xe 2 trục   = "+ (float) Math.round(( RFttmoi_2truc_inventory) * 100) / 100
                    ;
//            ;
        }


        //kiemr tra


//          if(RFtCD1_3truc_inventory>1){
            if(RFttCD1_3truc_inventory>1){
//                if(RFltSD2_3truc_inventory>1){
                    if(RFttSD2_3truc_inventory>1){
//                        if(RFltmoi_3truc_inventory>1){
                            if(RFttmoi_3truc_inventory>1){
//                                if(RFltCD1_2truc_inventory>1){
                                    if(RFttCD1_2truc_inventory>1){
//                                        if(RFltSD2_2truc_inventory>1){
                                            if(RFttSD2_2truc_inventory>1){
//                                                if(RFltmoi_2truc_inventory>1){
                                                    if(RFttmoi_2truc_inventory>1){

                                                        /// xuất kết quả đủ
                                                        //không hạn chế cầu
                                                        txtHL93_inv="THỎA trường hợp HL93-INVENTORY";


                                                                            }else{kiemdinhHL93_operating();
                                                                                txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
                                                                            }

                                                                        }else{kiemdinhHL93_operating();
                                                                            txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
                                                                        }

                                                                    }else{kiemdinhHL93_operating();
                                                                        txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";

                                                                    }

                                                                 }else{kiemdinhHL93_operating();
                                                                    txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
                                                                }

                                                            }else{kiemdinhHL93_operating();
                                                                txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
                                                            }

                                                        }else{kiemdinhHL93_operating();
                                                            txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
                                                        }

//                                                    }else{kiemdinhHL93_operating();
//                                                        txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
//                                                    }
//
//                                                }else{kiemdinhHL93_operating();
//                                                    txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
//                                                }
//
//                                            }else{kiemdinhHL93_operating();
//                                                txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
//                                            }
//
//                                        }else{kiemdinhHL93_operating();
//                                            txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
//                                        }
//
//                                    }else{kiemdinhHL93_operating();
//                                        txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
//                                    }
//
//                                }else{kiemdinhHL93_operating();
//                                    txtHL93_inv="KHÔNG THỎA trường hợp HL93-INVENTORY";
//                                }




    }
    public void kiemdinhHL93_operating(){
        ///////////   operating
        // /////////////////////////////////xe 3 trục/////////////////////////////////////
        // TTGH CD1
        ////RF thuần túy

        // RF nhập liệu
//        /// RF thuần túy
        if(mgLLtt<=0){
            /// RF nhaajo liệu thực tế
            RFttCD1_3truc_operating=0;
            RFttSD2_3truc_operating=0;
            RFttCD1_2truc_operating=0;
            RFttSD2_2truc_operating=0;
            RFltCD1_3truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLLlt*M3truc_lan);
            RFltSD2_3truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M3truc_lan*Y3*1000000./I3);
            ////////////////////////////xe 2 trục///////////////////////////////////////////////////
            RFltCD1_2truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLLlt*M2truc_lan);
            RFltSD2_2truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M2truc_lan*Y3*1000000./I3);

            txtkqRF_ope="                 Kiểm tra tại TH HL93-OPERATING            "+
                    "\n Hãy nhập hệ số ppn thực tế khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe 3 trục  = "+ (float) Math.round(( RFltCD1_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục   = "+ (float) Math.round(( RFttCD1_3truc_operating) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 3 trục = "+ (float) Math.round(( RFltSD2_3truc_operating) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 3 trục   = "+ (float) Math.round(( RFttSD2_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục = "+ (float) Math.round(( RFltCD1_2truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục   = "+ (float) Math.round(( RFttCD1_2truc_operating) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 2 trục = "+ (float) Math.round(( RFltSD2_2truc_operating) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 2 trục   = "+ (float) Math.round(( RFttSD2_2truc_operating) * 100) / 100

            ;


        }else if(mgLLlt<=0){
            RFltCD1_3truc_operating=0;
            RFltSD2_3truc_operating=0;
            RFltCD1_2truc_operating=0;
            RFltSD2_2truc_operating=0;
            RFttCD1_3truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.)) /(1.35*Nlan*1.33*mgLLtt*M3truc_lan);
            RFttSD2_3truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M3truc_lan*Y3*1000000./I3);
            RFttCD1_2truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.)) /(1.35*Nlan*1.33*mgLLtt*M2truc_lan);
            RFttSD2_2truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M2truc_lan*Y3*1000000./I3);

            txtkqRF_ope="                 Kiểm tra tại TH HL93-OPERATING            "+
                    "\n Hãy nhập hệ số ppn lý thuyết khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe 3 trục  = "+ (float) Math.round(( RFltCD1_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục   = "+ (float) Math.round(( RFttCD1_3truc_operating) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 3 trục = "+ (float) Math.round(( RFltSD2_3truc_operating) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 3 trục   = "+ (float) Math.round(( RFttSD2_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục = "+ (float) Math.round(( RFltCD1_2truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục   = "+ (float) Math.round(( RFttCD1_2truc_operating) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 2 trục = "+ (float) Math.round(( RFltSD2_2truc_operating) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 2 trục   = "+ (float) Math.round(( RFttSD2_2truc_operating) * 100) / 100

            ;
        }
        else  {
            RFltCD1_3truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLLlt*M3truc_lan);
            RFltSD2_3truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M3truc_lan*Y3*1000000./I3);
            ////////////////////////////xe 2 trục///////////////////////////////////////////////////
            RFltCD1_2truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLLlt*M2truc_lan);
            RFltSD2_2truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*M2truc_lan*Y3*1000000./I3);

            RFttCD1_3truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLLtt*M3truc_lan);
            RFttSD2_3truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M3truc_lan*Y3*1000000./I3);
            RFttCD1_2truc_operating=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLLtt*M2truc_lan);
            RFttSD2_2truc_operating=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*M2truc_lan*Y3*1000000./I3);
            txtkqRF_ope="                 Kiểm tra tại TH HL93-OPERATING            "+
                    "\n RF TTCĐ1 lý thuyết xe 3 trục  = "+ (float) Math.round(( RFltCD1_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục   = "+ (float) Math.round(( RFttCD1_3truc_operating) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 3 trục = "+ (float) Math.round(( RFltSD2_3truc_operating) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 3 trục   = "+ (float) Math.round(( RFttSD2_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục = "+ (float) Math.round(( RFltCD1_2truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục   = "+ (float) Math.round(( RFttCD1_2truc_operating) * 100) / 100
                    +"\n RF TTSD2 lý thuyết xe 2 trục = "+ (float) Math.round(( RFltSD2_2truc_operating) * 100) / 100
                    +"\n RF TTSD2 thực tế xe 2 trục   = "+ (float) Math.round(( RFttSD2_2truc_operating) * 100) / 100

            ;
        }



//                   //kiemr tra

//            if(RFltCD1_3truc_operating>1){
            if(RFttCD1_3truc_operating>1){
//                if(RFltSD2_3truc_operating>1){
                    if(RFttSD2_3truc_operating>1){
//                        if(RFltCD1_2truc_operating>1){
                            if(RFttCD1_2truc_operating>1){
//                                if(RFltSD2_2truc_operating>1){
                                    if(RFttSD2_2truc_operating>1){
                                        /// xuất kết quả đủ
                                                        //không hạn chế cầu
                                                        txtHL93_ope="THỎA trường hợp HL93-OPERATING";


                                                    }else{kiemdinhHL93_legal();
                                                        txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
                                                    }

                                                }else{kiemdinhHL93_legal();
                                    txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
                                                }

                                            }else{kiemdinhHL93_legal();
                                txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";

                                            }

                                        }else{kiemdinhHL93_legal();
                            txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
                                        }

//                                    }else{kiemdinhHL93_legal();
//                        txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
//                                    }

//                                }else{kiemdinhHL93_legal();
//                    txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
//                                }
//
//                            }else{kiemdinhHL93_legal();
//                txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
//                            }
//
//                        }else{kiemdinhHL93_legal();
//            txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
//                        }


    }
    public void kiemdinhHL93_legal(){
        txtLegal="Trường hợp xe Legal Load";

        if(Ls>8.9){
            Mtype3=(222.5-(71.2*(0.5*Ls-4.0475)+75.65*(0.5*Ls+0.5245)+75.65*(0.5*Ls+1.7435))/Ls)*(0.5*Ls+0.5245)-71.2*4.572;
        }else if(Ls<=8.9){
            Mtype3=(151.3-((75.65*(0.5*Ls-0.30475)+75.65*(0.5*Ls+0.91425))/Ls))*(0.5*Ls-0.30475);
        }
        if(Ls>14.138){
            Mtype3s2=(320.4-(44.5*(0.5*Ls-5.698)+68.975*(0.5*Ls-2.345)+68.975*(0.5*Ls- 1.126) +
                    68.975*(0.5*Ls+5.85) +68.975*(0.5*Ls+7.069))/Ls)*(0.5*Ls-1.126)-287.5345;
        }else if(Ls<14.138 && Ls>13.2) {

            Mtype3s2 = (275.9 - ((68.975 * (0.5 * Ls - 2.8955) + 68.975 * (0.5 * Ls - 1.6765) + 68.975 * (0.5 * Ls + 5.0295) + 68.975 * (0.5 * Ls + 6.2485)) / (Ls))) * (0.5 * Ls - 1.6765) - 68.975 * 1.219;
        }else if(Ls<=13.2 && Ls >12.7){
            Mtype3s2=(206.925-((68.975*(0.5*Ls-5.7915)+68.975*(0.5*Ls+0.9145)+68.975*(0.5*Ls+2.1335))/(Ls)))*(0.5*Ls+0.9145)-68.975*6.706;
        }else if(Ls<=12.7){
            Mtype3s2=(137.95-((68.975*(0.5*Ls-0.30475)+68.975*(0.5*Ls+0.91425))/Ls))*(0.5*Ls-0.30475);
        }


        if(Ls>19.537){
            Mtype33= (356-((53.4*(0.5*Ls-9.7685)+53.4*(0.5*Ls-5.1695)+53.4*(0.5*Ls-3.9775)+71.2*(0.5*Ls+0.5945)+62.3*(0.5*Ls+5.4715)+62.3*(0.5*Ls+6.6905))/(Ls)))*(0.5*Ls+0.5945)-53.4*18.9155;
        }
        else if(Ls<=19.537 && Ls>15.5)
        {
            Mtype33=(302.6-(53.4*(0.5*Ls-6.00525)+53.4*(0.5*Ls-4.78625)+71.2*(0.5*Ls-0.21425)+62.3*(0.5*Ls+4.66225)+62.3*(0.5*Ls+5.88125))/Ls)*(0.5*Ls-0.21425)-53.4*5.791-53.4*4.572;
        } else if(Ls<=15.5&& Ls> 9.3){
            Mtype33=(195.8-((71.2*(0.5*Ls-4.1838)+62.3*(0.5*Ls+0.6927+1.9117))/Ls))*(0.5*Ls+0.6927)-71.2*4.8765;

        }else if(Ls<=9.3 ){
            Mtype33=(124.6-((62.3*(0.5*Ls-0.30475+0.91425))/Ls))*(0.5*Ls-0.30475);
        }

/////////////////type 3

        // RF nhập liệu
        if(mgLLlt<=0){
            RFltCD1_type3_legal=0;
            /// sử dụng
            RFltSD2_type3_legal=0;

            RFttCD1_type3_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLtt*Mtype3);
            /// sử dụng
            RFttSD2_type3_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*Mtype3*Y3*1000000./I3);
            txtkqRF_legal_3="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3            "+
                    "\n Hãy nhập hệ số ppn lý thuyết khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe type 3  = "+ (float) Math.round(( RFltCD1_type3_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3  = "+ (float) Math.round(( RFttCD1_type3_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3  = "+ (float) Math.round((  RFltSD2_type3_legal) * 100) / 100+
                    "\n RF TTSD2 thực tế xe type 3  = "+ (float) Math.round(( RFttSD2_type3_legal) * 100) / 100

            ;
        }else if(mgLLtt<=0){

            RFltCD1_type3_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLlt*Mtype3);
            /// sử dụng
            RFltSD2_type3_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*Mtype3*Y3*1000000./I3);

            RFttCD1_type3_legal=0;
            /// sử dụng
            RFttSD2_type3_legal=0;
            txtkqRF_legal_3="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3            "+
                    "\n Hãy nhập hệ số ppn thực tế khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe type 3  = "+ (float) Math.round(( RFltCD1_type3_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3  = "+ (float) Math.round(( RFttCD1_type3_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3  = "+ (float) Math.round((  RFltSD2_type3_legal) * 100) / 100+
                    "\n RF TTSD2 thực tế xe type 3  = "+ (float) Math.round(( RFttSD2_type3_legal) * 100) / 100

            ;

        }else {


            RFltCD1_type3_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLlt*Mtype3);
            /// sử dụng
            RFltSD2_type3_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*Mtype3*Y3*1000000./I3);

            RFttCD1_type3_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLtt*Mtype3);
            /// sử dụng
            RFttSD2_type3_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*Mtype3*Y3*1000000./I3);
            txtkqRF_legal_3="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3            "+
                    "\n RF TTCĐ1 lý thuyết xe type 3  = "+ (float) Math.round(( RFltCD1_type3_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3  = "+ (float) Math.round(( RFttCD1_type3_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3  = "+ (float) Math.round((  RFltSD2_type3_legal) * 100) / 100+
                    "\n RF TTSD2 thực tế xe type 3  = "+ (float) Math.round(( RFttSD2_type3_legal) * 100) / 100

            ;
        }

               ///// chưa sửa
//        if(RFltCD1_type3_legal>=1){
//            if(RFltSD2_type3_legal>=1){
                if(RFttCD1_type3_legal>=1){
                    if(RFttSD2_type3_legal>=1){
                        ///cầu ok
                        txtLegal3="Cầu hoạt động bình thường với xe Legal Type 3";

                    }else{
                        if(RFttSD2_type3_legal>0.3){
                            // cấm biển tải trọng
                            double mt3,mt31,mt32;
                            mt3=Math.min(RFltCD1_type3_legal,RFltSD2_type3_legal);
                            mt31=Math.min(mt3,RFttCD1_type3_legal);
                            mt32=Math.min(RFttCD1_type3_legal,RFttSD2_type3_legal);
                            Tmax_type3= (222.5*mt32)/9.81;
                            txtLegal3="Tải trọng tối đa cho phép qua cầu với xe Legal Type 3  "+(float) Math.round((Tmax_type3) * 100) / 100+  "T";
                        }else{
                            txtLegal3="DỪNG KHAI THÁC";

                        }


                    }

                }else{

                        if(RFttCD1_type3_legal>0.3){
                            // cấm biển tải trọng
                            double mt3,mt31,mt32;
                            mt3=Math.min(RFltCD1_type3_legal,RFltSD2_type3_legal);
                            mt31=Math.min(mt3,RFttCD1_type3_legal);
                            mt32=Math.min(RFttCD1_type3_legal,RFttSD2_type3_legal);
                            Tmax_type3= (222.5*mt32)/9.81;
                            txtLegal3="Tải trọng tối đa cho phép qua cầu với xe Legal Type 3  "+(float) Math.round((Tmax_type3) * 100) / 100+  "T";
                        }else{
                            txtLegal3="DỪNG KHAI THÁC";

                        }
                }

//            }else{
//                // cấm biển tải trọng
//                double mt3,mt31,mt32;
//                mt3=Math.min(RFltCD1_type3_legal,RFltSD2_type3_legal);
//                mt31=Math.min(mt3,RFttCD1_type3_legal);
//                mt32=Math.min(mt31,RFttSD2_type3_legal);
//                Tmax_type3= (222.5*mt32)/9.81;
//                txtLegal3="Tải trọng tối đa cho phép qua cầu với xe Legal Type 3  "+(float) Math.round((Tmax_type3) * 100) / 100+  "T";
//            }
//        }else{
//            // cấm biển tải trọng
//            double mt3,mt31,mt32;
//            mt3=Math.min(RFltCD1_type3_legal,RFltSD2_type3_legal);
//            mt31=Math.min(mt3,RFttCD1_type3_legal);
//            mt32=Math.min(mt31,RFttSD2_type3_legal);
//            Tmax_type3= (222.5*mt32)/9.81;
//            txtLegal3="Tải trọng tối đa cho phép qua cầu với xe Legal Type 3  "+(float) Math.round((Tmax_type3) * 100) / 100+  "T";
//        }






        //////////////////TYPE 3S2
////////////////////////////////////////// bổ sung thêm 2 xe của 3s2   Mtype3s2_4truc




        /////////////// chưa

        if(mgLLlt<=0){
            RFltCD1_type3s2_legal=0;

            /// sử dụng
            RFltSD2_type3s2_legal=0;

            ////////////////////// thực tế

            RFttCD1_type3s2_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8))/(1.35*Nlan*phiLL*mgLLtt*Mtype3s2);

            /// sử dụng
            RFttSD2_type3s2_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*Mtype3s2*Y3*1000000./I3);

            txtkqRF_legal_3s2="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3S2            "+
                    "\n Hãy nhập hệ số ppn lý thuyết khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe type 3S2  = "+ (float) Math.round(( RFltCD1_type3s2_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3S2  = "+ (float) Math.round(( RFttCD1_type3s2_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3S2  = "+ (float) Math.round((  RFltSD2_type3s2_legal) * 100) / 100+
                    "\n RF TTSD2 thực tế xe type 3S2  = "+ (float) Math.round(( RFttSD2_type3s2_legal) * 100) / 100
            ;
        }else if(mgLLtt<=0){

            RFltCD1_type3s2_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8))/(1.35*Nlan*phiLL*mgLLlt*Mtype3s2);

            /// sử dụng
            RFltSD2_type3s2_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*Mtype3s2*Y3*1000000./I3);

            ////////////////////// thực tế

            RFttCD1_type3s2_legal=0;

            /// sử dụng
            RFttSD2_type3s2_legal=0;

            txtkqRF_legal_3s2="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3S2            "+
                    "\n Hãy nhập hệ số ppn thực tế khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe type 3S2  = "+ (float) Math.round(( RFltCD1_type3s2_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3S2  = "+ (float) Math.round(( RFttCD1_type3s2_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3S2  = "+ (float) Math.round((  RFltSD2_type3s2_legal) * 100) / 100+
                    "\n RF TTSD2 thực tế xe type 3S2  = "+ (float) Math.round(( RFttSD2_type3s2_legal) * 100) / 100

            ;

        }else {

            RFltCD1_type3s2_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8))/(1.35*Nlan*phiLL*mgLLlt*Mtype3s2);

            /// sử dụng
            RFltSD2_type3s2_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*Mtype3s2*Y3*1000000./I3);

            ////////////////////// thực tế

            RFttCD1_type3s2_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8))/(1.35*Nlan*phiLL*mgLLtt*Mtype3s2);

            /// sử dụng
            RFttSD2_type3s2_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*Mtype3s2*Y3*1000000./I3);



            txtkqRF_legal_3s2 = "                 Kiểm tra tại TH LEGAL LOAD-TYPE 3S2            " +
                    "\n RF TTCĐ1 lý thuyết xe type 3S2  = " + (float) Math.round((RFltCD1_type3s2_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3S2  = " + (float) Math.round((RFttCD1_type3s2_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3S2  = " + (float) Math.round((RFltSD2_type3s2_legal) * 100) / 100 +
                    "\n RF TTSD2 thực tế xe type 3S2  = " + (float) Math.round((RFttSD2_type3s2_legal) * 100) / 100

            ;
        }
        ///// chưa sửa
        double RF3s2,RF3s21,RF3s22;
        RF3s2=Math.min(RFltCD1_type3s2_legal, RFltSD2_type3s2_legal);
        RF3s21=Math.min(RF3s2,RFttCD1_type3s2_legal);
        RF3s22=Math.min(RFttCD1_type3s2_legal,RFttSD2_type3s2_legal);
//        if(RFltCD1_type3s2_legal>=1){
//            if(RFltSD2_type3s2_legal>=1){
                if(RFttCD1_type3s2_legal>=1){
                    if(RFttSD2_type3s2_legal>=1){
                        ///cầu ok
                        txtLegal3s2="Cầu hoạt động bình thường với xe Legal 3S2";

                    }else{
                        if(RFttSD2_type3s2_legal>0.3){
                            // cấm biển tải trọng
                            Tmax_type3s2= (320.4*RF3s22)/9.81;
                            txtLegal3s2="Tải trọng tối đa cho phép qua cầu với xe Legal 3S2  "+(float) Math.round((Tmax_type3s2) * 100) / 100+  "T";
                        }else{
                            txtLegal3s2="DỪNG KHAI THÁC";

                        }
                    }

                }else{
                    if(RFttCD1_type3s2_legal>0.3){
                        // cấm biển tải trọng
                        Tmax_type3s2= (320.4*RF3s22)/9.81;
                        txtLegal3s2="Tải trọng tối đa cho phép qua cầu với xe Legal 3S2  "+(float) Math.round((Tmax_type3s2) * 100) / 100+  "T";
                    }else{
                        txtLegal3s2="DỪNG KHAI THÁC";

                    }
                }

//            }else{
//                Tmax_type3s2= (320.4*RF3s22)/9.81;
//                txtLegal3s2="Tải trọng tối đa cho phép qua cầu với xe Legal 3S2  "+(float) Math.round((Tmax_type3s2) * 100) / 100+  "T";
//            }
//        }else{
//            // cấm biển tải trọng
//            Tmax_type3s2= (320.4*RF3s22)/9.81;
//            txtLegal3s2="Tải trọng tối đa cho phép qua cầu với xe Legal 3S2  "+(float) Math.round((Tmax_type3s2) * 100) / 100+  "T";
//        }





        ///////TYpe 33
////////////////////////////////////////// bổ sung thêm 2 xe của 33  Mtype33_6truc  Mtype33_4truc

        if(mgLLlt<=0){
            RFltCD1_type33_legal=0;
            /// sử dụng
            RFltSD2_type33_legal=0;
            RFttCD1_type33_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLtt*Mtype33);

            /// sử dụng
            RFttSD2_type33_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*Mtype33*Y3*1000000./I3);

            txtkqRF_legal_33="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3-3            "+
                    "\n Hãy nhập hệ số ppn lý thuyết khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe type 3-3  = "+ (float) Math.round(( RFltCD1_type33_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3-3  = "+ (float) Math.round(( RFttCD1_type33_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3-3  = "+ (float) Math.round((  RFltSD2_type33_legal) * 100) / 100+
                    "\n RF TTSD2 thực tế xe type 3-3  = "+ (float) Math.round(( RFttSD2_type33_legal) * 100) / 100

            ;
        }else if(mgLLtt<=0){
            RFltCD1_type33_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLlt*Mtype33);

            /// sử dụng
            RFltSD2_type33_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*Mtype33*Y3*1000000./I3);
            RFttCD1_type33_legal=0;

            /// sử dụng
            RFttSD2_type33_legal=0;
            txtkqRF_legal_33="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3-3            "+
                    "\n Hãy nhập hệ số ppn thực tế khác 0"+
                    "\n RF TTCĐ1 lý thuyết xe type 3-3  = "+ (float) Math.round(( RFltCD1_type33_legal) * 100) / 100 +
                    "\n RF TTCĐ1 thực tế xe type 3-3  = "+ (float) Math.round(( RFttCD1_type33_legal) * 100) / 100 +
                    "\n RF TTSD2 lý thuyết xe type 3-3  = "+ (float) Math.round((  RFltSD2_type33_legal) * 100) / 100+
                    "\n RF TTSD2 thực tế xe type 3-3  = "+ (float) Math.round(( RFttSD2_type33_legal) * 100) / 100

            ;
        } else {
            RFltCD1_type33_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLlt*Mtype33);

            /// sử dụng
            RFltSD2_type33_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLlt*Mtype33*Y3*1000000./I3);
            RFttCD1_type33_legal=((phic*phis*phi*Mp)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLLtt*Mtype33);

            /// sử dụng
            RFttSD2_type33_legal=(0.95*Fy-(0.125*DC*Ls*Ls*Y1*1000000./I1)-(0.125*DW*Ls*Ls*Y2*1000000./I2))/(1.3*Nlan*1.33*mgLLtt*Mtype33*Y3*1000000./I3);


            txtkqRF_legal_33="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3-3            "+
                "\n Hãy nhập hệ số ppn lý thuyết khác 0"+
                "\n RF TTCĐ1 lý thuyết xe type 3-3  = "+ (float) Math.round(( RFltCD1_type33_legal) * 100) / 100 +
                "\n RF TTCĐ1 thực tế xe type 3-3  = "+ (float) Math.round(( RFttCD1_type33_legal) * 100) / 100 +
                "\n RF TTSD2 lý thuyết xe type 3-3  = "+ (float) Math.round((  RFltSD2_type33_legal) * 100) / 100+
                "\n RF TTSD2 thực tế xe type 3-3  = "+ (float) Math.round(( RFttSD2_type33_legal) * 100) / 100

        ;}
        double RF33,RF331,RF332;

        RF33=Math.min(RFltCD1_type33_legal,RFltSD2_type33_legal);
        RF331=Math.min(RF33,RFttCD1_type33_legal);
        RF332=Math.min(RFttCD1_type33_legal,RFttSD2_type33_legal);
//        if(RFltCD1_type33_legal>=1){
//            if(RFltSD2_type33_legal>=1){
                if(RFttCD1_type33_legal>=1){
                    if(RFttSD2_type33_legal>=1){
                        ///cầu ok
                        txtLegal33="Cầu hoạt động bình thường với xe Legal 3-3";

                    }else{
                        if(RFttSD2_type33_legal>0.3){
                            // cấm biển tải trọng
                            Tmax_type33= (356.*RF332)/9.81;
                            txtLegal33="Tải trọng tối đa cho phép qua cầu với xe Legal 3-3  "+(float) Math.round((Tmax_type33) * 100) / 100+  "T";
                        }else{
                            txtLegal33="DỪNG KHAI THÁC";

                        }
                   }

                }else{
                    if(RFttCD1_type33_legal>0.3){
                        // cấm biển tải trọng
                        Tmax_type33= (356.*RF332)/9.81;
                        txtLegal33="Tải trọng tối đa cho phép qua cầu với xe Legal 3-3  "+(float) Math.round((Tmax_type33) * 100) / 100+  "T";
                    }else{
                        txtLegal33="DỪNG KHAI THÁC";

                    }              }

//            }else{
//                Tmax_type33= (356.*RF332)/9.81;
//                txtLegal33="Tải trọng tối đa cho phép qua cầu với xe Legal 3-3  "+(float) Math.round((Tmax_type33) * 100) / 100+  "T";
//            }
//        }else{
//            Tmax_type33= (356.*RF332)/9.81;
//            txtLegal33="Tải trọng tối đa cho phép qua cầu với xe Legal 3-3  "+(float) Math.round((Tmax_type33) * 100) / 100+  "T";
//        }



    }

    public void Spinner(){
        /// Cầu thép
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adaptercauthep = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,  arrcauthep);
        adaptercauthep.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spncauthep.setAdapter(adaptercauthep);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spncauthep.setOnItemSelectedListener(new MyProcessEventcauthep());
        //Class tạo sự kiện
        // phic
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapterphic = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrphic);
        adapterphic.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnphic.setAdapter(adapterphic);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnphic.setOnItemSelectedListener(new MyProcessEventphic());
        //Class tạo sự kiện

        // phis
        ArrayAdapter<String> adapterphis = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrphis);
        adapterphis.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnphis.setAdapter(adapterphis);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnphis.setOnItemSelectedListener(new MyProcessEventphis());
        // phiLL
        ArrayAdapter<String> adapterphiLL = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrphiLL);
        adapterphiLL.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnphiLL.setAdapter(adapterphiLL);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnphiLL.setOnItemSelectedListener(new MyProcessEventphiLL());
    }

    public class MyProcessEventphiLL implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            lastedSelectedphiLL = position;
            if (lastedSelectedphiLL == 0) {
                phiLL=1.8;

                //  Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            } else if (lastedSelectedphiLL == 1) {
                phiLL=1.8;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            } else if (lastedSelectedphiLL == 2) {
                phiLL=1.65;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            }
            else if (lastedSelectedphiLL == 3) {
                phiLL=1.4;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            }


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
        //Nếu không chọn gì cả
    }

    public class MyProcessEventphis implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            lastedSelectedphis = position;
            if (lastedSelectedphis == 0) {
                phis=1;

                //  Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            } else if (lastedSelectedphis == 1) {
                phis=0.85;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            } else if (lastedSelectedphis == 2) {
                phis=0.9;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            }
            else if (lastedSelectedphis == 3) {
                phis=0.9;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            }
            else if (lastedSelectedphis == 4) {
                phis=0.85;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            }
            else if (lastedSelectedphis == 5) {
                phis=0.95;

                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
        //Nếu không chọn gì cả
    }
    public class MyProcessEventcauthep implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            lastedSelectedcauthep = position;


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
        //Nếu không chọn gì cả
    }
    public class MyProcessEventphic implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            lastedSelectedphic = position;
            if (lastedSelectedphic == 0) {
                phic= 0.85;
                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            }
            else if (lastedSelectedphic == 1) {
                phic= 0.95;
                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            }
            else if (lastedSelectedphic == 2) {
                phic = 1;
                //  Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
        //Nếu không chọn gì cả
    }

    public void NhapFie(){
        btnNhapFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FilePicker.Builder(KiemDinhTheoAASHTO.this, new OnSelectFileListener() {
                    @Override
                    public void onSelect(File file) {
                        myFile = file;
                        BufferedReader br = null;
                        try {
                            br = new BufferedReader(new FileReader(myFile));
                            String line;
                            while ((line = br.readLine()) != null) {
                                text.append(line);
                                text.append('\n');


                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                br.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        // KẾT QUẢ ĐÂY
                        //////////////tách chuỗi//////////////
                        s = text.toString();
                        int vtc1=s.lastIndexOf("* Intelliducer Names");
                        int vtc2=s.lastIndexOf("* Box Names");
                        int vtc3=s.lastIndexOf("* Data");
                        int vtc4=s.lastIndexOf("* Starting position");
                        Log.d("huyhuyhuy",s +"ffffffffffffffffffffffffffffffffffffffffffff");
                        //////////////////////////////
                        s1= s.substring(vtc1+20,vtc2);
                        s1=s1.trim();
                        s2=s.substring(vtc3+6,vtc4);
                        s2=s2.trim();
                        ///////////tách dữ liệu//////////////
                        // tách hàng
                        String []name=s1.split(",");
                        String []row=s2.split(",\n");
                        int c=s1.split(",").length;
                        int d=s2.split(",\n").length;

                        for(int i=0; i<=d;i++){
                            for (int k=0; k<=c; k++){
                                String []data=row[i].split(",");
                                sen1=data[0];
                            }
                        }


                        txtViewTxt.setText(sen1);

//
//                        txtViewTxt.setText("Tên cảm biến: "+s1+"\nGiá trị cảm biến đo đc"+s2);
                    }
                }).fileType(FileType.TEXT).show();
            }
        });
    }
    public void btnTroVe(View view) {
        Intent iTroVe = new Intent(KiemDinhTheoAASHTO.this, MainActivity.class);
        startActivity(iTroVe);
    }
}

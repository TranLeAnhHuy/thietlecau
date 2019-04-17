package com.example.huy.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class KiemDinhTheoAASHTO_BTCT extends AppCompatActivity {
    Spinner spncauthep,spnphic, spnphis,spnphiLL;
    double phic,phis,phi=0.9,phiLL;
    int lastedSelectedphic = 0;
    int lastedSelectedcauthep = 0;
    int lastedSelectedphis = 0;
    int lastedSelectedphiLL = 0;
    String arrcauthep[] = {"Dầm I","Dầm T","Cầu bản"};
    String arrphic[] = {"Xấu","Tốt", "Khá", };
    String arrphis[]={"Cầu dầm/bản","Cấu kiện hàn","Cấu kiện đinh tán","Cấu kiện tai treo","Cầu 3 dầm chủ","Cầu 4 dầm chủ"};
    String arrphiLL[]={"Lưu lượng > 5000","Không biết lưu lượng","Lưu lượng = 1000","Lưu lượng < 100"};
    Button btnTinhToan;
    double damI,damT, ban;
    EditText edtMtt,edtNlan,edtmgLL,edtts,edtfcbmc,edtfcdc,edtyc,edtFy,edth,edthf,edtbf,  edttw, edthw,edtbe,edtht;
    EditText edtLs, edtDW, edtdbv,edtds,edtnthep,edtbt;

    double Mtt,Nlan,mgLL,ts,fcbmc,fcdc,yc,Fy,h,hf,bf, tw, hw,be,ht,Ls, DW, dbv,ds,nthep,bt;
    double Mlt;
    // tính momen
    double M1,M2,M3,DC;
    String txtHL93_inv,txtHL93_ope;
    ///////////inventory
    double RFltCD1_3truc_inventory,RFttCD1_3truc_inventory,RFltCD1_2truc_inventory,RFttCD1_2truc_inventory,RFltCD1_90_inventory,RFttCD1_90_inventory;
    String txtkqRF_inv;

    ////////////////////////operating
    double RFltCD1_3truc_operating,RFttCD1_3truc_operating;
    double RFltCD1_2truc_operating,RFttCD1_2truc_operating;
    double RFltCD1_90_operating,RFttCD1_90_operating;
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
        setContentView(R.layout.activity_kiem_dinh_theo_aashto__btct);
        addControls();
        addEvents();
    }
    public void addEvents(){

        Spinner();

        TinhToan();


    }
    public void addControls(){
//        btnNhapFile=(Button) findViewById(R.id.btnNhapFile);
//        txtViewTxt=(TextView) findViewById(R.id.txtViewTxt);
        ///////////
        spncauthep = (Spinner) findViewById(R.id.spncauthep);
        spnphic = (Spinner) findViewById(R.id.spnphic);
        spnphis = (Spinner) findViewById(R.id.spnphis);
        //spnphi = (Spinner) findViewById(R.id.spnphi);
        spnphiLL = (Spinner) findViewById(R.id.spnphiL);
//       dbv,ds,nthep,bt;
        edtMtt=(EditText)findViewById(R.id.edtMtt);
        edtNlan=(EditText)findViewById(R.id.edtNlan);
        edtmgLL=(EditText)findViewById(R.id.edtmgLL);
        edtts=(EditText)findViewById(R.id.edtts);
        edtfcbmc=(EditText)findViewById(R.id.edtfcbmc);
        edtfcdc=(EditText)findViewById(R.id.edtfcdc);
        edtyc=(EditText)findViewById(R.id.edtyc);
        edtFy=(EditText)findViewById(R.id.edtFy);
        edth=(EditText)findViewById(R.id.edth);
        edthf=(EditText)findViewById(R.id. edthf);
        edtbf=(EditText)findViewById(R.id.edtbf);
        edttw=(EditText)findViewById(R.id.edttw);
        edthw=(EditText)findViewById(R.id.edthw);
        edtbe=(EditText)findViewById(R.id.edtbe);
        edtht=(EditText)findViewById(R.id.edtht);
        btnTinhToan = (Button) findViewById(R.id.btnTinhToan);
        edtDW=(EditText) findViewById(R.id.edtDW);
        edtLs=(EditText)findViewById(R.id.edtLs);

        edtdbv=(EditText)findViewById(R.id.edtdbv);
        edtds=(EditText)findViewById(R.id.edtds);
        edtnthep=(EditText)findViewById(R.id.edtnthep);
        edtbt=(EditText)findViewById(R.id.edtbt);


    }
    public void kiemdinhHL93_legal(){
        txtLegal="Trường hợp xe Legal Load";
            //////////////////TYPE 3
        Mtype3=(222.5-(71.2*(0.5*Ls-4.0475)+75.65*(0.5*Ls+0.5245)+75.65*(0.5*Ls+1.219+1.7345))/Ls)*(0.5*Ls+0.5245)-71.2*4.572;


        Mtype3s2=(320.4-(44.5*(0.5*Ls-5.698)+68.975*(0.5*Ls-2.345)+68.975*(0.5*Ls- 1.216) +
                68.975*(0.5*Ls+5.58) +68.975*(0.5*Ls+6.799))/Ls)*(0.5*Ls-1.216)-44.5*4.572-68.975*1.219;
        Mtype3s2_4truc=(275.9-((68.975*(0.5*Ls-2.8955)+68.975*(0.5*Ls-1.6765)+68.975*(0.5*Ls+5.0295)+68.975*(0.5*Ls+6.2485))/(Ls)))*(0.5*Ls-1.6765)-68.975*1.219;
        Mtype3s2_3truc=(206.925-((68.975*(0.5*Ls-5.7915)+68.975*(0.5*Ls+0.9145)+68.975*(0.5*Ls+2.1335))/(Ls)))*(0.5*Ls+0.9145)-68.975*6.706;



        Mtype33=(302.6-(53.4*(0.5*Ls-6.00525)+53.4*(0.5*Ls-4.78625)+71.2*(0.5*Ls-0.21425)+62.3*(0.5*Ls+4.66225)+62.3*(0.5*Ls+5.88125))/Ls)*(0.5*Ls-0.21425)-53.4*5.791-53.4*4.572;
        Mtype33_6truc= (356-((53.4*(0.5*Ls-9.7455)+53.4*(0.5*Ls-5.1735)+53.4*(0.5*Ls-3.9545)+71.2*(0.5*Ls+0.6175)+62.3*(0.5*Ls+5.494)+62.3*(0.5*Ls+6.713))/(Ls)))*(0.5*Ls+0.6175)-53.4*20.726;
        Mtype33_4truc=(249.2-(53.4*(0.5*Ls-5.4535)+71.2*(0.5*Ls-0.8815)+62.3*(0.5*Ls+3.995)+62.3*(0.5*Ls+5.214))/Ls)*(0.5*Ls-0.8815)-53.4*4.572;
/////////////////type 3

        RFltCD1_type3_legal=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLL*Mtype3);
        /// sử dụng
        // RF nhập liệu
        txtkqRF_legal_3="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3            "+
                "\n RF TTCĐ1 lý thuyết xe type 3  = "+ (float) Math.round(( RFltCD1_type3_legal) * 100) / 100

        ;

        if( RFltCD1_type3_legal >=1){
            ///cầu ok
            txtLegal3="Cầu hoạt động bình thường với xe Legal Type 3";
        }else{
            // cấm biển tải trọng

            Tmax_type3= (222.5*RFltCD1_type3_legal)/9.81;
            txtLegal3="Tải trọng tối đa cho phép qua cầu  "+(float) Math.round((Tmax_type3) * 100) / 100+  "T";
        }




        //////////////////TYPE 3S2
////////////////////////////////////////// bổ sung thêm 2 xe của 3s2   Mtype3s2_4truc
        double RF3s2,RF3s22;


        RFltCD1_type3s2_legal=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8))/(1.35*Nlan*phiLL*mgLL*Mtype3s2);

        // RF nhập liệu
        RFltCD1_type3s2_4truc_legal=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8))/(1.35*Nlan*phiLL*mgLL*Mtype3s2_4truc);

        // RF nhập liệu

        RFltCD1_type3s2_3truc_legal=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8))/(1.35*Nlan*phiLL*mgLL*Mtype3s2_3truc);

        /// sử dụng
        RF3s2=Math.min(RFltCD1_type3s2_legal, RFltCD1_type3s2_4truc_legal);
        RF3s22=Math.min(RF3s2,RFltCD1_type3s2_3truc_legal);

        txtkqRF_legal_3s2="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3S2            "+
                "\n RF TTCĐ1 lý thuyết xe type 3S2 - 5truc  = "+ (float) Math.round((RFltCD1_type3s2_legal) * 100) / 100 +

                "\n RF TTCĐ1 lý thuyết xe type 3S2 - 4truc  = "+ (float) Math.round(( RFltCD1_type3s2_4truc_legal) * 100) / 100 +

                "\n RF TTCĐ1 lý thuyết xe type 3S2 - 3truc  = "+ (float) Math.round((RFltCD1_type3s2_3truc_legal) * 100) / 100

        ;
        // RF nhập liệu
        if(RFltCD1_type3s2_legal>=1){
                if( RFltCD1_type3s2_4truc_legal>=1){
                        if(RFltCD1_type3s2_3truc_legal>=1){
                                ///cầu bình thường
                                txtLegal3s2="Cầu hoạt động bình thường với xe Legal 3S2";

                            }else {
                                Tmax_type3s2= (320.4*RF3s22)/9.81;
                                txtLegal3s2="Tải trọng tối đa cho phép qua cầu  "+(float) Math.round((Tmax_type3s2) * 100) / 100+  "T";

                            }
                        }else {
                            Tmax_type3s2= (320.4*RF3s22)/9.81;
                            txtLegal3s2="Tải trọng tối đa cho phép qua cầu  "+(float) Math.round((Tmax_type3s2) * 100) / 100+  "T";
                        }
                    }else {
                        Tmax_type3s2= (320.4*RF3s22)/9.81;
                        txtLegal3s2="Tải trọng tối đa cho phép qua cầu  "+(float) Math.round((Tmax_type3s2) * 100) / 100+  "T";
                    }




        ///////TYpe 33
////////////////////////////////////////// bổ sung thêm 2 xe của 33  Mtype33_6truc  Mtype33_4truc
        double RF33,RF333;
        RFltCD1_type33_legal=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLL*Mtype33);
        RFltCD1_type33_6truc_legal=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLL*Mtype33_6truc);
        RFltCD1_type33_4truc_legal=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))/(1.35*Nlan*phiLL*mgLL*Mtype33_4truc);
        RF33=Math.min(RFltCD1_type33_legal,RFltCD1_type33_6truc_legal);
        RF333=Math.min(RF33,RFltCD1_type33_4truc_legal);

        txtkqRF_legal_33="                 Kiểm tra tại TH LEGAL LOAD-TYPE 3S2            "+
                "\n RF TTCĐ1 lý thuyết xe type 33          = "+ (float) Math.round((RFltCD1_type33_legal) * 100) / 100
                +
                "\n RF TTCĐ1 lý thuyết xe type 33 - 6truc  = "+ (float) Math.round((RFltCD1_type33_6truc_legal) * 100) / 100 +

                "\n RF TTCĐ1 lý thuyết xe type 33 - 4truc  = "+ (float) Math.round(( RFltCD1_type33_4truc_legal) * 100) / 100

        ;

        if(RFltCD1_type33_legal>=1){

                if( RFltCD1_type33_6truc_legal>=1){

                        if(RFltCD1_type33_4truc_legal>=1){

                                ///cầu bình thường
                                txtLegal33="Cầu hoạt động bình thường với xe Legal 3-3";

                            }else {
                                Tmax_type33= (320.4*RF333)/9.81;
                                txtLegal33="Tải trọng tối đa cho phép qua cầu  "+(float) Math.round((Tmax_type33) * 100) / 100+  "T";

                            }
                        }else {
                            Tmax_type33= (320.4*RF333)/9.81;
                            txtLegal33="Tải trọng tối đa cho phép qua cầu  "+(float) Math.round((Tmax_type33) * 100) / 100+  "T";
                        }
                    }else {
                        Tmax_type33= (320.4*RF333)/9.81;
                        txtLegal33="Tải trọng tối đa cho phép qua cầu  "+(float) Math.round((Tmax_type33) * 100) / 100+  "T";
                    }

    }
    public void kiemdinhHL93_operating(){
        ///////////   operating
        // /////////////////////////////////xe 3 trục/////////////////////////////////////
        // TTGH CD1
        ////RF thuần túy
        RFltCD1_3truc_operating=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                /(1.35*Nlan*1.33*mgLL*M1);
        ////////////////////////////xe 2 trục///////////////////////////////////////////////////
        // TTGH CD1
        ////RF thuần túy
        RFltCD1_2truc_operating=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                /(1.35*Nlan*1.33*mgLL*M2);
        ///////////////////// 2 xe
        RFltCD1_90_operating=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                /(1.35*Nlan*1.33*mgLL*M3);


        if(Mtt<=0){
            /// RF nhaajo liệu thực tế
            RFttCD1_3truc_operating=0;
            RFttCD1_2truc_operating=0;
            RFttCD1_90_operating=0;

            txtkqRF_ope="                 Kiểm tra tại TH HL93-OPERATING            "+
                    "\n Hãy nhập momen thực tế khác 0"
                    +"\n RF TTCĐ1 lý thuyết xe 3 trục      = "+ (float) Math.round(( RFltCD1_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục        = "+ (float) Math.round(( RFttCD1_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục      = "+ (float) Math.round(( RFltCD1_2truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục        = "+ (float) Math.round(( RFttCD1_2truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết 2 xe cách 15m  = "+ (float) Math.round(( RFltCD1_90_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế 2 xe cách 15m    = "+ (float) Math.round(( RFttCD1_90_operating) * 100) / 100
            ;


        }else {
            RFttCD1_3truc_operating=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLL*M1);
            RFttCD1_2truc_operating=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLL*M2);
            RFttCD1_90_operating=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.35*Nlan*1.33*mgLL*M3);
            txtkqRF_ope="                 Kiểm tra tại TH HL93-OPERATING            "+
                    "\n Hãy nhập momen thực tế khác 0"
                    +"\n RF TTCĐ1 lý thuyết xe 3 trục      = "+ (float) Math.round(( RFltCD1_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục        = "+ (float) Math.round(( RFttCD1_3truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục      = "+ (float) Math.round(( RFltCD1_2truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục        = "+ (float) Math.round(( RFttCD1_2truc_operating) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết 2 xe cách 15m  = "+ (float) Math.round(( RFltCD1_90_operating) * 100) / 100
                    +"\n RF TTCĐ1 thực tế 2 xe cách 15m    = "+ (float) Math.round(( RFttCD1_90_operating) * 100) / 100

            ;
        }


//                   //kiemr tra

        if(RFltCD1_3truc_operating>1){
            if(RFttCD1_3truc_operating>1){
                      if(RFltCD1_2truc_operating>1){
                            if(RFttCD1_2truc_operating>1){
                                if(RFltCD1_90_operating>1){
                                    if(RFttCD1_90_operating>1){

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

                    }else{kiemdinhHL93_legal();
                        txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
                    }

                }else{kiemdinhHL93_legal();
                    txtHL93_ope="KHÔNG THỎA trường hợp HL93-OPERATING";
                }

    }

    public void kiemdinhHL93_INVENTORY(){

        // xe 3 trục
        M1=(Ls*142.34/4.)+(0.5*(0.5*Ls-4.267)*142.34)+(0.5*(0.5*Ls-4.267)*35.59)+(93.*Ls*Ls/80.);
        // xe 2 trục
        M2=(Ls*111.21/4.)+(0.5*(0.5*Ls-1.219)*1.219)+(93.*Ls*Ls/80.);
        // 2 xe cách nhau 15,
        M3=0.9*((Ls*142.34/4.)+(0.5*(0.5*Ls-4.267)*142.34)+(0.5*(0.5*Ls-8.534)*35.59)+(0.5*(0.5*Ls-15.24)*35.59)
                +(0.5*(0.5*Ls-19.507)*142.34)+(0.5*(0.5*Ls-23.774)*142.34)+(93.*Ls*Ls/80.));
        DC=(bf*hf+bt*ht*hw*tw)/1000000.;
        // tính RF

        // /////////////////////////////////xe 3 trục/////////////////////////////////////
        // TTGH CD1
        ////RF thuần túy
        RFltCD1_3truc_inventory=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                /(1.75*Nlan*1.33*mgLL*M1);

        ////////////////////////////xe 2 trục///////////////////////////////////////////////////
        // TTGH CD1
        ////RF thuần túy
        RFltCD1_2truc_inventory=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                /(1.75*Nlan*1.33*mgLL*M2);
        /////////////////////// 2 xe 15m/////////////////
        RFltCD1_90_inventory=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                /(1.75*Nlan*1.33*mgLL*M3);
        if(Mtt<=0){
            RFttCD1_3truc_inventory=0;
            RFttCD1_2truc_inventory=0;
            RFttCD1_90_inventory=0;

            txtkqRF_inv="                 Kiểm tra tại TH HL93-INVENTORY            "+
                    "\n Hãy nhập momen thực tế khác 0"
                    +"\n RF TTCĐ1 lý thuyết xe 3 trục      = "+ (float) Math.round(( RFltCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục        = "+ (float) Math.round(( RFttCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục      = "+ (float) Math.round(( RFltCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục        = "+ (float) Math.round(( RFttCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết 2 xe cách 15m  = "+ (float) Math.round(( RFltCD1_90_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế 2 xe cách 15m    = "+ (float) Math.round(( RFttCD1_90_inventory) * 100) / 100

            ;
        }else {
            RFttCD1_3truc_inventory=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.75*Nlan*1.33*mgLL*M1);
            RFttCD1_2truc_inventory=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.75*Nlan*1.33*mgLL*M2);
            RFttCD1_90_inventory=((phic*phis*phi*Mlt)-(1.25*DC*Ls*Ls/8.)-(1.5*DW*Ls*Ls/8.))
                    /(1.75*Nlan*1.33*mgLL*M3);
            txtkqRF_inv="                 Kiểm tra tại TH HL93-INVENTORY            "
                    +"\n RF TTCĐ1 lý thuyết xe 3 trục      = "+ (float) Math.round(( RFltCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 3 trục        = "+ (float) Math.round(( RFttCD1_3truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết xe 2 trục      = "+ (float) Math.round(( RFltCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế xe 2 trục        = "+ (float) Math.round(( RFttCD1_2truc_inventory) * 100) / 100
                    +"\n RF TTCĐ1 lý thuyết 2 xe cách 15m  = "+ (float) Math.round(( RFltCD1_90_inventory) * 100) / 100
                    +"\n RF TTCĐ1 thực tế 2 xe cách 15m    = "+ (float) Math.round(( RFttCD1_90_inventory) * 100) / 100
            ;
        }

        //kiemr tra


        if(RFltCD1_3truc_inventory>1){
            if(RFttCD1_3truc_inventory>1){
                if(RFltCD1_2truc_inventory>1){
                    if(RFttCD1_2truc_inventory>1){
                        if(RFltCD1_90_inventory>1){
                            if(RFttCD1_90_inventory>1){

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



    }

    public void damI(){
        double beta1;
        double cquydoi_bancanh,cquydoi_bau,cquydoi_suon;

        if(fcdc <= 28){
            beta1=0.85;
        }else {
            beta1=0.85-(fcdc-28)*0.05/7.;
        }
        cquydoi_bancanh=((nthep*(3.14*ds*ds/4.)*Fy)/(0.85*beta1*fcdc*tw));
        cquydoi_bau= ((nthep*(3.14*ds*ds/4.)*Fy-(0.85*beta1*fcdc*(be*(Math.sqrt(fcbmc)/Math.sqrt(fcdc))-tw)*ts))/(0.85*beta1*fcdc*tw));
        cquydoi_suon=((nthep*(3.14*ds*ds/4.)*Fy)-(0.85*beta1*fcdc*(bt-tw)*ht)-(0.85*beta1*fcdc*(be*(Math.sqrt(fcbmc)/Math.sqrt(fcdc))-tw)*ts))/(0.85*beta1*fcdc*tw);

        if(cquydoi_bancanh<ts){
            // đi qua bản cánh
            Mlt=(0.9*nthep*(3.14*ds*ds/4.)*Fy*(h+ts-dbv-(cquydoi_bancanh*beta1/2.)))/(1000000.);

        }else if(ts<cquydoi_bau && cquydoi_bau <ts+ht) {
            // đi qua bầu
            Mlt=((0.9*nthep*(3.14*ds*ds/4.)*Fy*(h+ts-dbv-(cquydoi_bau*beta1/2.)))+(0.85*fcdc*(be*(Math.sqrt(fcbmc)/Math.sqrt(fcdc))-tw)*ts*((cquydoi_bau*beta1/2.)-0.5*ts)))/(1000000.);
        }else if(cquydoi_suon>ts+ht){
            // đi qua sườn
            Mlt=((0.9*nthep*(3.14*ds*ds/4.)*Fy*(h+ts-dbv-(cquydoi_suon*beta1/2.)))+(0.85*fcdc*(bt-tw)*ht*((cquydoi_suon*beta1/2.)-ts-(0.5*ht)))+(0.85*fcdc*(be*(Math.sqrt(fcbmc)/Math.sqrt(fcdc))-tw)*ts*((cquydoi_suon*beta1/2.)-0.5*ts)))/(1000000.);
        }

    }
    public void damT(){
        double beta1;
        double cquydoi_bancanh,cquydoi_suon;

        if(fcdc <= 28){
            beta1=0.85;
        }else {
            beta1=0.85-(fcdc-28)*0.05/7.;
        }
        cquydoi_bancanh=((nthep*(3.14*ds*ds/4.)*Fy)-(0.85*beta1*fcdc*(be-tw)*ts))/(0.85*beta1*fcdc*tw);
        cquydoi_suon=((nthep*(3.14*ds*ds/4.)*Fy)-(0.85*beta1*fcdc*(be-tw)*ts))/(0.85*beta1*fcdc*tw);

        if(cquydoi_bancanh<ts){
            // đi qua bản cánh
            Mlt=(0.9*nthep*(3.14*ds*ds/4.)*Fy*(h-dbv-(cquydoi_bancanh*beta1/2.)))/(1000000.);

        }else if(cquydoi_suon>=ts){
            // đi qua sườn
            Mlt=((0.9*nthep*(3.14*ds*ds/4.)*Fy*(h-dbv-(cquydoi_suon*beta1/2.)))+(0.85*fcdc*(be-tw)*ts*((cquydoi_suon*beta1/2.)-0.5*ts)))/(1000000.);
        }

    }
    public void ban(){
        //double bw=87;
        double beta1;
        double cquydoi;


        if(fcdc <= 28){
            beta1=0.85;
        }else {
            beta1=0.85-(fcdc-28)*0.05/7.;
        }
        cquydoi=(nthep*(3.14*ds*ds/4.)*Fy)/(0.85*beta1*fcdc*be);
        Mlt=(0.9*nthep*(3.14*ds*ds/4.)*Fy*(ts-dbv-(cquydoi*beta1/2.)))/(1000000.);


    }
    public void NhapLieu(){
        try {
            DW = Double.parseDouble(edtDW.getText().toString());

            if (DW < 0) {

                edtDW.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDW.setError("Hãy nhập giá trị");
        }
        try {
            Mtt = Double.parseDouble(edtMtt.getText().toString());

            if (Mtt < 0) {

                edtMtt.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtMtt.setError("Hãy nhập giá trị");
        }
        try {
            Nlan = Double.parseDouble(edtNlan.getText().toString());

            if (Nlan < 0) {

                edtNlan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtNlan.setError("Hãy nhập giá trị");
        }
        try {
            mgLL = Double.parseDouble(edtmgLL.getText().toString());

            if (mgLL < 0) {

                edtmgLL.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtmgLL.setError("Hãy nhập giá trị");
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
            tw= Double.parseDouble(edttw.getText().toString());

            if (tw< 0) {

                edttw.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edttw.setError("Hãy nhập giá trị");
        }
        try {
            hw= Double.parseDouble(edthw.getText().toString());

            if (hw< 0) {

                edthw.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edthw.setError("Hãy nhập giá trị");
        }

        try {
            bf= Double.parseDouble(edtbf.getText().toString());

            if (bf< 0) {

                edtbf.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtbf.setError("Hãy nhập giá trị");
        }
        try {
            hf= Double.parseDouble(edthf.getText().toString());

            if (hf< 0) {

                edthf.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtbf.setError("Hãy nhập giá trị");
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
            fcbmc= Double.parseDouble(edtfcbmc.getText().toString());

            if (fcbmc< 0) {

                edtfcbmc.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtfcbmc.setError("Hãy nhập giá trị");
        }
        try {
            fcdc= Double.parseDouble(edtfcdc.getText().toString());

            if (fcdc< 0) {

                edtfcdc.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtfcdc.setError("Hãy nhập giá trị");
        }
        //    double ,yc,,h,, , ,be,ht,, , dbv,ds,bt;

        try {
            nthep= Double.parseDouble(edtnthep.getText().toString());

            if (nthep< 0) {

                edtnthep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtnthep.setError("Hãy nhập giá trị");
        }

        try {
            Ls= Double.parseDouble(edtLs.getText().toString());

            if (Ls< 0) {

                edtLs.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtLs.setError("Hãy nhập giá trị");
        }
        //    double ,yc,,h,, , ,be,ht,, , dbv,,bt;
        try {
            yc= Double.parseDouble(edtyc.getText().toString());

            if (yc< 0) {

                edtyc.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtyc.setError("Hãy nhập giá trị");
        }
        try {
           h = Double.parseDouble(edth.getText().toString());

            if (h< 0) {

                edth.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edth.setError("Hãy nhập giá trị");
        }
        //    double ,yc,,h,, , ,be,ht,, , dbv,,bt;
        try {
            be= Double.parseDouble(edtbe.getText().toString());

            if (be< 0) {

                edtbe.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtbe.setError("Hãy nhập giá trị");
        }
        try {
            ht= Double.parseDouble(edtht.getText().toString());

            if (ht< 0) {

                edtht.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtht.setError("Hãy nhập giá trị");
        }
        try {
            dbv= Double.parseDouble(edtdbv.getText().toString());

            if (dbv< 0) {

                edtdbv.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtdbv.setError("Hãy nhập giá trị");
        }
        try {
            bt= Double.parseDouble(edtbt.getText().toString());

            if (bt< 0) {

                edtbt.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtbt.setError("Hãy nhập giá trị");
        }


        //Chiều dài phần hẫng
        try {
            ds = Double.parseDouble(edtds.getText().toString());

            if (ds < 0) {

                edtds.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtds.setError("Hãy nhập giá trị");
        }

    }
    public void TinhToan(){
        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NhapLieu();
                /// spinner liên hợp hoặc không liên h
                if(damI==1){
                    damI();

                }else if(damT==2){
                    damT();

                }else if(ban==3){
                    ban();

                }

                kiemdinhHL93_INVENTORY();
                Intent betong_KDintent = new Intent(KiemDinhTheoAASHTO_BTCT.this, KQ_kiemdinh_betong.class);
                Bundle betong_KDbundle = new Bundle();
                betong_KDbundle.putString("txtHL93_inv",txtHL93_inv);
                betong_KDbundle.putString("txtkqRF_inv",txtkqRF_inv);
                betong_KDbundle.putString("txtHL93_ope",txtHL93_ope);
                betong_KDbundle.putString("txtkqRF_ope",txtkqRF_ope);
                betong_KDbundle.putString("txtLegal3",txtLegal3);
                betong_KDbundle.putString("txtkqRF_legal_3",txtkqRF_legal_3);
                betong_KDbundle.putString("txtLegal3s2",txtLegal3s2);
                betong_KDbundle.putString("txtkqRF_legal_3s2",txtkqRF_legal_3s2);
                betong_KDbundle.putString("txtLegal33",txtLegal33);
                betong_KDbundle.putString("txtkqRF_legal_33",txtkqRF_legal_33);
                betong_KDbundle.putString("txtLegal",txtLegal);

                // LHbundle.putDouble("M4",M4 );
                betong_KDintent.putExtra("betong_KDbundle", betong_KDbundle);
                startActivity(betong_KDintent);

            }
        });
    }
    public void Spinner(){
        /// Cầu thép
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adaptercauthep = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,  arrcauthep);
        adaptercauthep.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spncauthep.setAdapter(adaptercauthep);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spncauthep.setOnItemSelectedListener(new KiemDinhTheoAASHTO_BTCT.MyProcessEventcauthep());
        //Class tạo sự kiện
        // phic
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapterphic = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrphic);
        adapterphic.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnphic.setAdapter(adapterphic);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnphic.setOnItemSelectedListener(new KiemDinhTheoAASHTO_BTCT.MyProcessEventphic());
        //Class tạo sự kiện

        // phis
        ArrayAdapter<String> adapterphis = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrphis);
        adapterphis.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnphis.setAdapter(adapterphis);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnphis.setOnItemSelectedListener(new KiemDinhTheoAASHTO_BTCT.MyProcessEventphis());
        // phiLL
        ArrayAdapter<String> adapterphiLL = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arrphiLL);
        adapterphiLL.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnphiLL.setAdapter(adapterphiLL);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnphiLL.setOnItemSelectedListener(new KiemDinhTheoAASHTO_BTCT.MyProcessEventphiLL());
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
            if (lastedSelectedcauthep == 0) {

                damI=1.;


       /* IstDT=((Bft*Math.pow(tft,3)/12)+(Bft*tft)*Math.pow((YsttDT-0.5*tft),2)+(Math.pow(Dw,3)*tw/12)+(Dw*tw*(Math.pow((tfb+0.5*Dw-YstdDT),2)))+(Bfb*(Math.pow(tfb,3))/12)+(Bfb*tfb*(Math.pow((YstdDT-0.5*tfb),2)))+(BssDT*(Math.pow(ts,3))/12)+(BssDT*ts*(Math.pow((YsttDT+0.5*ts),2))));
        IstDN=((Bft*Math.pow(tft,3)/12)+(Bft*tft)*Math.pow((YsttDN-0.5*tft),2)+(Math.pow(Dw,3)*tw/12)+(Dw*tw*(Math.pow((tfb+0.5*Dw-YstdDN),2)))+(Bfb*(Math.pow(tfb,3))/12)+(Bfb*tfb*(Math.pow((YstdDN-0.5*tfb),2)))+(BssDN*(Math.pow(ts,3))/12)+(BssDN*ts*(Math.pow((YsttDN+0.5*ts),2))));*/


                //  Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            } else if (lastedSelectedcauthep == 1) {
                damT=2.;
                ////



                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            }else if (lastedSelectedcauthep == 2) {
                ban=3.;
                ////



                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            }

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
}

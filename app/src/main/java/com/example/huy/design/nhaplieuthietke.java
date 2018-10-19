package com.example.huy.design;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.*;

public class nhaplieuthietke extends AppCompatActivity {
    EditText edtTenDuAn, edtHoatTaiTieuChuan, edtChieuDaiNhip, edtChieuDaiNhipTinhToan, edtBeRongPhanXeChay, edtBeRongLanCan, edtTongBeRongToanCuaCau;
    EditText edtLoaiLienKetSuDung, edtCauTaoDamChu, edtMatCatNgangDamChu, edtCuongDoChiuNenCuaBeTong, edtTiTrongCuaBeTong, edtModuynDanHoiCuaBeTong;
    EditText edtChieuDayBMC, edtChieuDayLopPhu, edtTytrongVLlamLopPhu, edtThepKetCau, edtModuynDanHoiThep, edtCuongDoChiuKeoMIN, edtCuongDoChayMIN;
    EditText edtTiTrongThep, edtSoLuongDamChu, edtKhoangCachGiuaDC, edtChieuDaiPhanHang, edtChieuCaoDC, edtChieuRongBanCanhTren, edtChieuDayBCT;
    EditText edtChieuRongBCD, edtChieuDayBCD, edtChieuDaySuonDam, edtChieuCaoSuon, edtSoLuongDamNgang1Nhip, edtTongSoDamNgang;
    EditText edtYv, edtKhoangCachTimDNĐenauDC, edtS2, edthn, edtbn, edttfdn, edttwdn, edthwdn, edta, edtnlkn, edthlkn, edtSlkn, edtb,edtAtg;
    TextView txtDienTichDamThep, txtModuynDanHoiCuaBeTong, txtAdn, txtnlkd, txtLdn;
    Button btnTinhToan;
    EditText edtDCneo,edtDClcT, edtDClcBT, edtPL, edtT;
    // TEXT nội lực tĩnh tải


    double Adt, heSoHoatTai, L, Ls, Bxc, Blc, B, fc, yc, Ec, ts, taf, yaf, Es, Fu, Fy, ys, ndc, S, de, D, Bft, tft, Bfb, tfb, tw, Dw, ndn1, ndn, S1;
    double S2, hn, Ldn, bn, tfdn, twdn, hwdn, Adn, a, nlkn, hlkn, Slkn, b, nlkd, bi, bc, bi1, bi2, bi3, bii;
    double bc1, bc2, bc3, bcc, n, Yv;
    // biến tính đặc trung hh gd 1
    double Snct, Yncd, Anc, Ynct, Inc, Sncd;
    // biến liên hợp dài hạn
    double BsDT, BsDN, AltDT, AltDN, SlttDT, SlttDN, YltdDT, YltdDN, YlttDT, YlttDN, IltDT, IltDN;
    // Biến liên hợp ngắn hạn
    double BssDT, BssDN, AstDT, AstDN, SsttDT, SsttDN, YstdDT, YstdDN, YsttDT, YsttDN, IstDT, IstDN;
    //Tĩnh tải giai đoạn 1 tác dụng lên mặt cắt ko liên hợp
    double DCdc, DCbmc, DClkn1, DClkn2, DClkd, DCneo,Atg, DC1;
    double DClcT, DClcBT,DClcDN,DClcDT, DW,DC2DN, DC2DT, DCDT,DCDN;
    //Pl, T
    double PL, T;
    // hệ số phân bố momen
    double eM,mgSIM, mgMIM, Kg,mgMEM1lan,mgMEM2lan,mgDTM,mgDNM;
    //hệ số phân bố lực cắt
    double eV,mgSIV, mgMIV, mgMEV1lan,mgMEV2lan, mgDTV,mgDNV,mgPLVDT, mgPLVDN;
    // nội lực tĩnh tải giai đoạn 1
    double M11, M12, M13, M14 ,M15, M16, M17, M18, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18; //
    //ứng suất tĩnh tải giai đoạn 1
    double f11,f12,f13,f14,f15,f16,f17,f18,f19,f110,f111,f112,f113,f114,f115,f116;
    // Nội lực giai đoạn 2
    double M21, M22, M23, M24 ,M25, M26, M27, M28, Q21, Q22, Q23, Q24, Q25, Q26, Q27, Q28;
    //ứng suất tĩnh tải giai đoạn 2
    double f21,f22,f23,f24,f25,f26,f27,f28,f29,f210,f211,f212,f213,f214,f215,f216,f217,f218,f219,f220,f221,f222,f223,f224,f225,f226,f227,f228,f229,f230,f231,f232;
    double M31,M32,M33,M34,M35,M36,M37,M38,Q31,Q32,Q33,Q34,Q35,Q36,Q37,Q38;
    // hoạt tải
    double M41,M42,M43,M44,M45,M46,M47,M48,M49,M410,M411,M412,M413,M414,M415,M416;
    double Q41,Q42,Q43,Q44,Q45,Q46,Q47,Q48,Q49,Q410,Q411,Q412,Q413,Q414,Q415,Q416;
    double Q417,Q418,Q419,Q420,Q421,Q422,Q423,Q424,Q425,Q426,Q427,Q428,Q429,Q430;
    double Q431,Q432,Q433,Q434,Q435,Q436,Q437,Q438,Q439,Q440;
    double m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16;
    double q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,q21,q22,q23,q24,q25,q26,q27,q28,q29,q30,q31,q32,q33,q34,q35,q36,q37,q38,q39,q40;
    float M1val[]=new float[5];
    float M2val[]=new float[5];
    float M3val[]=new float[5];
    float M4val[]=new float[5];
    float Q1val[]=new float[5];
    float Q2val[]=new float[5];
    float Q3val[]=new float[5];
    float Q4val[]=new float[5];




    String bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhaplieuthietke);
        //check chỗ này nè e
        // nếu activity ni có cái button nó tính toán sao thì em em để lệnh trong if else này
        // à tốt hơn e để ì else này trong sự kiện tính của button á, a để đây để ví dụ thôi


        addControls();
        addEvents();

        String edtenDuAn = edtTenDuAn.getText().toString();
        edtTenDuAn.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
    }

    public void addControls() {

        edtTenDuAn = (EditText) findViewById(R.id.edtTenDuAn);
        edtHoatTaiTieuChuan = (EditText) findViewById(R.id.edtHoatTaiTieuChuan);
        edtChieuDaiNhip = (EditText) findViewById(R.id.edtChieuDaiNhip);
        edtChieuDaiNhipTinhToan = (EditText) findViewById(R.id.edtChieuDaiNhipTinhToan);
        edtBeRongPhanXeChay = (EditText) findViewById(R.id.edtBeRongPhanXeChay);
        edtBeRongLanCan = (EditText) findViewById(R.id.edtBeRongLanCan);
        edtTongBeRongToanCuaCau = (EditText) findViewById(R.id.edtTongBeRongCuaCau);
   //     edtLoaiLienKetSuDung = (EditText) findViewById(R.id.edtLoaiLienKetSuDung);
       // edtCauTaoDamChu = (EditText) findViewById(R.id.edtCauTaoDamChu);
       // edtMatCatNgangDamChu = (EditText) findViewById(R.id.edtMatCatNgangDamChu);
        edtCuongDoChiuNenCuaBeTong = (EditText) findViewById(R.id.edtCuongDoChiuNenCuaBeTong);
        edtTiTrongCuaBeTong = (EditText) findViewById(R.id.edtTiTrongCuaBeTong);
        txtModuynDanHoiCuaBeTong = (TextView) findViewById(R.id.txtModuynDanHoiCuaBeTong);
        edtChieuDayBMC = (EditText) findViewById(R.id.edtChieuDayBMC);
        edtChieuDayLopPhu = (EditText) findViewById(R.id.edtChieuDayLopPhu);
        edtTytrongVLlamLopPhu = (EditText) findViewById(R.id.edtTytrongVLlamLopPhu);
        edtThepKetCau = (EditText) findViewById(R.id.edtThepKetCau);
        edtModuynDanHoiThep = (EditText) findViewById(R.id.edtModuynDanHoiThep);
        edtCuongDoChiuKeoMIN = (EditText) findViewById(R.id.edtCuongDoChiuKeoMIN);
        edtCuongDoChayMIN = (EditText) findViewById(R.id.edtCuongDoChayMIN);
        edtTiTrongThep = (EditText) findViewById(R.id.edtTiTrongThep);
        edtSoLuongDamChu = (EditText) findViewById(R.id.edtSoLuongDamChu);
        edtKhoangCachGiuaDC = (EditText) findViewById(R.id.edtKhoangCachGiuaDC);
        edtChieuDaiPhanHang = (EditText) findViewById(R.id.edtChieuDaiPhanHang);
        edtChieuCaoDC = (EditText) findViewById(R.id.edtChieuCaoDC);
        edtChieuRongBanCanhTren = (EditText) findViewById(R.id.edtChieuRongBanCanhTren);
        edtChieuDayBCT = (EditText) findViewById(R.id.edtChieuDayBCT);
        edtChieuRongBCD = (EditText) findViewById(R.id.edtChieuRongBCD);
        edtChieuDayBCD = (EditText) findViewById(R.id.edtChieuDayBCD);
        edtChieuDaySuonDam = (EditText) findViewById(R.id.edtChieuDaySuonDam);
        edtChieuCaoSuon = (EditText) findViewById(R.id.edtChieuCaoSuon);
        txtDienTichDamThep = (TextView) findViewById((R.id.txtDienTichDamChu));
        btnTinhToan = (Button) findViewById(R.id.btnTinhToan);
        edtSoLuongDamNgang1Nhip = (EditText) findViewById(R.id.edtSoLuongDamNgang1Nhip);
        edtTongSoDamNgang = (EditText) findViewById(R.id.edtTongSoDamNgang);
        edtKhoangCachTimDNĐenauDC = (EditText) findViewById(R.id.edtKhoangCachTimDNĐenauDC);
        edtS2 = (EditText) findViewById(R.id.edtS2);
        edthn = (EditText) findViewById(R.id.edthn);
        txtLdn = (TextView) findViewById(R.id.txtLdn);
        edtbn = (EditText) findViewById(R.id.edtbn);
        edttfdn = (EditText) findViewById(R.id.edttfdn);
        edttwdn = (EditText) findViewById(R.id.edttwdn);
        edthwdn = (EditText) findViewById(R.id.edthwdn);
        txtAdn = (TextView) findViewById(R.id.txtAdn);
        edta = (EditText) findViewById(R.id.edta);
        edtnlkn = (EditText) findViewById(R.id.edtnlkn);
        edthlkn = (EditText) findViewById(R.id.edthlkn);
        edtSlkn = (EditText) findViewById(R.id.edtSlkn);
        edtb = (EditText) findViewById(R.id.edtb);
        txtnlkd = (TextView) findViewById(R.id.txtnlkd);
        edtYv = (EditText) findViewById(R.id.edtYv);
        edtAtg = (EditText) findViewById(R.id.edtAtg);
        edtDCneo=(EditText) findViewById(R.id.edtDCneo);
        edtDClcT= (EditText) findViewById(R.id.edtDClcT);
        edtDClcBT=(EditText) findViewById(R.id.edtDClcBT);
        edtPL=(EditText) findViewById(R.id.edtPL);
        edtT=(EditText) findViewById(R.id.edtT);
       // edt=(EditText) findViewById(R.id.edt);
        //txtMmaxCD1GD1, txtMmaxSDGD1, txtQmaxCD1GD1, txtQmaxSDGD1 ;

            //= (TextView) findViewById(R.id.);


    }

    public void addEvents() {


        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt = getIntent().getStringExtra("baitoan");
                if (bt.equals("co")) {
                    //bai toan tren  KHÔNG LIÊN HỢP
                    tinhToanDienTichThep();
                    tinhToanEBeTong();
                    tinhToanDienTichDamNgang();
                    tinhToanTongSoHLKDoc();
                    tinhChieuRongHuuHieuBanCanhDamGiua();
                    tinhChieuRongHuuHieuBanCanhDamBien();
                    tinhTisoModuyn();
                    tinhDTHHGiaiDoan1();
                    chuaBien();


                } else {
                    // bai toan duoi LIÊN HỢP
                    // tuy bai ma button tính xử lý công thức cho đúng
                    tinhToanDienTichThep();
                    tinhToanEBeTong();
                    tinhToanDienTichDamNgang();
                    tinhToanTongSoHLKDoc();
                    tinhChieuRongHuuHieuBanCanhDamGiua();
                    tinhChieuRongHuuHieuBanCanhDamBien();
                    tinhTisoModuyn();
                    tinhDTHHGiaiDoan1();
                    chuaBien();
                    DTHHLienHopDaiHan();
                    DTHHLienHopNganHan();
                    tinhtxtLdn();
                    tinhKhoiLuongGD1();
                    tinhKhoiLuongGD2();
                    tinhHeSoPhanBoLLTheoLanDoiVoiMomen();
                    tinhHeSoPhanBoLLTheoLanDoiVoiLucCat();
                    tinhNoiLucTinhTaiGD1();
                    tinhUngSuatTinhTaiGD1();
                    tinhNoiLucTinhTaiGD2();
                    tinhUngSuatTinhTaiGD2();
                    tinhNoiLuc1va2();
                    tinhNoiLuc4();


                    // đóng gói và truyền dữ liệu
                    Intent LHintent = new Intent(nhaplieuthietke.this, KQKhongLienHop.class);
                    Bundle LHbundle = new Bundle();
                    LHbundle.putDouble("Anc", Anc);
                    LHbundle.putDouble("Snct", Snct);
                    LHbundle.putDouble("Yncd", Yncd);
                    LHbundle.putDouble("Ynct", Ynct);
                    LHbundle.putDouble("Inc", Inc);
                    LHbundle.putDouble("Sncd", Sncd);
                    //dài hạn
                    LHbundle.putDouble("BsDT", BsDT);
                    LHbundle.putDouble("BsDN", BsDN);
                    LHbundle.putDouble("AltDT", AltDT);
                    LHbundle.putDouble("AltDN", AltDN);
                    LHbundle.putDouble("SlttDT", SlttDT);
                    LHbundle.putDouble("SlttDN", SlttDN);
                    LHbundle.putDouble("YltdDT", YltdDT);
                    LHbundle.putDouble("YltdDN", YltdDN);
                    LHbundle.putDouble("YlttDT", YlttDT);
                    LHbundle.putDouble("YlttDN", YlttDN);
                    LHbundle.putDouble("IltDT", IltDT);
                    LHbundle.putDouble("IltDN", IltDN);
                    // ngắn hạn
                    LHbundle.putDouble("BssDT", BssDT);
                    LHbundle.putDouble("BssDN", BssDN);
                    LHbundle.putDouble("AstDT", AstDT);
                    LHbundle.putDouble("AstDN", AstDN);
                    LHbundle.putDouble("SsttDT", SsttDT);
                    LHbundle.putDouble("SsttDN", SsttDN);
                    LHbundle.putDouble("YstdDT", YstdDT);
                    LHbundle.putDouble("YstdDN", YstdDN);
                    LHbundle.putDouble("YsttDT", YsttDT);
                    LHbundle.putDouble("YsttDN", YsttDN);
                    LHbundle.putDouble("IstDT", IstDT);
                    LHbundle.putDouble("IstDN", IstDN);
                    // tĩnh tải
                    LHbundle.putDouble("DC1", DC1);
                    LHbundle.putDouble("DC2DT", DC2DT);
                    LHbundle.putDouble("DC2DN", DC2DN);
                    LHbundle.putDouble("DCDT", DCDT);
                    LHbundle.putDouble("DCDN", DCDN);
                    // hệ số phân phối ngang
                    LHbundle.putDouble("mgSIV",mgSIV );
                    LHbundle.putDouble("mgMEV2lan", mgMEV2lan);
                    LHbundle.putDouble("mgMIV", mgMIV);
                    LHbundle.putDouble("mgSIM", mgSIM);
                    LHbundle.putDouble("mgMIM",mgMIM );
                    LHbundle.putDouble("mgMEM2lan", mgMEM2lan);
                    LHbundle.putDouble("mgDTM",mgDTM );
                    LHbundle.putDouble("mgDTV", mgDTV);
                    LHbundle.putDouble("mgMEV1lan=",mgMEV1lan );
                    LHbundle.putDouble("mgDNV",mgDNV );
                    LHbundle.putDouble("mgMEM1lan",mgMEM1lan );
                    LHbundle.putDouble("mgDNM", mgDNM);
                    LHbundle.putDouble("mgPLDT",mgPLVDT );
                    LHbundle.putDouble("mgPLDN",mgPLVDN );
                    LHbundle.putDouble("M11",M11 );
                    LHbundle.putDouble("M12",M12 );
                    LHbundle.putDouble("M13",M13 );
                    LHbundle.putDouble("M14",M14 );
                    LHbundle.putDouble("M15",M15 );
                    LHbundle.putDouble("M16",M16 );
                    LHbundle.putDouble("M17",M17 );
                    LHbundle.putDouble("M18",M18 );
                    LHbundle.putDouble("Q11",Q11 );
                    LHbundle.putDouble("Q12",Q12 );
                    LHbundle.putDouble("Q13",Q13 );
                    LHbundle.putDouble("Q14",Q14 );
                    LHbundle.putDouble("Q15",Q15 );
                    LHbundle.putDouble("Q16",Q16 );
                    LHbundle.putDouble("Q17",Q17 );
                    LHbundle.putDouble("Q18",Q18 );
                    LHbundle.putDouble("f11",f11 );
                    LHbundle.putDouble("f12",f12 );
                    LHbundle.putDouble("f13",f13 );
                    LHbundle.putDouble("f14",f14 );
                    LHbundle.putDouble("f15",f15 );
                    LHbundle.putDouble("f16",f16 );
                    LHbundle.putDouble("f17",f17 );
                    LHbundle.putDouble("f18",f18 );
                    LHbundle.putDouble("f19",f19 );
                    LHbundle.putDouble("f110",f110 );
                    LHbundle.putDouble("f111",f111 );
                    LHbundle.putDouble("f112",f112 );
                    LHbundle.putDouble("f113",f113 );
                    LHbundle.putDouble("f114",f114 );
                    LHbundle.putDouble("f115",f115 );
                    LHbundle.putDouble("f116",f116 );
                    // nội lực giai đoạn 2
                    LHbundle.putDouble("M21",M21 );
                    LHbundle.putDouble("M22",M22 );
                    LHbundle.putDouble("M23",M23 );
                    LHbundle.putDouble("M24",M24 );
                    LHbundle.putDouble("M25",M25 );
                    LHbundle.putDouble("M26",M26 );
                    LHbundle.putDouble("M27",M27 );
                    LHbundle.putDouble("M28",M28 );
                    LHbundle.putDouble("Q21",Q21 );
                    LHbundle.putDouble("Q22",Q22 );
                    LHbundle.putDouble("Q23",Q23 );
                    LHbundle.putDouble("Q24",Q24 );
                    LHbundle.putDouble("Q25",Q25 );
                    LHbundle.putDouble("Q26",Q26 );
                    LHbundle.putDouble("Q27",Q27 );
                    LHbundle.putDouble("Q28",Q28 );
                    //ỨNG SUẤT GD2
                    LHbundle.putDouble("f21",f21 );
                    LHbundle.putDouble("f22",f22 );
                    LHbundle.putDouble("f23",f23 );
                    LHbundle.putDouble("f24",f24 );
                    LHbundle.putDouble("f25",f25 );
                    LHbundle.putDouble("f26",f26 );
                    LHbundle.putDouble("f27",f27 );
                    LHbundle.putDouble("f28",f28 );
                    LHbundle.putDouble("f29",f29 );
                    LHbundle.putDouble("f210",f210 );
                    LHbundle.putDouble("f211",f211 );
                    LHbundle.putDouble("f212",f212 );
                    LHbundle.putDouble("f213",f213 );
                    LHbundle.putDouble("f214",f214 );
                    LHbundle.putDouble("f215",f215 );
                    LHbundle.putDouble("f216",f216 );
                    LHbundle.putDouble("f217",f217 );
                    LHbundle.putDouble("f218",f218 );
                    LHbundle.putDouble("f219",f219 );
                    LHbundle.putDouble("f220",f220 );
                    LHbundle.putDouble("f221",f221 );
                    LHbundle.putDouble("f222",f222 );
                    LHbundle.putDouble("f223",f223 );
                    LHbundle.putDouble("f224",f224 );
                    LHbundle.putDouble("f225",f225 );
                    LHbundle.putDouble("f226",f226 );
                    LHbundle.putDouble("f227",f227 );
                    LHbundle.putDouble("f228",f228 );
                    LHbundle.putDouble("f229",f229 );
                    LHbundle.putDouble("f230",f230 );
                    LHbundle.putDouble("f231",f231 );
                    LHbundle.putDouble("f232",f232 );
                    // NỘI LỰC 1+2
                    LHbundle.putDouble("M31",M31 );
                    LHbundle.putDouble("M32",M32 );
                    LHbundle.putDouble("M33",M33 );
                    LHbundle.putDouble("M34",M34 );
                    LHbundle.putDouble("M35",M35 );
                    LHbundle.putDouble("M36",M36 );
                    LHbundle.putDouble("M37",M37 );
                    LHbundle.putDouble("M38",M38 );
                    LHbundle.putDouble("Q31",Q31 );
                    LHbundle.putDouble("Q32",Q32 );
                    LHbundle.putDouble("Q33",Q33 );
                    LHbundle.putDouble("Q34",Q34 );
                    LHbundle.putDouble("Q35",Q35 );
                    LHbundle.putDouble("Q36",Q36 );
                    LHbundle.putDouble("Q37",Q37 );
                    LHbundle.putDouble("Q38",Q38 );
                    //hoạt tải
                    LHbundle.putDouble("M41",M41 );
                    LHbundle.putDouble("M42",M42 );
                    LHbundle.putDouble("M43",M43 );
                    LHbundle.putDouble("M44",M44 );
                    LHbundle.putDouble("M45",M45 );
                    LHbundle.putDouble("M46",M46 );
                    LHbundle.putDouble("M47",M47 );
                    LHbundle.putDouble("M48",M48 );
                    LHbundle.putDouble("M49",M49 );
                    LHbundle.putDouble("M410",M410 );
                    LHbundle.putDouble("M411",M411 );
                    LHbundle.putDouble("M412",M412 );
                    LHbundle.putDouble("M413",M413 );
                    LHbundle.putDouble("M414",M414 );
                    LHbundle.putDouble("M415",M415 );
                    LHbundle.putDouble("M416",M416 );
                    LHbundle.putDouble("MQ41",Q41 );
                    LHbundle.putDouble("MQ42",Q42 );
                    LHbundle.putDouble("MQ43",Q43 );
                    LHbundle.putDouble("MQ44",Q44 );
                    LHbundle.putDouble("MQ45",Q45 );
                    LHbundle.putDouble("MQ46",Q46 );
                    LHbundle.putDouble("MQ47",Q47 );
                    LHbundle.putDouble("MQ48",Q48 );
                    LHbundle.putDouble("MQ49",Q49 );
                    LHbundle.putDouble("MQ410",Q410 );
                    LHbundle.putDouble("MQ411",Q411 );
                    LHbundle.putDouble("MQ412",Q412 );
                    LHbundle.putDouble("MQ413",Q413 );
                    LHbundle.putDouble("MQ414",Q414 );
                    LHbundle.putDouble("MQ415",Q415 );
                    LHbundle.putDouble("MQ416",Q416 );
                    LHbundle.putDouble("MQ417",Q417 );
                    LHbundle.putDouble("MQ418",Q418 );
                    LHbundle.putDouble("MQ419",Q419 );
                    LHbundle.putDouble("MQ420",Q420 );
                    LHbundle.putDouble("MQ421",Q421 );
                    LHbundle.putDouble("MQ422",Q422 );
                    LHbundle.putDouble("MQ423",Q423 );
                    LHbundle.putDouble("MQ424",Q424 );
                    LHbundle.putDouble("MQ425",Q425 );
                    LHbundle.putDouble("MQ426",Q426 );
                    LHbundle.putDouble("MQ427",Q427 );
                    LHbundle.putDouble("MQ428",Q428 );
                    LHbundle.putDouble("MQ429",Q429 );
                    LHbundle.putDouble("MQ430",Q430 );
                    LHbundle.putDouble("MQ431",Q431 );
                    LHbundle.putDouble("MQ432",Q432 );
                    LHbundle.putDouble("MQ433",Q433 );
                    LHbundle.putDouble("MQ434",Q434 );
                    LHbundle.putDouble("MQ435",Q435 );
                    LHbundle.putDouble("MQ436",Q436 );
                    LHbundle.putDouble("MQ437",Q437 );
                    LHbundle.putDouble("MQ438",Q438 );
                    LHbundle.putDouble("MQ439",Q439 );
                    LHbundle.putDouble("MQ440",Q440 );




                   // LHbundle.putDouble("M4",M4 );
                    LHintent.putExtra("LHbundle", LHbundle);
                    startActivity(LHintent);
                }
            }
        });

    }
    public void tinhNoiLuc4(){
        // phần ni tính xe 3 trục
        //L/8

        if ( ((7.0/8)*Ls-8.6 ) > 0){
            m1 =(7.0/64)*Ls*145+(1.0/8)*((7.0/8)*Ls-4.3)*145+(1.0/8)*((7.0/8)*Ls-8.6)*35;
          //  Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
        }
        else if ((7.0*Ls/8)-4.3 <= 0) {
            m1 =(7.0/64)*Ls*145+(1.0/8)*((7.0/8)*Ls-4.3)*145;
         //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
        }
        //L/4

        if ( ((3*Ls/4)-8.6) > 0){
            m2 =(3.0/16)*Ls*145+(1.0/4)*((3*Ls/4)-4.3)*145+(1.0/4)*((3*Ls/4)-8.6)*35;
             Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        }
        else if ((3*Ls/4)-4.3 <= 0) {
            m2 =(3.0/16)*Ls*145;
              Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        }
        else if(((3*Ls/4)-4.3)> 0 && ((3*Ls/4)-8.6) <= 0){
            m2=(3.0/16)*Ls*145+(1.0/4)*((3*Ls/4)-4.3)*145;
            Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        }
        //3L/8

        if ((3*Ls/8)-4.3>0){
            m3 =(15.0/64)*Ls*145+(3.0/8)*((5*Ls/8)-4.3)*145+(5.0/8)*((3*Ls/8)-4.3)*35;
            Toast.makeText(nhaplieuthietke.this,""+m3,Toast.LENGTH_LONG).show();
        }
        else if ((5*Ls/8)-4.3<=0) {
            m3 =(15.0/64)*Ls*145;
            Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        }
        else if(((3*Ls/8)-4.3)<=0 && ((5*Ls/8)-4.3>0)){
            m3=(15.0/64)*Ls*145+((3.0/8)*(5*Ls/8)-4.3)*145;
            Toast.makeText(nhaplieuthietke.this,""+m3,Toast.LENGTH_LONG).show();
        }
        //L/2

        if ( ( (Ls/2)-4.3) <= 0){
            m4 =(1.0/4)*Ls*145;
           Toast.makeText(nhaplieuthietke.this,""+m4,Toast.LENGTH_LONG).show();
        }
        else if ( (Ls/2)-4.3 > 0) {
            m4 =(1.0/4)*Ls*145+(1.0/2)*((Ls/2)-4.3)*145+(1.0/2)*((Ls/2)-4.3)*35;
           Toast.makeText(nhaplieuthietke.this,""+m4,Toast.LENGTH_LONG).show();
        }

        //cái ni do xe 2 trục gây ra
        // L/8

        if ( (7*Ls/8)-1.2 <=0){
            m5 =(7.0/64)*Ls*110;
            Toast.makeText(nhaplieuthietke.this,""+m5,Toast.LENGTH_LONG).show();
        }
        else if ((7*Ls/8)-1.2 >0) {
            m5 =(7.0/64)*Ls*110+(1.0/8)*((7*Ls/8)-1.2)*110;
            Toast.makeText(nhaplieuthietke.this,""+m5,Toast.LENGTH_LONG).show();
        }
        //L/4

        if ( (3*Ls/4)-1.2>0){
            m6 =(3.0/16)*Ls*110+(1.0/4)*((3*Ls/4)-1.2)*110;
            Toast.makeText(nhaplieuthietke.this,""+m6,Toast.LENGTH_LONG).show();
        }
        else if ((3*Ls/4)-1.2<=0) {
            m6 =(3.0/16)*Ls*110;
            Toast.makeText(nhaplieuthietke.this,""+m6,Toast.LENGTH_LONG).show();
        }
        //3L/8

        if ((5*Ls/8)-1.2>0){
            m7 =(15.0/64)*Ls*110+(3.0/8)*((5*Ls/8)-1.2)*110;
            Toast.makeText(nhaplieuthietke.this,""+m7,Toast.LENGTH_LONG).show();
        }
        else if ((5*Ls/8)-1.2 <=0) {
            m7 =(15.0/64)*Ls*110;
            Toast.makeText(nhaplieuthietke.this,""+m7,Toast.LENGTH_LONG).show();
        }
        //L/2

        if ((Ls/2)-1.2>0){
            m8 =(1.0/4)*Ls*110+(1.0/2)*((Ls/2)-1.2)*110;
            Toast.makeText(nhaplieuthietke.this,""+m8,Toast.LENGTH_LONG).show();
        }
        else if ((Ls/2)-1.2<=0) {
            m8 =(1.0/4)*Ls*110;
            Toast.makeText(nhaplieuthietke.this,""+m8,Toast.LENGTH_LONG).show();
        }
        // tải trọng làn
        m9=(651.0/1280)*Ls*Ls;
        m10=(279.0/320)*Ls*Ls;
        m11=(279.0/256)*Ls*Ls;
        m12=(93.0/80)*Ls*Ls;
        // tải trọng người đi bộ gây ra
        m13=(7.0/128)*Ls*Ls*PL;
        m14=(3.0/32)*Ls*Ls*PL;
        m15=(15.0/128)*Ls*Ls*PL;
        m16=(1.0/8)*Ls*Ls*PL;
        //TTGH CĐ1-dầm trong
        M41=(1.25*Math.max(m1,m5)+ m9+ m13)*1.75*mgDTM;
        M42=(1.25*Math.max(m2,m6)+ m10+ m14)*1.75*mgDTM;
        M43=(1.25*Math.max(m3,m7)+ m11+ m15)*1.75*mgDTM;
        M44=(1.25*Math.max(m4,m8)+ m12+ m16)*1.75*mgDTM;

        //TTGH CĐ1-dầm ngoài
        M45=(1.25*Math.max(m1,m5)+ m9+ m13)*1.75*mgDNM;
        M46=(1.25*Math.max(m2,m6)+ m10+ m14)*1.75*mgDNM;
        M47=(1.25*Math.max(m3,m7)+ m11+ m15)*1.75*mgDNM;
        M48=(1.25*Math.max(m4,m8)+ m12+ m16)*1.75*mgDNM;
        //TTGH SD-dầm trong
        M49=(1.25*Math.max(m1,m5)+ m9+ m13)*mgDTM;
        M410=(1.25*Math.max(m2,m6)+ m10+ m14)*mgDTM;
        M411=(1.25*Math.max(m3,m7)+ m11+ m15)*mgDTM;
        M412=(1.25*Math.max(m4,m8)+ m12+ m16)*mgDTM;
        //TTGH SD-dầm ngoài
        M413=(1.25*Math.max(m1,m5)+ m9+ m13)*mgDNM;
        M414=(1.25*Math.max(m2,m6)+ m10+ m14)*mgDNM;
        M415=(1.25*Math.max(m3,m7)+ m11+ m15)*mgDNM;
        M416=(1.25*Math.max(m4,m8)+ m12+ m16)*mgDNM;

        //LỰC CẮT XE 3 TRỤC
        //V DƯƠNG

        // tại gối


        if (Ls-8.6 >0){
            q1 =145+((Ls-4.3)/Ls)*145+((Ls-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q1,Toast.LENGTH_LONG).show();
        }
        else if (Ls-8.6<=0 && Ls-4.3>0) {
            q1 =145+((Ls-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q1,Toast.LENGTH_LONG).show();
        }
        else if(Ls-4.3<=0){
            q1 =145;
            Toast.makeText(nhaplieuthietke.this,""+q1,Toast.LENGTH_LONG).show();
        }
        //L/8

        if ((7*Ls/8)-8.6>0){
            q2 =(7.0/8)*145+(((7*Ls/8)-4.3)/Ls)*145+(((7*Ls/8)-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q2,Toast.LENGTH_LONG).show();
        }
        else if ((7*Ls/8)-8.6<=0 && (7*Ls/8)-4.3>0) {
            q2 =(7.0/8)*145+(((7*Ls/8)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q2,Toast.LENGTH_LONG).show();
        }
        else if((7*Ls/8)-4.3<=0){
            q2 =(7.0/8)*145;
            Toast.makeText(nhaplieuthietke.this,""+q2,Toast.LENGTH_LONG).show();
        }

        //L/4

        if ((3*Ls/4)-8.6>0){
            q3 =(3.0/4)*145+(((3*Ls/4)-4.3)/Ls)*145+(((3*Ls/4)-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q3,Toast.LENGTH_LONG).show();
        }
        else if ((3*Ls/4)-8.6<=0 && (3*Ls/4)-4.3>0) {
            q3 =(3.0/4)*145+(((3*Ls/4)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q3,Toast.LENGTH_LONG).show();
        }
        else if((3*Ls/4)-4.3<=0){
            q3 =(3.0/4)*145;
            Toast.makeText(nhaplieuthietke.this,""+q3,Toast.LENGTH_LONG).show();
        }

        //3L/8


        if ((5*Ls/8)-8.6>0){
            q4 =(5.0/8)*145+(((5*Ls/8)-4.3)/Ls)*145+(((5*Ls/8)-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q4,Toast.LENGTH_LONG).show();
        }
        else if ((5*Ls/8)-8.6<=0 && (5*Ls/8)-4.3>0) {
            q4 =(5.0/8)*145+(((5*Ls/8)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q4,Toast.LENGTH_LONG).show();
        }
        else if((5*Ls/8)-4.3<=0){
            q4 =(5.0/8)*145;
            Toast.makeText(nhaplieuthietke.this,""+q4,Toast.LENGTH_LONG).show();
        }

        // L/2

        if ((Ls/2)-8.6>0){
            q5 =(1.0/2)*145+(((Ls/2)-4.3)/Ls)*145+(((Ls/2)-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q5,Toast.LENGTH_LONG).show();
        }
        else if ((Ls/2)-8.6 <= 0 && (Ls/2)-4.3>0) {
            q5 =(1.0/2)*145+(((Ls/2)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q5,Toast.LENGTH_LONG).show();
        }
        else if((Ls/2)-4.3<=0){
            q5 =(1.0/2)*145;
            Toast.makeText(nhaplieuthietke.this,""+q5,Toast.LENGTH_LONG).show();
        }

        // lực cắt ÂM
        // GÔI
        q6=0;
        // L/8
//
        if (((Ls/8)-8.6>0)){
            q7 =(1.0/8)*145+(((Ls/8)-4.3)/Ls)*145+((Ls/8-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q7,Toast.LENGTH_LONG).show();
        }else if ( (Ls/8)-8.6 <= 0 && (Ls/8)-4.3 > 0) {
            q7 =(1.0/8)*145+(((Ls/8)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        }
        else if((Ls/8)-4.3<=0){
            q7 =(1.0/8)*145;
            Toast.makeText(nhaplieuthietke.this,""+q7,Toast.LENGTH_LONG).show();
        }

        // L/4


        if ((Ls/4)-8.6>0){
            q8 =(1.0/4)*145+(((Ls/4)-4.3)/Ls)*145+(((Ls/4)-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        }else if ((Ls/4)-8.6 <= 0 && (Ls/4)-4.3 > 0) {
            q8 =(1.0/4)*145+(((Ls/4)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        }
        else if((Ls/4)-4.3<=0){
            q8 =(1.0/4)*145;
            Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        }

        //3L/8

        if ((3*Ls/8)-8.6>0){
            q9 =(3.0/8)*145+(((3*Ls/8)-4.3)/Ls)*145+(((3*Ls/8)-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q9,Toast.LENGTH_LONG).show();
        }else if ((3*Ls/8)-8.6 <= 0 && (3*Ls/8)-4.3>0) {
            q9 =(3.0/8)*145+(((3*Ls/8)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q9,Toast.LENGTH_LONG).show();
        }
        else if((3*Ls/8)-4.3 <= 0){
            q9 =(3.0/8)*145;
            Toast.makeText(nhaplieuthietke.this,""+q9,Toast.LENGTH_LONG).show();
        }

        //L/2

        if ((Ls/2)-8.6>0){
            q10 =(1.0/2)*145+(((Ls/2)-4.3)/Ls)*145+(((Ls/2)-8.6)/Ls)*35;
            Toast.makeText(nhaplieuthietke.this,""+q10,Toast.LENGTH_LONG).show();
        }else if ((Ls/2)-8.6 <= 0 && (Ls/2)-4.3>0) {
            q10 =(10/2)*145+(((Ls/2)-4.3)/Ls)*145;
            Toast.makeText(nhaplieuthietke.this,""+q10,Toast.LENGTH_LONG).show();
        }
        else if((Ls/2)-4.3<=0){
            q10 =(1.0/2)*145;
            Toast.makeText(nhaplieuthietke.this,""+q10,Toast.LENGTH_LONG).show();
        }

        //lực cắt do xe 2 trục
        //lực cắt dương


        // gối

        if (Ls-1.2 > 0){
            q11 = 110+((Ls-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q11,Toast.LENGTH_LONG).show();
        }else if (Ls-1.2<=0) {
            q11 =110;
            Toast.makeText(nhaplieuthietke.this,""+q11,Toast.LENGTH_LONG).show();
        }
        // L/8

        if ((7*Ls/8)-1.2>0){
            q12=(7.0/8)*110+(((7*Ls/8)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q12,Toast.LENGTH_LONG).show();
        }else if ((7*Ls/8)-1.2<=0) {
            q12 =(7.0/8)*110;
            Toast.makeText(nhaplieuthietke.this,""+q12,Toast.LENGTH_LONG).show();
        }

        //L/4

        if ((3*Ls/4)-1.2 >0){
            q13=(3.0/4)*110+(((3*Ls/4)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q13,Toast.LENGTH_LONG).show();
        }else if ((3*Ls/4)-1.2<=0) {
            q13 =(3.0/4)*110;
            Toast.makeText(nhaplieuthietke.this,""+q13,Toast.LENGTH_LONG).show();
        }
        //3L/8

        if ( (5*Ls/8)-1.2>0){
            q14=(5.0/8)*110+(((5*Ls/8)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q14,Toast.LENGTH_LONG).show();
        }else if ((5*Ls/8)-1.2<=0) {
            q14 =(5.0/8)*110;
            Toast.makeText(nhaplieuthietke.this,""+q14,Toast.LENGTH_LONG).show();
        }
        //L/2

        if ((Ls/2)-1.2>0){
            q15=(1.0/2)*110+(((Ls/2)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q15,Toast.LENGTH_LONG).show();
        }else if ((Ls/2)-1.2<=0) {
            q15 =(1.0/2)*110;
            Toast.makeText(nhaplieuthietke.this,""+q15,Toast.LENGTH_LONG).show();
        }


        // lực cắt ÂM

        // gói
        q16=0;

        //L/8

        if ((Ls/8)-1.2>0){
            q17=(1.0/8)*110+(((Ls/8)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q17,Toast.LENGTH_LONG).show();
        }else if ((Ls/8)-1.2<=0) {
            q17 =(1.0/8)*110;
            Toast.makeText(nhaplieuthietke.this,""+q17,Toast.LENGTH_LONG).show();
        }

        // L/4


        if ((Ls/4)-1.2>0){
            q18=(1.0/4)*110+(((Ls/4)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q18,Toast.LENGTH_LONG).show();
        }else if ((Ls/4)-1.2<=0) {
            q18 =(1.0/4)*110;
            Toast.makeText(nhaplieuthietke.this,""+q18,Toast.LENGTH_LONG).show();
        }

        //3l/8

        if ((3*Ls/8)-1.2>0){
            q19=(3.0/8)*110+(((3*Ls/8)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q19,Toast.LENGTH_LONG).show();
        }else if ((3*Ls/8)-1.2<=0) {
            q19 =(3/8)*110;
            Toast.makeText(nhaplieuthietke.this,""+q19,Toast.LENGTH_LONG).show();
        }
        //l/2

        if ((Ls/2)-1.2>0){
            q20=(1.0/2)*110+(((Ls/2)-1.2)/Ls)*110;
            Toast.makeText(nhaplieuthietke.this,""+q20,Toast.LENGTH_LONG).show();
        }else if ((Ls/2)-1.2<=0) {
            q20 =(1.0/2)*110;
            Toast.makeText(nhaplieuthietke.this,""+q20,Toast.LENGTH_LONG).show();
        }

        // lực cắt do tải trọng làn
        // lực căt dương
        q21=0.5*Ls*9.3;
        q22=0.5*(49.0/64)*Ls*9.3;
        q23=0.5*(9.0/16)*Ls*9.3;
        q24=0.5*(25.0/64)*Ls*9.3;
        q25=0.5*(1.0/4)*Ls*9.3;

        // lwujc cắt âm
        q26=0;
        q27=0.5*(1.0/64)*Ls*9.3;
        q28=0.5*(1.0/16)*Ls*9.3;
        q29=0.5*(9.0/64)*Ls*9.3;
        q30=0.5*(1.0/4)*Ls*9.3;

        // lực cắt do người đi bộ
        // lwujc cắt dương
        q31=0.5*Ls*PL;
        q32=0.5*(49.0/64)*Ls*PL;
        q33=0.5*(9.0/16)*Ls*PL;
        q34=0.5*(25.0/64)*Ls*PL;
        q35=0.5*(1.0/4)*Ls*PL;

        // lwucj cắt âm
        q36=0;
        q37=0.5*(1.0/64)*Ls*PL;
        q38=0.5*(1.0/16)*Ls*PL;
        q39=0.5*(9.0/64)*Ls*PL;
        q40=0.5*(1.0/4)*Ls*PL;

        /// lực cắt DUOWNGF
        // Dầm trong cd1
        Q41=(1.25*Math.max(q1,q11)+q21+q31)*1.75*mgDTV;
        Q42=(1.25*Math.max(q2,q12)+q22+q32)*1.75*mgDTV;
        Q43=(1.25*Math.max(q3,q13)+q23+q33)*1.75*mgDTV;
        Q44=(1.25*Math.max(q4,q14)+q24+q34)*1.75*mgDTV;
        Q45=(1.25*Math.max(q5,q15)+q25+q35)*1.75*mgDTV;
        //Dầm trong sử dụng
        Q46=(1.25*Math.max(q1,q11)+q21+q31)*1*mgDTV;
        Q47=(1.25*Math.max(q2,q12)+q22+q32)*1*mgDTV;
        Q48=(1.25*Math.max(q3,q13)+q23+q33)*1*mgDTV;
        Q49=(1.25*Math.max(q4,q14)+q24+q34)*1*mgDTV;
        Q410=(1.25*Math.max(q5,q15)+q25+q35)*1*mgDTV;
        // Dầm ngoài CD1
        Q411=(1.25*Math.max(q1,q11)+q21+q31)*1.75*mgDNV;
        Q412=(1.25*Math.max(q2,q12)+q22+q32)*1.75*mgDNV;
        Q413=(1.25*Math.max(q3,q13)+q23+q33)*1.75*mgDNV;
        Q414=(1.25*Math.max(q4,q14)+q24+q34)*1.75*mgDNV;
        Q415=(1.25*Math.max(q5,q15)+q25+q35)*1.75*mgDNV;
        // Dầm ngoài SD
        Q416=(1.25*Math.max(q1,q11)+q21+q31)*1*mgDNV;
        Q417=(1.25*Math.max(q2,q12)+q22+q32)*1*mgDNV;
        Q418=(1.25*Math.max(q3,q13)+q23+q33)*1*mgDNV;
        Q419=(1.25*Math.max(q4,q14)+q24+q34)*1*mgDNV;
        Q420=(1.25*Math.max(q5,q15)+q25+q35)*1*mgDNV;


        // lỰC CẮT ÂM
        // dầm trong CD1
        Q421=(1.25*Math.max(q6,q16)+q26+q36)*1.75*mgDTV;
        Q422=(1.25*Math.max(q7,q17)+q27+q37)*1.75*mgDTV;
        Q423=(1.25*Math.max(q8,q18)+q28+q38)*1.75*mgDTV;
        Q424=(1.25*Math.max(q9,q19)+q29+q39)*1.75*mgDTV;
        Q425=(1.25*Math.max(q10,q20)+q30+q40)*1.75*mgDTV;
        // dầm trong sử dụng
        Q426=(1.25*Math.max(q6,q16)+q26+q36)*1*mgDTV;
        Q427=(1.25*Math.max(q7,q17)+q27+q37)*1*mgDTV;
        Q428=(1.25*Math.max(q8,q18)+q28+q38)*1*mgDTV;
        Q429=(1.25*Math.max(q9,q19)+q29+q39)*1*mgDTV;
        Q430=(1.25*Math.max(q10,q20)+q30+q40)*1*mgDTV;
        // dầm ngoài SD
        Q431=(1.25*Math.max(q6,q16)+q26+q36)*1*mgDNV;
        Q432=(1.25*Math.max(q7,q17)+q27+q37)*1*mgDNV;
        Q433=(1.25*Math.max(q8,q18)+q28+q38)*1*mgDNV;
        Q434=(1.25*Math.max(q9,q19)+q29+q39)*1*mgDNV;
        Q435=(1.25*Math.max(q10,q20)+q30+q40)*1*mgDNV;

        // DẦM NGOÀI CD1
        Q436=(1.25*Math.max(q6,q16)+q26+q36)*1.75*mgDNV;
        Q437=(1.25*Math.max(q7,q17)+q27+q37)*1.75*mgDNV;
        Q438=(1.25*Math.max(q8,q18)+q28+q38)*1.75*mgDNV;
        Q439=(1.25*Math.max(q9,q19)+q29+q39)*1.75*mgDNV;
        Q440=(1.25*Math.max(q10,q20)+q30+q40)*1.75*mgDNV;





































    }

    public void tinhNoiLuc1va2(){
        M31=M11+M21;
        M32=M12+M22;
        M33=M13+M23;
        M34=M14+M24;
        M35=M15+M25;
        M36=M16+M26;
        M37=M17+M27;
        M38=M18+M28;

        Q31=Q11+Q21;
        Q32=Q12+Q22;
        Q33=Q13+Q23;
        Q34=Q14+Q24;
        Q35=Q15+Q25;
        Q36=Q16+Q26;
        Q37=Q17+Q27;
        Q38=Q18+Q28;


    }
    public void tinhUngSuatTinhTaiGD2(){

        ///ứng suất THỚ TRÊN dầm trong
        // CD1
        f21=(M21*YlttDT*1000000)/IltDT;
        f22=(M22*YlttDT*1000000)/IltDT;
        f23=(M23*YlttDT*1000000)/IltDT;
        f24=(M24*YlttDT*1000000)/IltDT;
        //SD
        f29= (M25*YlttDT*1000000)/IltDT;
        f210=(M26*YlttDT*1000000)/IltDT;
        f211=(M27*YlttDT*1000000)/IltDT;
        f212=(M28*YlttDT*1000000)/IltDT;

        ///ỨNG SUẤT THỚ DƯỚI DẦM TRONG
        //CD1
        f25=(M21*YltdDT*1000000)/IltDT;
        f26=(M22*YltdDT*1000000)/IltDT;
        f27=(M23*YltdDT*1000000)/IltDT;
        f28=(M24*YltdDT*1000000)/IltDT;
        //SD
        f213=(M25*YltdDT*1000000)/IltDT;
        f214=(M26*YltdDT*1000000)/IltDT;
        f215=(M27*YltdDT*1000000)/IltDT;
        f216=(M28*YltdDT*1000000)/IltDT;


        ///ứng suất thớ trên dầm ngoài
        //CD1
        f217=(M21*YlttDN*1000000)/IltDN;
        f218=(M22*YlttDN*1000000)/IltDN;
        f219=(M23*YlttDN*1000000)/IltDN;
        f220=(M24*YlttDN*1000000)/IltDN;
        //SD
        f225=(M25*YlttDN*1000000)/IltDN;
        f226=(M26*YlttDN*1000000)/IltDN;
        f227=(M27*YlttDN*1000000)/IltDN;
        f228=(M28*YlttDN*1000000)/IltDN;
        ///ỨNG SUẤT THỚ DƯỚI DẦM NGOÀI
        // CD1
        f221=(M21*YltdDN*1000000)/IltDN;
        f222=(M22*YltdDN*1000000)/IltDN;
        f223=(M23*YltdDN*1000000)/IltDN;
        f224=(M24*YltdDN*1000000)/IltDN;
        //SD
        f229=(M25*YltdDN*1000000)/IltDN;
        f230=(M26*YltdDN*1000000)/IltDN;
        f231=(M27*YltdDN*1000000)/IltDN;
        f232=(M28*YltdDN*1000000)/IltDN;
    }
    public void tinhNoiLucTinhTaiGD2(){
        //tính momen CƯỜNG ĐỌ 1  TƯƠNG ỨNG MẶT CẮT 0, l/8 l/4 3l/8 l/2
        M21= 1.5*(7.0/128)*Ls*Ls*DC2DT;
        M22= 1.5*(3.0/32)*Ls*Ls*DC2DT;
        M23= 1.5*(15.0/128)*Ls*Ls*DC2DT;
        M24= 1.5*(1.0/8)*Ls*Ls*DC2DT;

        // tính momen SỬ DỤNG TƯƠNG ỨNG MẶT CẮT 0, l/8 l/4 3l/8 l/2
        M25= 1*(7.0/128)*Ls*Ls*DC2DT;
        M26= 1*(3.0/32)*Ls*Ls*DC2DT;
        M27= 1*(15.0/128)*Ls*Ls*DC2DT;
        M28= 1*(1.0/8)*Ls*Ls*DC2DT;

        // tính lực cắt CƯỜNG ĐỘ 1 TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q21= 1.5*0.125*Ls*DC2DT;
        Q22= 1.5*0.25*Ls*DC2DT;
        Q23= 1.5*0.375*Ls*DC2DT;
        Q24= 1.5*0.5*Ls*DC2DT;

        // tính lực cắt SỬ DỤNG TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q25= 1*0.125*Ls*DC2DT;
        Q26= 1*0.25*Ls*DC2DT;
        Q27= 1*0.375*Ls*DC2DT;
        Q28= 1*0.5*Ls*DC2DT;

    }
    public void tinhUngSuatTinhTaiGD1(){
        // thớ trên CĐ1
        f11=(M11*Ynct*1000000)/Inc;
        f12=(M12*Ynct*1000000)/Inc;
        f13=(M13*Ynct*1000000)/Inc;
        f14=(M14*Ynct*1000000)/Inc;

        // thớ dưới CD1
        f15=(M11*Yncd*1000000)/Inc;
        f16=(M12*Yncd*1000000)/Inc;
        f17=(M13*Yncd*1000000)/Inc;
        f18=(M14*Yncd*1000000)/Inc;

        //thớ trên SD
        f19=(M15*Ynct*1000000)/Inc;
        f110=(M16*Ynct*1000000)/Inc;
        f111=(M17*Ynct*1000000)/Inc;
        f112=(M18*Ynct*1000000)/Inc;

        // thớ dưới SD
        f113=(M15*Yncd*1000000)/Inc;
        f114=(M16*Yncd*1000000)/Inc;
        f115=(M17*Yncd*1000000)/Inc;
        f116=(M18*Yncd*1000000)/Inc;


    }
    @SuppressLint("SetTextI18n")
    public void tinhNoiLucTinhTaiGD1(){
        //Chiều dài nhịp tính toán
        try {
            Ls = Double.parseDouble(edtChieuDaiNhipTinhToan.getText().toString());

            if (Ls < 0) {

                edtChieuDaiNhipTinhToan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaiNhipTinhToan.setError("Hãy nhập giá trị");
        }

        //tính momen CƯỜNG ĐỌ 1  TƯƠNG ỨNG MẶT CẮT 0, l/8 l/4 3l/8 l/2
        M11= 1.25*(7.0/128)*Ls*Ls*DC1;
        M12= 1.25*(3.0/32)*Ls*Ls*DC1;
        M13= 1.25*(15.0/128)*Ls*Ls*DC1;
        M14= 1.25*(1.0/8)*Ls*Ls*DC1;

        // tính momen SỬ DỤNG TƯƠNG ỨNG MẶT CẮT 0, l/8 l/4 3l/8 l/2
        M15= 1*(7.0/128)*Ls*Ls*DC1;
        M16= 1*(3.0/32)*Ls*Ls*DC1;
        M17= 1*(15.0/128)*Ls*Ls*DC1;
        M18= 1*(1.0/8)*Ls*Ls*DC1;

        // tính lực cắt CƯỜNG ĐỘ 1 TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q11= 1.25*0.125*Ls*DC1;
        Q12= 1.25*0.25*Ls*DC1;
        Q13= 1.25*0.375*Ls*DC1;
        Q14= 1.25*0.5*Ls*DC1;

        // tính lực cắt SỬ DỤNG TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q15= 1*0.125*Ls*DC1;
        Q16= 1*0.25*Ls*DC1;
        Q17= 1*0.375*Ls*DC1;
        Q18= 1*0.5*Ls*DC1;

    }
    public void tinhHeSoPhanBoLLTheoLanDoiVoiLucCat(){

        // 1 làn xe chất tảu DT
        mgSIV=0.36+(S/7600);
        //2 or nhiều DT
        mgMIV= 0.2+(S/3600)-(Math.pow(S/10700,2));
        // 2 làn DN
        eV=0.6+(de/3000);
        mgMEV2lan= eV*mgMIV;
        //
        mgDTV=Math.max(mgSIV,mgMIV);
        // nguoi di bo
        //PL
        try {
            PL = Double.parseDouble(edtPL.getText().toString());

            if (PL < 0) {

                edtPL.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtPL.setError("Hãy nhập giá trị");
        }
        //T
        try {
            T = Double.parseDouble(edtT.getText().toString());

            if (T < 0) {

                edtT.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtT.setError("Hãy nhập giá trị");
        }
        mgPLVDT= 2*T/ndc;
        mgPLVDN=1.2*0.5*T*(((S+de-Blc)/S)+((S+de-T-Blc)/S));

        //
        mgMEV1lan=0.5*((2*S+2*de-2*Blc-2*T-2400)/S);
        mgDNV=Math.max(mgMEV1lan, mgMEV2lan);



    }
    public void tinhHeSoPhanBoLLTheoLanDoiVoiMomen(){
        double eg;

        // Khoảng cách giữa trọng trâm của dầm và của BMC
        eg=Ynct+ts/2;
        //Tham số độ cứng dọc
        Kg=n*(Inc+Adt*Math.pow(eg,2));
        // Dầm trong
        ////1 làn chất tải
        mgSIM=0.06+(Math.pow(S/4300,0.4))*(Math.pow(S/(L*1000),0.3))*(Math.pow((Kg/(L*1000*Math.pow(ts,3))),0.1));
        Toast.makeText(nhaplieuthietke.this,""+mgSIM,Toast.LENGTH_LONG).show();
        ////2 hoặc nhiều làn xe chất tải
        mgMIM=0.075+(Math.pow(S/2900,0.6))*(Math.pow(S/(L*1000),0.2))*(Math.pow((Kg/(L*1000*Math.pow(ts,3))),0.1));
        Toast.makeText(nhaplieuthietke.this,""+mgMIM,Toast.LENGTH_LONG).show();
        double e1;
        e1=0.77+(de/2800);
        if (e1>=1){
           eM =  e1;
        }else {
            eM =1;
        }
        mgMEM2lan= eM*mgMIM;
        Toast.makeText(nhaplieuthietke.this,""+mgMEM2lan,Toast.LENGTH_LONG).show();
        mgDTM= Math.max(mgSIM,mgMIM);
        mgMEM1lan=0.5*((2*S+2*de-2*Blc-2*T-2400)/S);
        mgDNM=Math.max(mgMEM1lan, mgMEM2lan);

    }
    public void tinhKhoiLuongGD2(){
        //Trọng lượng lan can thép
        try {
            DClcT = Double.parseDouble(edtDClcT.getText().toString());

            if (DClcT < 0) {

                edtDClcT.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDClcT.setError("Hãy nhập giá trị");
        }
        //Trọng lượng lan can BT
        try {
            DClcBT = Double.parseDouble(edtDClcBT.getText().toString());

            if (DClcBT < 0) {

                edtDClcBT.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDClcBT.setError("Hãy nhập giá trị");
        }
        DClcDN=(DClcT+DClcBT)/ndc;
        DClcDT=(DClcT+DClcBT)/ndc;
      //  Toast.makeText(nhaplieuthietke.this,""+DClcDN,Toast.LENGTH_LONG).show();
        //Tyr trọng VL lớp phủ
        try {
            yaf = Double.parseDouble(edtTytrongVLlamLopPhu.getText().toString());

            if (yaf < 0) {

                edtTytrongVLlamLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTytrongVLlamLopPhu.setError("Hãy nhập giá trị");
        }
        //Chiều dày lớp phủ
        try {
            taf = Double.parseDouble(edtChieuDayLopPhu.getText().toString());

            if (taf < 0) {
                edtChieuDayLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayLopPhu.setError("Hãy nhập giá trị");
        }
        //Chiều rộng phần xe chạy
        try {
            Bxc = Double.parseDouble(edtBeRongPhanXeChay.getText().toString());

            if (Bxc < 0) {

                edtBeRongPhanXeChay.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtBeRongPhanXeChay.setError("Hãy nhập giá trị");
        }
        //Số lượng dầm chủ
        try {
            ndc = Double.parseDouble(edtSoLuongDamChu.getText().toString());

            if (ndc < 0) {

                edtSoLuongDamChu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtSoLuongDamChu.setError("Hãy nhập giá trị");
        }
        DW=(taf*yaf*Bxc)/(1000*ndc);
        DC2DN= DW+DClcDN;
        DC2DT= DW+DClcDT;
      //  Toast.makeText(nhaplieuthietke.this,""+DC2DT,Toast.LENGTH_LONG).show();
        DCDT=DC2DT+DC1;
        DCDN=DC2DN+DC1;

    }
    public void tinhKhoiLuongGD1(){

        //Moduyn đàn hồi thép
        try {
            Es = Double.parseDouble(edtModuynDanHoiThep.getText().toString());

            if (Es < 0) {

                edtModuynDanHoiThep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtModuynDanHoiThep.setError("Hãy nhập giá trị");
        }

        // Chiều dài nhịp
        try {
            L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

            if (L < 0) {

                edtChieuDaiNhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaiNhip.setError("Hãy nhập giá trị");
        }
        // neo
        try {
            DCneo = Double.parseDouble(edtDCneo.getText().toString());

            if (DCneo < 0) {

                edtDCneo.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDCneo.setError("Hãy nhập giá trị");
        }
        // Tỉ trọng thép
        try {
            ys = Double.parseDouble(edtTiTrongThep.getText().toString());

            if (ys < 0) {

                edtTiTrongThep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTiTrongThep.setError("Hãy nhập giá trị");
        }
        DCdc=Adt*ys/Math.pow(10,6);
        Toast.makeText(nhaplieuthietke.this,""+DCdc,Toast.LENGTH_LONG).show();
        //Tỉ trọng của bê tông
        try {
            yc = Double.parseDouble(edtTiTrongCuaBeTong.getText().toString());

            if (yc < 0) {

                edtTiTrongCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTiTrongCuaBeTong.setError("Hãy nhập giá trị");
        }
        //Chiều dày của BMC
        try {
            ts = Double.parseDouble(edtChieuDayBMC.getText().toString());

            if (ts < 0) {

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }
        //Khoảng cách giữa các dầm chủ
        try {
            S = Double.parseDouble(edtKhoangCachGiuaDC.getText().toString());

            if (S < 0) {

                edtKhoangCachGiuaDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtKhoangCachGiuaDC.setError("Hãy nhập giá trị");
        }
        DCbmc=(yc*ts*S)/(Math.pow(10,6));
        Toast.makeText(nhaplieuthietke.this, ""+DCbmc,Toast.LENGTH_LONG).show();

        DClkn1=(Adn*Ldn*ys*2)/(L*Math.pow(10,9));
        Toast.makeText(nhaplieuthietke.this,""+DClkn1,Toast.LENGTH_LONG).show();
        //DClkn2=11*(2*(S-tw)+2*Math.sqrt(((S-tw)/2)*2+hlkn2)).Atg.ϒs)/(109.L)
        //DClkn2=(Atg*ys*11*(2*(S-tw)+2*(Math.sqrt((Math.pow((S-tw)2,2)+Math.pow(hlkn,2)),2))))/(L*Math.pow(10,9));

        //Diện tích thép góc
        try {
            Atg = Double.parseDouble(edtAtg.getText().toString());

            if (Atg < 0) {

                edtAtg.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtAtg.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw < 0) {

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }
        // Chiều cao hệ liên kết ngang
        try {
            hlkn = Double.parseDouble(edthlkn.getText().toString());

            if (hlkn < 0) {

                edthlkn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edthlkn.setError("Hãy nhập giá trị");
        }
         DClkn2= Atg*ys*11*(2*(S-tw)+2*Math.sqrt(Math.pow((S-tw)/2,2)+Math.pow(hlkn,2)))/(L*Math.pow(10,9));
     //   Toast.makeText(nhaplieuthietke.this,""+DClkn2,Toast.LENGTH_LONG).show();

               //Khoảng cách tim dầm ngang dến hệ Liên kết ngang
        try {
            S2 = Double.parseDouble(edtS2.getText().toString());

            if (S2 < 0) {

                edtS2.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtS2.setError("Hãy nhập giá trị");
        }
        //Chiều rộng phần xe chạy
        try {
            Bxc = Double.parseDouble(edtBeRongPhanXeChay.getText().toString());

            if (Bxc < 0) {

                edtBeRongPhanXeChay.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtBeRongPhanXeChay.setError("Hãy nhập giá trị");
        }
        //Chiều dày lớp phủ
        try {
            taf = Double.parseDouble(edtChieuDayLopPhu.getText().toString());

            if (taf < 0) {
                edtChieuDayLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayLopPhu.setError("Hãy nhập giá trị");
        }
        try {
            Slkn = Double.parseDouble(edtSlkn.getText().toString());

            if (Slkn < 0) {
                edtSlkn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtSlkn.setError("Hãy nhập giá trị");
        }
        // Chiều dài nhịp
        try {
            L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

            if (L < 0) {

                edtChieuDaiNhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaiNhip.setError("Hãy nhập giá trị");
        }
        DClkd= Atg*ys*(2*(Math.sqrt(Math.pow(S-tw,2)+Math.pow(S2,2)))+10*(Math.sqrt(Math.pow(S-tw,2)+Math.pow(Slkn,2))))/(L*Math.pow(10,9));
        DC1=DCdc+DCbmc+DClkn1+DClkn2+DClkd+DCneo;
     //   Toast.makeText(nhaplieuthietke.this,""+DC1,Toast.LENGTH_LONG).show();



    }

    public void tinhtxtLdn() {
        //Khoảng cách giữa các dầm chủ
        try {
            S = Double.parseDouble(edtKhoangCachGiuaDC.getText().toString());

            if (S < 0) {

                edtKhoangCachGiuaDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtKhoangCachGiuaDC.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw < 0) {

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }
        Ldn=S-tw;
        txtLdn.setText(""+Ldn);

    }

    public void DTHHLienHopNganHan() {
        //Bss
        BssDT = (bi / (n));
        BssDN = (bc / (n));
        //Ast
        //Chiều dài đoạn vát
        //Chiều dày của BMC
        try {
            Yv = Double.parseDouble(edtYv.getText().toString());

            if (Yv < 0) {

                edtYv.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtYv.setError("Hãy nhập giá trị");
        }
        //Chiều dày của BMC
        try {
            ts = Double.parseDouble(edtChieuDayBMC.getText().toString());

            if (ts < 0) {

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }
        AstDT = (Anc + BssDT * ts);
        AstDN = (Anc + BssDN * ts);

        //Sstt
        //Chiều rộng bản cánh trên
        try {
            Bft = Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft < 0) {

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }
        //Chiều dày bản cánh trên
        try {
            tft = Double.parseDouble(edtChieuDayBCT.getText().toString());

            if (tft < 0) {

                edtChieuDayBCT.setError("Hãy nhập giá trị");
            }
        } catch (Exception e) {
            edtChieuDayBCT.setError("Hãy nhập giá trị");
        }

        //Chiều rộng bản cánh dưới
        try {
            Bfb = Double.parseDouble(edtChieuRongBCD.getText().toString());

            if (Bfb < 0) {

                edtChieuRongBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBCD.setError("Hãy nhập giá trị");
        }

        //Chiều dày bản cánh dưới
        try {
            tfb = Double.parseDouble(edtChieuDayBCD.getText().toString());

            if (tfb < 0) {

                edtChieuDayBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBCD.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw < 0) {

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }

        //Chiều cao sườn dầm
        try {
            Dw = Double.parseDouble(edtChieuCaoSuon.getText().toString());

            if (Dw < 0) {

                edtChieuCaoSuon.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoSuon.setError("Hãy nhập giá trị");
        }
        //Chiều cao dàm chủ
        try {
            D = Double.parseDouble(edtChieuCaoDC.getText().toString());

            if (D < 0) {

                edtChieuCaoDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoDC.setError("Hãy nhập giá trị");
        }
        SsttDT = (Bft * tft * (D - (tft / 2)) + Dw * tw * (tfb + 0.5 * Dw) + Bfb * tfb * 0.5 * tfb + BssDT * ts * (D + 0.5 * ts));
        SsttDN = (Bft * tft * (D - (tft / 2)) + Dw * tw * (tfb + 0.5 * Dw) + Bfb * tfb * 0.5 * tfb + BssDN * ts * (D + 0.5 * ts));

        //Ystd
        YstdDT = (SsttDT / AstDT);
        YstdDN = (SsttDN / AstDN);
        Toast.makeText(nhaplieuthietke.this, "" + YstdDN, Toast.LENGTH_LONG).show();
        //Ystt
        YsttDT = Math.ceil(D - YstdDT);
        YsttDN = Math.ceil(D - YstdDN);
        //Ist
        IstDT = Inc + Anc * Math.pow(YstdDT - Yncd, 2) + (BssDT * Math.pow(ts, 3) / 12) + BssDT * ts * Math.pow(0.5 * ts + YsttDT + Yv, 2);
        IstDN = Inc + Anc * Math.pow(YstdDN - Yncd, 2) + (BssDN * Math.pow(ts, 3) / 12) + BssDN * ts * Math.pow(0.5 * ts + YsttDN + Yv, 2);
       /* IstDT=((Bft*Math.pow(tft,3)/12)+(Bft*tft)*Math.pow((YsttDT-0.5*tft),2)+(Math.pow(Dw,3)*tw/12)+(Dw*tw*(Math.pow((tfb+0.5*Dw-YstdDT),2)))+(Bfb*(Math.pow(tfb,3))/12)+(Bfb*tfb*(Math.pow((YstdDT-0.5*tfb),2)))+(BssDT*(Math.pow(ts,3))/12)+(BssDT*ts*(Math.pow((YsttDT+0.5*ts),2))));
        IstDN=((Bft*Math.pow(tft,3)/12)+(Bft*tft)*Math.pow((YsttDN-0.5*tft),2)+(Math.pow(Dw,3)*tw/12)+(Dw*tw*(Math.pow((tfb+0.5*Dw-YstdDN),2)))+(Bfb*(Math.pow(tfb,3))/12)+(Bfb*tfb*(Math.pow((YstdDN-0.5*tfb),2)))+(BssDN*(Math.pow(ts,3))/12)+(BssDN*ts*(Math.pow((YsttDN+0.5*ts),2))));*/


    }

    public void DTHHLienHopDaiHan() {
        //Bs
        BsDT = (bi / (3 * n));
        BsDN = (bc / (3 * n));
        //Alt
        //Chiều dày của BMC
        try {
            ts = Double.parseDouble(edtChieuDayBMC.getText().toString());

            if (ts < 0) {

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }
        AltDT = (Anc + BsDT * ts);
        AltDN = (Anc + BsDN * ts);

        //Sltt
        //Chiều rộng bản cánh trên
        try {
            Bft = Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft < 0) {

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }
        //Chiều dày bản cánh trên
        try {
            tft = Double.parseDouble(edtChieuDayBCT.getText().toString());

            if (tft < 0) {

                edtChieuDayBCT.setError("Hãy nhập giá trị");
            }
        } catch (Exception e) {
            edtChieuDayBCT.setError("Hãy nhập giá trị");
        }

        //Chiều rộng bản cánh dưới
        try {
            Bfb = Double.parseDouble(edtChieuRongBCD.getText().toString());

            if (Bfb < 0) {

                edtChieuRongBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBCD.setError("Hãy nhập giá trị");
        }

        //Chiều dày bản cánh dưới
        try {
            tfb = Double.parseDouble(edtChieuDayBCD.getText().toString());

            if (tfb < 0) {

                edtChieuDayBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBCD.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw < 0) {

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }

        //Chiều cao sườn dầm
        try {
            Dw = Double.parseDouble(edtChieuCaoSuon.getText().toString());

            if (Dw < 0) {

                edtChieuCaoSuon.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoSuon.setError("Hãy nhập giá trị");
        }
        //Chiều cao dàm chủ
        try {
            D = Double.parseDouble(edtChieuCaoDC.getText().toString());

            if (D < 0) {

                edtChieuCaoDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoDC.setError("Hãy nhập giá trị");
        }
        SlttDT = (Bft * tft * (D - (tft / 2)) + Dw * tw * (tfb + 0.5 * Dw) + Bfb * tfb * 0.5 * tfb + BsDT * ts * (D + 0.5 * ts));
        SlttDN = (Bft * tft * (D - (tft / 2)) + Dw * tw * (tfb + 0.5 * Dw) + Bfb * tfb * 0.5 * tfb + BsDN * ts * (D + 0.5 * ts));

        //Yltd
        YltdDT = (SlttDT / AltDT);
        YltdDN = (SlttDN / AltDN);
        Toast.makeText(nhaplieuthietke.this, "" + YltdDN, Toast.LENGTH_LONG).show();
        //Yltt
        YlttDT = Math.ceil(D - YltdDT);
        YlttDN = Math.ceil(D - YltdDN);
        //Ilt
        IltDT = Inc + Anc * Math.pow(YltdDT - Yncd, 2) + (BsDT * Math.pow(ts, 3) / 12) + BsDT * ts * Math.pow(0.5 * ts + YlttDT + Yv, 2);
        IltDN = Inc + Anc * Math.pow(YltdDN - Yncd, 2) + (BsDN * Math.pow(ts, 3) / 12) + BsDN * ts * Math.pow(0.5 * ts + YlttDN + Yv, 2);
        /*IltDT=((Bft*Math.pow(tft,3)/12)+(Bft*tft)*Math.pow((YlttDT-0.5*tft),2)+(Math.pow(Dw,3)*tw/12)+(Dw*tw*(Math.pow((tfb+0.5*Dw-YltdDT),2)))+(Bfb*(Math.pow(tfb,3))/12)+(Bfb*tfb*(Math.pow((YltdDT-0.5*tfb),2)))+(BsDT*(Math.pow(ts,3))/12)+(BsDT*ts*(Math.pow((YlttDT+0.5*ts),2))));
        IltDN=((Bft*Math.pow(tft,3)/12)+(Bft*tft)*Math.pow((YlttDN-0.5*tft),2)+(Math.pow(Dw,3)*tw/12)+(Dw*tw*(Math.pow((tfb+0.5*Dw-YltdDN),2)))+(Bfb*(Math.pow(tfb,3))/12)+(Bfb*tfb*(Math.pow((YltdDN-0.5*tfb),2)))+(BsDN*(Math.pow(ts,3))/12)+(BsDN*ts*(Math.pow((YlttDN+0.5*ts),2))));*/


    }


    public void tinhDTHHGiaiDoan1() {
        //Chiều cao dàm chủ
        try {
            D = Double.parseDouble(edtChieuCaoDC.getText().toString());

            if (D < 0) {

                edtChieuCaoDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoDC.setError("Hãy nhập giá trị");
        }
        //Diện tích mặt cắt nguyên
        Anc = Adt;
        //Momen tĩnh đối với đáy dầm
        Snct = (((Bft * tft) * (D - (tft / 2))) + ((Dw * tw) * (D - tft - (Dw / 2))) + ((Bfb * tfb) * (tfb / 2)));
        Toast.makeText(nhaplieuthietke.this, "" + Snct, Toast.LENGTH_LONG).show();
        Yncd = (Snct / Anc);
        Toast.makeText(nhaplieuthietke.this, "" + Yncd, Toast.LENGTH_LONG).show();
        Ynct = (D - Yncd);
        Toast.makeText(nhaplieuthietke.this, "" + Ynct, Toast.LENGTH_LONG).show();
        Inc = ((Bft * (Math.pow(tft, 3)) / 12) + (Bft * tft) * Math.pow((Ynct - 0.5 * tft), 2) + (Bfb * Math.pow(tfb, 3) / 12) + (Bfb * tfb) * Math.pow((Yncd - 0.5 * tfb), 2) + (tw * Math.pow(Dw, 3) / 12) + (tw * Dw) + (tw * Dw) * Math.pow((0.5 * Dw + tfb - Yncd), 2));
        Toast.makeText(nhaplieuthietke.this, "" + Inc, Toast.LENGTH_LONG).show();
        Sncd = (Anc * Ynct);
        Toast.makeText(nhaplieuthietke.this, "" + Sncd, Toast.LENGTH_LONG).show();


    }

    public void tinhTisoModuyn() {
        //Moduyn đàn hồi thép
        try {
            Es = Double.parseDouble(edtModuynDanHoiThep.getText().toString());

            if (Es < 0) {

                edtModuynDanHoiThep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtModuynDanHoiThep.setError("Hãy nhập giá trị");
        }
        n = Math.ceil(Es / Ec);
        Toast.makeText(nhaplieuthietke.this, "n=" + n, Toast.LENGTH_LONG).show();
    }

    // bản cánh biên đủ biến
    public void tinhChieuRongHuuHieuBanCanhDamBien() {
        // Chiều dài nhịp
        try {
            L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

            if (L < 0) {

                edtChieuDaiNhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaiNhip.setError("Hãy nhập giá trị");
        }
        bc1 = 1000 * L / 8;
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw < 0) {

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }

        //Chiều dày của BMC
        try {
            ts = Double.parseDouble(edtChieuDayBMC.getText().toString());

            if (ts < 0) {

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }
        //Chiều rộng bản cánh trên
        try {
            Bft = Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft < 0) {

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }

        //Chiều dài phần hẫng
        try {
            de = Double.parseDouble(edtChieuDaiPhanHang.getText().toString());

            if (de < 0) {

                edtChieuDaiPhanHang.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaiPhanHang.setError("Hãy nhập giá trị");
        }
        bc2 = 6 * ts + Math.max((tw / 2), (Bft / 4));
        bc3 = de;
        bcc = Math.min(bc1, bc2);
        bc = (0.5 * bi) + Math.min(bcc, bc3);
        Toast.makeText(nhaplieuthietke.this, "bc=" + bc, Toast.LENGTH_LONG).show();
    }

    // BỀ RỘNG HỮU HIỆU ĐỦ BIẾN
    public void tinhChieuRongHuuHieuBanCanhDamGiua() {
        // Chiều dài nhịp
        try {
            L = Double.parseDouble(edtChieuDaiNhip.getText().toString());

            if (L < 0) {

                edtChieuDaiNhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaiNhip.setError("Hãy nhập giá trị");
        }
        //Chiều dày của BMC
        try {
            ts = Double.parseDouble(edtChieuDayBMC.getText().toString());

            if (ts < 0) {

                edtChieuDayBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBMC.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw < 0) {

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }
        //Chiều rộng bản cánh trên
        try {
            Bft = Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft < 0) {

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }

        //Khoảng cách giữa các dầm chủ
        try {
            S = Double.parseDouble(edtKhoangCachGiuaDC.getText().toString());

            if (S < 0) {

                edtKhoangCachGiuaDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtKhoangCachGiuaDC.setError("Hãy nhập giá trị");
        }
        bi1 = (1000 * L) / 4;
        bi2 = 12 * ts + Math.max(tw, 0.5 * Bft);
        bi3 = S;
        bii = Math.min(bi1, bi2);
        bi = Math.min(bii, bi3);
        Toast.makeText(nhaplieuthietke.this, "bi=" + bi, Toast.LENGTH_LONG).show();
    }

    // TÍNH SỐ HỆ LIÊN KẾT DỌC ĐỦ BIẾN
    public void tinhToanTongSoHLKDoc() {
        //Số lượng dầm chủ
        try {
            ndc = Double.parseDouble(edtSoLuongDamChu.getText().toString());

            if (ndc < 0) {

                edtSoLuongDamChu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtSoLuongDamChu.setError("Hãy nhập giá trị");
        }
        //Số lượng hệ liên kết dọc theo phương dọc
        try {
            b = Double.parseDouble(edtb.getText().toString());

            if (b < 0) {

                edtb.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtb.setError("Hãy nhập giá trị");
        }
        nlkd = b * (ndc / 2);
        txtnlkd.setText("" + nlkd);
    }

    // DIỆN TÍCH DẦM NGANG ĐỦ BIẾN
    public void tinhToanDienTichDamNgang() {
        // Số lượng dầm ngang theo phương dọc cầu trong 1 nhịp edtSoLuongDamNgang1Nhip
        try {
            ndn1 = Double.parseDouble(edtSoLuongDamNgang1Nhip.getText().toString());

            if (ndn1 < 0) {

                edtSoLuongDamNgang1Nhip.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtSoLuongDamNgang1Nhip.setError("Hãy nhập giá trị");
        }
        //Bề rộng bản cánh dầm ngang
        try {
            bn = Double.parseDouble(edtbn.getText().toString());

            if (bn < 0) {

                edtbn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtbn.setError("Hãy nhập giá trị");
        }
        // Chiều dày bản cánh dầm ngang
        try {
            tfdn = Double.parseDouble(edttfdn.getText().toString());

            if (tfdn < 0) {

                edttfdn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edttfdn.setError("Hãy nhập giá trị");
        }

        // Chiều dày sườn dầm ngang
        try {
            twdn = Double.parseDouble(edttwdn.getText().toString());

            if (twdn < 0) {

                edttwdn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edttwdn.setError("Hãy nhập giá trị");
        }

        // Chiều cao sườn dâm ngang
        try {
            hwdn = Double.parseDouble(edthwdn.getText().toString());

            if (hwdn < 0) {

                edthwdn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edthwdn.setError("Hãy nhập giá trị");
        }
        // Diện tích mặt cắt dâm ngang
        Adn = (twdn * hwdn) + (bn * tfdn * ndn1);
        txtAdn.setText("" + Adn);

    }

    // DIỆN TÍCH THÉP ĐỦ BIẾN
    public void tinhToanDienTichThep() {
        //Chiều rộng bản cánh trên
        try {
            Bft = Double.parseDouble(edtChieuRongBanCanhTren.getText().toString());

            if (Bft < 0) {

                edtChieuRongBanCanhTren.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBanCanhTren.setError("Hãy nhập giá trị");
        }


        //Chiều dày bản cánh trên
        try {
            tft = Double.parseDouble(edtChieuDayBCT.getText().toString());

            if (tft < 0) {

                edtChieuDayBCT.setError("Hãy nhập giá trị");
            }
        } catch (Exception e) {
            edtChieuDayBCT.setError("Hãy nhập giá trị");
        }

        //Chiều rộng bản cánh dưới
        try {
            Bfb = Double.parseDouble(edtChieuRongBCD.getText().toString());

            if (Bfb < 0) {

                edtChieuRongBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuRongBCD.setError("Hãy nhập giá trị");
        }

        //Chiều dày bản cánh dưới
        try {
            tfb = Double.parseDouble(edtChieuDayBCD.getText().toString());

            if (tfb < 0) {

                edtChieuDayBCD.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayBCD.setError("Hãy nhập giá trị");
        }
        //Chiều dày sườn dầm
        try {
            tw = Double.parseDouble(edtChieuDaySuonDam.getText().toString());

            if (tw < 0) {

                edtChieuDaySuonDam.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaySuonDam.setError("Hãy nhập giá trị");
        }

        //Chiều cao sườn dầm
        try {
            Dw = Double.parseDouble(edtChieuCaoSuon.getText().toString());

            if (Dw < 0) {

                edtChieuCaoSuon.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoSuon.setError("Hãy nhập giá trị");
        }

        // Diện tích dầm thép // Adt
        Adt = Bft * tft + Bfb * tfb + Dw * tw;
        txtDienTichDamThep.setText("" + Adt);
    }

    public void tinhToanEBeTong() {
        //Cường độ chịu nén của bê tông ĐỦ BIẾN
        try {
            fc = Double.parseDouble(edtCuongDoChiuNenCuaBeTong.getText().toString());

            if (fc < 0) {

                edtCuongDoChiuNenCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtCuongDoChiuNenCuaBeTong.setError("Hãy nhập giá trị");
        }


        //Tỉ trọng của bê tông
        try {
            yc = Double.parseDouble(edtTiTrongCuaBeTong.getText().toString());

            if (yc < 0) {

                edtTiTrongCuaBeTong.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTiTrongCuaBeTong.setError("Hãy nhập giá trị");
        }
        Ec = Math.ceil(0.043 * Math.pow((yc * 100), 1.5) * (Math.sqrt(fc)));
        txtModuynDanHoiCuaBeTong.setText("" + Ec);

    }

    public void chuaBien() {

        //Số lượng hệ liên kết ngang theo phương dọc cầu trong nhịp
        try {
            a = Double.parseDouble(edta.getText().toString());

            if (a < 0) {

                edta.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edta.setError("Hãy nhập giá trị");
        }

        // Tổng số hệ liên kết ngang trong 1 nhịp
        try {
            nlkn = Double.parseDouble(edtnlkn.getText().toString());

            if (nlkn < 0) {

                edtnlkn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtnlkn.setError("Hãy nhập giá trị");
        }

        // Chiều cao hệ liên kết ngang
        try {
            hlkn = Double.parseDouble(edthlkn.getText().toString());

            if (hlkn < 0) {

                edthlkn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edthlkn.setError("Hãy nhập giá trị");
        }
        //Hoạt tải tiêu chuẩn
        try {
            heSoHoatTai = Double.parseDouble(edtHoatTaiTieuChuan.getText().toString());

            if (heSoHoatTai < 0) {

                edtHoatTaiTieuChuan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtHoatTaiTieuChuan.setError("Hãy nhập giá trị");
        }


        //Chiều dài nhịp tính toán
        try {
            Ls = Double.parseDouble(edtChieuDaiNhipTinhToan.getText().toString());

            if (Ls < 0) {

                edtChieuDaiNhipTinhToan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDaiNhipTinhToan.setError("Hãy nhập giá trị");
        }

        //Chiều rộng phần xe chạy
        try {
            Bxc = Double.parseDouble(edtBeRongPhanXeChay.getText().toString());

            if (Bxc < 0) {

                edtBeRongPhanXeChay.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtBeRongPhanXeChay.setError("Hãy nhập giá trị");
        }


        // Bề rộng lan can
        try {
            Blc = Double.parseDouble(edtBeRongLanCan.getText().toString());

            if (Blc < 0) {

                edtBeRongLanCan.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtBeRongLanCan.setError("Hãy nhập giá trị");
        }

        //Bề rộng toàn cầu
        try {
            B = Double.parseDouble(edtTongBeRongToanCuaCau.getText().toString());

            if (B < 0) {

                edtTongBeRongToanCuaCau.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTongBeRongToanCuaCau.setError("Hãy nhập giá trị");
        }

        //Loại liên kết sử dụng
//        String edtlienKetSuDung = edtLoaiLienKetSuDung.getText().toString();

        //Cấu tạo dầm chủ
    //    String edtcauTaoDamChu = edtCauTaoDamChu.getText().toString();

        //Mặt cắt ngang dầm chủ
       // String edtmatCatNgangDamChu = edtMatCatNgangDamChu.getText().toString();


        //Chiều dày lớp phủ
        try {
            taf = Double.parseDouble(edtChieuDayLopPhu.getText().toString());

            if (taf < 0) {
                edtChieuDayLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuDayLopPhu.setError("Hãy nhập giá trị");
        }

        //Tyr trọng VL lớp phủ
        try {
            yaf = Double.parseDouble(edtTytrongVLlamLopPhu.getText().toString());

            if (yaf < 0) {

                edtTytrongVLlamLopPhu.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTytrongVLlamLopPhu.setError("Hãy nhập giá trị");
        }


        //Thép kết cấu
        String edtthepKetCau = edtThepKetCau.getText().toString();


        //Cường đọ chịu kéo nhỏ nhất
        try {
            Fu = Double.parseDouble(edtCuongDoChiuKeoMIN.getText().toString());

            if (Fu < 0) {

                edtCuongDoChiuKeoMIN.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtCuongDoChiuKeoMIN.setError("Hãy nhập giá trị");
        }

        // Cường độ chảy nhỏ nhất
        try {
            Fy = Double.parseDouble(edtCuongDoChayMIN.getText().toString());

            if (Fy < 0) {

                edtCuongDoChayMIN.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtCuongDoChayMIN.setError("Hãy nhập giá trị");
        }

        // Tỉ trọng thép
        try {
            ys = Double.parseDouble(edtTiTrongThep.getText().toString());

            if (ys < 0) {

                edtTiTrongThep.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTiTrongThep.setError("Hãy nhập giá trị");
        }


        //Tổng số dầm ngang 1 nhịp
        try {
            ndn = Double.parseDouble(edtTongSoDamNgang.getText().toString());

            if (ndn < 0) {

                edtTongSoDamNgang.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtTongSoDamNgang.setError("Hãy nhập giá trị");
        }
        // edtKhoangCachTimDNĐenauDC Khoàng cách dm đến dầm chủ
        try {
            S1 = Double.parseDouble(edtKhoangCachTimDNĐenauDC.getText().toString());

            if (S1 < 0) {

                edtKhoangCachTimDNĐenauDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtKhoangCachTimDNĐenauDC.setError("Hãy nhập giá trị");
        }

        //Khoảng cách tim dầm ngang dến hệ Liên kết ngang
        try {
            S2 = Double.parseDouble(edtS2.getText().toString());

            if (S2 < 0) {

                edtS2.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtS2.setError("Hãy nhập giá trị");
        }

        // Chiều cao dầm ngang
        try {
            hn = Double.parseDouble(edthn.getText().toString());

            if (hn < 0) {

                edthn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edthn.setError("Hãy nhập giá trị");
        }
    }

    public void btnTroVe(View view) {
        Intent iTroVe = new Intent(nhaplieuthietke.this, MainActivity.class);
        startActivity(iTroVe);
    }
}


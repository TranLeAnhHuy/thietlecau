package com.example.huy.design;

import android.annotation.SuppressLint;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.text.InputFilter;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//import android.annotation.SuppressLint;
public class nhaplieuthietke extends AppCompatActivity {
    EditText edtTenDuAn, edtHoatTaiTieuChuan, edtChieuDaiNhip, edtChieuDaiNhipTinhToan, edtBeRongPhanXeChay, edtBeRongLanCan, edtTongBeRongToanCuaCau;
    EditText edtLoaiLienKetSuDung, edtCauTaoDamChu, edtMatCatNgangDamChu, edtCuongDoChiuNenCuaBeTong, edtTiTrongCuaBeTong, edtModuynDanHoiCuaBeTong;
    EditText edtChieuDayBMC, edtChieuDayLopPhu, edtTytrongVLlamLopPhu, edtThepKetCau, edtModuynDanHoiThep, edtCuongDoChiuKeoMIN, edtCuongDoChayMIN;
    EditText edtTiTrongThep, edtSoLuongDamChu, edtKhoangCachGiuaDC, edtChieuDaiPhanHang, edtChieuCaoDC, edtChieuRongBanCanhTren, edtChieuDayBCT;
    EditText edtChieuRongBCD;
    EditText edtChieuDayBCD;
    EditText edtChieuDaySuonDam;
    TextView edtChieuCaoSuon;
    EditText edtSoLuongDamNgang1Nhip;
    EditText edtTongSoDamNgang;
    EditText edtYv, edtKhoangCachTimDNDenauDC, edtS2, edthn, edtbn, edttfdn, edttwdn, edthwdn, edta, edtnlkn, edthlkn, edtSlkn, edtb, edtAtg;
    TextView txtDienTichDamThep, txtModuynDanHoiCuaBeTong, txtAdn, txtnlkd, txtLdn;
    Button btnTinhToan;
    EditText edtDCneo, edtDClcT, edtDClcBT, edtPL, edtT;
    EditText edtDtt, edtDtt_ct, edtDbaove_t;
    EditText edtnn, edtdneo, edtpn, edtDuThuaBMC;
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
    double DCdc, DCbmc, DClkn1, DClkn2, DClkd, DCneo, Atg, DC1;
    double DClcT, DClcBT, DClcDN, DClcDT, DW, DC2DN, DC2DT, DCDT, DCDN;
    //Pl, T
    double PL, T;
    // hệ số phân bố momen
    double eM, mgSIM, mgMIM, Kg, mgMEM1lan, mgMEM2lan, mgDTM, mgDNM;
    //hệ số phân bố lực cắt
    double eV, mgSIV, mgMIV, mgMEV1lan, mgMEV2lan, mgDTV, mgDNV, mgPLVDT, mgPLVDN;
    // nội lực tĩnh tải giai đoạn 1
    double M11, M12, M13, M14, M15, M16, M17, M18, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18; //
    //ứng suất tĩnh tải giai đoạn 1
    double f11, f12, f13, f14, f15, f16, f17, f18, f19, f110, f111, f112, f113, f114, f115, f116;
    // Nội lực giai đoạn 2
    double M21, M22, M23, M24, M25, M26, M27, M28, Q21, Q22, Q23, Q24, Q25, Q26, Q27, Q28;
    //ứng suất tĩnh tải giai đoạn 2
    double f21, f22, f23, f24, f25, f26, f27, f28, f29, f210, f211, f212, f213, f214, f215, f216, f217, f218, f219, f220, f221, f222, f223, f224, f225, f226, f227, f228, f229, f230, f231, f232;
    double M31, M32, M33, M34, M35, M36, M37, M38, Q31, Q32, Q33, Q34, Q35, Q36, Q37, Q38;
    // hoạt tải
    double M41, M42, M43, M44, M45, M46, M47, M48, M49, M410, M411, M412, M413, M414, M415, M416;
    double Q41, Q42, Q43, Q44, Q45, Q46, Q47, Q48, Q49, Q410, Q411, Q412, Q413, Q414, Q415, Q416;
    double Q417, Q418, Q419, Q420, Q421, Q422, Q423, Q424, Q425, Q426, Q427, Q428, Q429, Q430;
    double Q431, Q432, Q433, Q434, Q435, Q436, Q437, Q438, Q439, Q440;
    double m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16;
    double q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26, q27, q28, q29, q30, q31, q32, q33, q34, q35, q36, q37, q38, q39, q40;
    //co ngót
    double ks, M51, M52, f51, f52, f53, f54;
    //mỏi
    double M61, M62, M63, M64, Q61, Q62, Q63, Q64, Q65, Q66, Q67, Q68, Q69, Q610;
    //tổng hợp
    double M71, M72, M73, M74, M75, M76, M77, M78, M79, M710, M711, M712, M713, M714, M715, M716, M717, M718, M719, M720, M721, M722, M723, M724;
    double Q71, Q72, Q73, Q74, Q75, Q76, Q77, Q78, Q79, Q710, Q711, Q712, Q713, Q714, Q715, Q716, Q717, Q718, Q719, Q720, Q721, Q722, Q723, Q724, Q725, Q726, Q727, Q728, Q729, Q730;
    double Q71klh, Q72klh, Q73klh, Q74klh, Q75klh, Q76klh, Q77klh, Q78klh, Q79klh, Q710klh, Q711klh, Q712klh, Q713klh, Q714klh, Q715klh, Q716klh, Q717klh, Q718klh, Q719klh, Q720klh, Q721klh, Q722klh, Q723klh, Q724klh, Q725klh, Q726klh, Q727klh, Q728klh, Q729klh, Q730klh;
    double M71klh, M72klh, M73klh, M74klh, M75klh, M76klh, M77klh, M78klh, M79klh, M710klh, M711klh, M712klh, M713klh, M714klh, M715klh, M716klh, M717klh, M718klh, M719klh, M720klh, M721klh, M722klh, M723klh, M724klh;
    // kiểm toán
    double my, myy, Ystt, Ystd, My;
    // tính thông số
    double Ps, Pc, Pt, Pw, Prt, Prb;
    // trục trung hòa dẻo
    double Dcp, Mp;
    // momen dẻo
    double Dp, beta, Dphay, Mn, Mr, Mu;
    EditText edtd0;
    double d0, k, c, V1n, V2n, r, Vr, Vp;
    double fcf, f;
    // sTring
    String txtKT1, txtKT2, txtKT3, txtKT4, txtKT5, txtKT6, txtKT7, txtKT8, txtKT9, txtKT10, txtKT11, txtKT12, txtKT13;
    String txtBMC1,txtBMC2,txtBMC3,txtBMC4,txtBMC5,txtBMC6,txtBMC7;
    // text ở KQkhong liên hợp
    String txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
    double Dentaf, N, u1, u2, u3;
    Spinner spnLoaiThep, spnViTri;
    AutoCompleteTextView spnProject;
    String arrLoaiThep[] = {"A", "B", "B'", "C", "C'", "D", "E", "E'"};
    String arrViTri[] = {"Đường nông thôn liên quốc gia", "Đường nông thôn", "Đường thành phố liên quốc gia", "Đường thành phó"};
    double DentaFTH, ABCDE, l1234;
    int lastedSelected = 0;
    int lastedSelectedViTri = 0;
    double DentaFn;
    // tiết diện khong chắc
    double Yltd, Dc, Fn, Vn;
    // kiểm toán ở ttgh sử dụng
    double Ist;
    double ftDC1, ftDC2, ftLL_IM, ftSH, ftsum;
    double fbDC1, fbDC2, fbLL_IM, fbSH, fbsum;
    double dentaDC1, dentaDC2, dentaP35, dentaP145G, dentaP145S, denta1;
    double denta2, denta3, denta4, denta5, denta6;
    double dentav;
    double dentafinal;
    //// tính BMC
    //cốt thép ở BMC                 Dtt=Dtd=16;// nhập
    double Dtt, St, Stbmc, N1, Dtd, Sd, Sdbmc, N2;
    double DCbmctt, E, Eduong, Eam, LL, LLduong, LLam;
    double M81, M82, M83, M84, M85, M86, M87, M88, M89, M810, M811, M812, M813, M814, M815, M816;
    double e;
    double Q81, Q82, Q83, Q84, Q85, Q86, Q87, Q88;
    // tổng hợp
    double M821, M822, M823, M824, Q821, Q822, M825, M826, Q823, Q824;
    double m821, m822, m823, m824;
    double Mt;
    double Dbaove_t; /// nhập vô
    double A1, B1, C1, Denta1, beta1;
    ///// tìm nghiệm
    double X1, X2;
    double cc1, de1, romin1, N1new;
    double Md, Dbaove_d, A2, B2, C2, Denta2, X3, X4, cc2, de2, romin2, N2new;
    double Sbmc, Abmc, Yd, I, Fs_d, Fsa_d, Z = 23000., Dc_sdd, Asd_d;
    double Yt, Fs_t, Fsa_t, Dc_sdt, Asd_t, C, As_ctd;
    double Dtd_ct, N3, Dtt_ct, N4, N4new, St_ct;
    double V1n_bmc, dv, Vc_bmc;
    String txtbmc1, txtbmc2, txtbmc3, txtbmc4, txtbmc5, txtbmc6, txtbmc7, txtbmc8;
    double DuThuaBMC;
    /// neo liên kết
    double hneo, dneo, pn, mm, dmu, nn;
    double Zr, anpha, Qsr, V1duong, V1am, V1sr, p1;
    double V2duong, V2am, V2sr, p2;
    double V3duong, V3am, V3sr, p3;
    double V4duong, V4am, V4sr, p4;
    double V5duong, V5am, V5sr, p5;
    double Qr, Vh, nCD, pnew, nneofinal;
    double Myklh, Mpklh;
    String tpn;
    AppDatabase appDatabase;
    String bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhaplieuthietke);
        appDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "app.db").fallbackToDestructiveMigration().allowMainThreadQueries().build();
        addControls();
        addEvents();
        String edtenDuAn = edtTenDuAn.getText().toString();
        edtTenDuAn.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        clearData();
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
        edtChieuCaoSuon = (TextView) findViewById(R.id.edtChieuCaoSuon);
        txtDienTichDamThep = (TextView) findViewById((R.id.txtDienTichDamChu));
        btnTinhToan = (Button) findViewById(R.id.btnTinhToan);
        edtSoLuongDamNgang1Nhip = (EditText) findViewById(R.id.edtSoLuongDamNgang1Nhip);
        edtTongSoDamNgang = (EditText) findViewById(R.id.edtTongSoDamNgang);
        edtKhoangCachTimDNDenauDC = (EditText) findViewById(R.id.edtKhoangCachTimDNĐenauDC);
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
        edtDCneo = (EditText) findViewById(R.id.edtDCneo);
        edtDClcT = (EditText) findViewById(R.id.edtDClcT);
        edtDClcBT = (EditText) findViewById(R.id.edtDClcBT);
        edtPL = (EditText) findViewById(R.id.edtPL);
        edtT = (EditText) findViewById(R.id.edtT);
        edtd0 = (EditText) findViewById(R.id.edtd0);
        spnLoaiThep = (Spinner) findViewById(R.id.spnLoaiThep);
        spnViTri = (Spinner) findViewById(R.id.spnViTri);
        spnProject = findViewById(R.id.spnProject);
        edtDtt = (EditText) findViewById(R.id.edtDtt);
        edtDtt_ct = (EditText) findViewById(R.id.edtDtt_ct);
        edtDbaove_t = (EditText) findViewById(R.id.edtDbaove_t);
        edtnn = (EditText) findViewById(R.id.edtnn);
        edtdneo = (EditText) findViewById(R.id.edtdneo);
        edtpn = (EditText) findViewById(R.id.edtpn);
        edtDuThuaBMC = (EditText) findViewById(R.id.edtDuThuaBMC);
        final List<savedata> datas = appDatabase.getDao().getAllData();
        final List<String> names = new ArrayList<>();
        for (int i = 0; i < datas.size(); i++) {
            names.add(datas.get(i).getEdtTenDuAn());
        }
        if (names.size() == 0) {
            spnProject.setVisibility(View.GONE);
        } else {
            spnProject.setVisibility(View.VISIBLE);
            ArrayAdapter projectAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
            spnProject.setAdapter(projectAdapter);
            spnProject.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    savedata data = appDatabase.getDao().getDataByName(spnProject.getText().toString());
                    if (data != null) setData(data);
                }
            });
        }

        spinnerLoaiThep();
        spinnerViTri();

        // edt=(EditText) findViewById(R.id.edt);
        //txtMmaxCD1GD1, txtMmaxSDGD1, txtQmaxCD1GD1, txtQmaxSDGD1 ;
        //= (TextView) findViewById(R.id.);
    }

    private void clearData() {
        edtTenDuAn.setText("");
        edtHoatTaiTieuChuan.setText("");
        edtChieuDaiNhip.setText("");
        edtChieuDaiNhipTinhToan.setText("");
        edtBeRongPhanXeChay.setText("");
        edtBeRongLanCan.setText("");
        edtTongBeRongToanCuaCau.setText("");
        edtCuongDoChiuNenCuaBeTong.setText("");
        edtTiTrongCuaBeTong.setText("");
        edtChieuDayBMC.setText("");
        edtChieuDayLopPhu.setText("");
        edtTytrongVLlamLopPhu.setText("");
        edtThepKetCau.setText("");
        edtModuynDanHoiThep.setText("");
        edtCuongDoChiuKeoMIN.setText("");
        edtCuongDoChayMIN.setText("");
        edtTiTrongThep.setText("");
        edtSoLuongDamChu.setText("");
        edtKhoangCachGiuaDC.setText("");
        edtChieuDaiPhanHang.setText("");
        edtChieuCaoDC.setText("");
        edtChieuRongBanCanhTren.setText("");
        edtChieuDayBCT.setText("");
        edtChieuRongBCD.setText("");
        edtChieuDayBCD.setText("");
        edtChieuDaySuonDam.setText("");

        edtSoLuongDamNgang1Nhip.setText("");
        edtTongSoDamNgang.setText("");
        edtYv.setText("");
        edtKhoangCachTimDNDenauDC.setText("");
        edtS2.setText("");
        edthn.setText("");
        edtbn.setText("");
        edttfdn.setText("");
        edttwdn.setText("");
        edthwdn.setText("");
        edta.setText("");
        edtnlkn.setText("");
        edthlkn.setText("");
        edtSlkn.setText("");
        edtb.setText("");
        edtAtg.setText("");
        edtDCneo.setText("");
        edtDClcT.setText("");
        edtDClcBT.setText("");
        edtPL.setText("");
        edtT.setText("");
        edtDtt.setText("");
        edtDtt_ct.setText("");
        edtDbaove_t.setText("");
        edtd0.setText("");
        edtnn.setText("");
        edtdneo.setText("");
        edtpn.setText("");
        edtDuThuaBMC.setText("");
    }

    private savedata buildData() {
        try {
            return new savedata(edtTenDuAn.getText().toString(), edtHoatTaiTieuChuan.getText().toString(), edtChieuDaiNhip.getText().toString(), edtChieuDaiNhipTinhToan.getText().toString(), edtBeRongPhanXeChay.getText().toString(), edtBeRongLanCan.getText().toString(), edtTongBeRongToanCuaCau.getText().toString(), "", "", "", edtCuongDoChiuNenCuaBeTong.getText().toString(), edtTiTrongCuaBeTong.getText().toString(), "", edtChieuDayBMC.getText().toString(), edtChieuDayLopPhu.getText().toString(), edtTytrongVLlamLopPhu.getText().toString(), edtThepKetCau.getText().toString(), edtModuynDanHoiThep.getText().toString(), edtCuongDoChiuKeoMIN.getText().toString(), edtCuongDoChayMIN.getText().toString(), edtTiTrongThep.getText().toString(), edtSoLuongDamChu.getText().toString(), edtKhoangCachGiuaDC.getText().toString(), edtChieuDaiPhanHang.getText().toString(), edtChieuCaoDC.getText().toString(), edtChieuRongBanCanhTren.getText().toString(), edtChieuDayBCT.getText().toString(), edtChieuRongBCD.getText().toString(), edtChieuDayBCD.getText().toString(), edtChieuDaySuonDam.getText().toString(), edtSoLuongDamNgang1Nhip.getText().toString(), edtTongSoDamNgang.getText().toString(), edtYv.getText().toString(), edtKhoangCachTimDNDenauDC.getText().toString(), edtS2.getText().toString(), edthn.getText().toString(), edtbn.getText().toString(), edttfdn.getText().toString(), edttwdn.getText().toString(), edthwdn.getText().toString(), edta.getText().toString(), edtnlkn.getText().toString(), edthlkn.getText().toString(), edtSlkn.getText().toString(), edtb.getText().toString(), edtAtg.getText().toString(), edtDCneo.getText().toString(), edtDClcT.getText().toString(), edtDClcBT.getText().toString(), edtPL.getText().toString(), edtT.getText().toString(), edtDtt.getText().toString(), edtDtt_ct.getText().toString(), edtDbaove_t.getText().toString(), edtd0.getText().toString(), edtnn.getText().toString(), edtdneo.getText().toString(), edtpn.getText().toString(), edtDuThuaBMC.getText().toString());
        } catch (Exception e) {
            return null;
        }
    }

    private void setData(savedata data) {
        edtTenDuAn.setText(data.edtTenDuAn);
        edtHoatTaiTieuChuan.setText(data.edtHoatTaiTieuChuan);
        edtChieuDaiNhip.setText(data.edtChieuDaiNhip);
        edtChieuDaiNhipTinhToan.setText(data.edtChieuDaiNhipTinhToan);
        edtBeRongPhanXeChay.setText(data.edtBeRongPhanXeChay);
        edtBeRongLanCan.setText(data.edtBeRongLanCan);
        edtTongBeRongToanCuaCau.setText(data.edtTongBeRongToanCuaCau);
//        edtLoaiLienKetSuDung.setText(data.edtLoaiLienKetSuDung);
//        edtCauTaoDamChu.setText(data.edtCauTaoDamChu);
//        edtMatCatNgangDamChu.setText(data.edtMatCatNgangDamChu);
        edtCuongDoChiuNenCuaBeTong.setText(data.edtCuongDoChiuNenCuaBeTong);
        edtTiTrongCuaBeTong.setText(data.edtTiTrongCuaBeTong);
//        edtModuynDanHoiCuaBeTong.setText(data.edtModuynDanHoiCuaBeTong);
        edtChieuDayBMC.setText(data.edtChieuDayBMC);
        edtChieuDayLopPhu.setText(data.edtChieuDayLopPhu);
        edtTytrongVLlamLopPhu.setText(data.edtTytrongVLlamLopPhu);
        edtThepKetCau.setText(data.edtThepKetCau);
        edtModuynDanHoiThep.setText(data.edtModuynDanHoiThep);
        edtCuongDoChiuKeoMIN.setText(data.edtCuongDoChiuKeoMIN);
        edtCuongDoChayMIN.setText(data.edtCuongDoChayMIN);
        edtTiTrongThep.setText(data.edtTiTrongThep);
        edtSoLuongDamChu.setText(data.edtSoLuongDamChu);
        edtKhoangCachGiuaDC.setText(data.edtKhoangCachGiuaDC);
        edtChieuDaiPhanHang.setText(data.edtChieuDaiPhanHang);
        edtChieuCaoDC.setText(data.edtChieuCaoDC);
        edtChieuRongBanCanhTren.setText(data.edtChieuRongBanCanhTren);
        edtChieuDayBCT.setText(data.edtChieuDayBCT);
        edtChieuRongBCD.setText(data.edtChieuRongBCD);
        edtChieuDayBCD.setText(data.edtChieuDayBCD);
        edtChieuDaySuonDam.setText(data.edtChieuDaySuonDam);

        edtSoLuongDamNgang1Nhip.setText(data.edtSoLuongDamNgang1Nhip);
        edtTongSoDamNgang.setText(data.edtTongSoDamNgang);
        edtYv.setText(data.edtYv);
        edtKhoangCachTimDNDenauDC.setText(data.edtKhoangCachTimDNDenauDC);
        edtS2.setText(data.edtS2);
        edthn.setText(data.edthn);
        edtbn.setText(data.edtbn);
        edttfdn.setText(data.edttfdn);
        edttwdn.setText(data.edttwdn);
        edthwdn.setText(data.edthwdn);
        edta.setText(data.edta);
        edtnlkn.setText(data.edtnlkn);
        edthlkn.setText(data.edthlkn);
        edtSlkn.setText(data.edtSlkn);
        edtb.setText(data.edtb);
        edtAtg.setText(data.edtAtg);
        edtDCneo.setText(data.edtDCneo);
        edtDClcT.setText(data.edtDClcT);
        edtDClcBT.setText(data.edtDClcBT);
        edtPL.setText(data.edtPL);
        edtT.setText(data.edtT);
        edtDtt.setText(data.edtDtt);
        edtDtt_ct.setText(data.edtDtt_ct);
        edtDbaove_t.setText(data.edtDbaove_t);
        edtd0.setText(data.edtd0);
        edtnn.setText(data.edtnn);
        edtdneo.setText(data.edtdneo);
        edtpn.setText(data.edtpn);
        edtDuThuaBMC.setText(data.edtDuThuaBMC);
    }

    public void addEvents() {


        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtTenDuAn.getText().toString().trim().isEmpty()) {
                    savedata data = buildData();
                    if (data != null) {
                        Log.d("hehehe", "save done");
                        appDatabase.getDao().insertData(data);
                    }
                }
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
                    tinhtxtLdn();
                    tinhKhoiLuongGD1();
                    tinhKhoiLuongGD2();
                    tinhHeSoPhanBoLLTheoLanDoiVoiMomen();
                    tinhHeSoPhanBoLLTheoLanDoiVoiLucCat();
                    tinhNoiLucTinhTaiGD1();
                    tinhUngSuatTinhTaiGD1();
                    tinhNoiLuc4();
                    tinhNoiLuc5();
                    tinhNoiLuc6();
                    tinhNoiLuc7klh();
//                    tinhBMC();
                    kiemtoanklh();
                    kqKiemToan();


                    // đóng gói và truyền dữ liệu
                    Intent KLHintent = new Intent(nhaplieuthietke.this, KQLienHop.class);
                    Bundle KLHbundle = new Bundle();
                    KLHbundle.putDouble("Dw",Dw);
                    KLHbundle.putDouble("Anc", Anc);

                    KLHbundle.putDouble("Snct", Snct);
                    KLHbundle.putDouble("Yncd", Yncd);
                    KLHbundle.putDouble("Ynct", Ynct);
                    KLHbundle.putDouble("Inc", Inc);
                    KLHbundle.putDouble("Sncd", Sncd);

                    // tĩnh tải
                    KLHbundle.putDouble("DC1", DC1);
                    KLHbundle.putDouble("DC2DT", DC2DT);
                    KLHbundle.putDouble("DC2DN", DC2DN);
                    KLHbundle.putDouble("DCDT", DCDT);
                    KLHbundle.putDouble("DCDN", DCDN);
                    // hệ số phân phối ngang
                    KLHbundle.putDouble("mgSIV", mgSIV);
                    KLHbundle.putDouble("mgMEV2lan", mgMEV2lan);
                    KLHbundle.putDouble("mgMIV", mgMIV);
                    KLHbundle.putDouble("mgSIM", mgSIM);
                    KLHbundle.putDouble("mgMIM", mgMIM);
                    KLHbundle.putDouble("mgMEM2lan", mgMEM2lan);
                    KLHbundle.putDouble("mgDTM", mgDTM);
                    KLHbundle.putDouble("mgDTV", mgDTV);
                    KLHbundle.putDouble("mgMEV1lan=", mgMEV1lan);
                    KLHbundle.putDouble("mgDNV", mgDNV);
                    KLHbundle.putDouble("mgMEM1lan", mgMEM1lan);
                    KLHbundle.putDouble("mgDNM", mgDNM);
                    KLHbundle.putDouble("mgPLDT", mgPLVDT);
                    KLHbundle.putDouble("mgPLDN", mgPLVDN);

                    KLHbundle.putDouble("M11", M11);
                    KLHbundle.putDouble("M12", M12);
                    KLHbundle.putDouble("M13", M13);
                    KLHbundle.putDouble("M14", M14);
                    KLHbundle.putDouble("M15", M15);
                    KLHbundle.putDouble("M16", M16);
                    KLHbundle.putDouble("M17", M17);
                    KLHbundle.putDouble("M18", M18);
                    KLHbundle.putDouble("Q11", Q11);
                    KLHbundle.putDouble("Q12", Q12);
                    KLHbundle.putDouble("Q13", Q13);
                    KLHbundle.putDouble("Q14", Q14);
                    KLHbundle.putDouble("Q15", Q15);
                    KLHbundle.putDouble("Q16", Q16);
                    KLHbundle.putDouble("Q17", Q17);
                    KLHbundle.putDouble("Q18", Q18);
                    KLHbundle.putDouble("f11", f11);
                    KLHbundle.putDouble("f12", f12);
                    KLHbundle.putDouble("f13", f13);
                    KLHbundle.putDouble("f14", f14);
                    KLHbundle.putDouble("f15", f15);
                    KLHbundle.putDouble("f16", f16);
                    KLHbundle.putDouble("f17", f17);
                    KLHbundle.putDouble("f18", f18);
                    KLHbundle.putDouble("f19", f19);
                    KLHbundle.putDouble("f110", f110);
                    KLHbundle.putDouble("f111", f111);
                    KLHbundle.putDouble("f112", f112);
                    KLHbundle.putDouble("f113", f113);
                    KLHbundle.putDouble("f114", f114);
                    KLHbundle.putDouble("f115", f115);
                    KLHbundle.putDouble("f116", f116);

                    //hoạt tải
                   KLHbundle.putDouble("M41", M41);
                    KLHbundle.putDouble("M42", M42);
                    KLHbundle.putDouble("M43", M43);
                    KLHbundle.putDouble("M44", M44);
                    KLHbundle.putDouble("M45", M45);
                    KLHbundle.putDouble("M46", M46);
                    KLHbundle.putDouble("M47", M47);
                    KLHbundle.putDouble("M48", M48);
                    KLHbundle.putDouble("M49", M49);
                    KLHbundle.putDouble("M410", M410);
                    KLHbundle.putDouble("M411", M411);
                    KLHbundle.putDouble("M412", M412);
                    KLHbundle.putDouble("M413", M413);
                    KLHbundle.putDouble("M414", M414);
                    KLHbundle.putDouble("M415", M415);
                    KLHbundle.putDouble("M416", M416);
                    KLHbundle.putDouble("Q41", Q41);
                    KLHbundle.putDouble("Q42", Q42);
                    KLHbundle.putDouble("Q43", Q43);
                    KLHbundle.putDouble("Q44", Q44);
                    KLHbundle.putDouble("Q45", Q45);
                    KLHbundle.putDouble("Q46", Q46);
                    KLHbundle.putDouble("Q47", Q47);
                    KLHbundle.putDouble("Q48", Q48);
                    KLHbundle.putDouble("Q49", Q49);
                    KLHbundle.putDouble("Q410", Q410);
                    KLHbundle.putDouble("Q411", Q411);
                    KLHbundle.putDouble("Q412", Q412);
                    KLHbundle.putDouble("Q413", Q413);
                    KLHbundle.putDouble("Q414", Q414);
                    KLHbundle.putDouble("Q415", Q415);
                    KLHbundle.putDouble("Q416", Q416);
                    KLHbundle.putDouble("Q417", Q417);
                    KLHbundle.putDouble("Q418", Q418);
                    KLHbundle.putDouble("Q419", Q419);
                    KLHbundle.putDouble("Q420", Q420);
                    KLHbundle.putDouble("Q421", Q421);
                    KLHbundle.putDouble("Q422", Q422);
                    KLHbundle.putDouble("Q423", Q423);
                    KLHbundle.putDouble("Q424", Q424);
                    KLHbundle.putDouble("Q425", Q425);
                    KLHbundle.putDouble("Q426", Q426);
                    KLHbundle.putDouble("Q427", Q427);
                    KLHbundle.putDouble("Q428", Q428);
                    KLHbundle.putDouble("Q429", Q429);
                   KLHbundle.putDouble("Q430", Q430);
                    KLHbundle.putDouble("Q431", Q431);
                    KLHbundle.putDouble("Q432", Q432);
                    KLHbundle.putDouble("Q433", Q433);
                    KLHbundle.putDouble("Q434", Q434);
                    KLHbundle.putDouble("Q435", Q435);
                    KLHbundle.putDouble("Q436", Q436);
                    KLHbundle.putDouble("Q437", Q437);
                    KLHbundle.putDouble("Q438", Q438);
                   KLHbundle.putDouble("Q439", Q439);
                    KLHbundle.putDouble("Q440", Q440);
                    KLHbundle.putDouble("Q440", Q440);
                    KLHbundle.putDouble("M51", M51);
                    KLHbundle.putDouble("M52", M52);
                    KLHbundle.putDouble("f51", f51);
                    KLHbundle.putDouble("f52", f52);
                    KLHbundle.putDouble("f53", f53);
                    KLHbundle.putDouble("f54", f54);

                    KLHbundle.putDouble("M61", M61);
                    KLHbundle.putDouble("M62", M62);
                   KLHbundle.putDouble("M63", M63);
                    KLHbundle.putDouble("M64", M64);

                    KLHbundle.putDouble("Q61", Q61);
                    KLHbundle.putDouble("Q62", Q62);
                    KLHbundle.putDouble("Q63", Q63);
                    KLHbundle.putDouble("Q64", Q64);
                    KLHbundle.putDouble("Q65", Q65);

                    KLHbundle.putDouble("Q66", Q66);
                    KLHbundle.putDouble("Q67", Q67);
                    KLHbundle.putDouble("Q68", Q68);
                    KLHbundle.putDouble("Q69", Q69);
                    KLHbundle.putDouble("Q610", Q610);

                    // tổng hợp
                    KLHbundle.putDouble("M71klh", M71klh);
                    KLHbundle.putDouble("M72klh", M72klh);
                    KLHbundle.putDouble("M73klh", M73klh);
                    KLHbundle.putDouble("M74klh", M74klh);
                    KLHbundle.putDouble("M75klh", M75klh);
                    KLHbundle.putDouble("M76klh", M76klh);
                    KLHbundle.putDouble("M77klh", M77klh);
                    KLHbundle.putDouble("M78klh", M78klh);
                    KLHbundle.putDouble("M79klh", M79klh);
                    KLHbundle.putDouble("M710klh", M710klh);
                    KLHbundle.putDouble("M711klh", M711klh);
                    KLHbundle.putDouble("M712klh", M712klh);
                    KLHbundle.putDouble("M713klh", M713klh);
                    KLHbundle.putDouble("M714klh", M714klh);
                    KLHbundle.putDouble("M715klh", M715klh);
                    KLHbundle.putDouble("M716klh", M716klh);
                    KLHbundle.putDouble("M717klh", M717klh);
                    KLHbundle.putDouble("M718klh", M718klh);
                    KLHbundle.putDouble("M719klh", M719klh);
                    KLHbundle.putDouble("M720klh", M720klh);
                    KLHbundle.putDouble("M721klh", M721klh);
                    KLHbundle.putDouble("M722klh", M722klh);
                    KLHbundle.putDouble("M723klh", M723klh);
                    KLHbundle.putDouble("M724klh", M724klh);
                    KLHbundle.putDouble("Q71klh", Q71klh);
                    KLHbundle.putDouble("Q72klh", Q72klh);
                    KLHbundle.putDouble("Q73klh", Q73klh);
                    KLHbundle.putDouble("Q74klh", Q74klh);
                    KLHbundle.putDouble("Q75klh", Q75klh);
                    KLHbundle.putDouble("Q76klh", Q76klh);
                    KLHbundle.putDouble("Q77klh", Q77klh);
                    KLHbundle.putDouble("Q78klh", Q78klh);
                    KLHbundle.putDouble("Q79klh", Q79klh);
                    KLHbundle.putDouble("Q710klh", Q710klh);
                    KLHbundle.putDouble("Q711klh", Q711klh);
                    KLHbundle.putDouble("Q712klh", Q712klh);
                    KLHbundle.putDouble("Q713klh", Q713klh);
                    KLHbundle.putDouble("Q714klh", Q714klh);
                    KLHbundle.putDouble("Q715klh", Q715klh);
                    KLHbundle.putDouble("Q716klh", Q716klh);
                    KLHbundle.putDouble("Q717klh", Q717klh);
                    KLHbundle.putDouble("Q718klh", Q718klh);
                    KLHbundle.putDouble("Q719klh", Q719klh);
                    KLHbundle.putDouble("Q720klh", Q720klh);
                    KLHbundle.putDouble("Q721klh", Q721klh);
                    KLHbundle.putDouble("Q722klh", Q722klh);
                    KLHbundle.putDouble("Q723klh", Q723klh);
                    KLHbundle.putDouble("Q724klh", Q724klh);
                    KLHbundle.putDouble("Q725klh", Q725klh);
                    KLHbundle.putDouble("Q726klh", Q726klh);
                    KLHbundle.putDouble("Q727klh", Q727klh);
                    KLHbundle.putDouble("Q728klh", Q728klh);
                    KLHbundle.putDouble("Q729klh", Q729klh);
                    KLHbundle.putDouble("Q730klh", Q730klh);
                    ////
//                    KLHbundle.putString("txtbmc1", txtbmc1);
//                    KLHbundle.putString("txtbmc2", txtbmc2);
//                    KLHbundle.putString("txtbmc3", txtbmc3);
//                    KLHbundle.putString("txtbmc4", txtbmc4);
//                    KLHbundle.putString("txtbmc5", txtbmc5);
//                    KLHbundle.putString("txtbmc6", txtbmc6);
//                    KLHbundle.putString("txtbmc7", txtbmc7);
//                    KLHbundle.putString("txtbmc8", txtbmc8);
//
//                    KLHbundle.putString("txtBMC1", txtBMC1);
//                    KLHbundle.putString("txtBMC2", txtBMC2);
//                    KLHbundle.putString("txtBMC3", txtBMC3);
//                    KLHbundle.putString("txtBMC4", txtBMC4);
//                    KLHbundle.putString("txtBMC5", txtBMC5);
//                    KLHbundle.putString("txtBMC6", txtBMC6);
//                    KLHbundle.putString("txtBMC7", txtBMC7);
//                    ///
                    KLHbundle.putString("txtKT1", txtKT1);
                    KLHbundle.putString("txtKT2", txtKT2);
                    KLHbundle.putString("txtKT3", txtKT3);
                    KLHbundle.putString("txtKT4", txtKT4);
                    KLHbundle.putString("txtKT5", txtKT5);
                    KLHbundle.putString("txtKT5", txtKT5);
                    KLHbundle.putString("txtKT6", txtKT6);
                    KLHbundle.putString("txtKT7", txtKT7);
                    KLHbundle.putString("txtKT8", txtKT8);
                    KLHbundle.putString("txtKT9", txtKT9);
                    KLHbundle.putString("txtKT10", txtKT10);
                    KLHbundle.putString("txtKT11", txtKT11);
                    KLHbundle.putString("txtKT12", txtKT12);
                    KLHbundle.putString("txtKT13", txtKT13);

                    //////////////
                    KLHbundle.putString("txt1", txt1);
                    KLHbundle.putString("txt2", txt2);
                    KLHbundle.putString("txt3", txt3);
                    KLHbundle.putString("txt4", txt4);
                    KLHbundle.putString("txt5", txt5);
                    KLHbundle.putString("txt6", txt6);



                    // LHbundle.putDouble("M4",M4 );
                    KLHintent.putExtra("KLHbundle", KLHbundle);
                    startActivity(KLHintent);

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
                    tinhDTHHGiaiDoan1();///
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
                    tinhNoiLuc5();
                    tinhNoiLuc6();
                    tinhNoiLuc7();
                    tinhBMC();
                    kiemtoan();
                    kqKiemToan();
                    tinhNeoLK();
                    // đóng gói và truyền dữ liệu
                    Intent LHintent = new Intent(nhaplieuthietke.this, KQKhongLienHop.class);
                    Bundle LHbundle = new Bundle();
                    LHbundle.putDouble("Dw",Dw);
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
                    LHbundle.putDouble("mgSIV", mgSIV);
                    LHbundle.putDouble("mgMEV2lan", mgMEV2lan);
                    LHbundle.putDouble("mgMIV", mgMIV);
                    LHbundle.putDouble("mgSIM", mgSIM);
                    LHbundle.putDouble("mgMIM", mgMIM);
                    LHbundle.putDouble("mgMEM2lan", mgMEM2lan);
                    LHbundle.putDouble("mgDTM", mgDTM);
                    LHbundle.putDouble("mgDTV", mgDTV);
                    LHbundle.putDouble("mgMEV1lan=", mgMEV1lan);
                    LHbundle.putDouble("mgDNV", mgDNV);
                    LHbundle.putDouble("mgMEM1lan", mgMEM1lan);
                    LHbundle.putDouble("mgDNM", mgDNM);
                    LHbundle.putDouble("mgPLDT", mgPLVDT);
                    LHbundle.putDouble("mgPLDN", mgPLVDN);
                    LHbundle.putDouble("M11", M11);
                    LHbundle.putDouble("M12", M12);
                    LHbundle.putDouble("M13", M13);
                    LHbundle.putDouble("M14", M14);
                    LHbundle.putDouble("M15", M15);
                    LHbundle.putDouble("M16", M16);
                    LHbundle.putDouble("M17", M17);
                    LHbundle.putDouble("M18", M18);
                    LHbundle.putDouble("Q11", Q11);
                    LHbundle.putDouble("Q12", Q12);
                    LHbundle.putDouble("Q13", Q13);
                    LHbundle.putDouble("Q14", Q14);
                    LHbundle.putDouble("Q15", Q15);
                    LHbundle.putDouble("Q16", Q16);
                    LHbundle.putDouble("Q17", Q17);
                    LHbundle.putDouble("Q18", Q18);
                    LHbundle.putDouble("f11", f11);
                    LHbundle.putDouble("f12", f12);
                    LHbundle.putDouble("f13", f13);
                    LHbundle.putDouble("f14", f14);
                    LHbundle.putDouble("f15", f15);
                    LHbundle.putDouble("f16", f16);
                    LHbundle.putDouble("f17", f17);
                    LHbundle.putDouble("f18", f18);
                    LHbundle.putDouble("f19", f19);
                    LHbundle.putDouble("f110", f110);
                    LHbundle.putDouble("f111", f111);
                    LHbundle.putDouble("f112", f112);
                    LHbundle.putDouble("f113", f113);
                    LHbundle.putDouble("f114", f114);
                    LHbundle.putDouble("f115", f115);
                    LHbundle.putDouble("f116", f116);
                    // nội lực giai đoạn 2
                    LHbundle.putDouble("M21", M21);
                    LHbundle.putDouble("M22", M22);
                    LHbundle.putDouble("M23", M23);
                    LHbundle.putDouble("M24", M24);
                    LHbundle.putDouble("M25", M25);
                    LHbundle.putDouble("M26", M26);
                    LHbundle.putDouble("M27", M27);
                    LHbundle.putDouble("M28", M28);
                    LHbundle.putDouble("Q21", Q21);
                    LHbundle.putDouble("Q22", Q22);
                    LHbundle.putDouble("Q23", Q23);
                    LHbundle.putDouble("Q24", Q24);
                    LHbundle.putDouble("Q25", Q25);
                    LHbundle.putDouble("Q26", Q26);
                    LHbundle.putDouble("Q27", Q27);
                    LHbundle.putDouble("Q28", Q28);
                    //ỨNG SUẤT GD2
                    LHbundle.putDouble("f21", f21);
                    LHbundle.putDouble("f22", f22);
                    LHbundle.putDouble("f23", f23);
                    LHbundle.putDouble("f24", f24);
                    LHbundle.putDouble("f25", f25);
                    LHbundle.putDouble("f26", f26);
                    LHbundle.putDouble("f27", f27);
                    LHbundle.putDouble("f28", f28);
                    LHbundle.putDouble("f29", f29);
                    LHbundle.putDouble("f210", f210);
                    LHbundle.putDouble("f211", f211);
                    LHbundle.putDouble("f212", f212);
                    LHbundle.putDouble("f213", f213);
                    LHbundle.putDouble("f214", f214);
                    LHbundle.putDouble("f215", f215);
                    LHbundle.putDouble("f216", f216);
                    LHbundle.putDouble("f217", f217);
                    LHbundle.putDouble("f218", f218);
                    LHbundle.putDouble("f219", f219);
                    LHbundle.putDouble("f220", f220);
                    LHbundle.putDouble("f221", f221);
                    LHbundle.putDouble("f222", f222);
                    LHbundle.putDouble("f223", f223);
                    LHbundle.putDouble("f224", f224);
                    LHbundle.putDouble("f225", f225);
                    LHbundle.putDouble("f226", f226);
                    LHbundle.putDouble("f227", f227);
                    LHbundle.putDouble("f228", f228);
                    LHbundle.putDouble("f229", f229);
                    LHbundle.putDouble("f230", f230);
                    LHbundle.putDouble("f231", f231);
                    LHbundle.putDouble("f232", f232);
                    // NỘI LỰC 1+2
                    LHbundle.putDouble("M31", M31);
                    LHbundle.putDouble("M32", M32);
                    LHbundle.putDouble("M33", M33);
                    LHbundle.putDouble("M34", M34);
                    LHbundle.putDouble("M35", M35);
                    LHbundle.putDouble("M36", M36);
                    LHbundle.putDouble("M37", M37);
                    LHbundle.putDouble("M38", M38);
                    LHbundle.putDouble("Q31", Q31);
                    LHbundle.putDouble("Q32", Q32);
                    LHbundle.putDouble("Q33", Q33);
                    LHbundle.putDouble("Q34", Q34);
                    LHbundle.putDouble("Q35", Q35);
                    LHbundle.putDouble("Q36", Q36);
                    LHbundle.putDouble("Q37", Q37);
                    LHbundle.putDouble("Q38", Q38);
                    //hoạt tải
                    LHbundle.putDouble("M41", M41);
                    LHbundle.putDouble("M42", M42);
                    LHbundle.putDouble("M43", M43);
                    LHbundle.putDouble("M44", M44);
                    LHbundle.putDouble("M45", M45);
                    LHbundle.putDouble("M46", M46);
                    LHbundle.putDouble("M47", M47);
                    LHbundle.putDouble("M48", M48);
                    LHbundle.putDouble("M49", M49);
                    LHbundle.putDouble("M410", M410);
                    LHbundle.putDouble("M411", M411);
                    LHbundle.putDouble("M412", M412);
                    LHbundle.putDouble("M413", M413);
                    LHbundle.putDouble("M414", M414);
                    LHbundle.putDouble("M415", M415);
                    LHbundle.putDouble("M416", M416);
                    LHbundle.putDouble("Q41", Q41);
                    LHbundle.putDouble("Q42", Q42);
                    LHbundle.putDouble("Q43", Q43);
                    LHbundle.putDouble("Q44", Q44);
                    LHbundle.putDouble("Q45", Q45);
                    LHbundle.putDouble("Q46", Q46);
                    LHbundle.putDouble("Q47", Q47);
                    LHbundle.putDouble("Q48", Q48);
                    LHbundle.putDouble("Q49", Q49);
                    LHbundle.putDouble("Q410", Q410);
                    LHbundle.putDouble("Q411", Q411);
                    LHbundle.putDouble("Q412", Q412);
                    LHbundle.putDouble("Q413", Q413);
                    LHbundle.putDouble("Q414", Q414);
                    LHbundle.putDouble("Q415", Q415);
                    LHbundle.putDouble("Q416", Q416);
                    LHbundle.putDouble("Q417", Q417);
                    LHbundle.putDouble("Q418", Q418);
                    LHbundle.putDouble("Q419", Q419);
                    LHbundle.putDouble("Q420", Q420);
                    LHbundle.putDouble("Q421", Q421);
                    LHbundle.putDouble("Q422", Q422);
                    LHbundle.putDouble("Q423", Q423);
                    LHbundle.putDouble("Q424", Q424);
                    LHbundle.putDouble("Q425", Q425);
                    LHbundle.putDouble("Q426", Q426);
                    LHbundle.putDouble("Q427", Q427);
                    LHbundle.putDouble("Q428", Q428);
                    LHbundle.putDouble("Q429", Q429);
                    LHbundle.putDouble("Q430", Q430);
                    LHbundle.putDouble("Q431", Q431);
                    LHbundle.putDouble("Q432", Q432);
                    LHbundle.putDouble("Q433", Q433);
                    LHbundle.putDouble("Q434", Q434);
                    LHbundle.putDouble("Q435", Q435);
                    LHbundle.putDouble("Q436", Q436);
                    LHbundle.putDouble("Q437", Q437);
                    LHbundle.putDouble("Q438", Q438);
                    LHbundle.putDouble("Q439", Q439);
                    LHbundle.putDouble("Q440", Q440);
                    LHbundle.putDouble("Q440", Q440);
                    LHbundle.putDouble("M51", M51);
                    LHbundle.putDouble("M52", M52);
                    LHbundle.putDouble("f51", f51);
                    LHbundle.putDouble("f52", f52);
                    LHbundle.putDouble("f53", f53);
                    LHbundle.putDouble("f54", f54);

                    LHbundle.putDouble("M61", M61);
                    LHbundle.putDouble("M62", M62);
                    LHbundle.putDouble("M63", M63);
                    LHbundle.putDouble("M64", M64);

                    LHbundle.putDouble("Q61", Q61);
                    LHbundle.putDouble("Q62", Q62);
                    LHbundle.putDouble("Q63", Q63);
                    LHbundle.putDouble("Q64", Q64);
                    LHbundle.putDouble("Q65", Q65);

                    LHbundle.putDouble("Q66", Q66);
                    LHbundle.putDouble("Q67", Q67);
                    LHbundle.putDouble("Q68", Q68);
                    LHbundle.putDouble("Q69", Q69);
                    LHbundle.putDouble("Q610", Q610);

                    // tổng hợp
                    LHbundle.putDouble("M71", M71);
                    LHbundle.putDouble("M72", M72);
                    LHbundle.putDouble("M73", M73);
                    LHbundle.putDouble("M74", M74);
                    LHbundle.putDouble("M75", M75);
                    LHbundle.putDouble("M76", M76);
                    LHbundle.putDouble("M77", M77);
                    LHbundle.putDouble("M78", M78);
                    LHbundle.putDouble("M79", M79);
                    LHbundle.putDouble("M710", M710);
                    LHbundle.putDouble("M711", M711);
                    LHbundle.putDouble("M712", M712);
                    LHbundle.putDouble("M713", M713);
                    LHbundle.putDouble("M714", M714);
                    LHbundle.putDouble("M715", M715);
                    LHbundle.putDouble("M716", M716);
                    LHbundle.putDouble("M717", M717);
                    LHbundle.putDouble("M718", M718);
                    LHbundle.putDouble("M719", M719);
                    LHbundle.putDouble("M720", M720);
                    LHbundle.putDouble("M721", M721);
                    LHbundle.putDouble("M722", M722);
                    LHbundle.putDouble("M723", M723);
                    LHbundle.putDouble("M724", M724);
                    LHbundle.putDouble("Q71", Q71);
                    LHbundle.putDouble("Q72", Q72);
                    LHbundle.putDouble("Q73", Q73);
                    LHbundle.putDouble("Q74", Q74);
                    LHbundle.putDouble("Q75", Q75);
                    LHbundle.putDouble("Q76", Q76);
                    LHbundle.putDouble("Q77", Q77);
                    LHbundle.putDouble("Q78", Q78);
                    LHbundle.putDouble("Q79", Q79);
                    LHbundle.putDouble("Q710", Q710);
                    LHbundle.putDouble("Q711", Q711);
                    LHbundle.putDouble("Q712", Q712);
                    LHbundle.putDouble("Q713", Q713);
                    LHbundle.putDouble("Q714", Q714);
                    LHbundle.putDouble("Q715", Q715);
                    LHbundle.putDouble("Q716", Q716);
                    LHbundle.putDouble("Q717", Q717);
                    LHbundle.putDouble("Q718", Q718);
                    LHbundle.putDouble("Q719", Q719);
                    LHbundle.putDouble("Q720", Q720);
                    LHbundle.putDouble("Q721", Q721);
                    LHbundle.putDouble("Q722", Q722);
                    LHbundle.putDouble("Q723", Q723);
                    LHbundle.putDouble("Q724", Q724);
                    LHbundle.putDouble("Q725", Q725);
                    LHbundle.putDouble("Q726", Q726);
                    LHbundle.putDouble("Q727", Q727);
                    LHbundle.putDouble("Q728", Q728);
                    LHbundle.putDouble("Q729", Q729);
                    LHbundle.putDouble("Q730", Q730);
///////////////////////////////////////////////////////////////////////////////////
                    LHbundle.putString("txtKT1", txtKT1);
                    LHbundle.putString("txtKT2", txtKT2);
                    LHbundle.putString("txtKT3", txtKT3);
                    LHbundle.putString("txtKT4", txtKT4);
                    LHbundle.putString("txtKT5", txtKT5);
                    LHbundle.putString("txtKT5", txtKT5);
                    LHbundle.putString("txtKT6", txtKT6);
                    LHbundle.putString("txtKT7", txtKT7);
                    LHbundle.putString("txtKT8", txtKT8);
                    LHbundle.putString("txtKT9", txtKT9);
                    LHbundle.putString("txtKT10", txtKT10);
                    LHbundle.putString("txtKT11", txtKT11);
                    LHbundle.putString("txtKT12", txtKT12);
                    LHbundle.putString("txtKT13", txtKT13);
                    //////////////
                    LHbundle.putString("txt1", txt1);
                    LHbundle.putString("txt2", txt2);
                    LHbundle.putString("txt3", txt3);
                    LHbundle.putString("txt4", txt4);
                    LHbundle.putString("txt5", txt5);
                    LHbundle.putString("txt6", txt6);
                    LHbundle.putString("txt7", txt7);
                    //////////
                    LHbundle.putString("txtbmc1", txtbmc1);
                    LHbundle.putString("txtbmc2", txtbmc2);
                    LHbundle.putString("txtbmc3", txtbmc3);
                    LHbundle.putString("txtbmc4", txtbmc4);
                    LHbundle.putString("txtbmc5", txtbmc5);
                    LHbundle.putString("txtbmc6", txtbmc6);
                    LHbundle.putString("txtbmc7", txtbmc7);
                    LHbundle.putString("txtbmc8", txtbmc8);

                    LHbundle.putString("txtBMC1", txtBMC1);
                    LHbundle.putString("txtBMC2", txtBMC2);
                    LHbundle.putString("txtBMC3", txtBMC3);
                    LHbundle.putString("txtBMC4", txtBMC4);
                    LHbundle.putString("txtBMC5", txtBMC5);
                    LHbundle.putString("txtBMC6", txtBMC6);
                    LHbundle.putString("txtBMC7", txtBMC7);


                    // LHbundle.putDouble("M4",M4 );
                    LHintent.putExtra("LHbundle", LHbundle);
                    startActivity(LHintent);
                }
            }
        });

    }
    public void tinhToanTCDKhongChacklh() {
      //  IstDT=Ist=IstDN=IltDT=IltDN=Inc;


        // kiểm tra bản cánh chịu nén cần bố trí STC dọc không
        Dc = D - tft - Yncd;
        if (((2.0 * Dc / tw) - 6.7 * Math.sqrt(Es / Fy)) <= 0) {
            txtKT4 = "((2.0*Dc/tw)-6.7*Math.sqrt(Es/Fy))= " + (float) Math.round((((2.0 * Dc / tw) - 6.7 * Math.sqrt(Es / Fy))) * 1000) / 1000 + " <= 0" + "\n   Độ mảnh của bản cánh chịu nén đạt, không cần bố trí STC dọc";
        } else if (((2.0 * Dc / tw) - 11.63 * Math.sqrt(Es / Fy)) <= 0) {
            txtKT4 = "((2.0*Dc/tw)-11.63*Math.sqrt(Es/Fy))= " + (float) Math.round((((2.0 * Dc / tw) - 11.63 * Math.sqrt(Es / Fy))) * 1000) / 1000 + " <= 0" + "\n   Độ mảnh của bản cánh chịu nén không đạt, cần bố trí STC dọc";
        }
        /////////////// kiểm tra độ maanhr của bản biên
        double b1;
        b1 = (Bft / (2.0 * tft)) - 1.38 * Math.sqrt(Es / (Math.abs(f220) + Math.abs(f24) * Math.sqrt(2.0 * Dc / tw)));
        if (b1 <= 0) {
            txtKT5 = "(Bft/(2.0*tft))-1.38*Math.sqrt(Es/(Math.abs(f220)+Math.abs(f24)*Math.sqrt(2.0*Dc/tw)))= " + (float) Math.round((b1) * 1000) / 1000 + " <= 0" + "\n  Kích thước bản biên thỏa";
        } else {
            txtKT5 = "(Bft/(2.0*tft))-1.38*Math.sqrt(Es/(Math.abs(f220)+Math.abs(f24)*Math.sqrt(2.0*Dc/tw)))= " + (float) Math.round((b1) * 1000) / 1000 + " > 0" + "\n  Chọn lại kích thước bản biên";
        }
        /// tính sức kháng uốn danh định CD1
        double uu;
        if (Bft * tft - Bfb * tfb < 0) {
            uu = 4.76;
        } else {
            uu = 5.67;
        }
        Fn = Fy * (1 - ((2.0 * Dc * tw / (Bft * tft)) / (1200.0 + 300.0 * 2.0 * Dc * tw / (Bft * tft))) * ((2.0 * Dc / tw) - uu * Math.sqrt(Es / (Math.abs(f220) + Math.abs(f24)))));
        if (Fn - (Math.abs(f220) + Math.abs(f24)) >= 0) {
            txtKT6 = "Fn= " + (float) Math.round((Fn) * 1000) / 1000 + " >= (Math.abs(f220)+Math.abs(f24))= " + (float) Math.round((Math.abs(f220) - Math.abs(f24)) * 1000) / 1000 + "\n   Sức kháng uốn đảm bảo";
            txt2 = "Sức kháng uốn TTGH CD1 đảm bảo";
        } else {
            txtKT6 = "Fn= " + (float) Math.round((Fn) * 1000) / 1000 + " < (Math.abs(f220)+Math.abs(f24))= " + (float) Math.round((Math.abs(f220) - Math.abs(f24)) * 1000) / 1000 + "\n   Sức kháng uốn không đảm bảo, chọn lại kích thước tiết diện";
            txt2 = "Sức kháng uốn TTGH CD1 không đảm bảo";
        }
        ///// kiểm tra lực cắt cường độ 1
        // tính c
        if ((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy) <= 0) {
            c = 1;
        } else if ((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy) > 0 && (Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy) <= 0) {
            c = (1.1 * tw / Dw) * Math.sqrt(Es * k / Fy);
        } else if ((Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy) > 0) {
            c = (1.52 / Math.pow(Dw / tw, 2)) * Es * k / Fy;
        }
        //Cường đọ chịu kéo nhỏ nhất
        try {
            d0 = Double.parseDouble(edtd0.getText().toString());
            if (d0 < 0) {
                edtd0.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtd0.setError("Hãy nhập giá trị");
        }
        ////
        Vp = 0.58 * Fy * Dw * tw * 0.001;
        if (Fu <= 0.75 * Fy) {
            Vn = Vp * (c + (0.87 * (1 - c) / Math.sqrt(1.0 + Math.pow(d0 / Dw, 2))));
        } else if (Fu > 0.75 * Fy) {
            Vn = (Math.min(1.0, 0.6 + 0.4 * (Fy - Fu) / (Fy - 0.75 * Fy)) * Vp * (c + (0.87 * (1 - c) / Math.sqrt(1 + Math.pow(d0 / Dw, 2)))));
        }
        ////
        if (Vn - c * Vp >= 0) {
            txtKT7 = "Vn= " + (float) Math.round((Vn) * 1000) / 1000 + " >= c*Vp= " + (float) Math.round((c * Vp) * 1000) / 1000 + "\n   Thỏa sức kháng cắt";
        } else {
            txtKT7 = "Vn= " + (float) Math.round((Vn) * 1000) / 1000 + " < c*Vp= " + (float) Math.round((c * Vp) * 1000) / 1000 + "\n   Không thỏa sức kháng cắt";
        }
        //////////////////////////////////////////////////////////////MỎI///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////// ứng suất nén đàn hồi lớn nhất ở bản biên chịu nén khi uốn do tác dụng của tải trọng dài hạn
        if ((2.0 * (D - tft - Yncd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) <= 0) {
            fcf = Fy;
        } else if ((2.0 * (D - tft - Yncd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) > 0) {
            fcf = 32.5 * Es * Math.pow(tw / (2 * (D - tft - Yncd)), 2);
        }
        //// tính đc fcf
        /////////////// kiểm ra fcf
        // tính ứng suất
        f = -f112 - Math.max(f228, f212) - 2 * (1000000 * Ynct * Math.max(M720klh, M724klh)) / Inc;
        ///  Toast.makeText(nhaplieuthietke.this, "f= "+f, Toast.LENGTH_LONG).show();
        // kiểm tra ứng suất
        ///kiểm tra ổn định uốn của vách đứng
        if (f - fcf <= 0) {
            txtKT8 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " <= fcf= " + fcf + "\n  Vách đứng ổn định uốn";
            // Toast.makeText(nhaplieuthietke.this,"ứng suất dầm thoả",Toast.LENGTH_LONG).show();
        } else {
            txtKT8 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " > fcf= " + fcf + "\n  Vách đứng mất ổn định uốn";
        }
        if ((((2.0 * Math.max(Q721klh, Q726klh) + Q35) / (Dw * tw)) - 0.58 * c * Fy) <= 0) {
            txtKT9 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721klh, Q726klh) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " <= 0" + "\n   Vách đứng ổn định lực cắt";
        } else {
            txtKT9 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721klh, Q726klh) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " > 0" + "\n   Vách đứng mất ổn định lực cắt";
        }
        // tính biên độ ứng suất do xe tải mỏi gây ra
        Dentaf = (Yncd * Math.max(M720klh, M724klh) * 1000000.0) / (Inc);
        // tính lượng chu kì ứng suất
        ////////// tính u1 nhịp
        if (L * 1000.0 > 12000) {
            u1 = 1;
        } else {
            u1 = 2;
        }
        ////////tính u2
        if (Bxc * 1000.0 / 3500.0 > 1 && Bxc * 1000.0 / 3500.0 < 2) {
            u2 = 1;
        } else if (Bxc * 1000.0 / 3500.0 >= 2 && Bxc * 1000.0 / 3500.0 < 3) {
            u2 = 0.85;
        } else {
            u2 = 0.8;
        }
        /// tính N
        N = 100.0 * 365.0 * u1 * u2 * 2.0 * 10000.0 * l1234;
        ///sức kháng mỏi danh định
        DentaFn = Math.max((Math.pow(ABCDE, 1. / 3.) / N), (0.5 * DentaFTH));
        if (DentaFn - Dentaf * 0.75 >= 0) {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + ">= 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi đảm bảo ";
        } else {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + "< 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Không đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi không đảm bảo ";
        }
        //////////////////////////////////////////////// SỬ DỤNG/////////////////////////////////////////////////////////
        ftDC1 = f112;
        ftDC2 = Math.max(Math.abs(f212), Math.abs(f228));
        ftLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ystt * 1000000.0 / Ist;
        ftSH = Math.max(Math.abs(f51), Math.abs(f53)) * 1.2;
        ftsum = Math.abs(ftDC1) + Math.abs(ftDC2) + Math.abs(ftLL_IM) + Math.abs(ftSH);
        /// ứng suất bản biên dưới của dầm
        fbDC1 = f116;
        fbDC2 = Math.max(Math.abs(f216), Math.abs(f232));
        fbLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ynct * 1000000.0 / Inc;
        fbSH = Math.max(Math.abs(f52), Math.abs(f54)) * 1.2;
        fbsum = Math.abs(fbDC1) + Math.abs(fbDC2) + Math.abs(fbLL_IM) + Math.abs(fbSH);
        // kiểm tra
        if (Math.max(Math.abs(ftsum), Math.abs(fbsum)) <= 0.95 * Fy) {
            txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " <= 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới đạt";
        } else {
            txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " > 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới không đạt";
        }
        /// kiểm tra độ vồng ngược
        dentaDC1 = 5.0 * Math.pow(Ls * 1000.0, 4) * DC1 / (384.0 * Es * Inc);
        dentaDC2 = 5.0 * Math.pow(Ls * 1000.0, 4) * Math.max(DC2DT, DC2DN) / (384.0 * Es * Inc);
        // độ võng do xe tải thiết kế
        dentaP35 = Math.max(mgDTM, mgDNM) * (35.0 * ((0.5 * Ls * 1000.0) + 4300.0) * (0.5 * Ls * 1000.0) * (Math.pow(Ls * 1000.0, 2) - Math.pow((0.5 * Ls * 1000.0) + 4300.0, 2) - Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Ist * Ls * Es);
        dentaP145G = Math.max(mgDTM, mgDNM) * (145.0 * Math.pow(0.5 * Ls * 1000.0, 2) * (Math.pow(Ls * 1000.0, 2) - 2.0 * Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Ist * Ls * Es);
        dentaP145S = Math.max(mgDTM, mgDNM) * (145.0 * ((0.5 * Ls * 1000.) - 4300.) * (0.5 * Ls * 1000.) * ((Math.pow(Ls * 1000., 2)) - (Math.pow((0.5 * Ls * 1000.) - 4300.0, 2)) - (Math.pow(0.5 * 1000. * Ls, 2)))) / (6.0 * Ist * Ls * Es);
        //double grjfdj=M36;
        //độ võng thiết kế
        denta1 = (dentaP35 + dentaP145G + dentaP145S) * 1.25;
        // độ võng do tổ hợp 25 xe tải thiết kế, ttl,
        denta2 = 0.25 * denta1;
        denta3 = (5. * 9.3 * Math.pow(Ls * 1000., 4) * Math.max(mgDTM, mgDNM)) / (384. * Es * Inc);
        // độ võng tổ hợp trên gây ra
        denta4 = denta2 + denta3;
        /// ///độ võng do hoạt tải
        denta5 = Math.max(denta1, denta4);
        /// độ võng cho phép của hoạt tải
        denta6 = Ls;
        ///// (float)Math.round((f)* 1000)/1000
        // kiểm tra độ võng cho phép riêng của hoạt tải
        if (denta5 < denta6) {
            txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " <= denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải ĐẠT";
            txt5 = "Độ võng riêng cho phép của hoạt tải ĐẠT";
        } else {
            txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " > denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";
            txt5 = "Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";
        }
        // ĐỘ VỒNG cần chế tạo hợp lí
        dentav = 0.5 * denta5 + dentaDC1 + dentaDC2;
        // quyết định độ vồng ngược cho tất cả các dầm
        dentafinal = dentav;
        txtKT13 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA final= " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
        txt6 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA = " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
    }

    public void tinhToanTDChacklh() {

        // momen dẻo
        Mpklh = 2.*Fy*tft*Bft*(0.5*D-0.5*tft)+2.*Fy*tw*Dw*Dw/8.;
        //     Toast.makeText(nhaplieuthietke.this,"Mp="+Mp,Toast.LENGTH_LONG).show();
        Dp = Dcp + tft + Yv + ts;
        if (Fy == 345) {
            Dphay = (0.7 * (D + ts + Yv)) / 7.5;
            beta = 0.7;
        } else if (Fy == 250) {
            Dphay = (0.9 * (D + ts + Yv)) / 7.5;
            beta = 0.9;
        }
        if (Dphay < Dp && Dp <= 5 * Dphay) {
            Mn = ((5.0 * Mpklh) - 0.85 * Myklh) / 4.0 + (((0.85 * Myklh) - Mpklh) / 4.0) * (Dp / Dphay);
            //    Toast.makeText(nhaplieuthietke.this,"Mr="+Mn,Toast.LENGTH_LONG).show();
        } else if (Dp < Dphay) {
            Mn = Mpklh;
            //    Toast.makeText(nhaplieuthietke.this,"Mr="+Mn,Toast.LENGTH_LONG).show();
        }
        // momen kháng uốn
        Mr = Mn;
        //momen uốn lớn nhất
        Mu = Math.max(M74klh, M78klh);
        // kiểm tra sức kháng uốn
        if (Mr - Math.max(M74klh, M78klh) > 0) {
            txtKT5 = "Mr= " + (float) Math.round((Mr/1000000.) * 1000) / 1000 + " >= Mu= " + (float) Math.round((Mu) * 1000) / 1000 + "\n  Thỏa điều kiện sức kháng uốn";
            txt2 = "Sức kháng uốn TTGH CD1 đảm bảo";
            //   Toast.makeText(nhaplieuthietke.this,"thỏa điều kiện sức kháng uốn",Toast.LENGTH_LONG).show();
        } else {
            txtKT5 = txtKT5 = "Mr= " + (float) Math.round((Mr) * 1000) / 1000 + " < Mu= " + (float) Math.round((Mu) * 1000) / 1000 + "\n  Không thỏa điều kiện sức kháng uốn";
            txt2 = "Sức kháng uốn TTGH CD1 không đảm bảo";
            //   Toast.makeText(nhaplieuthietke.this,"không thỏa điều kiện sức kháng uốn",Toast.LENGTH_LONG).show();
        }
        //

        //Cường đọ chịu kéo nhỏ nhất
        try {
            d0 = Double.parseDouble(edtd0.getText().toString());

            if (d0 < 0) {

                edtd0.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtd0.setError("Hãy nhập giá trị");
        }

        //tính hệ số k
        k = 5. + (5. / (Math.pow(d0 / Dw, 2)));
        // tính c
        if (((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy)) <= 0) {
            c = 1;
        } else if (((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy)) >= 0 && ((((Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy)) <= 0))) {
            c = (1.1 * tw / Dw) * (Math.sqrt(Es * k / Fy));

        } else if ((Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy) >= 0) {
            c = (1.52 / (Math.pow(Dw / tw, 2))) * (Es * k / Fy);
        }
        //
        r = Math.min(1, (0.4 * (Mr - Mu) / (Mr - 0.75 * Myklh)));

        //
        Vp = 0.58 * Fy * Dw * tw * 0.001;
        //tính sức kháng uốn
        if (Mu - 0.5 * Mpklh < 0) {
//            V1n, V2n,r, Vr;
            V1n = (0.58 * Fy * Dw * tw) * (c + ((0.87 * (1 - c)) / (Math.sqrt(1 + Math.pow(d0 / Dw, 2)))));
            Vr = V1n / 1000.;

        } else if (Mu - 0.5 * Mpklh > 0) {
            V2n = r * ((0.58 * Fy * Dw * tw) * (c + ((0.87 * (1 - c)) / (Math.sqrt(1 + Math.pow(d0 / Dw, 2))))));
            Vr = V2n / 1000.;
        }
        // kiểm tra  lực cắt
        if (Vr - Math.max(Q71klh, Q76klh) > 0) {
            txtKT6 = "Vr= " + (float) Math.round((Vr) * 1000) / 1000 + " > Vu= " + (float) Math.round((Math.max(Q71klh, Q76klh)) * 1000) / 1000 + "\n   Dầm thỏa sức kháng cắt";
            txt3 = "Sức kháng cắt TTGH CD1 đảm bảo";
        } else if ((Math.max(Q71klh, Q76klh) - c * Vp) < 0) {
            txtKT6 = "c*Vp= " + (float) Math.round((c * Vp) * 1000) / 1000+" > Vu= "+ (float) Math.round((Math.max(Q71klh, Q76klh)) * 1000) / 1000+ "\n  Dầm thỏa sức kháng cắt";
            //Toast.makeText(nhaplieuthietke.this,"dầm chịu được khả năng chịu kháng uốn",Toast.LENGTH_LONG).show();
            txt3 = "Sức kháng cắt TTGH CD1 đảm bảo";
        } else {
            txtKT6 = "Dầm không không thỏa sức kháng cắt";
            txt3 = "Sức kháng cắt TTGH CD1 không đảm bảo";
            //   Toast.makeText(nhaplieuthietke.this,"dầm không đủ khả năng chịu kháng uốn",Toast.LENGTH_LONG).show();
        }
//////////////////////////////////////////////////////////////MỎI///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////// ứng suất nén đàn hồi lớn nhất ở bản biên chịu nén khi uốn do tác dụng của tải trọng dài hạn
        if ((2.0 * (D - tft - Ystd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) <= 0) {
            fcf = Fy;
        } else if ((2.0 * (D - tft - Ystd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) > 0) {
            fcf = 32.5 * Es * Math.pow(tw / (2 * (D - tft - Ystd)), 2);
        }
        //// tính đc fcf
        /////////////// kiểm ra fcf

        // tính ứng suất
        f = -f112 - Math.max(f228, f212) - 2 * (1000000 * Ynct * Math.max(M720klh, M724klh)) / Inc;
        ///  Toast.makeText(nhaplieuthietke.this, "f= "+f, Toast.LENGTH_LONG).show();
        // kiểm tra ứng suất

        ///kiểm tra ổn định uốn của vách đứng
        if (f - fcf <= 0) {
            txtKT7 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " <= fcf= " + fcf + "\n  Vách đứng ổn định uốn";
            // Toast.makeText(nhaplieuthietke.this,"ứng suất dầm thoả",Toast.LENGTH_LONG).show();
        } else {
            txtKT7 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " > fcf= " + fcf + "\n  Vách đứng mất ổn định uốn";
        }

        if ((((2.0 * Math.max(Q721klh, Q726klh) + Q35) / (Dw * tw)) - 0.58 * c * Fy) <= 0) {
            txtKT8 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721klh, Q726klh) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " <= 0" + "\n   Vách đứng ổn định lực cắt";
        } else {
            txtKT8 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721klh, Q726klh) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " > 0" + "\n   Vách đứng mất ổn định lực cắt";
        }

        // tính biên độ ứng suất do xe tải mỏi gây ra
        Dentaf = (Yncd * Math.max(M720klh, M724klh) * 1000000.0) / Inc;
        // tính lượng chu kì ứng suất
        ////////// tính u1 nhịp
        if (L * 1000.0 > 12000) {
            u1 = 1;
        } else {
            u1 = 2;
        }
        ////////tính u2
        if (Bxc * 1000.0 / 3500.0 > 1 && Bxc * 1000.0 / 3500.0 < 2) {
            u2 = 1;
        } else if (Bxc * 1000.0 / 3500.0 >= 2 && Bxc * 1000.0 / 3500.0 < 3) {
            u2 = 0.85;
        } else {
            u2 = 0.8;
        }
        /// tính N
        N = 100.0 * 365.0 * u1 * u2 * 2.0 * 10000.0 * l1234;
        ///sức kháng mỏi danh định
        DentaFn = Math.max((Math.pow(ABCDE, 1 / 3) / N), (0.5 * DentaFTH));
        if (DentaFn - Dentaf * 0.75 >= 0) {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + ">= 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi đảm bảo ";
        } else {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + "< 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Không đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi không đảm bảo ";
        }
        //////////////////////////////////////////////// SỬ DỤNG/////////////////////////////////////////////////////////
        ftDC1 = f112;
        ftDC2 = Math.max(Math.abs(f212), Math.abs(f228));
        ftLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ynct * 1000000.0 / Inc;
        ftSH = Math.max(Math.abs(f51), Math.abs(f53)) * 1.2;
        ftsum = Math.abs(ftDC1) + Math.abs(ftDC2) + Math.abs(ftLL_IM) + Math.abs(ftSH);
        /// ứng suất bản biên dưới của dầm
        fbDC1 = f116;
        fbDC2 = Math.max(Math.abs(f216), Math.abs(f232));
        fbLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ynct * 1000000.0 / Inc;
        fbSH = Math.max(Math.abs(f52), Math.abs(f54)) * 1.2;
        fbsum = Math.abs(fbDC1) + Math.abs(fbDC2) + Math.abs(fbLL_IM) + Math.abs(fbSH);
        // kiểm tra
        if (Math.max(Math.abs(ftsum), Math.abs(fbsum)) <= 0.95 * Fy) {
            txtKT11="";
         //   txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " <= 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới đạt";
        } else {
            txtKT11="";
         //   txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " > 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới không đạt";
        }
        /// kiểm tra độ vồng ngược
        dentaDC1 = 5.0 * Math.pow(Ls * 1000.0, 4) * DC1 / (384.0 * Es * Inc);
        dentaDC2 = 5.0 * Math.pow(Ls * 1000.0, 4) * Math.max(DC2DT, DC2DN) / (384.0 * Es * Inc);
        // độ võng do xe tải thiết kế
        dentaP35 = Math.max(mgDTM, mgDNM) * (35.0 * ((0.5 * Ls * 1000.0) + 4300.0) * (0.5 * Ls * 1000.0) * (Math.pow(Ls * 1000.0, 2) - Math.pow((0.5 * Ls * 1000.0) + 4300.0, 2) - Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Inc * Ls * Es);
        dentaP145G = Math.max(mgDTM, mgDNM) * (145.0 * Math.pow(0.5 * Ls * 1000.0, 2) * (Math.pow(Ls * 1000.0, 2) - 2.0 * Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Inc * Ls * Es);
        dentaP145S = Math.max(mgDTM, mgDNM) * (145.0 * ((0.5 * Ls * 1000.) - 4300.) * (0.5 * Ls * 1000.) * ((Math.pow(Ls * 1000., 2)) - (Math.pow((0.5 * Ls * 1000.) - 4300.0, 2)) - (Math.pow(0.5 * 1000. * Ls, 2)))) / (6.0 * Inc * Ls * Es);
        //double grjfdj=M36;
        //độ võng thiết kế
        denta1 = (dentaP35 + dentaP145G + dentaP145S) * 1.25;
        // độ võng do tổ hợp 25 xe tải thiết kế, ttl,
        denta2 = 0.25 * denta1;
        denta3 = (5. * 9.3 * Math.pow(Ls * 1000., 4) * Math.max(mgDTM, mgDNM)) / (384. * Es * Inc);
        // độ võng tổ hợp trên gây ra
        denta4 = denta2 + denta3;
        /// ///độ võng do hoạt tải
        denta5 = Math.max(denta1, denta4)/1000000000000000.;
        /// độ võng cho phép của hoạt tải
        denta6 = Ls;

        ///// (float)Math.round((f)* 1000)/1000
        // kiểm tra độ võng cho phép riêng của hoạt tải
        if (denta5 < denta6) {
           // txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " <= denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải ĐẠT";
            txtKT12="";
            txt5 = "Độ võng riêng cho phép của hoạt tải ĐẠT";

        } else {
            txtKT12="";
          //  txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " > denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";
            txt5 = "Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";

        }
        // ĐỘ VỒNG cần chế tạo hợp lí
        dentav = 0.5 * denta5 + dentaDC1 + dentaDC2;
        // quyết định độ vồng ngược cho tất cả các dầm
        dentafinal = dentav;
        txtKT13 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA final= " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
        txt6 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA = " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
        //      double  x=M87;

    }
    public void kiemTraTCgiklh() {

        // kiểm tra bản bụng đặc chắc
        double x1, x2;
        x1 = (2 * Dcp / tw) - 3.76 * Math.sqrt(Es / Fy);
        x2 = (Bft / (2 * tft)) - 0.382 * Math.sqrt(Es / Fy);


        if (x2 <= 0) {
            //ok
            txtKT3 = "(Bft/(2*tft))-0.382*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x2 * 1000) / 1000 + "<= 0" + "\n   Kích thước bản biên trên đạt";

        } else {
//            Toast.makeText(nhaplieuthietke.this,"Chọn lại tiết diện bản cánh",Toast.LENGTH_LONG).show();
            txtKT3 = "(Bft/(2*tft))-0.382*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x2 * 1000) / 1000 + "> 0" + "\n   Kích thước bản biên trên không đạt";

        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // kiểm tra tiết diện CHẮC, KHÔNG CHẮC, MÃNH
        if (x1 <= 0) {
            // TIẾT DIỆN CHẮC
            tinhToanTDChacklh();
            txtKT2 = "(2*Dcp/tw)-3.76*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x1 * 1000) / 1000 + "<= 0" + "\n   Loại tiết diện Chắc";

        } else if (x1 > 0) {
            // TD ko chắc
            tinhToanTCDKhongChacklh();

            txtKT2 = "(2*Dcp/tw)-3.76*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x1 * 1000) / 1000 + "> 0" + "\n   Loại tiết diện Không Chắc";
        }

    }
    public  void  tinhMomenChayklh(){
        Myklh= Inc*Fy/(0.5*D-0.5*tft);
    }
    public void kiemtoanklh() {
        tinhMomenChayklh();
        ktTiLeCauTaoChung();
        kiemTraTCgiklh();

    }
    public void tinhNoiLuc7klh() {
        // CD1 DẦM TRONG
        M71klh = (M11 + M41 ) * 1.05;
        M72klh = (M12 + M42 ) * 1.05;
        M73klh = (M13 + M43) * 1.05;
        M74klh = (M14 + M44 ) * 1.05;

        // CD1 Dầm Ngoài
        M75klh = (M11 + M45 ) * 1.05;
        M76klh = (M12 + M46) * 1.05;
        M77klh = (M13 + M47 ) * 1.05;
        M78klh = (M14 + M48 ) * 1.05;
// SD dầm trong
        M79klh = (M15 + M49 );
        M710klh = (M16 + M410 );
        M711klh = (M17 + M411 );
        M712klh = (M18 + M412 );
        //SD dầm ngoài
        M713klh = (M15 + M413 );
        M714klh = (M16 + M414);
        M715klh = (M17 + M415 );
        M716klh = (M18 + M416 );
        // mỏi dầm trong
        M717klh = 0.75 * 1.15 * M61 * mgSIM;
        M718klh = 0.75 * 1.15 * M62 * mgSIM;
        M719klh = 0.75 * 1.15 * M63 * mgSIM;
        M720klh = 0.75 * 1.15 * M64 * mgSIM;
        //mỏi dầm ngoài
        M721klh = 0.75 * 1.15 * M61 * mgMEM1lan;
        M722klh = 0.75 * 1.15 * M62 * mgMEM1lan;
        M723klh = 0.75 * 1.15 * M63 * mgMEM1lan;
        M724klh = 0.75 * 1.15 * M64 * mgMEM1lan;

        // CD1 DẦM TRONG
        Q71klh = (Q14 + Q41) * 0.95;
        Q72klh = (Q13 + Q42) * 0.95;
        Q73klh = (Q12 + Q43) * 0.95;
        Q74klh = (Q11 + Q44) * 0.95;
        Q75klh = Q45 * 0.95;
        //CD1 DẦM NGOÀI
        Q76klh = (Q14 + Q46) * 0.95;//
        Q77klh = (Q13 + Q47) * 0.95;
        Q78klh= (Q12 + Q48) * 0.95;
        Q79klh = (Q11 + Q49) * 0.95;
        Q710klh = Q410 * 0.95;
        //sd DẦM TRONG
        Q711klh = Q18 + Q411;//
        Q712klh = Q17 + Q412;
        Q713klh = Q16 + Q413;
        Q714klh = Q15 + Q414;
        Q715klh = Q415;
        //SD DẦM NGOÀI
        Q716klh = Q18 + Q416;//
        Q717klh = Q17 + Q417;
        Q718klh = Q16 + Q418;
        Q719klh = Q15 + Q419;
        Q720klh = Q420;
        // MỎI DẦM TRONG
        Q721klh = 0.75 * 1.15 * Q61 * mgSIV;//
        Q722klh = 0.75 * 1.15 * Q62 * mgSIV;
        Q723klh = 0.75 * 1.15 * Q63 * mgSIV;
        Q724klh = 0.75 * 1.15 * Q64 * mgSIV;
        Q725klh = 0.75 * 1.15 * Q65 * mgSIV;
        // mỏi dầm ngoài
        Q726klh = 0.75 * 1.15 * Q61 * mgMEV1lan;//
        Q727klh = 0.75 * 1.15 * Q62 * mgMEV1lan;
        Q728klh = 0.75 * 1.15 * Q63 * mgMEV1lan;
        Q729klh = 0.75 * 1.15 * Q64 * mgMEV1lan;
        Q730klh = 0.75 * 1.15 * Q65 * mgMEV1lan;
    }


    public void tinhNeoLK() {
        try {
            nn = Double.parseDouble(edtnn.getText().toString());

            if (nn < 0) {

                edtnn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtnn.setError("Hãy nhập giá trị");
        }
        try {
            dneo = Double.parseDouble(edtdneo.getText().toString());

            if (dneo < 0 && dneo % 2 != 0) {

                edtdneo.setError("Lỗi: Nhập số lớn hơn 0 và số chẵn");
            }
        } catch (Exception e) {
            edtdneo.setError("Hãy nhập giá trị");
        }
        try {
            pn = Double.parseDouble(edtpn.getText().toString());

            if (pn < 0) {

                edtpn.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtpn.setError("Hãy nhập giá trị");
        }
        ///////////////// THÔNG SỐ ĐẦU VÀO///////////////////////
        /// CHIỀU CAO
        // đường kính neo
        double hneo1;
        hneo1 = Math.ceil(Math.max(4. * dneo, 50. + Yv));
        do {
            hneo1++;
        } while (!(hneo1 % 10 == 0));
        hneo = hneo1;
        //số neo tren MCN
        ////////////////////////
        mm = Math.max(.5 * (Bft - (nn - 1.) * pn + dneo), 25.);
        //        //khoảng cách của các đinh neo theo phương nghang
//        pn=150;
//        /// khoảng cách tĩnh của mép bản cánh trên và mép neo
//        mm=58;
        //đường kính mũ neo
        dmu = 35;

        ///////////////// tính toán
        double j1, j2;
        if (Ls * 1000. > 12000.0) {
            j1 = 1.;
        } else {
            j1 = 2.0;
        }
        if ((Bxc * 1000. / 3500.) > 1 && (Bxc * 1000. / 3500.) < 2) {
            j2 = 1;
        } else if ((Bxc * 1000. / 3500.) >= 2 && (Bxc * 1000. / 3500.) < 3) {
            j2 = 0.85;
        } else {
            j2 = 0.8;
        }

        anpha = 238. - 29.5 * Math.log10(100. * 365. * j1 * j2 * 2. * 10000. * l1234);
        double th = Math.log10(100. * 365. * j1 * j2 * 2. * 10000. * l1234);
        double hfd = Math.log(100. * 365. * j1 * j2 * 2. * 10000. * l1234);
        if (anpha * dneo * dneo - 19.0 * dneo * dneo >= 0) {
            Zr = anpha * dneo * dneo;
        } else {
            Zr = 19. * dneo * dneo;
        }
        Qsr = ts * bi * (Ystt + 0.5 * ts) / n;
        // Lực cắt
        //////tại gối
        V1duong = Q61 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V1am = Q66 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V1sr = V1duong + V1am;
        /// bước của neo chống cắt dọc theo trục dọc
        p1 = nn * Ist * Zr / (V1sr * Qsr);
        //////tại L/8
        V2duong = Q62 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V2am = Q67 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V2sr = V2duong + V2am;
        /// bước của neo chống cắt dọc theo trục dọc
        p2 = nn * Ist * Zr / (V2sr * Qsr);
        //////tại L/4
        V3duong = Q63 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V3am = Q68 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V3sr = V3duong + V3am;
        /// bước của neo chống cắt dọc theo trục dọc
        p3 = nn * Ist * Zr / (V3sr * Qsr);
        //////tại 3L/8
        V4duong = Q64 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V4am = Q69 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V4sr = V4duong + V4am;
        /// bước của neo chống cắt dọc theo trục dọc
        p4 = nn * Ist * Zr / (V4sr * Qsr);
        //////tại L/2
        V5duong = Q65 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V5am = Q610 * Math.max(mgSIV, mgMEV1lan) * 1.15 * 1000. * 0.75 / 1.2;
        V5sr = V5duong + V5am;
        /// bước của neo chống cắt dọc theo trục dọc
        p5 = nn * Ist * Zr / (V5sr * Qsr);
        /// lựa chọn số lượng neochoongs cắt theo TTGH CD
        Qr = Math.min((0.85 * 0.001 * 0.5 * (3.14 * dneo * dneo / 4.) * (Math.sqrt(fc * 0.043 * Math.pow(yc * 100., 1.5) * Math.sqrt(fc)))), (0.5 * (3.14 * dneo * dneo / 4.)) * Fu);
        ///Số lượng neo chống cắt bố trí ở giữa mặt cắt của mm dương lớn nhất
        Vh = Math.min((0.85 * fc * bi * ts * 0.001), (Adt * Fy));
        // số neo mỗi dầm
        nCD = 2. * Vh / Qr;
        double p12 = Math.max(p1, p2);
        double p34 = Math.max(p3, p4);
        double p1234 = Math.max(p12, p34);

        if (pn < 4. * dneo) {
            tpn = " Chọn lại khoảng cách các neo lớn hơn " + 4. * dneo + " mm";
        }else {
            tpn="";
        }
        pnew = Math.ceil(Math.max(p1234, p5));
        // số neo cuối cùng
        nneofinal = Math.ceil((Math.max(nCD, ((L * 1000. / pnew) + 1.) * nn)));
        txt7 = "Số lượng neo mỗi dầm: " + nneofinal + " neo" + "\nTheo phương dọc cầu" + "\n    Khoảng cách các neo: " + pnew + " mm" + "\nTheo phương ngang cầu" + "\n    Số lượng neo: " + nn + "\n    Khoảng cách của các đinh neo: " + pn + "mm." + tpn;
    }

    public void spinnerViTri() {
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapterViTri = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrViTri);
        adapterViTri.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnViTri.setAdapter(adapterViTri);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnViTri.setOnItemSelectedListener(new MyProcessEventViTri());
        //Class tạo sự kiện
    }

    //Class tạo sự kiện
    public class MyProcessEventViTri implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            lastedSelectedViTri = position;
            if (lastedSelectedViTri == 0) {
                l1234 = 0.2;
                //  Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            } else if (lastedSelectedViTri == 1) {
                l1234 = 0.15;
                //      Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            } else if (lastedSelectedViTri == 2) {
                l1234 = 0.15;
                //   Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();

            } else if (lastedSelectedViTri == 3) {
                l1234 = 0.15;
                //   Toast.makeText(nhaplieuthietke.this,""+l1234,Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
        //Nếu không chọn gì cả
    }

    public void spinnerLoaiThep() {
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrLoaiThep);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spnLoaiThep.setAdapter(adapter);
        //thiết lập sự kiện chọn phần tử cho Spinner
        spnLoaiThep.setOnItemSelectedListener(new MyProcessEvent());
        //Class tạo sự kiện
    }

    //Class tạo sự kiện
    public class MyProcessEvent implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            lastedSelected = position;
            if (lastedSelected == 0) {
                DentaFTH = 165;
                //  Toast.makeText(nhaplieuthietke.this,""+DentaFTH,Toast.LENGTH_LONG).show();
                ABCDE = 82;
                //  Toast.makeText(nhaplieuthietke.this,""+ABCDE,Toast.LENGTH_LONG).show();
            } else if (lastedSelected == 1) {
                DentaFTH = 110;
                ABCDE = 39.3;
                //  Toast.makeText(nhaplieuthietke.this,"DentaFTH"+DentaFTH +"\nABCDE="+ABCDE,Toast.LENGTH_LONG).show();


            } else if (lastedSelected == 2) {
                DentaFTH = 82.7;
                ABCDE = 20;
                //   Toast.makeText(nhaplieuthietke.this,"DentaFTH"+DentaFTH +"\nABCDE="+ABCDE,Toast.LENGTH_LONG).show();

            } else if (lastedSelected == 3) {
                DentaFTH = 69;

                ABCDE = 14.4;
                //    Toast.makeText(nhaplieuthietke.this,"DentaFTH"+DentaFTH +"\nABCDE="+ABCDE,Toast.LENGTH_LONG).show();
            } else if (lastedSelected == 4) {
                DentaFTH = 82.7;

                ABCDE = 14.4;
                //  Toast.makeText(nhaplieuthietke.this,"DentaFTH"+DentaFTH +"\nABCDE="+ABCDE,Toast.LENGTH_LONG).show();
            } else if (lastedSelected == 5) {
                DentaFTH = 48.3;

                ABCDE = 7.21;
                //    Toast.makeText(nhaplieuthietke.this,"DentaFTH"+DentaFTH +"\nABCDE="+ABCDE,Toast.LENGTH_LONG).show();
            } else if (lastedSelected == 6) {
                DentaFTH = 31;

                ABCDE = 3.61;
                //     Toast.makeText(nhaplieuthietke.this,"DentaFTH"+DentaFTH +"\nABCDE="+ABCDE,Toast.LENGTH_LONG).show();
            } else if (lastedSelected == 7) {
                DentaFTH = 17.9;
                ABCDE = 1.28;
                // Toast.makeText(nhaplieuthietke.this,"DentaFTH"+DentaFTH +"\nABCDE="+ABCDE,Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
        //Nếu không chọn gì cả
    }


    public void tinhBMC() {
        DCbmctt = (ts * yc / 1000.0) + (taf * yaf / 1000.0) + DClcT + DClcBT;
        //Hoạt tải
        //// chiều rộng bản chịu ảnh hưởng của bánh xe
        E = 1140.0 + 0.833 * (((B - (ndc - 1) * S) / 2.) - Blc - 300.);
        Eduong = 660.0 + 0.55 * S;
        Eam = 1220.0 + 0.25 * S;
        ///tải trọng bánh xe
        LL = (145.0 / 2.0) / ((510.0 + ts) * E / (1000.0 * 1000.0));
        LLduong = (145.0 / 2.0) / ((510.0 + ts) * Eduong / (1000.0 * 1000.0));
        LLam = (145.0 / 2.0) / ((510.0 + ts) * Eam / (1000.0 * 1000.0));
        ///tính nội lực
        ///1 bản hẫng
        double a, b, c, d;
        a = ((B - (ndc - 1.0) * S) / 2.) - Blc;
        if (Blc + 300 <= ((B - (ndc - 1.0) * S) / 2.0)) {
            b = ((B - (ndc - 1.0) * S) / 2.0) - Blc + 55.0;
        } else {
            b = 355.0 - (Blc + 300.0 - ((B - (ndc - 1.0) * S) / 2.0));
        }
        c = ((B - (ndc - 1.0) * S) / 2.0) - (Blc / 2.0);
        d = (B - (ndc - 1.0) * S) / 2.0;
        /// tính M81và Q81
        if (Blc + T >= ((B - (ndc - 1.0) * S) / 2.0)) {
            e = ((B - (ndc - 1.0) * S) / 2.0) - Blc;
            M81 = (1.25 * (ts * yc / 1000.0) * (Math.pow(d, 2) / (2.0 * Math.pow(1000.0, 2)))) + (1.25 * (DClcT + DClcBT) * c / 1000.0) + (1.5 * (taf * yaf / 1000.0) * Math.pow(a, 2) / (2.0 * Math.pow(1000, 2))) + (1.75 * PL * e * e / (2.0 * Math.pow(1000.0, 2)));
            Toast.makeText(this, "" + M81, Toast.LENGTH_LONG).show();
            Q81 = (1.25 * (ts * yc / 1000.0) * d / 1000.0) + (1.25 * (DClcBT + DClcT)) + (1.5 * (taf * yaf / 1000.0) * a / 1000.0) + (1.75 * PL * e / 1000.0);
        } else {
            e = ((B - (ndc - 1.0) * S) / 2.0) - Blc - (T / 2.0);
            M81 = (1.25 * (ts * yc / 1000.0) * (Math.pow(d, 2) / (2.0 * Math.pow(1000.0, 2)))) + (1.25 * (DClcT + DClcBT) * c / 1000.0) + (1.5 * (taf * yaf / 1000.0) * Math.pow(a, 2) / (2.0 * Math.pow(1000, 2))) + (1.75 * PL * T * e / (Math.pow(1000.0, 2)));
            Q81 = (1.25 * (ts * yc / 1000.0) * d / 1000.0) + (1.25 * (DClcBT + DClcT)) + (1.5 * (taf * yaf / 1000.0) * a / 1000.0) + (1.75 * PL * T / 1000.0);

        }
        ////tính M82
        M82 = (1.25 * (ts * yc / 1000.0) * (Math.pow(d, 2) / (2.0 * Math.pow(1000.0, 2)))) + (1.25 * (DClcT + DClcBT) * c / 1000.0) + (1.5 * (taf * yaf / 1000.0) * Math.pow(a, 2) / (2.0 * Math.pow(1000, 2))) + (1.2 * 1.75 * 1.25 * LL * (Math.pow(b, 2)) / (2.0 * Math.pow(1000.0, 2)));
        //// tính M83
        Q82 = (1.25 * (ts * yc / 1000.0) * d / 1000.0) + (1.25 * (DClcBT + DClcT)) + (1.5 * (taf * yaf / 1000.0) * a / 1000.0) + (1.2 * 1.75 * 1.25 * LL * b / 1000.0);

        double e3;
        if (Blc + T >= ((B - (ndc - 1.0) * S) / 2.0)) {
            e3 = ((B - (ndc - 1.0) * S) / 2.0) - Blc;
            M83 = ((ts * yc / 1000.0) * (Math.pow(d, 2) / (2.0 * Math.pow(1000.0, 2)))) + ((DClcT + DClcBT) * c / 1000.0) + ((taf * yaf / 1000.0) * Math.pow(a, 2) / (2.0 * Math.pow(1000, 2))) + (PL * Math.pow(e3, 2) / (2.0 * Math.pow(1000.0, 2)));
            Q83 = ((ts * yc / 1000.0) * d / 1000.0) + ((DClcBT + DClcT)) + ((taf * yaf / 1000.0) * a / 1000.0) + (PL * T / 1000.0);
        } else {
            e3 = ((B - (ndc - 1.0) * S) / 2.0) - Blc - (T / 2.0);
            M83 = ((ts * yc / 1000.0) * (Math.pow(d, 2) / (2.0 * Math.pow(1000.0, 2)))) + ((DClcT + DClcBT) * c / 1000.0) + ((taf * yaf / 1000.0) * Math.pow(a, 2) / (2.0 * Math.pow(1000, 2))) + (PL * Math.pow(e3, 1) / (1.0 * Math.pow(1000.0, 1)));
            Q83 = ((ts * yc / 1000.0) * d / 1000.0) + ((DClcBT + DClcT)) + ((taf * yaf / 1000.0) * a / 1000.0) + (PL * e / 1000.0);
        }
        // tính M84
        M84 = ((ts * yc / 1000.0) * (Math.pow(d, 2) / (2.0 * Math.pow(1000.0, 2)))) + ((DClcT + DClcBT) * c / 1000.0) + ((taf * yaf / 1000.0) * Math.pow(a, 2) / (2.0 * Math.pow(1000, 2))) + (1.2 * 1.25 * LL * (Math.pow(b, 2)) / (2.0 * Math.pow(1000.0, 2)));
        Q84 = ((ts * yc / 1000.0) * d / 1000.0) + ((DClcBT + DClcT)) + ((taf * yaf / 1000.0) * a / 1000.0) + (1.2 * 1.25 * LL * b / 1000.0);
        // tính M85
        if (S > 710.0) {
            M85 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + (1.2 * 1.25 * LLduong * ((0.5 * (0.5 * S - 355.0) + 0.25 * S) * 355.0 / Math.pow(1000.0, 2)));
        } else {
            M85 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + (1.2 * 1.25 * LLduong * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2));
        }
        // tính Q85
        if (S > 2510.0) {
            Q85 = ((ts * yc / 1000.0) * 0.5 * S / 1000.0) + ((taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * LLam * ((4.0 * S - 5020.0) * 710.0 / (S * 2000.0)));
        } else if (S > 1800.0 && S <= 2510.0) {
            Q85 = ((ts * yc / 1000.0) * 0.5 * S / 1000.0) + ((taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * LLam * (((2.0 * S - 710.0) * 710.0 / (S * 2000.0)) + (0.5 * Math.pow(S - 1800.0, 2) / (1000.0 * S))));
        } else if (S <= 1800.0) {
            Q85 = ((ts * yc / 1000.0) * 0.5 * S / 1000.0) + ((taf * yaf / 1000.0) * 0.5 * S / 1000.0);
        }
        //// tính M86
        if (S > 1910.0) {
            M86 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + (1.25 * LLduong * ((0.5 * S - 600.0) * 710.0 / Math.pow(1000.0, 2)));
        } else {
            M86 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + (1.25 * LLduong * (0.5 * Math.pow(0.5 * S - 245.0, 2) / Math.pow(1000.0, 2)));
        }
        // tính Q86
        if (S > 1910.0) {
            Q86 = ((ts * yc / 1000.0) * 0.5 * S / 1000.0) + ((taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * LLam * (((4.0 * S - 3820.0) * 710.0 / (S * 2000.0))));
        } else if (S > 1200.0 && S <= 1910.0) {
            Q86 = ((ts * yc / 1000.0) * 0.5 * S / 1000.0) + ((taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * LLam * (((2.0 * S - 710.0) * 710.0 / (S * 2000.0)) + (0.5 * Math.pow(S - 1200.0, 2) / (1000.0 * S))));
        } else if (S <= 1200.0) {
            Q86 = ((ts * yc / 1000.0) * 0.5 * S / 1000.0) + ((taf * yaf / 1000.0) * 0.5 * S / 1000.0);
        }
        /// Tính M87
        if (S > 2510.0) {
            M87 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + (1.2 * 1.25 * LLduong * ((0.5 * S - 900.0) * 710.0 / Math.pow(1000.0, 2)));

        } else if (S > 1090.0 && S <= 2510.0) {
            M87 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + (1.2 * 1.25 * LLduong * (0.5 * Math.pow(0.5 * S - 545.0, 2)) / Math.pow(1000.0, 2));
        } else if (S <= 1090.0) {
            M87 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2))) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) * (1.0 / Math.pow(1000.0, 2)));
        }
        if (S > 2510.0) {
            Q87 = (1.25 * (ts * yc / 1000.0) * 0.5 * S / 1000.0) + (1.5 * (taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * 1.75 * LLam * (((4.0 * S - 5020.0) * 710.0 / (S * 2000.0))));
        } else if (S > 1800.0 && S <= 2510.0) {
            Q87 = (1.25 * (ts * yc / 1000.0) * 0.5 * S / 1000.0) + (1.5 * (taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * 1.75 * LLam * (((2.0 * S - 710.0) * 710.0 / (S * 2000.0)) + (0.5 * Math.pow(S - 1800.0, 2) / (1000.0 * S))));
        } else if (S <= 1800.0) {
            Q87 = (1.25 * (ts * yc / 1000.0) * 0.5 * S / 1000.0) + (1.5 * (taf * yaf / 1000.0) * 0.5 * S / 1000.0);
        }
        /// tính M88 tính Q88
        if (S > 710.0) {
            M88 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLduong * ((0.5 * (0.5 * S - 355.0) + 0.25 * S) * 355.0 / Math.pow(1000.0, 2)));
        } else if (S <= 710.0) {
            M88 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLduong * ((Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)));
        }
        if (S > 1910) {
            Q88 = (1.25 * (ts * yc / 1000.0) * 0.5 * S / 1000.0) + (1.5 * (taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * 1.75 * LLam * (((4.0 * S - 3820.0) * 710.0 / (S * 2000.0))));
        } else if (S > 1200.0 && S <= 1910.0) {
            Q88 = (1.25 * (ts * yc / 1000.0) * 0.5 * S / 1000.0) + (1.5 * (taf * yaf / 1000.0) * 0.5 * S / 1000.0) + (1.2 * 1.25 * 1.75 * LLam * (((2.0 * S - 710.0) * 710.0 / (S * 2000.0)) + (0.5 * Math.pow(S - 1200.0, 2) / (1000.0 * S))));
        } else if (S <= 1200.0) {
            Q88 = (1.25 * (ts * yc / 1000.0) * 0.5 * S / 1000.0) + (1.5 * (taf * yaf / 1000.0) * 0.5 * S / 1000.0);
        }
        //tính M89
        if (S > 1910.0) {
            M89 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.75 * 1.25 * LLduong * ((0.5 * S - 600.0) * 710.0 / Math.pow(1000.0, 2)));
        } else {
            M89 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.75 * 1.25 * LLduong * (0.5 * Math.pow(0.5 * S - 245.0, 2) / Math.pow(1000.0, 2)));
        }
        /// tính M810
        if (S > 2510.0) {
            M810 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLduong * ((0.5 * S - 900.0) * 710.0 / Math.pow(1000.0, 2)));
        } else if (S > 1090.0 && S <= 2510.0) {
            M810 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLduong * (0.5 * Math.pow(0.5 * S - 545.0, 2) / Math.pow(1000.0, 2)));
        } else if (S <= 1090.0) {
            M810 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2));
        }
        // tính M811
        if (S > 710.0) {
            M811 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.25 * LLam * ((0.5 * (0.5 * S - 355.0) + 0.25 * S) * 355.0 / Math.pow(1000.0, 2)));
        } else {
            M811 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.25 * LLam * ((Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)));
        }
        // tính M812
        if (S > 1910.0) {
            M812 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.25 * LLam * ((0.5 * S - 600.0) * 710.0 / Math.pow(1000.0, 2)));
        } else {
            M812 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.25 * LLam * (0.5 * Math.pow(0.5 * S - 245.0, 2) / Math.pow(1000.0, 2)));
        }
        //tính M813
        if (S > 2510.0) {
            M813 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.25 * LLam * ((0.5 * S - 900.0) * 710.0 / Math.pow(1000.0, 2)));
        } else if (S > 1090.0 && S <= 2510.0) {
            M813 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.25 * LLam * (0.5 * Math.pow(0.5 * S - 545.0, 2) / Math.pow(1000.0, 2)));
        } else if (S <= 1090.0) {
            M813 = ((ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + ((taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2));
        }
        /// tính M814
        if (S > 710.0) {
            M814 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLam * ((0.5 * (0.5 * S - 355.0) + 0.25 * S) * 355.0 / Math.pow(1000.0, 2)));
        } else {
            M814 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLam * ((Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)));
        }
        // tính M15
        if (S > 1910.0) {
            M815 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.75 * 1.25 * LLam * ((0.5 * S - 600.0) * 710.0 / Math.pow(1000.0, 2)));
        } else {
            M815 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.75 * 1.25 * LLam * (0.5 * Math.pow(0.5 * S - 245.0, 2) / Math.pow(1000.0, 2)));
        }
        // tính M816
        if (S > 2510.0) {
            M816 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLam * ((0.5 * S - 900.0) * 710.0 / Math.pow(1000.0, 2)));
        } else if (S > 1090.0 && S <= 2510.0) {
            M816 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.2 * 1.75 * 1.25 * LLam * (0.5 * Math.pow(0.5 * S - 545.0, 2) / Math.pow(1000.0, 2)));
        } else if (S <= 1090.0) {
            M816 = (1.25 * (ts * yc / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2)) + (1.5 * (taf * yaf / 1000.0) * (Math.pow(S, 2) / 8.0) / Math.pow(1000.0, 2));
        }
        //// tổng kết nội lực BMC bản kiểu DẦM
        /// Sử dụng
        // M 0,5L
        m821 = Math.max(M85, M86);
        M821 = 0.5 * Math.max(m821, M87);
        // gối
        m822 = Math.max(M811, M812);
        M822 = 0.8 * Math.max(m822, M813);
        // lực cắt
        Q821 = Math.max(Q85, Q86);
        ////// CD1
        // L/2
        m823 = Math.max(M88, M89);
        M823 = 0.5 * Math.max(m823, M810);
        // gối
        m824 = Math.max(M814, M815);
        M824 = 0.8 * Math.max(m824, M816);
        // lực cắt
        Q822 = Math.max(Q87, Q88);
        //////////// tổng hợp nội lực bản hẫng
        /// Sử dụng
        M825 = Math.max(M83, M84);
        Q823 = Math.max(Q83, Q84);
        // CD1
        M826 = Math.max(M81, M82);
        Q824 = Math.max(Q81, Q82);
        ///// 4. tính toán bà kiểm tra BM theo TTGH CD!
        // bố trí cốt thép chịu momen âm của MBC và kiểm toán theo TTGH CD1
        /////////////////////////////////////////////
        // tính các thông số
        ////////////////////////////////////////////

        Mt = (1.+ DuThuaBMC/100.)*Math.max(M824, M826);
        // biến đã có beta1,
        ////// biến nhập vào Dtt Dbaove_t

        // khoảng cách từ tim cốt thép lưới trên của BMC
        St = Dbaove_t + 0.5 * Dtt;

        // hệ số chuyển đổi biểu đồ ứng suất
        if (fc <= 28) {
            beta1 = 0.85;
        } else if (fc > 28) {
            double beta11 = 0.85 - ((fc - 28.) / 7.) * 0.05;
            if (beta11 >= 0.65) {
                beta1 = 0.85 - ((fc - 28.) / 7.) * 0.05;
            } else {
                beta1 = 0.65;
            }
        }
        /// Số thanh cốt thép - phương trình bậc 2

        ///fy= 400
        A1 = (0.5 * 400. * 400. * Math.pow((3.14 * Dtt * Dtt / 4.), 2)) / (0.85 * fc * 1000.);
        B1 = -(3.14 * Dtt * Dtt / 4.) * 400. * (ts - St);
        C1 = Mt * 1000000.;
        Denta1 = B1 * B1 - 4. * A1 * C1;

        if ((Denta1 > 0)) {
            X1 = (-B1 + Math.sqrt(Denta1)) / (2. * A1);
            X2 = (-B1 - Math.sqrt(Denta1)) / (2. * A1);
        } else if (Denta1 == 0) {
            X1 = X2 = -B1 / (2. * A1);

        }
        N1 = Math.ceil(Math.min(X1, X2));

        do {
            // kiểm tra lượng cốt thép tối đa
            cc1 = (N1 * 3.14 * Dtt * Dtt * 400. / 4.) / (0.85 * fc * beta1 * 1000.);
            de1 = ts - St;
            // thé tối thiểu
            romin1 = (N1 * (3.14 * Dtt * Dtt / 4.)) / (1000. * ts);
            // cự li tối đa
            Stbmc = 1000. / N1;
            N1++;
        }

        while ((!((cc1 / de1) <= 0.42 && romin1 >= (0.03 * fc / 400.)) && !(Stbmc <= Math.min(1.5 * ts, 450.))));
        /////
        N1new = N1;
        txtbmc1 = "Số thanh cốt thép chịu lực lưới trên: " + N1new + " thanh, đường kính: " + Dtt + " mm";

        ///bố trí thép chịu momen dươngMd

        Md = (1.+DuThuaBMC/100.)*M823;

        // khoảng cách tim cốt thép lưới trên đến mép trên BMC
        Sd = Dbaove_d + 0.5 * Dtd;
        //hệ số chuyển đổi biểu đồ ứng suất

        ///fy= 400
        A2 = (0.5 * 400. * 400. * Math.pow((3.14 * Dtd * Dtd / 4.), 2)) / (0.85 * fc * 1000.);
        B2 = -(3.14 * Dtd * Dtd / 4.) * 400. * (ts - Sd);
        C2 = Md * 1000000.;
        Denta2 = B2 * B2 - 4. * A2 * C2;
        ///giải hệ phương trình nghiệm X3 X4
        if ((Denta2 > 0)) {
            X3 = (-B2 + Math.sqrt(Denta2)) / (2. * A2);
            X4 = (-B2 - Math.sqrt(Denta2)) / (2. * A2);
        } else if (Denta2 == 0) {
            X3 = X4 = -B2 / (2. * A2);
        }
        N2 = Math.ceil(Math.min(X3, X4));
        do {
            // kiểm tra lượng cốt thép tối đa
            cc2 = (N2 * 3.14 * Dtd * Dtd * 400. / 4.) / (0.85 * fc * beta1 * 1000.);
            de2 = ts - Sd;
            // thé tối thiểu
            romin2 = (N2 * (3.14 * Dtd * Dtd / 4.)) / (1000. * ts);
            // cự li tối đa
            Sdbmc = 1000. / N2;
            N2++;
        }

        while ((!((cc2 / de2) <= 0.42 && romin2 >= (0.03 * fc / 400.)) && !(Sdbmc <= Math.min(1.5 * ts, 450.))));
        /////
        N2new = N2;
        txtbmc2 = "Số thanh cốt thép chịu lực lưới dưới: " + N2new + " thanh, đường kính: " + Dtd + " mm";
        // kiểm tra BMC theo TTGH sử dụng ( kiểm toán nứt)
        ///// với momen dương

        /// momen tĩnh
        Sbmc = (1000. * ts * 0.5 * ts) + ((Es / Ec) * N2 * (3.14 * Dtd * Dtd / 4.) * Sd) + ((Es / Ec) * N1 * (3.14 * Dtt * Dtt / 4.) * (ts - St));
        /// diện tích mặt cắt
        Abmc = (1000. * ts) + ((Es / Ec) * N2 * (3.14 * Dtd * Dtd / 4.)) + ((Es / Ec) * N1 * (3.14 * Dtt * Dtt / 4.));
        // kc từ trục trung hòa đến mép dưới mặt cắt
        Yd = Sbmc / Abmc;
        // momen quan tính của mặt cắt
        I = ((1000. * ts * ts * ts / 12.) + 1000. * ts * (Math.pow(Yd - (ts / 2.), 2))) + (Es / Ec) * ((N2 * (3.14 * Dtd * Dtd / 4.) * Math.pow(Yd - Sd, 2)) + (N1 * (3.14 * Dtt * Dtt / 4.) * Math.pow(ts - Yd - St, 2)));
        // ứng suất trong cốt thép dưới bàn
        Fs_d = (Es / Ec) * (M821 * 1000000. * (Yd - Sd) / I);
        // tính ứng suất kéo trong CT thường ở TTGH sử dụng
        Asd_d = 2. * 1000. * Sd / N2;
        if (Dbaove_d + 0.5 * Dtd <= 50.) {
            Dc_sdd = Dbaove_d + 0.5 * Dtd;
        } else {
            Dc_sdd = 50.;
        }

        Fsa_d = Z / (Math.pow(Dc_sdd * Asd_d, 1.0 / 3.));
        txtBMC1= "\n Momen thớ trên Mt= "+(float) Math.round((Mt) * 1000) / 1000+
                "\n Khoảng cách từ tim cốt thép lưới trên BMC St= "+(float) Math.round((St) * 1000) / 1000+
                "\n Momen thớ trên Md= "+(float) Math.round((Md) * 1000) / 1000+
                "\n Khoảng cách từ tim cốt thép lưới trên BMC Sd= "+(float) Math.round((Sd) * 1000) / 1000+" mm"+
                "\n Momen tĩnh đối với BMC Sbmc= "+(float) Math.round((Abmc) * 1000) / 1000+" mm^3"+
                "\n KC từ TTH đến mép dưới mặt cắt Yd= "+(float) Math.round((Sd) * 1000) / 1000+" mm"+
                "\n Momen quán tính của mặt cắt I= "+(float) Math.round((I) * 1000) / 1000+ " mm^4"+
                "\n Ứng suất trong cốt thép dưới BMC Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000+ ""+
                "\n Ứng suất kéo trong CT thường ở TTGH sử dụng Asd_d= "+(float) Math.round((Asd_d) * 1000) / 1000+
                "\n Ứng suất Fsa_d= "+(float) Math.round((Fsa_d) * 1000) / 1000;
        if (Fs_d <= Fsa_d && Fs_d <= 0.6 * 400.) {
            //// ok
            txtbmc3 = "Kiểm toán nứt momen dương đảm bảo";
            txtBMC2="Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000+" <= "+(float) Math.round((Fsa_d) * 1000) / 1000
                    +" && Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000 +" <="+ 0.6*400.+
                    "\n   Kiểm toán nứt momen dương đảm bảo";
        } else if (Fs_d > Fsa_d && Fs_d <= 0.6 * 400.) {
            //// ko
            txtbmc3 = "Kiểm toán nứt momen dương không đảm bảo";
            txtBMC2="Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000+" > "+(float) Math.round((Fsa_d) * 1000) / 1000
                    +" && Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000 +" <="+ 0.6*400.+
                    "\n   Kiểm toán nứt momen dương không đảm bảo";
        } else if (Fs_d <= Fsa_d && Fs_d > 0.6 * 400.) {
            ////ko
            txtbmc3 = "Kiểm toán nứt momen dương không đảm bảo";
            txtBMC2="Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000+" <= "+(float) Math.round((Fsa_d) * 1000) / 1000
                    +" && Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000 +" >"+ 0.6*400.+
                    "\n   Kiểm toán nứt momen dương không đảm bảo";
        } else if (Fs_d > Fsa_d && Fs_d > 0.6 * 400.) {
            /// ko
            txtbmc3 = "Kiểm toán nứt momen dương không đảm bảo";
            txtBMC2="Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000+" > "+(float) Math.round((Fsa_d) * 1000) / 1000
                    +" && Fs_d= "+(float) Math.round((Fs_d) * 1000) / 1000 +" >"+ 0.6*400.+
                    "\n   Kiểm toán nứt momen dương không đảm bảo";
        }
        /////////// kiểm tra nứt momen âm

        /// KCtuwf trục trung hòa đến mép trên mặt cắt
        Yt = ts - Yd;
        //ứng suất trong CT ở mép trên bản
        Fs_t = (Es / Ec) * (Math.max(M825, M822) * 1000000. * Yt / I);
        // ứng suất kéo trong cốt thép thường ở TTGH sử dụng
        if (Dbaove_t + 0.5 * Dtt <= 50.) {
            Dc_sdt = Dbaove_t + 0.5 * Dtt;
        } else {
            Dc_sdt = 50.;
        }
        Asd_t = 2. * 1000. * St / N1;
        Fsa_t = Z / (Math.pow((Dc_sdt * Asd_t), 1. / 3.));
        txtBMC3="KC từ TTH đến mép dưới mặt cắt Yt= "+(float) Math.round((Yt) * 1000) / 1000+
                "\n Ứng suất trong cốt thép trên BMC Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000+
                "\n Dc_sdt= "+(float) Math.round((Dc_sdt) * 1000) / 1000+
                "\n Ứng suất kéo trong CT thường ở TTGH sử dụng Asd_t= "+(float) Math.round((Asd_t) * 1000) / 1000+
                "\n Ứng suất Fsa_t= "+(float) Math.round((Fsa_t) * 1000) / 1000;
        if (Fs_t <= Fsa_t && Fs_t <= 0.6 * 400.) {
            //// ok
            txtbmc4 = "Kiểm toán nứt momen âm đảm bảo";
            txtBMC4="Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000+" <= "+(float) Math.round((Fsa_t) * 1000) / 1000
                    +" && Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000 +" <= "+ 0.6*400.+
                    "\n   Kiểm toán nứt momen âm đảm bảo";
        } else if (Fs_t > Fsa_t && Fs_t <= 0.6 * 400.) {
            //// ko
            txtbmc4 = "Kiểm toán nứt momen âm không đảm bảo";
            txtBMC4="Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000+" > "+(float) Math.round((Fsa_t) * 1000) / 1000
                    +" && Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000 +" <= "+ 0.6*400.+
                    "\n   Kiểm toán nứt momen không âm đảm bảo";
        } else if (Fs_t <= Fsa_t && Fs_t > 0.6 * 400.) {
            ////ko
            txtbmc4 = "Kiểm toán nứt momen âm không đảm bảo";
            txtBMC4="Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000+" <= "+(float) Math.round((Fsa_t) * 1000) / 1000
                    +" && Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000 +" > "+ 0.6*400.+
                    "\n   Kiểm toán nứt momen không âm đảm bảo";
        } else if (Fs_t > Fsa_t && Fs_t > 0.6 * 400.) {
            /// ko
            txtbmc4 = "Kiểm toán nứt momen âm không đảm bảo";
            txtBMC4="Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000+" > "+(float) Math.round((Fsa_t) * 1000) / 1000
                    +" && Fs_t= "+(float) Math.round((Fs_t) * 1000) / 1000 +" >"+ 0.6*400.+
                    "\n   Kiểm toán nứt momen không âm đảm bảo";
        }
        //4.4. CT lưới dưới cấu tạo
        if (3840. / Math.sqrt(Sbmc - tw) <= 67.) {
            C = 3840. / Math.sqrt(Sbmc - tw);
        } else {
            C = 67.;
        }
        As_ctd = (C / 100.) * N2 * (3.14 * Dtd * Dtd / 4.);
        txtBMC5=" As_ctd= "+(float) Math.round((As_ctd) * 1000) / 1000;

        N3 = Math.ceil((4. * As_ctd) / (3.14 * Dtd_ct * Dtd_ct));
        txtbmc5 = "Số thanh cốt thép lưới dưới cấu tạo phân bố theo dọc cầu: " + N3 + " thanh, đường kính: " + Dtt_ct + " mm";

        //
        ///4.5 cốt thép lưới trên cấu tạo
        N4 = Math.ceil(0.75 * (Sbmc * ts / 400.) * (4. / (3.14 * Dtt_ct * Dtt_ct)));
        do {
            St_ct = Sbmc / N4;
            N4++;
        }

        while (!(St_ct <= Math.min(3. * ts, 450.)));
        N4new = N4;
        txtbmc6 = "Số thanh cốt thép lưới trên cấu tạo phân bố theo dọc cầu: " + N4new + " thanh, đường kính: " + Dtd_ct + " mm";
        txtBMC6="Số thanh cốt thép lưới dưới cấu tạo phân bố theo dọc cầu"+
                "\n N3 =(4. * As_ctd) / (3.14 * Dtd_ct * Dtd_ct)= "+
                (float) Math.round((Math.ceil((4. * As_ctd) / (3.14 * Dtd_ct * Dtd_ct))) * 1000) / 1000+
                "Số thanh cốt thép lưới trên cấu tạo phân bố theo dọc cầu"+
                "\n N4 =0.75 * (Sbmc * ts / 400.) * (4. / (3.14 * Dtt_ct * Dtt_ct))= "+
                (float) Math.round((Math.ceil(0.75 * (Sbmc * ts / 400.) * (4. / (3.14 * Dtt_ct * Dtt_ct)))) * 1000) / 1000;

        /// 4.6. kiểm tra theo điều kiện kháng cắt
        //// sức kháng cắt danh ssinhj

        dv = Math.max(0.9 * (ts - Sd), 0.72 * ts);
        V1n_bmc = 0.25 * fc * 1000. * dv * 1. / 1000.;
        Vc_bmc = 0.083 * 2. * Math.sqrt(fc) * 1000. * dv * 1. / 1000.;
        txtbmc7= "Sức kháng cắt danh định của BMC Vn= "+(float) Math.round((V1n_bmc) * 1000) / 1000+" kN" ;
        txtBMC7="V1n_bmc = 0.25*fc*1000*dv*1/1000= "+(float) Math.round((V1n_bmc) * 1000) / 1000+
                "\nVc_bmc = 0.083*2*Math.sqrt(fc)*1000*dv*1/1000= "+(float) Math.round((Vc_bmc) * 1000) / 1000;


        //        txtKT10= "M81= "+M81+"\nM82= "+M82+"\nM83= "+M83+"\nM84= "+M84+"\nM85= "+M85+"\nM86= "+M86 +"\nM87= "+M87+"\nM88= "+M88+"\nM89= "+M89+"\nM810= "+M810+"\nM811= "+M811+"\nM812= "+M812+"\nM813= "+M813+"\nM814= "+M814+"\nM815= "+M815+"\nM816= "+M816
//        +"\nQ81= "+Q81  +"\nQ82= "+Q82  +"\nQ83= "+Q83  +"\nQ84= "+Q84  +"\nQ85= "+Q85  +"\nQ86= "+Q86  +"\nQ87= "+Q87  +"\nQ88= "+Q88+"\nM821= "+M821+"\nM822= "+M822+"\nM823= "+M823+"\nM824= "+M824+"\nM825= "+M825+"\nM826= "+M826+"\nQ821= "+Q821+"\nQ822= "+Q822+"\nQ823= "+Q823+"\nQ824= "+Q824;
    }



    public void kqKiemToan() {
        // txt1
        double t, x2;
        x2 = (Bft / (2 * tft)) - 0.382 * Math.sqrt(Es / Fy);
        t = (tfb * Bfb * Bfb * Bfb / 12) / ((tfb * Bfb * Bfb * Bfb / 12) + (Dw * tw * tw * tw / 12) + (tft * Bft * Bft * Bft / 12));
        if (t >= 0.1 && t <= 0.9 && x2 <= 0) {
            txt1 = "Kích thước bản biên dưới và trên đạt";
        } else if (t > 0.9 && x2 <= 0) {
            txt1 = "Kích thước bản biên dưới và trên đạt";
        } else {
            txt1 = "Kích thước bản biên dưới và trên không đạt";
        }
    }

    public void tinhToanTCDKhongChac() {
        // kiểm tra bản cánh chịu nén cần bố trí STC dọc không
        Dc = D - tft - Yltd;
        if (((2.0 * Dc / tw) - 6.7 * Math.sqrt(Es / Fy)) <= 0) {
            txtKT4 = "((2.0*Dc/tw)-6.7*Math.sqrt(Es/Fy))= " + (float) Math.round((((2.0 * Dc / tw) - 6.7 * Math.sqrt(Es / Fy))) * 1000) / 1000 + " <= 0" + "\n   Độ mảnh của bản cánh chịu nén đạt, không cần bố trí STC dọc";
        } else if (((2.0 * Dc / tw) - 11.63 * Math.sqrt(Es / Fy)) <= 0) {
            txtKT4 = "((2.0*Dc/tw)-11.63*Math.sqrt(Es/Fy))= " + (float) Math.round((((2.0 * Dc / tw) - 11.63 * Math.sqrt(Es / Fy))) * 1000) / 1000 + " <= 0" + "\n   Độ mảnh của bản cánh chịu nén không đạt, cần bố trí STC dọc";
        }
        /////////////// kiểm tra độ maanhr của bản biên
        double b1;
        b1 = (Bft / (2.0 * tft)) - 1.38 * Math.sqrt(Es / (Math.abs(f220) + Math.abs(f24) * Math.sqrt(2.0 * Dc / tw)));
        if (b1 <= 0) {
            txtKT5 = "(Bft/(2.0*tft))-1.38*Math.sqrt(Es/(Math.abs(f220)+Math.abs(f24)*Math.sqrt(2.0*Dc/tw)))= " + (float) Math.round((b1) * 1000) / 1000 + " <= 0" + "\n  Kích thước bản biên thỏa";
        } else {
            txtKT5 = "(Bft/(2.0*tft))-1.38*Math.sqrt(Es/(Math.abs(f220)+Math.abs(f24)*Math.sqrt(2.0*Dc/tw)))= " + (float) Math.round((b1) * 1000) / 1000 + " > 0" + "\n  Chọn lại kích thước bản biên";
        }
        /// tính sức kháng uốn danh định CD1
        double uu;
        if (Bft * tft - Bfb * tfb < 0) {
            uu = 4.76;
        } else {
            uu = 5.67;
        }
        Fn = Fy * (1 - ((2.0 * Dc * tw / (Bft * tft)) / (1200.0 + 300.0 * 2.0 * Dc * tw / (Bft * tft))) * ((2.0 * Dc / tw) - uu * Math.sqrt(Es / (Math.abs(f220) + Math.abs(f24)))));
        if (Fn - (Math.abs(f220) + Math.abs(f24)) >= 0) {
            txtKT6 = "Fn= " + (float) Math.round((Fn) * 1000) / 1000 + " >= (Math.abs(f220)+Math.abs(f24))= " + (float) Math.round((Math.abs(f220) - Math.abs(f24)) * 1000) / 1000 + "\n   Sức kháng uốn đảm bảo";
            txt2 = "Sức kháng uốn TTGH CD1 đảm bảo";
        } else {
            txtKT6 = "Fn= " + (float) Math.round((Fn) * 1000) / 1000 + " < (Math.abs(f220)+Math.abs(f24))= " + (float) Math.round((Math.abs(f220) - Math.abs(f24)) * 1000) / 1000 + "\n   Sức kháng uốn không đảm bảo, chọn lại kích thước tiết diện";
            txt2 = "Sức kháng uốn TTGH CD1 không đảm bảo";
        }
        ///// kiểm tra lực cắt cường độ 1
        // tính c
        if ((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy) <= 0) {
            c = 1;
        } else if ((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy) > 0 && (Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy) <= 0) {
            c = (1.1 * tw / Dw) * Math.sqrt(Es * k / Fy);
        } else if ((Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy) > 0) {
            c = (1.52 / Math.pow(Dw / tw, 2)) * Es * k / Fy;
        }
        //Cường đọ chịu kéo nhỏ nhất
        try {
            d0 = Double.parseDouble(edtd0.getText().toString());
            if (d0 < 0) {
                edtd0.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtd0.setError("Hãy nhập giá trị");
        }
        ////
        Vp = 0.58 * Fy * Dw * tw * 0.001;
        if (Fu <= 0.75 * Fy) {
            Vn = Vp * (c + (0.87 * (1 - c) / Math.sqrt(1.0 + Math.pow(d0 / Dw, 2))));
        } else if (Fu > 0.75 * Fy) {
            Vn = (Math.min(1.0, 0.6 + 0.4 * (Fy - Fu) / (Fy - 0.75 * Fy)) * Vp * (c + (0.87 * (1 - c) / Math.sqrt(1 + Math.pow(d0 / Dw, 2)))));
        }
        ////
        if (Vn - c * Vp >= 0) {
            txtKT7 = "Vn= " + (float) Math.round((Vn) * 1000) / 1000 + " >= c*Vp= " + (float) Math.round((c * Vp) * 1000) / 1000 + "\n   Thỏa sức kháng cắt";
        } else {
            txtKT7 = "Vn= " + (float) Math.round((Vn) * 1000) / 1000 + " < c*Vp= " + (float) Math.round((c * Vp) * 1000) / 1000 + "\n   Không thỏa sức kháng cắt";
        }
        //////////////////////////////////////////////////////////////MỎI///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////// ứng suất nén đàn hồi lớn nhất ở bản biên chịu nén khi uốn do tác dụng của tải trọng dài hạn
        if ((2.0 * (D - tft - Ystd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) <= 0) {
            fcf = Fy;
        } else if ((2.0 * (D - tft - Ystd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) > 0) {
            fcf = 32.5 * Es * Math.pow(tw / (2 * (D - tft - Ystd)), 2);
        }
        //// tính đc fcf
        /////////////// kiểm ra fcf
        // tính ứng suất
        f = -f112 - Math.max(f228, f212) - 2 * (1000000 * YlttDT * Math.max(M720, M724)) / IltDT;
        ///  Toast.makeText(nhaplieuthietke.this, "f= "+f, Toast.LENGTH_LONG).show();
        // kiểm tra ứng suất
        ///kiểm tra ổn định uốn của vách đứng
        if (f - fcf <= 0) {
            txtKT8 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " <= fcf= " + fcf + "\n  Vách đứng ổn định uốn";
            // Toast.makeText(nhaplieuthietke.this,"ứng suất dầm thoả",Toast.LENGTH_LONG).show();
        } else {
            txtKT8 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " > fcf= " + fcf + "\n  Vách đứng mất ổn định uốn";
        }
        if ((((2.0 * Math.max(Q721, Q726) + Q35) / (Dw * tw)) - 0.58 * c * Fy) <= 0) {
            txtKT9 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721, Q726) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " <= 0" + "\n   Vách đứng ổn định lực cắt";
        } else {
            txtKT9 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721, Q726) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " > 0" + "\n   Vách đứng mất ổn định lực cắt";
        }
        // tính biên độ ứng suất do xe tải mỏi gây ra
        Dentaf = (Ystd * Math.max(M720, M724) * 1000000.0) / (Math.max(IstDT, IstDN));
        // tính lượng chu kì ứng suất
        ////////// tính u1 nhịp
        if (L * 1000.0 > 12000) {
            u1 = 1;
        } else {
            u1 = 2;
        }
        ////////tính u2
        if (Bxc * 1000.0 / 3500.0 > 1 && Bxc * 1000.0 / 3500.0 < 2) {
            u2 = 1;
        } else if (Bxc * 1000.0 / 3500.0 >= 2 && Bxc * 1000.0 / 3500.0 < 3) {
            u2 = 0.85;
        } else {
            u2 = 0.8;
        }
        /// tính N
        N = 100.0 * 365.0 * u1 * u2 * 2.0 * 10000.0 * l1234;
        ///sức kháng mỏi danh định
        DentaFn = Math.max((Math.pow(ABCDE, 1 / 3) / N), (0.5 * DentaFTH));
        if (DentaFn - Dentaf * 0.75 >= 0) {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + ">= 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi đảm bảo ";
        } else {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + "< 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Không đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi không đảm bảo ";
        }
        //////////////////////////////////////////////// SỬ DỤNG/////////////////////////////////////////////////////////
        ftDC1 = f112;
        ftDC2 = Math.max(Math.abs(f212), Math.abs(f228));
        ftLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ystt * 1000000.0 / Ist;
        ftSH = Math.max(Math.abs(f51), Math.abs(f53)) * 1.2;
        ftsum = Math.abs(ftDC1) + Math.abs(ftDC2) + Math.abs(ftLL_IM) + Math.abs(ftSH);
        /// ứng suất bản biên dưới của dầm
        fbDC1 = f116;
        fbDC2 = Math.max(Math.abs(f216), Math.abs(f232));
        fbLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ystt * 1000000.0 / Ist;
        fbSH = Math.max(Math.abs(f52), Math.abs(f54)) * 1.2;
        fbsum = Math.abs(fbDC1) + Math.abs(fbDC2) + Math.abs(fbLL_IM) + Math.abs(fbSH);
        // kiểm tra
        if (Math.max(Math.abs(ftsum), Math.abs(fbsum)) <= 0.95 * Fy) {
            txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " <= 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới đạt";
        } else {
            txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " > 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới không đạt";
        }
        /// kiểm tra độ vồng ngược
        dentaDC1 = 5.0 * Math.pow(Ls * 1000.0, 4) * DC1 / (384.0 * Es * Inc);
        dentaDC2 = 5.0 * Math.pow(Ls * 1000.0, 4) * Math.max(DC2DT, DC2DN) / (384.0 * Es * Math.max(IltDN, IltDT));
        // độ võng do xe tải thiết kế
        dentaP35 = Math.max(mgDTM, mgDNM) * (35.0 * ((0.5 * Ls * 1000.0) + 4300.0) * (0.5 * Ls * 1000.0) * (Math.pow(Ls * 1000.0, 2) - Math.pow((0.5 * Ls * 1000.0) + 4300.0, 2) - Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Ist * Ls * Es);
        dentaP145G = Math.max(mgDTM, mgDNM) * (145.0 * Math.pow(0.5 * Ls * 1000.0, 2) * (Math.pow(Ls * 1000.0, 2) - 2.0 * Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Ist * Ls * Es);
        dentaP145S = Math.max(mgDTM, mgDNM) * (145.0 * ((0.5 * Ls * 1000.) - 4300.) * (0.5 * Ls * 1000.) * ((Math.pow(Ls * 1000., 2)) - (Math.pow((0.5 * Ls * 1000.) - 4300.0, 2)) - (Math.pow(0.5 * 1000. * Ls, 2)))) / (6.0 * Ist * Ls * Es);
        //double grjfdj=M36;
        //độ võng thiết kế
        denta1 = (dentaP35 + dentaP145G + dentaP145S) * 1.25;
        // độ võng do tổ hợp 25 xe tải thiết kế, ttl,
        denta2 = 0.25 * denta1;
        denta3 = (5. * 9.3 * Math.pow(Ls * 1000., 4) * Math.max(mgDTM, mgDNM)) / (384. * Es * Ist);
        // độ võng tổ hợp trên gây ra
        denta4 = denta2 + denta3;
        /// ///độ võng do hoạt tải
        denta5 = Math.max(denta1, denta4);
        /// độ võng cho phép của hoạt tải
        denta6 = Ls;
        ///// (float)Math.round((f)* 1000)/1000
        // kiểm tra độ võng cho phép riêng của hoạt tải
        if (denta5 < denta6) {
            txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " <= denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải ĐẠT";
            txt5 = "Độ võng riêng cho phép của hoạt tải ĐẠT";
        } else {
            txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " > denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";
            txt5 = "Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";
        }
        // ĐỘ VỒNG cần chế tạo hợp lí
        dentav = 0.5 * denta5 + dentaDC1 + dentaDC2;
        // quyết định độ vồng ngược cho tất cả các dầm
        dentafinal = dentav;
        txtKT13 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA final= " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
        txt6 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA = " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
    }
//////////////////////////////////////LIEN HƠP
    public void tinhToanTDChac() {
        ////
        Ps = 0.85 * fc * bi * ts;
        Pc = Fy * Bft * tft;
        Pt = Fy * Bfb * tfb;
        Pw = Fy * Dw * tw;
        Prt = 400. * N1 * 3.14 * Dtt * Dtt * 0.25;
        Prb = 400. * N2 * 3.14 * Dtd * Dtd * 0.25;
        // xác định trục trung hòa dẻo
        if ((Pt + Pw) > (Ps + Pc + Prt + Prb)) {
            Dcp = (Dw / 2.) * ((Pt + Pw - Pc - Ps - Prt - Prb) / Pw);
            Mp=((Ps*(0.5*ts+Yv+tft+Dcp)+(Prt*(ts+Yv+Dcp-St+tft))+(Prb*(Dcp+Yv+Sd+tft))+(Pc*(0.5*tft+Dcp))+(Pt*(Dw-Dcp+0.5*tfb))+(Pw*(Math.abs(0.5*Dw-Dcp)))))/(1000000.);
             txtKT4 = "Pt+Pw=" + "" + (float) Math.round((Pt + Pw) * 1000) / 1000 + ">" + "Ps+Pc+Prt+Prb= " + (float) Math.round(((Pt + Pw - Pc - Ps - Prt - Prb) / Pw) * 1000) / 1000 + "\nDcp=" + "" + (float) Math.round((Dcp * 1000) / 1000) + "\n   Trục trung hòa dẻo nằm ở bản bụng";
            // Toast.makeText(nhaplieuthietke.this,"Trục trung hòa dẻo nằm ở bản bụng",Toast.LENGTH_LONG).show();
        } else if ((Pt + Pw < Ps + Pc + Prt + Prb && Pt + Pw + Pc > Ps + Prt + Prb)) {
            Dcp = (tft / 2.) * ((Pt + Pw + Pc - Ps - Prt - Prb) / Pc);
            Mp=((Ps*(0.5*ts+Yv+Dcp))+(Prt*(ts+Yv+Dcp-St))+(Prb*(Dcp+Yv+Sd))+(Pc*tft)+(Pt*(tft-Dcp+Dw+0.5*tfb))+(Pw*(tft-Dcp+0.5*Dw)))/(1000000.);

           txtKT4 = "Pt+Pw=" + "" + (float) Math.round((Pt + Pw) * 1000) / 1000 + "<" + "Ps+Pc+Prt+Prb= " + (float) Math.round((Ps + Pc + Prt + Prb) * 1000) / 1000 + "\nDcp=" + "" + (float) Math.round((Dcp * 1000) / 1000) + "\n   Trục trung hòa dẻo nằm ở bản cánh trên";
            // Toast.makeText(nhaplieuthietke.this,"Trục trung hòa dẻo nằm ở bản cánh trên",Toast.LENGTH_LONG).show();
        } else if (Ps>Pc+Pw+Pt) {
            Dcp  =(ts/Ps)*(Pc+Pt+Pw);
            Mp=((Ps*Dcp*Dcp*0.5/ts)+(Prt*(Dcp-St))+(Prb*(ts-Dcp-Sd))+(Pc*(ts-Dcp+Yv+0.5*tft))+(Pt*(ts-Dcp+Yv+tft+Dw+0.5*tfb))+(Pw*(ts-Dcp+Yv+tft+0.5*Dw)))/(1000000.);
            txtKT4 = "Trục trung hòa dẻo nằm ở bản bê tông";
            /// Toast.makeText(nhaplieuthietke.this,"Trục trung hòa dẻo nằm ở bản bê tông",Toast.LENGTH_LONG).show();
        }

        Dp = Dcp + tft + Yv + ts;
        if (Fy == 345) {
            Dphay = (0.7 * (D + ts + Yv)) / 7.5;
            beta = 0.7;
        } else if (Fy == 250) {
            Dphay = (0.9 * (D + ts + Yv)) / 7.5;
            beta = 0.9;
        }
        if (Dphay < Dp && Dp <= 5 * Dphay) {
            Mn = ((5.0 * Mp) - 0.85 * My) / 4.0 + (((0.85 * My) - Mp) / 4.0) * (Dp / Dphay);
            //    Toast.makeText(nhaplieuthietke.this,"Mr="+Mn,Toast.LENGTH_LONG).show();
        } else if (Dp < Dphay) {
            Mn = Mp;
            //    Toast.makeText(nhaplieuthietke.this,"Mr="+Mn,Toast.LENGTH_LONG).show();
        }
        // momen kháng uốn
        Mr = Mn;
        //momen uốn lớn nhất
        Mu = Math.max(M74, M78);
        // kiểm tra sức kháng uốn
        if (Mr - Math.max(M74, M78) > 0) {
            txtKT5 = "Mr= " + (float) Math.round((Mr) * 1000) / 1000 + " >= Mu= " + (float) Math.round((Mu) * 1000) / 1000 + "\n  Thỏa điều kiện sức kháng uốn";
            txt2 = "Sức kháng uốn TTGH CD1 đảm bảo";
            //   Toast.makeText(nhaplieuthietke.this,"thỏa điều kiện sức kháng uốn",Toast.LENGTH_LONG).show();
        } else {
            txtKT5 = txtKT5 = "Mr= " + (float) Math.round((Mr) * 1000) / 1000 + " < Mu= " + (float) Math.round((Mu) * 1000) / 1000 + "\n  Không thỏa điều kiện sức kháng uốn";
            txt2 = "Sức kháng uốn TTGH CD1 không đảm bảo";
            //   Toast.makeText(nhaplieuthietke.this,"không thỏa điều kiện sức kháng uốn",Toast.LENGTH_LONG).show();
        }
        //

        //Cường đọ chịu kéo nhỏ nhất
        try {
            d0 = Double.parseDouble(edtd0.getText().toString());

            if (d0 < 0) {

                edtd0.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtd0.setError("Hãy nhập giá trị");
        }

        //tính hệ số k
        k = 5. + (5. / (Math.pow(d0 / Dw, 2)));
        // tính c
        if (((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy)) <= 0) {
            c = 1;
        } else if (((Dw / tw) - 1.1 * Math.sqrt(Es * k / Fy)) >= 0 && ((((Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy)) <= 0))) {
            c = (1.1 * tw / Dw) * (Math.sqrt(Es * k / Fy));

        } else if ((Dw / tw) - 1.38 * Math.sqrt(Es * k / Fy) >= 0) {
            c = (1.52 / (Math.pow(Dw / tw, 2))) * (Es * k / Fy);
        }
        //
        r = Math.min(1, (0.4 * (Mr - Mu) / (Mr - 0.75 * My)));

        //
        Vp = 0.58 * Fy * Dw * tw * 0.001;
        //tính sức kháng uốn
        if (Mu - 0.5 * Mp < 0) {
//            V1n, V2n,r, Vr;
            V1n = (0.58 * Fy * Dw * tw) * (c + ((0.87 * (1 - c)) / (Math.sqrt(1 + Math.pow(d0 / Dw, 2)))));
            Vr = V1n / 1000.;

        } else if (Mu - 0.5 * Mp > 0) {
            V2n = r * ((0.58 * Fy * Dw * tw) * (c + ((0.87 * (1 - c)) / (Math.sqrt(1 + Math.pow(d0 / Dw, 2))))));
            Vr = V2n / 1000.;
        }
        // kiểm tra  lực cắt
        if (Vr - Math.max(Q71, Q76) > 0) {
            txtKT6 = "Vr= " + (float) Math.round((Vr) * 1000) / 1000 + " > Vu= " + (float) Math.round((Math.max(Q71, Q76)) * 1000) / 1000 + "\n   Dầm thỏa sức kháng cắt";
            txt3 = "Sức kháng cắt TTGH CD1 đảm bảo";
        } else if ((Math.max(Q71, Q76) - c * Vp) < 0) {
            txtKT6 = "c*Vp= " + (float) Math.round((c * Vp) * 1000) / 1000+" > Vu= "+ (float) Math.round((Math.max(Q71, Q76)) * 1000) / 1000+ "\n  Dầm thỏa sức kháng cắt";
            //Toast.makeText(nhaplieuthietke.this,"dầm chịu được khả năng chịu kháng uốn",Toast.LENGTH_LONG).show();
            txt3 = "Sức kháng cắt TTGH CD1 đảm bảo";
        } else {
            txtKT6 = "Dầm không không thỏa sức kháng cắt";
            txt3 = "Sức kháng cắt TTGH CD1 không đảm bảo";
            //   Toast.makeText(nhaplieuthietke.this,"dầm không đủ khả năng chịu kháng uốn",Toast.LENGTH_LONG).show();
        }
//////////////////////////////////////////////////////////////MỎI///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////// ứng suất nén đàn hồi lớn nhất ở bản biên chịu nén khi uốn do tác dụng của tải trọng dài hạn
        if ((2.0 * (D - tft - Ystd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) <= 0) {
            fcf = Fy;
        } else if ((2.0 * (D - tft - Ystd) / tw) - 5.7 * (Math.sqrt(Es / Fy)) > 0) {
            fcf = 32.5 * Es * Math.pow(tw / (2 * (D - tft - Ystd)), 2);
        }
        //// tính đc fcf
        /////////////// kiểm ra fcf

        // tính ứng suất
        f = -f112 - Math.max(f228, f212) - 2 * (1000000 * YlttDT * Math.max(M720, M724)) / IltDT;
        ///  Toast.makeText(nhaplieuthietke.this, "f= "+f, Toast.LENGTH_LONG).show();
        // kiểm tra ứng suất

        ///kiểm tra ổn định uốn của vách đứng
        if (f - fcf <= 0) {
            txtKT7 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " <= fcf= " + fcf + "\n  Vách đứng ổn định uốn";
            // Toast.makeText(nhaplieuthietke.this,"ứng suất dầm thoả",Toast.LENGTH_LONG).show();
        } else {
            txtKT7 = "-----------------------  KIỂM TOÁN Ở TTGH MỎI  -----------------------" + "\nf= " + (float) Math.round((f) * 1000) / 1000 + " > fcf= " + fcf + "\n  Vách đứng mất ổn định uốn";
        }

        if ((((2.0 * Math.max(Q721, Q726) + Q35) / (Dw * tw)) - 0.58 * c * Fy) <= 0) {
            txtKT8 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721, Q726) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " <= 0" + "\n   Vách đứng ổn định lực cắt";
        } else {
            txtKT8 = "(((2.0*Math.max(Q721,Q726)+Q35)/(Dw*tw))-0.58*c*Fy)= " + (float) Math.round((((2.0 * Math.max(Q721, Q726) + Q35) / (Dw * tw)) - 0.58 * c * Fy) * 1000) / 1000 + " > 0" + "\n   Vách đứng mất ổn định lực cắt";
        }

        // tính biên độ ứng suất do xe tải mỏi gây ra
        Dentaf = (Ystd * Math.max(M720, M724) * 1000000.0) / (Math.max(IstDT, IstDN));
        // tính lượng chu kì ứng suất
        ////////// tính u1 nhịp
        if (L * 1000.0 > 12000) {
            u1 = 1;
        } else {
            u1 = 2;
        }
        ////////tính u2
        if (Bxc * 1000.0 / 3500.0 > 1 && Bxc * 1000.0 / 3500.0 < 2) {
            u2 = 1;
        } else if (Bxc * 1000.0 / 3500.0 >= 2 && Bxc * 1000.0 / 3500.0 < 3) {
            u2 = 0.85;
        } else {
            u2 = 0.8;
        }
        /// tính N
        N = 100.0 * 365.0 * u1 * u2 * 2.0 * 10000.0 * l1234;
        ///sức kháng mỏi danh định
        DentaFn = Math.max((Math.pow(ABCDE, 1 / 3) / N), (0.5 * DentaFTH));
        if (DentaFn - Dentaf * 0.75 >= 0) {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + ">= 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi đảm bảo ";
        } else {
            txtKT9 = "DentaFn= " + (float) Math.round(DentaFn * 1000) / 1000 + "< 0,75.DentaF= " + (float) Math.round(0.75 * Dentaf * 1000) / 1000 + "\n   Không đảm bảo TTGH mỏi";
            txt4 = "TTGH mỏi không đảm bảo ";
        }
        //////////////////////////////////////////////// SỬ DỤNG/////////////////////////////////////////////////////////
        ftDC1 = f112;
        ftDC2 = Math.max(Math.abs(f212), Math.abs(f228));
        ftLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ystt * 1000000.0 / Ist;
        ftSH = Math.max(Math.abs(f51), Math.abs(f53)) * 1.2;
        ftsum = Math.abs(ftDC1) + Math.abs(ftDC2) + Math.abs(ftLL_IM) + Math.abs(ftSH);
        /// ứng suất bản biên dưới của dầm
        fbDC1 = f116;
        fbDC2 = Math.max(Math.abs(f216), Math.abs(f232));
        fbLL_IM = Math.max((mgDTM * (1.25 * Math.max(m4, m8) + m12 + m16)), (mgDNM * (1.25 * Math.max(m4, m8) + m12 + m16))) * Ystt * 1000000.0 / Ist;
        fbSH = Math.max(Math.abs(f52), Math.abs(f54)) * 1.2;
        fbsum = Math.abs(fbDC1) + Math.abs(fbDC2) + Math.abs(fbLL_IM) + Math.abs(fbSH);
        // kiểm tra
        if (Math.max(Math.abs(ftsum), Math.abs(fbsum)) <= 0.95 * Fy) {

            txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " <= 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới đạt";
        } else {

            txtKT11 = "--------------------  KIỂM TOÁN TTGH SỬ DỤNG  --------------------" + "\nMath.max(Math.abs(ftsum),Math.abs(fbsum))= " + (float) Math.round(Math.max(Math.abs(ftsum), Math.abs(fbsum)) * 1000) / 1000 + " > 0.95*Fy= " + (float) Math.round(0.95 * Fy * 1000) / 1000 + "\n   Ứng suất cánh trên và cánh dưới không đạt";
        }
        /// kiểm tra độ vồng ngược
        dentaDC1 = 5.0 * Math.pow(Ls * 1000.0, 4) * DC1 / (384.0 * Es * Inc);
        dentaDC2 = 5.0 * Math.pow(Ls * 1000.0, 4) * Math.max(DC2DT, DC2DN) / (384.0 * Es * Math.max(IltDN, IltDT));
        // độ võng do xe tải thiết kế
        dentaP35 = Math.max(mgDTM, mgDNM) * (35.0 * ((0.5 * Ls * 1000.0) + 4300.0) * (0.5 * Ls * 1000.0) * (Math.pow(Ls * 1000.0, 2) - Math.pow((0.5 * Ls * 1000.0) + 4300.0, 2) - Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Ist * Ls * Es);
        dentaP145G = Math.max(mgDTM, mgDNM) * (145.0 * Math.pow(0.5 * Ls * 1000.0, 2) * (Math.pow(Ls * 1000.0, 2) - 2.0 * Math.pow(0.5 * Ls * 1000.0, 2))) / (6.0 * Ist * Ls * Es);
        dentaP145S = Math.max(mgDTM, mgDNM) * (145.0 * ((0.5 * Ls * 1000.) - 4300.) * (0.5 * Ls * 1000.) * ((Math.pow(Ls * 1000., 2)) - (Math.pow((0.5 * Ls * 1000.) - 4300.0, 2)) - (Math.pow(0.5 * 1000. * Ls, 2)))) / (6.0 * Ist * Ls * Es);
        //double grjfdj=M36;
        //độ võng thiết kế
        denta1 = (dentaP35 + dentaP145G + dentaP145S) * 1.25;
        // độ võng do tổ hợp 25 xe tải thiết kế, ttl,
        denta2 = 0.25 * denta1;
        denta3 = (5. * 9.3 * Math.pow(Ls * 1000., 4) * Math.max(mgDTM, mgDNM)) / (384. * Es * Ist);
        // độ võng tổ hợp trên gây ra
        denta4 = denta2 + denta3;
        /// ///độ võng do hoạt tải
        denta5 = Math.max(denta1, denta4);
        /// độ võng cho phép của hoạt tải
        denta6 = Ls;

        ///// (float)Math.round((f)* 1000)/1000
        // kiểm tra độ võng cho phép riêng của hoạt tải
        if (denta5 < denta6) {
            txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " <= denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải ĐẠT";
            txt5 = "Độ võng riêng cho phép của hoạt tải ĐẠT";

        } else {
            txtKT12 = "denta5= " + (float) Math.round((denta5) * 1000) / 1000 + " > denta6= " + (float) Math.round((denta6) * 1000) / 1000 + "\n   Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";
            txt5 = "Độ võng riêng cho phép của hoạt tải KHÔNG ĐẠT";

        }
        // ĐỘ VỒNG cần chế tạo hợp lí
        dentav = 0.5 * denta5 + dentaDC1 + dentaDC2;
        // quyết định độ vồng ngược cho tất cả các dầm
        dentafinal = dentav;
        txtKT13 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA final= " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
        txt6 = "Độ vồng ngược cho tất cả các dầm" + "\nDENTA = " + (float) Math.round((dentafinal) * 1000) / 1000 + "mm";
        //      double  x=M87;

    }

    public void kiemTraTCgi() {

        // kiểm tra bản bụng đặc chắc
        double x1, x2;
        x1 = (2 * Dcp / tw) - 3.76 * Math.sqrt(Es / Fy);
        x2 = (Bft / (2 * tft)) - 0.382 * Math.sqrt(Es / Fy);


        if (x2 <= 0) {
            //ok
            txtKT3 = "(Bft/(2*tft))-0.382*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x2 * 1000) / 1000 + "<= 0" + "\n   Kích thước bản biên trên đạt";

        } else {
//            Toast.makeText(nhaplieuthietke.this,"Chọn lại tiết diện bản cánh",Toast.LENGTH_LONG).show();
            txtKT3 = "(Bft/(2*tft))-0.382*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x2 * 1000) / 1000 + "> 0" + "\n   Kích thước bản biên trên không đạt";

        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // kiểm tra tiết diện CHẮC, KHÔNG CHẮC, MÃNH
        if (x1 <= 0) {
            // TIẾT DIỆN CHẮC
            tinhToanTDChac();
            txtKT2 = "(2*Dcp/tw)-3.76*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x1 * 1000) / 1000 + "<= 0" + "\n   Loại tiết diện Chắc";

        } else if (x1 > 0) {
            // TD ko chắc
            tinhToanTCDKhongChac();

            txtKT2 = "(2*Dcp/tw)-3.76*Math.sqrt(Es/Fy)= " + "" + (float) Math.round(x1 * 1000) / 1000 + "> 0" + "\n   Loại tiết diện Không Chắc";
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ktTiLeCauTaoChung() {
        double t;
        t = (tfb * Bfb * Bfb * Bfb / 12) / ((tfb * Bfb * Bfb * Bfb / 12) + (Dw * tw * tw * tw / 12) + (tft * Bft * Bft * Bft / 12));
        if (t >= 0.1 && t <= 0.9) {
            // kích thước bản biên hợp lý
            txtKT1 = "-----------------------  KIỂM TOÁN Ở TTGH CD1  -----------------------" + "\n0.1<= " + "(tfb*Bfb*Bfb*Bfb/12)/((tfb*Bfb*Bfb*Bfb/12)+(Dw*tw*tw*tw/12)+(tft*Bft*Bft*Bft/12))= " + "" + (float) Math.round(t * 100) / 100 + " <= 0.9" + "\n   Kích thước bản biên dưới đạt";
        } else if (t < 0.1) {
            txtKT1 = "-----------------------  KIỂM TOÁN Ở TTGH CD1  -----------------------" + "\n(tfb*Bfb*Bfb*Bfb/12)/((tfb*Bfb*Bfb*Bfb/12)+(Dw*tw*tw*tw/12)+(tft*Bft*Bft*Bft/12))= " + "" + (float) Math.round(t * 100) / 100 + " < 0.1" + "\n  Tăng bề dày bản biên dưới hoặc tăng bề rộng bản biên dưới";
            // tăng bề dày bản biên dưới hoặc tăng bề rộng bản biên dưới
            //   Toast.makeText(nhaplieuthietke.this,"Chọn lại tiết diện",Toast.LENGTH_LONG).show();
        } else if (t > 0.9) {
            // giảm bề rộng bản biên dưới
            txtKT1 = "-----------------------  KIỂM TOÁN Ở TTGH CD1  -----------------------" + "\n(tfb*Bfb*Bfb*Bfb/12)/((tfb*Bfb*Bfb*Bfb/12)+(Dw*tw*tw*tw/12)+(tft*Bft*Bft*Bft/12))= " + "" + (float) Math.round(t * 100) / 100 + " > 0.9" + "\n  Giảm bề rộng bản biên dưới";

        } else {
            // chọn lại bản biên dưới
            txtKT1 = "-----------------------  KIỂM TOÁN Ở TTGH CD1  -----------------------" + "\n(tfb*Bfb*Bfb*Bfb/12)/((tfb*Bfb*Bfb*Bfb/12)+(Dw*tw*tw*tw/12)+(tft*Bft*Bft*Bft/12))= " + "" + (float) Math.round(t * 100) / 100 + "\n  Chọn lại bản biên dưới";
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void tinhMomenChay() {
        if (IstDN > IstDT) {
            Ystt = YsttDN;
            Ystd = YstdDN;
            Yltd = YltdDN;
            Ist = IstDN;
        } else {
            Ystt = YsttDT;
            Ystd = YstdDT;
            Yltd = YlttDT;
            Ist = IstDT;
        }
        my = ((Fy - (Math.abs(f14 + Math.max(f220, f24) - Math.min(f51, f53)))) * Math.max(IstDT, IstDN)) / (Ystt * 1000000);
        myy = ((Fy - (Math.abs(f18 + Math.max(f224, f28) + Math.max(f52, f54)))) * Math.max(IstDT, IstDN)) / (Ystd * 1000000);
        My = M14 + Math.max(M51, M52) + M24 + Math.min(my, myy);
    }

    public void kiemtoan() {
        tinhMomenChay();
        ktTiLeCauTaoChung();
        kiemTraTCgi();

    }

    public void tinhNoiLuc7() {
        // CD1 DẦM TRONG
        M71 = (M31 + M41 + M51 * 1.2) * 1.05;
        M72 = (M32 + M42 + M51 * 1.2) * 1.05;
        M73 = (M33 + M43 + M51 * 1.2) * 1.05;
        M74 = (M34 + M44 + M51 * 1.2) * 1.05;

        // CD1 Dầm Ngoài
        M75 = (M31 + M45 + M52 * 1.2) * 1.05;
        M76 = (M32 + M46 + M52 * 1.2) * 1.05;
        M77 = (M33 + M47 + M52 * 1.2) * 1.05;
        M78 = (M34 + M48 + M52 * 1.2) * 1.05;
// SD dầm trong
        M79 = (M35 + M49 + M51 * 1.2);
        M710 = (M36 + M410 + M51 * 1.2);
        M711 = (M37 + M411 + M51 * 1.2);
        M712 = (M38 + M412 + M51 * 1.2);
        //SD dầm ngoài
        M713 = (M35 + M413 + M52 * 1.2);
        M714 = (M36 + M414 + M52 * 1.2);
        M715 = (M37 + M415 + M52 * 1.2);
        M716 = (M38 + M416 + M52 * 1.2);
        // mỏi dầm trong
        M717 = 0.75 * 1.15 * M61 * mgSIM;
        M718 = 0.75 * 1.15 * M62 * mgSIM;
        M719 = 0.75 * 1.15 * M63 * mgSIM;
        M720 = 0.75 * 1.15 * M64 * mgSIM;
        //mỏi dầm ngoài
        M721 = 0.75 * 1.15 * M61 * mgMEM1lan;
        M722 = 0.75 * 1.15 * M62 * mgMEM1lan;
        M723 = 0.75 * 1.15 * M63 * mgMEM1lan;
        M724 = 0.75 * 1.15 * M64 * mgMEM1lan;

        // CD1 DẦM TRONG
        Q71 = (Q34 + Q41) * 0.95;
        Q72 = (Q33 + Q42) * 0.95;
        Q73 = (Q32 + Q43) * 0.95;
        Q74 = (Q31 + Q44) * 0.95;
        Q75 = Q45 * 0.95;
        //CD1 DẦM NGOÀI
        Q76 = (Q34 + Q46) * 0.95;//
        Q77 = (Q33 + Q47) * 0.95;
        Q78 = (Q32 + Q48) * 0.95;
        Q79 = (Q31 + Q49) * 0.95;
        Q710 = Q410 * 0.95;
        //sd DẦM TRONG
        Q711 = Q38 + Q411;//
        Q712 = Q37 + Q412;
        Q713 = Q36 + Q413;
        Q714 = Q35 + Q414;
        Q715 = Q415;
        //SD DẦM NGOÀI
        Q716 = Q38 + Q416;//
        Q717 = Q37 + Q417;
        Q718 = Q36 + Q418;
        Q719 = Q35 + Q419;
        Q720 = Q420;
        // MỎI DẦM TRONG
        Q721 = 0.75 * 1.15 * Q61 * mgSIV;//
        Q722 = 0.75 * 1.15 * Q62 * mgSIV;
        Q723 = 0.75 * 1.15 * Q63 * mgSIV;
        Q724 = 0.75 * 1.15 * Q64 * mgSIV;
        Q725 = 0.75 * 1.15 * Q65 * mgSIV;
        // mỏi dầm ngoài
        Q726 = 0.75 * 1.15 * Q61 * mgMEV1lan;//
        Q727 = 0.75 * 1.15 * Q62 * mgMEV1lan;
        Q728 = 0.75 * 1.15 * Q63 * mgMEV1lan;
        Q729 = 0.75 * 1.15 * Q64 * mgMEV1lan;
        Q730 = 0.75 * 1.15 * Q65 * mgMEV1lan;
    }

    public void tinhNoiLuc6() {
        //L/8

        if ((7 * Ls / 8) - 13.3 > 0) {
            M61 = (7.0 / 64) * Ls * heSoHoatTai * 145 + (1.0 / 8) * ((7 * Ls / 8) - 9) * heSoHoatTai * 145 + (1.0 / 8) * ((7 * Ls / 8) - 13.3) * heSoHoatTai * 35;
            //  Toast.makeText(nhaplieuthietke.this,""+M61,Toast.LENGTH_LONG).show();
        } else if ((7 * Ls / 8) - 13.3 <= 0 && (7 * Ls / 8) - 9 > 0) {
            M61 = (7.0 / 64) * Ls * heSoHoatTai * 145 + (1.0 / 8) * ((7 * Ls / 8) - 9) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M61,Toast.LENGTH_LONG).show();
        } else if ((7 * Ls / 8) - 9 <= 0) {
            M61 = (7.0 / 64) * Ls * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M61,Toast.LENGTH_LONG).show();
        }
        ///L/4

        if ((3 * Ls / 4) - 13.3 > 0) {
            M62 = (3.0 / 16) * Ls * 145 * heSoHoatTai + (1.0 / 4) * ((3 * Ls / 4) - 9) * 145 * heSoHoatTai + (1.0 / 4) * ((3 * Ls / 4) - 13.3) * 35 * heSoHoatTai;

            //   Toast.makeText(nhaplieuthietke.this,""+M62,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 4) - 13.3 <= 0 && (3 * Ls / 4) - 9 > 0) {
            M62 = (3.0 / 16) * Ls * 145 * heSoHoatTai + (1.0 / 4) * ((3 * Ls / 4) - 9) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M62,Toast.LENGTH_LONG).show();

        } else if ((3 * Ls / 4) - 9 <= 0) {
            M62 = (3.0 / 16) * Ls * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M62,Toast.LENGTH_LONG).show();

        }

        //3L/8

        if ((5 * Ls / 8) - 9 > 0 && (3 * Ls / 8) - 4.3 > 0) {
            M63 = (15.0 / 64) * Ls * 145 * heSoHoatTai + (3.0 / 8) * ((5 * Ls / 8) - 9) * 145 * heSoHoatTai + (5.0 / 8) * ((3 * Ls / 8) - 4.3) * 35 * heSoHoatTai;
            ///  Toast.makeText(nhaplieuthietke.this,""+M63,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 9 <= 0 && (3 * Ls / 8) - 4.3 <= 0) {
            M63 = (15.0 / 64) * Ls * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M63,Toast.LENGTH_LONG).show();

        } else if ((5 * Ls / 8) - 9 > 0 && (3 * Ls / 8) - 4.3 <= 0) {
            M63 = (15.0 / 64) * Ls * 145 * heSoHoatTai + (3.0 / 8) * ((5 * Ls / 8) - 9) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M63,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 9 <= 0 && (3 * Ls / 8) - 4.3 > 0) {
            M63 = (15.0 / 64) * Ls * 145 * heSoHoatTai + (5.0 / 8) * ((3 * Ls / 8) - 4.3) * 35 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+M63,Toast.LENGTH_LONG).show();
        }
        //L/2
        if ((Ls / 2) - 9 > 0) {
            M64 = (1.0 / 4) * Ls * 145 * heSoHoatTai + (1.0 / 2) * ((Ls / 2) - 9) * 145 * heSoHoatTai + (1.0 / 2) * ((Ls / 2) - 4.3) * 35 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M64,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 9 <= 0 && (Ls / 2) - 4.3 > 0) {
            M64 = (1.0 / 4) * Ls * 145 * heSoHoatTai + (1.0 / 2) * (((Ls / 2) - 4.3) * 35) * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+M64,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 4.3 <= 0) {
            M64 = (1.0 / 4) * Ls * 145 * heSoHoatTai;
            ///   Toast.makeText(nhaplieuthietke.this,""+M64,Toast.LENGTH_LONG).show();
        }

        // lực cắt

        // GỐI

        if (Ls - 13.3 > 0) {
            Q61 = 145 * heSoHoatTai + ((Ls - 9) / Ls) * 145 * heSoHoatTai + ((Ls - 13.3) / Ls) * 35 * heSoHoatTai;
            ///     Toast.makeText(nhaplieuthietke.this,""+Q61,Toast.LENGTH_LONG).show();
        } else if (Ls - 13.3 <= 0 && Ls - 9 > 0) {
            Q61 = 145 * heSoHoatTai + ((Ls - 9) / Ls) * 145 * heSoHoatTai;
            ///   Toast.makeText(nhaplieuthietke.this,""+Q61,Toast.LENGTH_LONG).show();
        } else if (Ls - 9 <= 0) {
            Q61 = 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+Q61,Toast.LENGTH_LONG).show();
        }
        //l/8
        if ((7 * Ls / 8) - 13.3 > 0) {
            Q62 = (7.0 / 8) * 145 * heSoHoatTai + (((7 * Ls / 8) - 9) / Ls) * 145 * heSoHoatTai + (((7 * Ls / 8) - 13.3) / Ls) * 35 * heSoHoatTai;
            ///  Toast.makeText(nhaplieuthietke.this,""+Q62,Toast.LENGTH_LONG).show();
        } else if ((7 * Ls / 8) - 13.3 <= 0 && (7 * Ls / 8) - 9 > 0) {
            Q62 = (7.0 / 8) * 145 * heSoHoatTai + (((7 * Ls / 8) - 9) / Ls) * 145 * heSoHoatTai;
            ///   Toast.makeText(nhaplieuthietke.this,""+Q62,Toast.LENGTH_LONG).show();

        } else if ((7 * Ls / 8) - 9 <= 0) {
            Q62 = (7.0 / 8) * 145 * heSoHoatTai;
            //// Toast.makeText(nhaplieuthietke.this,""+Q62,Toast.LENGTH_LONG).show();
        }
        //l/4

        if ((3 * Ls / 4) - 13.3 > 0) {
            Q63 = (3.0 / 4) * 145 * heSoHoatTai + (((3 * Ls / 4) - 9) / Ls) * 145 * heSoHoatTai + (((3 * Ls / 4) - 13.3) / Ls) * 35 * heSoHoatTai;
            ///Toast.makeText(nhaplieuthietke.this,""+Q63,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 4) - 13.3 <= 0 && (3 * Ls / 4) - 9 > 0) {
            Q63 = (3.0 / 4) * 145 * heSoHoatTai + (((3 * Ls / 4) - 9) / Ls) * 145 * heSoHoatTai;
            ////   Toast.makeText(nhaplieuthietke.this,""+Q63,Toast.LENGTH_LONG).show();

        } else if ((3 * Ls / 4) - 9 <= 0) {
            Q63 = (3.0 / 4) * 145 * heSoHoatTai;
            /// Toast.makeText(nhaplieuthietke.this,""+Q63,Toast.LENGTH_LONG).show();
        }
        //3l/8

        if ((5 * Ls / 8) - 13.3 > 0) {
            Q64 = (5.0 / 8) * 145 * heSoHoatTai + (((5 * Ls / 8) - 9) / Ls) * 145 * heSoHoatTai + (((5 * Ls / 8) - 13.3) / Ls) * 35 * heSoHoatTai;
            //// Toast.makeText(nhaplieuthietke.this,""+Q64,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 13.3 <= 0 && (5 * Ls / 8) - 9 > 0) {
            Q64 = (5.0 / 8) * 145 * heSoHoatTai + (((5 * Ls / 8) - 9) / Ls) * 145 * heSoHoatTai;
            ////Toast.makeText(nhaplieuthietke.this,""+Q64,Toast.LENGTH_LONG).show();

        } else if ((5 * Ls / 8) - 9 <= 0) {
            Q64 = (5.0 / 8) * 145 * heSoHoatTai;
            /////   Toast.makeText(nhaplieuthietke.this,""+Q64,Toast.LENGTH_LONG).show();
        }

        //L/2
//        Nếu Ls/2-13,3>0
//        Q5=(1/2).145+(Ls/2-9)/Ls.145+(Ls/2-13,3)/Ls.35
//        Nếu Ls/2-13,3<=0 và Ls/2-9>0
//        Q5=(1/2).145+(Ls/2-9)/Ls.145
//        Nếu Ls/2-9<=0
//        Q5=(1/2).145
        if ((Ls / 2) - 13.3 > 0) {
            Q65 = (1.0 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 9) / Ls) * 145 * heSoHoatTai + (((Ls / 2) - 13.3) / Ls) * 35 * heSoHoatTai;
            ///// Toast.makeText(nhaplieuthietke.this,""+Q65,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 13.3 <= 0 && (Ls / 2) - 9 > 0) {
            Q65 = (1.0 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 9) / Ls) * 145 * heSoHoatTai;
            /////  Toast.makeText(nhaplieuthietke.this,""+Q65,Toast.LENGTH_LONG).show();

        } else if ((Ls / 2) - 9 <= 0) {
            Q65 = (1.0 / 2) * 145 * heSoHoatTai;
            //////    Toast.makeText(nhaplieuthietke.this,""+Q65,Toast.LENGTH_LONG).show();
        }
        //
        Q66 = 0;
///
        if ((Ls / 8) - 13.3 > 0) {
            Q67 = (1.0 / 8) * 145 * heSoHoatTai + (((Ls / 8) - 9) / Ls) * 145 * heSoHoatTai + (((Ls / 8) - 13.3) / Ls) * 35 * heSoHoatTai;
            /////   Toast.makeText(nhaplieuthietke.this,""+Q67,Toast.LENGTH_LONG).show();
        } else if ((Ls / 8) - 13.3 <= 0 && (Ls / 8) - 9 > 0) {
            Q67 = (1.0 / 8) * 145 * heSoHoatTai + (((Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai;
            /////Toast.makeText(nhaplieuthietke.this,""+Q67,Toast.LENGTH_LONG).show();
        } else if ((Ls / 8) - 9 <= 0) {
            Q67 = (1.0 / 8) * 145 * heSoHoatTai;
            ////////  Toast.makeText(nhaplieuthietke.this,""+Q67,Toast.LENGTH_LONG).show();
        }
        if ((Ls / 4) - 13.3 > 0) {
            Q68 = (1.0 / 4) * 145 * heSoHoatTai + (((Ls / 4) - 9) / Ls) * 145 * heSoHoatTai + (((Ls / 4) - 13.3) / Ls) * 35 * heSoHoatTai;
            //////////////// Toast.makeText(nhaplieuthietke.this,""+Q68,Toast.LENGTH_LONG).show();
        } else if ((Ls / 4) - 13.3 <= 0 && (Ls / 4) - 9 > 0) {
            Q68 = (1.0 / 4) * 145 * heSoHoatTai + (((Ls / 4) - 9) / Ls) * 145 * heSoHoatTai;
            ////////  Toast.makeText(nhaplieuthietke.this,""+Q68,Toast.LENGTH_LONG).show();
        } else if ((Ls / 4) - 9 <= 0) {
            Q68 = (1.0 / 4) * 145 * heSoHoatTai;
            ///////////  Toast.makeText(nhaplieuthietke.this,""+Q68,Toast.LENGTH_LONG).show();
        }
        if ((3 * Ls / 8) - 13.3 > 0) {
            Q69 = (3.0 / 8) * 145 * heSoHoatTai + (((3 * Ls / 8) - 9) / Ls) * 145 * heSoHoatTai + (((3 * Ls / 8) - 13.3) / Ls) * 35 * heSoHoatTai;
            ////////////////// Toast.makeText(nhaplieuthietke.this,""+Q69,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 8) - 13.3 <= 0 && (3 * Ls / 8) - 9 > 0) {
            Q69 = (3.0 / 8) * 145 * heSoHoatTai + (((3 * Ls / 8) - 9) / Ls) * 145 * heSoHoatTai;
            //////////////  Toast.makeText(nhaplieuthietke.this,""+Q69,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 8) - 9 <= 0) {
            Q69 = (3.0 / 8) * 145 * heSoHoatTai;
            /////////////   Toast.makeText(nhaplieuthietke.this,""+Q69,Toast.LENGTH_LONG).show();
        }
        if ((Ls / 2) - 13.3 > 0) {
            Q610 = (1.0 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 9) / Ls) * 145 * heSoHoatTai + (((Ls / 2) - 13.3) / Ls) * 35 * heSoHoatTai;
            /////////////////////   Toast.makeText(nhaplieuthietke.this,""+Q610,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 13.3 <= 0 && (Ls / 2) - 9 > 0) {
            Q610 = (1.0 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 9) / Ls) * 145 * heSoHoatTai;
            /////////////////   Toast.makeText(nhaplieuthietke.this,""+Q610,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 9 <= 0) {
            Q610 = (1.0 / 2) * 145 * heSoHoatTai;
            //////////////////     Toast.makeText(nhaplieuthietke.this,""+Q610,Toast.LENGTH_LONG).show();
        }
    }

    public void tinhNoiLuc5() {
        // nọi lực do CO NGÓT

        // tính hệ số ks t=10000

        if ((ts / 2) < 25) {
            ks = 1.04;
            //  Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
            /////////   Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
        } else if ((ts / 2) >= 25 && (ts / 2) < 38) {
            ks = 1 + ((38.0 - ts / 2) * (1.04 - 1)) / (38.0 - 25.0);
            ///////////////////////   Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
        } else if ((ts / 2) >= 38 && (ts / 2) < 50) {
            ks = 0.97 + ((50.0 - ts / 2) * (1 - 0.97)) / (50.0 - 38.0);
            //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
            /////////////////// Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
        } else if ((ts / 2) >= 50 && (ts / 2) < 75) {
            ks = 0.84 + ((75.0 - ts / 2) * (0.97 - 0.84)) / (75.0 - 50.0);
            //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
            /////////////////////////   Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
        } else if ((ts / 2) >= 75 && (ts / 2) < 100) {
            ks = 0.74 + ((100.0 - ts / 2) * (0.84 - 0.74)) / (100.0 - 75.0);
            //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
            ///////////////  Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
        } else if ((ts / 2) >= 100 && (ts / 2) < 125) {
            ks = 0.63 + ((125.0 - ts / 2) * (0.74 - 0.63)) / (125.0 - 100.0);
            //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
            ///////////////////Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
        } else if ((ts / 2) >= 125 && (ts / 2) < 150) {
            ks = 0.55 + ((150.0 - ts / 2) * (0.63 - 0.55)) / (150.0 - 125.0);
            //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
            ////////////////////   Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
        } else if ((ts / 2) >= 150) {
            ks = 0.55;
            /////////////////  Toast.makeText(nhaplieuthietke.this,""+ks,Toast.LENGTH_LONG).show();
            //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
        }
        // momen co ngót
//        Dầm trong	M1=(Es.Anc.(Yltd(dầm trong)-Yncd(dầm trong)).ks.kh.t.0,51.10-3)/(35+t)
        M51 = ((Es * Anc * (YltdDT - Yncd) * ks * 1 * 10000 * 0.51 * (1.0 / (1000))) / (35 + 10000)) / 1000000;

        M52 = ((Es * Anc * (YltdDN - Yncd) * ks * 1 * 10000 * 0.51 * (1.0 / (1000))) / (35 + 10000)) / 1000000;

        // DẦM TRONG
//
        f51 = Es * ((ks * 10000 * 1 * 0.51 * (1.0 / 1000)) / (35 + 10000)) * ((Anc / AltDT) - (Anc * (YltdDT - Yncd) * (YlttDT / IltDT)) - 1);
        f52 = Es * ((ks * 10000 * 1 * 0.51 * (1.0 / 1000)) / (35 + 10000)) * ((Anc / AltDT) + (Anc * (YltdDT - Yncd) * (YltdDT / IltDT)) - 1);

        f53 = Es * ((ks * 10000 * 1 * 0.51 * (1.0 / 1000)) / (35 + 10000)) * ((Anc / AltDN) - (Anc * (YltdDN - Yncd) * (YlttDN / IltDN)) - 1);
        f54 = Es * ((ks * 10000 * 1 * 0.51 * (1.0 / 1000)) / (35 + 10000)) * ((Anc / AltDN) + (Anc * (YltdDN - Yncd) * (YltdDN / IltDN)) - 1);
    }

    public void tinhNoiLuc4() {
        // phần ni tính xe 3 trục
        //L/8

        if (((7.0 / 8) * Ls - 8.6) > 0) {
            m1 = (7.0 / 64) * Ls * heSoHoatTai * 145 + (1.0 / 8) * ((7.0 / 8) * Ls - 4.3) * heSoHoatTai * 145 + (1.0 / 8) * ((7.0 / 8) * Ls - 8.6) * heSoHoatTai * 35;
            //  Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
        } else if ((7.0 * Ls / 8) - 4.3 <= 0) {
            m1 = (7.0 / 64) * Ls * heSoHoatTai * 145 + (1.0 / 8) * ((7.0 / 8) * Ls - 4.3) * 145 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+m1,Toast.LENGTH_LONG).show();
        }
        //L/4

        if (((3 * Ls / 4) - 8.6) > 0) {
            m2 = (3.0 / 16) * Ls * 145 * heSoHoatTai + (1.0 / 4) * ((3 * Ls / 4) - 4.3) * 145 * heSoHoatTai + (1.0 / 4) * ((3 * Ls / 4) - 8.6) * 35 * heSoHoatTai;
            //    Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 4) - 4.3 <= 0) {
            m2 = (3.0 / 16) * Ls * 145 * heSoHoatTai;
            //      Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        } else if (((3 * Ls / 4) - 4.3) > 0 && ((3 * Ls / 4) - 8.6) <= 0) {
            m2 = (3.0 / 16) * Ls * 145 * heSoHoatTai + (1.0 / 4) * ((3 * Ls / 4) - 4.3) * 145 * heSoHoatTai;
            //    Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        }
        //3L/8

        if ((3 * Ls / 8) - 4.3 > 0) {
            m3 = (15.0 / 64) * Ls * 145 * heSoHoatTai + (3.0 / 8) * ((5 * Ls / 8) - 4.3) * 145 * heSoHoatTai + (5.0 / 8) * ((3 * Ls / 8) - 4.3) * 35 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+m3,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 4.3 <= 0) {
            m3 = (15.0 / 64) * Ls * 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+m2,Toast.LENGTH_LONG).show();
        } else if (((3 * Ls / 8) - 4.3) <= 0 && ((5 * Ls / 8) - 4.3 > 0)) {
            m3 = (15.0 / 64) * Ls * 145 * heSoHoatTai + ((3.0 / 8) * (5 * Ls / 8) - 4.3) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+m3,Toast.LENGTH_LONG).show();
        }
        //L/2
        if (((Ls / 2) - 4.3) <= 0) {
            m4 = (1.0 / 4) * Ls * 145 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+m4,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 4.3 > 0) {
            m4 = (1.0 / 4) * Ls * 145 * heSoHoatTai + (1.0 / 2) * ((Ls / 2) - 4.3) * 145 * heSoHoatTai + (1.0 / 2) * ((Ls / 2) - 4.3) * 35 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+m4,Toast.LENGTH_LONG).show();
        }
        //cái ni do xe 2 trục gây ra
        // L/8

        if ((7 * Ls / 8) - 1.2 <= 0) {
            m5 = (7.0 / 64) * Ls * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+m5,Toast.LENGTH_LONG).show();
        } else if ((7 * Ls / 8) - 1.2 > 0) {
            m5 = (7.0 / 64) * Ls * 110 * heSoHoatTai + (1.0 / 8) * ((7 * Ls / 8) - 1.2) * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+m5,Toast.LENGTH_LONG).show();
        }
        //L/4

        if ((3 * Ls / 4) - 1.2 > 0) {
            m6 = (3.0 / 16) * Ls * 110 * heSoHoatTai + (1.0 / 4) * ((3 * Ls / 4) - 1.2) * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+m6,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 4) - 1.2 <= 0) {
            m6 = (3.0 / 16) * Ls * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+m6,Toast.LENGTH_LONG).show();
        }
        //3L/8

        if ((5 * Ls / 8) - 1.2 > 0) {
            m7 = (15.0 / 64) * Ls * 110 * heSoHoatTai + (3.0 / 8) * ((5 * Ls / 8) - 1.2) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+m7,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 1.2 <= 0) {
            m7 = (15.0 / 64) * Ls * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+m7,Toast.LENGTH_LONG).show();
        }
        //L/2

        if ((Ls / 2) - 1.2 > 0) {
            m8 = (1.0 / 4) * Ls * 110 * heSoHoatTai + (1.0 / 2) * ((Ls / 2) - 1.2) * 110 * heSoHoatTai;
            //    Toast.makeText(nhaplieuthietke.this,""+m8,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 1.2 <= 0) {
            m8 = (1.0 / 4) * Ls * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+m8,Toast.LENGTH_LONG).show();
        }
        // tải trọng làn
        m9 = (651.0 / 1280) * Ls * Ls;
        m10 = (279.0 / 320) * Ls * Ls;
        m11 = (279.0 / 256) * Ls * Ls;
        m12 = (93.0 / 80) * Ls * Ls;
        // tải trọng người đi bộ gây ra
        m13 = (7.0 / 128) * Ls * Ls * PL;
        m14 = (3.0 / 32) * Ls * Ls * PL;
        m15 = (15.0 / 128) * Ls * Ls * PL;
        m16 = (1.0 / 8) * Ls * Ls * PL;
        //TTGH CĐ1-dầm trong
        M41 = (1.25 * Math.max(m1, m5) + m9 + m13) * 1.75 * mgDTM;
        M42 = (1.25 * Math.max(m2, m6) + m10 + m14) * 1.75 * mgDTM;
        M43 = (1.25 * Math.max(m3, m7) + m11 + m15) * 1.75 * mgDTM;
        M44 = (1.25 * Math.max(m4, m8) + m12 + m16) * 1.75 * mgDTM;

        //TTGH CĐ1-dầm ngoài
        M45 = (1.25 * Math.max(m1, m5) + m9 + m13) * 1.75 * mgDNM;
        M46 = (1.25 * Math.max(m2, m6) + m10 + m14) * 1.75 * mgDNM;
        M47 = (1.25 * Math.max(m3, m7) + m11 + m15) * 1.75 * mgDNM;
        M48 = (1.25 * Math.max(m4, m8) + m12 + m16) * 1.75 * mgDNM;
        //TTGH SD-dầm trong
        M49 = (1.25 * Math.max(m1, m5) + m9 + m13) * 1.3*mgDTM;
        M410 = (1.25 * Math.max(m2, m6) + m10 + m14) * 1.3*mgDTM;
        M411 = (1.25 * Math.max(m3, m7) + m11 + m15) * 1.3*mgDTM;
        M412 = (1.25 * Math.max(m4, m8) + m12 + m16) * 1.3*mgDTM;
        //TTGH SD-dầm ngoài
        M413 = (1.25 * Math.max(m1, m5) + m9 + m13) * 1.3*mgDNM;
        M414 = (1.25 * Math.max(m2, m6) + m10 + m14) * 1.3*mgDNM;
        M415 = (1.25 * Math.max(m3, m7) + m11 + m15) * 1.3*mgDNM;
        M416 = (1.25 * Math.max(m4, m8) + m12 + m16) * 1.3*mgDNM;

        //LỰC CẮT XE 3 TRỤC
        //V DƯƠNG

        // tại gối
        if (Ls - 8.6 > 0) {
            q1 = 145 * heSoHoatTai + ((Ls - 4.3) / Ls) * 145 * heSoHoatTai + ((Ls - 8.6) / Ls) * 35 * heSoHoatTai;
            //     Toast.makeText(nhaplieuthietke.this,""+q1,Toast.LENGTH_LONG).show();
        } else if (Ls - 8.6 <= 0 && Ls - 4.3 > 0) {
            q1 = 145 * heSoHoatTai + ((Ls - 4.3) / Ls) * 145 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+q1,Toast.LENGTH_LONG).show();
        } else if (Ls - 4.3 <= 0) {
            q1 = 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q1,Toast.LENGTH_LONG).show();
        }
        //L/8

        if ((7 * Ls / 8) - 8.6 > 0) {
            q2 = (7.0 / 8) * 145 * heSoHoatTai + (((7 * Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai + (((7 * Ls / 8) - 8.6) / Ls) * 35 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q2,Toast.LENGTH_LONG).show();
        } else if ((7 * Ls / 8) - 8.6 <= 0 && (7 * Ls / 8) - 4.3 > 0) {
            q2 = (7.0 / 8) * 145 * heSoHoatTai + (((7 * Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q2,Toast.LENGTH_LONG).show();
        } else if ((7 * Ls / 8) - 4.3 <= 0) {
            q2 = (7.0 / 8) * 145 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+q2,Toast.LENGTH_LONG).show();
        }
        //L/4
        if ((3 * Ls / 4) - 8.6 > 0) {
            q3 = (3.0 / 4) * 145 * heSoHoatTai + (((3 * Ls / 4) - 4.3) / Ls) * 145 * heSoHoatTai + (((3 * Ls / 4) - 8.6) / Ls) * 35 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q3,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 4) - 8.6 <= 0 && (3 * Ls / 4) - 4.3 > 0) {
            q3 = (3.0 / 4) * 145 * heSoHoatTai + (((3 * Ls / 4) - 4.3) / Ls) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q3,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 4) - 4.3 <= 0) {
            q3 = (3.0 / 4) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q3,Toast.LENGTH_LONG).show();
        }
        //3L/8
        if ((5 * Ls / 8) - 8.6 > 0) {
            q4 = (5.0 / 8) * 145 * heSoHoatTai + (((5 * Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai + (((5 * Ls / 8) - 8.6) / Ls) * 35 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q4,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 8.6 <= 0 && (5 * Ls / 8) - 4.3 > 0) {
            q4 = (5.0 / 8) * 145 * heSoHoatTai + (((5 * Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q4,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 4.3 <= 0) {
            q4 = (5.0 / 8) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q4,Toast.LENGTH_LONG).show();
        }
        // L/2
        if ((Ls / 2) - 8.6 > 0) {
            q5 = (1.0 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 4.3) / Ls) * 145 * heSoHoatTai + (((Ls / 2) - 8.6) / Ls) * 35 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q5,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 8.6 <= 0 && (Ls / 2) - 4.3 > 0) {
            q5 = (1.0 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 4.3) / Ls) * 145 * heSoHoatTai;
            //     Toast.makeText(nhaplieuthietke.this,""+q5,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 4.3 <= 0) {
            q5 = (1.0 / 2) * 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q5,Toast.LENGTH_LONG).show();
        }
        // lực cắt ÂM
        // GÔI
        q6 = 0;
        // L/8
//
        if (((Ls / 8) - 8.6 > 0)) {
            q7 = (1.0 / 8) * 145 * heSoHoatTai + (((Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai + ((Ls / 8 - 8.6) / Ls) * 35 * heSoHoatTai;
            //    Toast.makeText(nhaplieuthietke.this,""+q7,Toast.LENGTH_LONG).show();
        } else if ((Ls / 8) - 8.6 <= 0 && (Ls / 8) - 4.3 > 0) {
            q7 = (1.0 / 8) * 145 * heSoHoatTai + (((Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        } else if ((Ls / 8) - 4.3 <= 0) {
            q7 = (1.0 / 8) * 145 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+q7,Toast.LENGTH_LONG).show();
        }
        // L/4
        if ((Ls / 4) - 8.6 > 0) {
            q8 = (1.0 / 4) * 145 * heSoHoatTai + (((Ls / 4) - 4.3) / Ls) * 145 * heSoHoatTai + (((Ls / 4) - 8.6) / Ls) * 35 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        } else if ((Ls / 4) - 8.6 <= 0 && (Ls / 4) - 4.3 > 0) {
            q8 = (1.0 / 4) * 145 * heSoHoatTai + (((Ls / 4) - 4.3) / Ls) * 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        } else if ((Ls / 4) - 4.3 <= 0) {
            q8 = (1.0 / 4) * 145 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q8,Toast.LENGTH_LONG).show();
        }

        //3L/8

        if ((3 * Ls / 8) - 8.6 > 0) {
            q9 = (3.0 / 8) * 145 * heSoHoatTai + (((3 * Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai + (((3 * Ls / 8) - 8.6) / Ls) * 35 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q9,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 8) - 8.6 <= 0 && (3 * Ls / 8) - 4.3 > 0) {
            q9 = (3.0 / 8) * 145 * heSoHoatTai + (((3 * Ls / 8) - 4.3) / Ls) * 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q9,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 8) - 4.3 <= 0) {
            q9 = (3.0 / 8) * 145 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q9,Toast.LENGTH_LONG).show();
        }

        //L/2

        if ((Ls / 2) - 8.6 > 0) {
            q10 = (1.0 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 4.3) / Ls) * 145 * heSoHoatTai + (((Ls / 2) - 8.6) / Ls) * 35 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q10,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 8.6 <= 0 && (Ls / 2) - 4.3 > 0) {
            q10 = (10 / 2) * 145 * heSoHoatTai + (((Ls / 2) - 4.3) / Ls) * 145 * heSoHoatTai;
            //Toast.makeText(nhaplieuthietke.this,""+q10,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 4.3 <= 0) {
            q10 = (1.0 / 2) * 145 * heSoHoatTai;
            //Toast.makeText(nhaplieuthietke.this,""+q10,Toast.LENGTH_LONG).show();
        }

        //lực cắt do xe 2 trục
        //lực cắt dương


        // gối

        if (Ls - 1.2 > 0) {
            q11 = 110 * heSoHoatTai + ((Ls - 1.2) / Ls) * 110 * heSoHoatTai;
            //Toast.makeText(nhaplieuthietke.this,""+q11,Toast.LENGTH_LONG).show();
        } else if (Ls - 1.2 <= 0) {
            q11 = 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q11,Toast.LENGTH_LONG).show();
        }
        // L/8

        if ((7 * Ls / 8) - 1.2 > 0) {
            q12 = (7.0 / 8) * 110 * heSoHoatTai + (((7 * Ls / 8) - 1.2) / Ls) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q12,Toast.LENGTH_LONG).show();
        } else if ((7 * Ls / 8) - 1.2 <= 0) {
            q12 = (7.0 / 8) * 110 * heSoHoatTai;
            Toast.makeText(nhaplieuthietke.this, "" + q12, Toast.LENGTH_LONG).show();
        }

        //L/4

        if ((3 * Ls / 4) - 1.2 > 0) {
            q13 = (3.0 / 4) * 110 * heSoHoatTai + (((3 * Ls / 4) - 1.2) / Ls) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q13,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 4) - 1.2 <= 0) {
            q13 = (3.0 / 4) * 110 * heSoHoatTai;
            //Toast.makeText(nhaplieuthietke.this,""+q13,Toast.LENGTH_LONG).show();
        }
        //3L/8

        if ((5 * Ls / 8) - 1.2 > 0) {
            q14 = (5.0 / 8) * 110 * heSoHoatTai + (((5 * Ls / 8) - 1.2) / Ls) * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q14,Toast.LENGTH_LONG).show();
        } else if ((5 * Ls / 8) - 1.2 <= 0) {
            q14 = (5.0 / 8) * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q14,Toast.LENGTH_LONG).show();
        }
        //L/2

        if ((Ls / 2) - 1.2 > 0) {
            q15 = (1.0 / 2) * 110 * heSoHoatTai + (((Ls / 2) - 1.2) / Ls) * 110 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+q15,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 1.2 <= 0) {
            q15 = (1.0 / 2) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q15,Toast.LENGTH_LONG).show();
        }


        // lực cắt ÂM

        // gói
        q16 = 0;

        //L/8

        if ((Ls / 8) - 1.2 > 0) {
            q17 = (1.0 / 8) * 110 * heSoHoatTai + (((Ls / 8) - 1.2) / Ls) * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q17,Toast.LENGTH_LONG).show();
        } else if ((Ls / 8) - 1.2 <= 0) {
            q17 = (1.0 / 8) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q17,Toast.LENGTH_LONG).show();
        }

        // L/4


        if ((Ls / 4) - 1.2 > 0) {
            q18 = (1.0 / 4) * 110 * heSoHoatTai + (((Ls / 4) - 1.2) / Ls) * 110 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+q18,Toast.LENGTH_LONG).show();
        } else if ((Ls / 4) - 1.2 <= 0) {
            q18 = (1.0 / 4) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q18,Toast.LENGTH_LONG).show();
        }

        //3l/8

        if ((3 * Ls / 8) - 1.2 > 0) {
            q19 = (3.0 / 8) * 110 * heSoHoatTai + (((3 * Ls / 8) - 1.2) / Ls) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q19,Toast.LENGTH_LONG).show();
        } else if ((3 * Ls / 8) - 1.2 <= 0) {
            q19 = (3 / 8) * 110 * heSoHoatTai;
            // Toast.makeText(nhaplieuthietke.this,""+q19,Toast.LENGTH_LONG).show();
        }
        //l/2

        if ((Ls / 2) - 1.2 > 0) {
            q20 = (1.0 / 2) * 110 * heSoHoatTai + (((Ls / 2) - 1.2) / Ls) * 110 * heSoHoatTai;
            //   Toast.makeText(nhaplieuthietke.this,""+q20,Toast.LENGTH_LONG).show();
        } else if ((Ls / 2) - 1.2 <= 0) {
            q20 = (1.0 / 2) * 110 * heSoHoatTai;
            //  Toast.makeText(nhaplieuthietke.this,""+q20,Toast.LENGTH_LONG).show();
        }

        // lực cắt do tải trọng làn
        // lực căt dương
        q21 = 0.5 * Ls * 9.3;
        q22 = 0.5 * (49.0 / 64) * Ls * 9.3;
        q23 = 0.5 * (9.0 / 16) * Ls * 9.3;
        q24 = 0.5 * (25.0 / 64) * Ls * 9.3;
        q25 = 0.5 * (1.0 / 4) * Ls * 9.3;

        // lwujc cắt âm
        q26 = 0;
        q27 = 0.5 * (1.0 / 64) * Ls * 9.3;
        q28 = 0.5 * (1.0 / 16) * Ls * 9.3;
        q29 = 0.5 * (9.0 / 64) * Ls * 9.3;
        q30 = 0.5 * (1.0 / 4) * Ls * 9.3;

        // lực cắt do người đi bộ
        // lwujc cắt dương
        q31 = 0.5 * Ls * PL;
        q32 = 0.5 * (49.0 / 64) * Ls * PL;
        q33 = 0.5 * (9.0 / 16) * Ls * PL;
        q34 = 0.5 * (25.0 / 64) * Ls * PL;
        q35 = 0.5 * (1.0 / 4) * Ls * PL;

        // lwucj cắt âm
        q36 = 0;
        q37 = 0.5 * (1.0 / 64) * Ls * PL;
        q38 = 0.5 * (1.0 / 16) * Ls * PL;
        q39 = 0.5 * (9.0 / 64) * Ls * PL;
        q40 = 0.5 * (1.0 / 4) * Ls * PL;

        /// lực cắt DUOWNGF
        // Dầm trong cd1
        Q41 = (1.25 * Math.max(q1, q11) + q21 + q31) * 1.75 * mgDTV;
        Q42 = (1.25 * Math.max(q2, q12) + q22 + q32) * 1.75 * mgDTV;
        Q43 = (1.25 * Math.max(q3, q13) + q23 + q33) * 1.75 * mgDTV;
        Q44 = (1.25 * Math.max(q4, q14) + q24 + q34) * 1.75 * mgDTV;
        Q45 = (1.25 * Math.max(q5, q15) + q25 + q35) * 1.75 * mgDTV;
        //Dầm trong sử dụng
        Q46 = (1.25 * Math.max(q1, q11) + q21 + q31) * 1.3 * mgDTV;
        Q47 = (1.25 * Math.max(q2, q12) + q22 + q32) * 1.3 * mgDTV;
        Q48 = (1.25 * Math.max(q3, q13) + q23 + q33) * 1.3 * mgDTV;
        Q49 = (1.25 * Math.max(q4, q14) + q24 + q34) * 1.3 * mgDTV;
        Q410 = (1.25 * Math.max(q5, q15) + q25 + q35) * 1.3 * mgDTV;
        // Dầm ngoài CD1
        Q411 = (1.25 * Math.max(q1, q11) + q21 + q31) * 1.75 * mgDNV;
        Q412 = (1.25 * Math.max(q2, q12) + q22 + q32) * 1.75 * mgDNV;
        Q413 = (1.25 * Math.max(q3, q13) + q23 + q33) * 1.75 * mgDNV;
        Q414 = (1.25 * Math.max(q4, q14) + q24 + q34) * 1.75 * mgDNV;
        Q415 = (1.25 * Math.max(q5, q15) + q25 + q35) * 1.75 * mgDNV;
        // Dầm ngoài SD
        Q416 = (1.25 * Math.max(q1, q11) + q21 + q31) * 1.3 * mgDNV;
        Q417 = (1.25 * Math.max(q2, q12) + q22 + q32) * 1.3 * mgDNV;
        Q418 = (1.25 * Math.max(q3, q13) + q23 + q33) * 1.3 * mgDNV;
        Q419 = (1.25 * Math.max(q4, q14) + q24 + q34) * 1.3 * mgDNV;
        Q420 = (1.25 * Math.max(q5, q15) + q25 + q35) * 1.3 * mgDNV;


        // lỰC CẮT ÂM
        // dầm trong CD1
        Q421 = (1.25 * Math.max(q6, q16) + q26 + q36) * 1.75 * mgDTV;
        Q422 = (1.25 * Math.max(q7, q17) + q27 + q37) * 1.75 * mgDTV;
        Q423 = (1.25 * Math.max(q8, q18) + q28 + q38) * 1.75 * mgDTV;
        Q424 = (1.25 * Math.max(q9, q19) + q29 + q39) * 1.75 * mgDTV;
        Q425 = (1.25 * Math.max(q10, q20) + q30 + q40) * 1.75 * mgDTV;
        // dầm trong sử dụng
        Q426 = (1.25 * Math.max(q6, q16) + q26 + q36) * 1 * mgDTV;
        Q427 = (1.25 * Math.max(q7, q17) + q27 + q37) * 1 * mgDTV;
        Q428 = (1.25 * Math.max(q8, q18) + q28 + q38) * 1 * mgDTV;
        Q429 = (1.25 * Math.max(q9, q19) + q29 + q39) * 1 * mgDTV;
        Q430 = (1.25 * Math.max(q10, q20) + q30 + q40) * 1 * mgDTV;
        // dầm ngoài SD
        Q431 = (1.25 * Math.max(q6, q16) + q26 + q36) * 1 * mgDNV;
        Q432 = (1.25 * Math.max(q7, q17) + q27 + q37) * 1 * mgDNV;
        Q433 = (1.25 * Math.max(q8, q18) + q28 + q38) * 1 * mgDNV;
        Q434 = (1.25 * Math.max(q9, q19) + q29 + q39) * 1 * mgDNV;
        Q435 = (1.25 * Math.max(q10, q20) + q30 + q40) * 1 * mgDNV;

        // DẦM NGOÀI CD1
        Q436 = (1.25 * Math.max(q6, q16) + q26 + q36) * 1.75 * mgDNV;
        Q437 = (1.25 * Math.max(q7, q17) + q27 + q37) * 1.75 * mgDNV;
        Q438 = (1.25 * Math.max(q8, q18) + q28 + q38) * 1.75 * mgDNV;
        Q439 = (1.25 * Math.max(q9, q19) + q29 + q39) * 1.75 * mgDNV;
        Q440 = (1.25 * Math.max(q10, q20) + q30 + q40) * 1.75 * mgDNV;

    }

    public void tinhNoiLuc1va2() {
        M31 = M11 + M21;
        M32 = M12 + M22;
        M33 = M13 + M23;
        M34 = M14 + M24;
        M35 = M15 + M25;
        M36 = M16 + M26;
        M37 = M17 + M27;
        M38 = M18 + M28;

        Q31 = Q11 + Q21;
        Q32 = Q12 + Q22;
        Q33 = Q13 + Q23;
        Q34 = Q14 + Q24;
        Q35 = Q15 + Q25;
        Q36 = Q16 + Q26;
        Q37 = Q17 + Q27;
        Q38 = Q18 + Q28;


    }

    public void tinhUngSuatTinhTaiGD2() {

        ///ứng suất THỚ TRÊN dầm trong
        // CD1
        f21 = (M21 * YlttDT * 1000000) / IltDT;
        f22 = (M22 * YlttDT * 1000000) / IltDT;
        f23 = (M23 * YlttDT * 1000000) / IltDT;
        f24 = (M24 * YlttDT * 1000000) / IltDT;
        //SD
        f29 = (M25 * YlttDT * 1000000) / IltDT;
        f210 = (M26 * YlttDT * 1000000) / IltDT;
        f211 = (M27 * YlttDT * 1000000) / IltDT;
        f212 = (M28 * YlttDT * 1000000) / IltDT;

        ///ỨNG SUẤT THỚ DƯỚI DẦM TRONG
        //CD1
        f25 = (M21 * YltdDT * 1000000) / IltDT;
        f26 = (M22 * YltdDT * 1000000) / IltDT;
        f27 = (M23 * YltdDT * 1000000) / IltDT;
        f28 = (M24 * YltdDT * 1000000) / IltDT;
        //SD
        f213 = (M25 * YltdDT * 1000000) / IltDT;
        f214 = (M26 * YltdDT * 1000000) / IltDT;
        f215 = (M27 * YltdDT * 1000000) / IltDT;
        f216 = (M28 * YltdDT * 1000000) / IltDT;


        ///ứng suất thớ trên dầm ngoài
        //CD1
        f217 = (M21 * YlttDN * 1000000) / IltDN;
        f218 = (M22 * YlttDN * 1000000) / IltDN;
        f219 = (M23 * YlttDN * 1000000) / IltDN;
        f220 = (M24 * YlttDN * 1000000) / IltDN;
        //SD
        f225 = (M25 * YlttDN * 1000000) / IltDN;
        f226 = (M26 * YlttDN * 1000000) / IltDN;
        f227 = (M27 * YlttDN * 1000000) / IltDN;
        f228 = (M28 * YlttDN * 1000000) / IltDN;
        ///ỨNG SUẤT THỚ DƯỚI DẦM NGOÀI
        // CD1
        f221 = (M21 * YltdDN * 1000000) / IltDN;
        f222 = (M22 * YltdDN * 1000000) / IltDN;
        f223 = (M23 * YltdDN * 1000000) / IltDN;
        f224 = (M24 * YltdDN * 1000000) / IltDN;
        //SD
        f229 = (M25 * YltdDN * 1000000) / IltDN;
        f230 = (M26 * YltdDN * 1000000) / IltDN;
        f231 = (M27 * YltdDN * 1000000) / IltDN;
        f232 = (M28 * YltdDN * 1000000) / IltDN;
    }

    public void tinhNoiLucTinhTaiGD2() {
        //tính momen CƯỜNG ĐỌ 1  TƯƠNG ỨNG MẶT CẮT 0, l/8 l/4 3l/8 l/2
        M21 = 1.5 * (7.0 / 128) * Ls * Ls * DC2DT;
        M22 = 1.5 * (3.0 / 32) * Ls * Ls * DC2DT;
        M23 = 1.5 * (15.0 / 128) * Ls * Ls * DC2DT;
        M24 = 1.5 * (1.0 / 8) * Ls * Ls * DC2DT;

        // tính momen SỬ DỤNG TƯƠNG ỨNG MẶT CẮT 0, l/8 l/4 3l/8 l/2
        M25 = 1 * (7.0 / 128) * Ls * Ls * DC2DT;
        M26 = 1 * (3.0 / 32) * Ls * Ls * DC2DT;
        M27 = 1 * (15.0 / 128) * Ls * Ls * DC2DT;
        M28 = 1 * (1.0 / 8) * Ls * Ls * DC2DT;

        // tính lực cắt CƯỜNG ĐỘ 1 TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q21 = 1.5 * 0.125 * Ls * DC2DT;
        Q22 = 1.5 * 0.25 * Ls * DC2DT;
        Q23 = 1.5 * 0.375 * Ls * DC2DT;
        Q24 = 1.5 * 0.5 * Ls * DC2DT;

        // tính lực cắt SỬ DỤNG TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q25 = 1 * 0.125 * Ls * DC2DT;
        Q26 = 1 * 0.25 * Ls * DC2DT;
        Q27 = 1 * 0.375 * Ls * DC2DT;
        Q28 = 1 * 0.5 * Ls * DC2DT;

    }

    public void tinhUngSuatTinhTaiGD1() {
        // thớ trên CĐ1
        f11 = (M11 * Ynct * 1000000) / Inc;
        f12 = (M12 * Ynct * 1000000) / Inc;
        f13 = (M13 * Ynct * 1000000) / Inc;
        f14 = (M14 * Ynct * 1000000) / Inc;

        // thớ dưới CD1
        f15 = (M11 * Yncd * 1000000) / Inc;
        f16 = (M12 * Yncd * 1000000) / Inc;
        f17 = (M13 * Yncd * 1000000) / Inc;
        f18 = (M14 * Yncd * 1000000) / Inc;

        //thớ trên SD
        f19 = (M15 * Ynct * 1000000) / Inc;
        f110 = (M16 * Ynct * 1000000) / Inc;
        f111 = (M17 * Ynct * 1000000) / Inc;
        f112 = (M18 * Ynct * 1000000) / Inc;

        // thớ dưới SD
        f113 = (M15 * Yncd * 1000000) / Inc;
        f114 = (M16 * Yncd * 1000000) / Inc;
        f115 = (M17 * Yncd * 1000000) / Inc;
        f116 = (M18 * Yncd * 1000000) / Inc;


    }

    @SuppressLint("SetTextI18n")
    public void tinhNoiLucTinhTaiGD1() {
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
        M11 = 1.25 * (7.0 / 128) * Ls * Ls * DC1;
        M12 = 1.25 * (3.0 / 32) * Ls * Ls * DC1;
        M13 = 1.25 * (15.0 / 128) * Ls * Ls * DC1;
        M14 = 1.25 * (1.0 / 8) * Ls * Ls * DC1;

        // tính momen SỬ DỤNG TƯƠNG ỨNG MẶT CẮT 0, l/8 l/4 3l/8 l/2
        M15 = 1 * (7.0 / 128) * Ls * Ls * DC1;
        M16 = 1 * (3.0 / 32) * Ls * Ls * DC1;
        M17 = 1 * (15.0 / 128) * Ls * Ls * DC1;
        M18 = 1 * (1.0 / 8) * Ls * Ls * DC1;

        // tính lực cắt CƯỜNG ĐỘ 1 TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q11 = 1.25 * 0.125 * Ls * DC1;
        Q12 = 1.25 * 0.25 * Ls * DC1;
        Q13 = 1.25 * 0.375 * Ls * DC1;
        Q14 = 1.25 * 0.5 * Ls * DC1;

        // tính lực cắt SỬ DỤNG TƯƠNG ỨNG MẶT CẮT l/2 3L/8 L/4 L/8 0
        Q15 = 1 * 0.125 * Ls * DC1;
        Q16 = 1 * 0.25 * Ls * DC1;
        Q17 = 1 * 0.375 * Ls * DC1;
        Q18 = 1 * 0.5 * Ls * DC1;
    }

    public void tinhHeSoPhanBoLLTheoLanDoiVoiLucCat() {
        // 1 làn xe chất tảu DT
        mgSIV = 0.36 + (S / 7600);
        //2 or nhiều DT
        mgMIV = 0.2 + (S / 3600) - (Math.pow(S / 10700, 2));
        // 2 làn DN
        eV = 0.6 + (de / 3000);
        mgMEV2lan = eV * mgMIV;
        //
        mgDTV = Math.max(mgSIV, mgMIV);
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
        mgPLVDT = 2 * T / ndc;
        mgPLVDN = 1.2 * 0.5 * T * (((S + de - Blc) / S) + ((S + de - T - Blc) / S));

        //
        mgMEV1lan = 0.5 * ((2 * S + 2 * de - 2 * Blc - 2 * T - 2400) / S);
        mgDNV = Math.max(mgMEV1lan, mgMEV2lan);


    }

    public void tinhHeSoPhanBoLLTheoLanDoiVoiMomen() {
        double eg;
        // Khoảng cách giữa trọng trâm của dầm và của BMC
        eg = Ynct + ts / 2;
        //Tham số độ cứng dọc
        Kg = n * (Inc + Adt * Math.pow(eg, 2));
        // Dầm trong
        ////1 làn chất tải
        mgSIM = 0.06 + (Math.pow(S / 4300, 0.4)) * (Math.pow(S / (L * 1000), 0.3)) * (Math.pow((Kg / (L * 1000 * Math.pow(ts, 3))), 0.1));
        //   Toast.makeText(nhaplieuthietke.this,""+mgSIM,Toast.LENGTH_LONG).show();
        ////2 hoặc nhiều làn xe chất tải
        mgMIM = 0.075 + (Math.pow(S / 2900, 0.6)) * (Math.pow(S / (L * 1000), 0.2)) * (Math.pow((Kg / (L * 1000 * Math.pow(ts, 3))), 0.1));
        //  Toast.makeText(nhaplieuthietke.this,""+mgMIM,Toast.LENGTH_LONG).show();
        double e1;
        e1 = 0.77 + (de / 2800);
        if (e1 >= 1) {
            eM = e1;
        } else {
            eM = 1;
        }
        mgMEM2lan = eM * mgMIM;
        //  Toast.makeText(nhaplieuthietke.this,""+mgMEM2lan,Toast.LENGTH_LONG).show();
        mgDTM = Math.max(mgSIM, mgMIM);
        mgMEM1lan = 0.5 * ((2 * S + 2 * de - 2 * Blc - 2 * T - 2400) / S);
        mgDNM = Math.max(mgMEM1lan, mgMEM2lan);
    }

    public void tinhKhoiLuongGD2() {
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
        DClcDN = (DClcT + DClcBT) / ndc;
        DClcDT = (DClcT + DClcBT) / ndc;
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
        DW = (taf * yaf * Bxc) / (1000 * ndc);
        DC2DN = DW + DClcDN;
        DC2DT = DW + DClcDT;
        //  Toast.makeText(nhaplieuthietke.this,""+DC2DT,Toast.LENGTH_LONG).show();
        DCDT = DC2DT + DC1;
        DCDN = DC2DN + DC1;
    }

    public void tinhKhoiLuongGD1() {
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
        DCdc = Adt * ys / Math.pow(10, 6);
        // Toast.makeText(nhaplieuthietke.this,""+DCdc,Toast.LENGTH_LONG).show();
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
        DCbmc = (yc * ts * S) / (Math.pow(10, 6));
        //  Toast.makeText(nhaplieuthietke.this, ""+DCbmc,Toast.LENGTH_LONG).show();

        DClkn1 = (Adn * Ldn * ys * 2) / (L * Math.pow(10, 9));
        //Toast.makeText(nhaplieuthietke.this,""+DClkn1,Toast.LENGTH_LONG).show();
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
        DClkn2 = Atg * ys * 11 * (2 * (S - tw) + 2 * Math.sqrt(Math.pow((S - tw) / 2, 2) + Math.pow(hlkn, 2))) / (L * Math.pow(10, 9));
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
        DClkd = Atg * ys * (2 * (Math.sqrt(Math.pow(S - tw, 2) + Math.pow(S2, 2))) + 10 * (Math.sqrt(Math.pow(S - tw, 2) + Math.pow(Slkn, 2)))) / (L * Math.pow(10, 9));
        DC1 = DCdc + DCbmc + DClkn1 + DClkn2 + DClkd + DCneo;
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
        Ldn = S - tw;
        txtLdn.setText("" + Ldn);

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
        //Toast.makeText(nhaplieuthietke.this, "" + YstdDN, Toast.LENGTH_LONG).show();
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

        //Chiều cao dàm chủ
        try {
            D = Double.parseDouble(edtChieuCaoDC.getText().toString());

            if (D < 0) {

                edtChieuCaoDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoDC.setError("Hãy nhập giá trị");
        }
        Dw= D-tfb-tft;
        SlttDT = (Bft * tft * (D - (tft / 2)) + Dw * tw * (tfb + 0.5 * Dw) + Bfb * tfb * 0.5 * tfb + BsDT * ts * (D + 0.5 * ts));
        SlttDN = (Bft * tft * (D - (tft / 2)) + Dw * tw * (tfb + 0.5 * Dw) + Bfb * tfb * 0.5 * tfb + BsDN * ts * (D + 0.5 * ts));

        //Yltd
        YltdDT = (SlttDT / AltDT);
        YltdDN = (SlttDN / AltDN);
        //  Toast.makeText(nhaplieuthietke.this, "" + YltdDN, Toast.LENGTH_LONG).show();
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
        Snct = (((Bft * tft) * (D - (tft / 2.))) + ((Dw * tw) * (D - tft - (Dw / 2.))) + ((Bfb * tfb) * (tfb / 2.)));
        //  Toast.makeText(nhaplieuthietke.this, "" + Snct, Toast.LENGTH_LONG).show();
        Yncd = (Snct / Anc);
        // Toast.makeText(nhaplieuthietke.this, "" + Yncd, Toast.LENGTH_LONG).show();
        Ynct = (D - Yncd);
        // Toast.makeText(nhaplieuthietke.this, "" + Ynct, Toast.LENGTH_LONG).show();
        Inc = ((Bft * (Math.pow(tft, 3)) / 12) + (Bft * tft) * Math.pow((Ynct - 0.5 * tft), 2) + (Bfb * Math.pow(tfb, 3) / 12) + (Bfb * tfb) * Math.pow((Yncd - 0.5 * tfb), 2) + (tw * Math.pow(Dw, 3) / 12) + (tw * Dw) + (tw * Dw) * Math.pow((0.5 * Dw + tfb - Yncd), 2));
        //  Toast.makeText(nhaplieuthietke.this, "" + Inc, Toast.LENGTH_LONG).show();
        Sncd = (Anc * Ynct);
        // Toast.makeText(nhaplieuthietke.this, "" + Sncd, Toast.LENGTH_LONG).show();


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
        //    Toast.makeText(nhaplieuthietke.this, "n=" + n, Toast.LENGTH_LONG).show();
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
        //   Toast.makeText(nhaplieuthietke.this, "bc=" + bc, Toast.LENGTH_LONG).show();
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
        //  Toast.makeText(nhaplieuthietke.this, "bi=" + bi, Toast.LENGTH_LONG).show();
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
        //Chiều cao dàm chủ
        try {
            D = Double.parseDouble(edtChieuCaoDC.getText().toString());

            if (D < 0) {

                edtChieuCaoDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtChieuCaoDC.setError("Hãy nhập giá trị");
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


        // Diện tích dầm thép // Adt
        Dw=D-tft-tfb;
        edtChieuCaoSuon.setText(""+Dw);
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

        try {
            DuThuaBMC = DuThuaBMC = Double.parseDouble(edtDuThuaBMC.getText().toString());

            if (DuThuaBMC < 0) {

                edtDuThuaBMC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDuThuaBMC.setError("Hãy nhập giá trị");
        }
        try {
            Dtt = Dtd = Double.parseDouble(edtDtt.getText().toString());

            if (Dtt < 0) {

                edtDtt.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDtt.setError("Hãy nhập giá trị");
        }
        try {
            Dtt_ct = Dtd_ct = Double.parseDouble(edtDtt_ct.getText().toString());

            if (Dtt_ct < 0) {

                edtDtt_ct.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDtt_ct.setError("Hãy nhập giá trị");
        }
        try {
            Dbaove_d = Dbaove_t = Double.parseDouble(edtDbaove_t.getText().toString());

            if (Dbaove_t < 0) {

                edtDbaove_t.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtDbaove_t.setError("Hãy nhập giá trị");
        }


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
        // edtKhoangCachTimDNDenauDC Khoàng cách dm đến dầm chủ
        try {
            S1 = Double.parseDouble(edtKhoangCachTimDNDenauDC.getText().toString());
            if (S1 < 0) {
                edtKhoangCachTimDNDenauDC.setError("Lỗi: Nhập số lớn hơn 0");
            }
        } catch (Exception e) {
            edtKhoangCachTimDNDenauDC.setError("Hãy nhập giá trị");
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

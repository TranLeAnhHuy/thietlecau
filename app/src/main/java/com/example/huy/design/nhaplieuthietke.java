package com.example.huy.design;

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

public class nhaplieuthietke extends AppCompatActivity {
    EditText edtTenDuAn, edtHoatTaiTieuChuan, edtChieuDaiNhip, edtChieuDaiNhipTinhToan, edtBeRongPhanXeChay, edtBeRongLanCan, edtTongBeRongToanCuaCau;
    EditText edtLoaiLienKetSuDung, edtCauTaoDamChu, edtMatCatNgangDamChu, edtCuongDoChiuNenCuaBeTong, edtTiTrongCuaBeTong, edtModuynDanHoiCuaBeTong;
    EditText edtChieuDayBMC, edtChieuDayLopPhu, edtTytrongVLlamLopPhu, edtThepKetCau, edtModuynDanHoiThep, edtCuongDoChiuKeoMIN, edtCuongDoChayMIN;
    EditText edtTiTrongThep, edtSoLuongDamChu, edtKhoangCachGiuaDC, edtChieuDaiPhanHang, edtChieuCaoDC, edtChieuRongBanCanhTren, edtChieuDayBCT;
    EditText edtChieuRongBCD, edtChieuDayBCD, edtChieuDaySuonDam, edtChieuCaoSuon, edtSoLuongDamNgang1Nhip, edtTongSoDamNgang;
    EditText edtYv, edtKhoangCachTimDNĐenauDC, edtS2, edthn, edtbn, edttfdn, edttwdn, edthwdn, edta, edtnlkn, edthlkn, edtSlkn, edtb,edtAtg;
    TextView txtDienTichDamThep, txtModuynDanHoiCuaBeTong, txtAdn, txtnlkd, txtLdn;
    Button btnTinhToan;
    EditText edtDCneo,edtDClcT, edtDClcBT;
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
    double DClcT, DClcBT,DClcDN,DClcDT;

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


                    // đóng gói và truyền dữ liệu
                    Intent KLHintent = new Intent(nhaplieuthietke.this, KQKhongLienHop.class);
                    Bundle KLHbundle = new Bundle();
                    KLHbundle.putDouble("Anc", Anc);
                    KLHbundle.putDouble("Snct", Snct);
                    KLHbundle.putDouble("Yncd", Yncd);
                    KLHbundle.putDouble("Ynct", Ynct);
                    KLHbundle.putDouble("Inc", Inc);
                    KLHbundle.putDouble("Sncd", Sncd);
                    //dài hạn
                    KLHbundle.putDouble("BsDT", BsDT);
                    KLHbundle.putDouble("BsDN", BsDN);
                    KLHbundle.putDouble("AltDT", AltDT);
                    KLHbundle.putDouble("AltDN", AltDN);
                    KLHbundle.putDouble("SlttDT", SlttDT);
                    KLHbundle.putDouble("SlttDN", SlttDN);
                    KLHbundle.putDouble("YltdDT", YltdDT);
                    KLHbundle.putDouble("YltdDN", YltdDN);
                    KLHbundle.putDouble("YlttDT", YlttDT);
                    KLHbundle.putDouble("YlttDN", YlttDN);
                    KLHbundle.putDouble("IltDT", IltDT);
                    KLHbundle.putDouble("IltDN", IltDN);
                    // ngắn hạn
                    KLHbundle.putDouble("BssDT", BssDT);
                    KLHbundle.putDouble("BssDN", BssDN);
                    KLHbundle.putDouble("AstDT", AstDT);
                    KLHbundle.putDouble("AstDN", AstDN);
                    KLHbundle.putDouble("SsttDT", SsttDT);
                    KLHbundle.putDouble("SsttDN", SsttDN);
                    KLHbundle.putDouble("YstdDT", YstdDT);
                    KLHbundle.putDouble("YstdDN", YstdDN);
                    KLHbundle.putDouble("YsttDT", YsttDT);
                    KLHbundle.putDouble("YsttDN", YsttDN);
                    KLHbundle.putDouble("IstDT", IstDT);
                    KLHbundle.putDouble("IstDN", IstDN);


                    KLHintent.putExtra("KLHbundle", KLHbundle);
                    startActivity(KLHintent);


                }


            }
        });

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
        Toast.makeText(nhaplieuthietke.this,""+DClcDN,Toast.LENGTH_LONG).show();

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
        DCdc=Adt*ys;
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
        Toast.makeText(nhaplieuthietke.this,""+DClkn2,Toast.LENGTH_LONG).show();
        DClkd= 0;
        DC1=DCdc+DCbmc+DClkn1+DClkn2+DClkd+DCneo;
        Toast.makeText(nhaplieuthietke.this,""+DC1,Toast.LENGTH_LONG).show();

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


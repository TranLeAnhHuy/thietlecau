package com.example.huy.design;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "savedata")
public class savedata {
    @PrimaryKey
    @NonNull
    @ColumnInfo
    public String edtTenDuAn;
    @ColumnInfo
    public String edtHoatTaiTieuChuan;
    @ColumnInfo
    public String edtChieuDaiNhip;
    @ColumnInfo
    public String edtChieuDaiNhipTinhToan;
    @ColumnInfo
    public String edtBeRongPhanXeChay;
    @ColumnInfo
    public String edtBeRongLanCan;
    @ColumnInfo
    public String edtTongBeRongToanCuaCau;
    @ColumnInfo
    public String edtLoaiLienKetSuDung;
    @ColumnInfo
    public String edtCauTaoDamChu;
    @ColumnInfo
    public String edtMatCatNgangDamChu;
    @ColumnInfo
    public String edtCuongDoChiuNenCuaBeTong;
    @ColumnInfo
    public String edtTiTrongCuaBeTong;
    @ColumnInfo
    public String edtModuynDanHoiCuaBeTong;
    @ColumnInfo
    public String edtChieuDayBMC;
    @ColumnInfo
    public String edtChieuDayLopPhu;
    @ColumnInfo
    public String edtTytrongVLlamLopPhu;
    @ColumnInfo
    public String edtThepKetCau;
    @ColumnInfo
    public String edtModuynDanHoiThep;
    @ColumnInfo
    public String edtCuongDoChiuKeoMIN;
    @ColumnInfo
    public String edtCuongDoChayMIN;
    @ColumnInfo
    public String edtTiTrongThep;
    @ColumnInfo
    public String edtSoLuongDamChu;
    @ColumnInfo
    public String edtKhoangCachGiuaDC;
    @ColumnInfo
    public String edtChieuDaiPhanHang;
    @ColumnInfo
    public String edtChieuCaoDC;
    @ColumnInfo
    public String edtChieuRongBanCanhTren;
    @ColumnInfo
    public String edtChieuDayBCT;
    @ColumnInfo
    public String edtChieuRongBCD;
    @ColumnInfo
    public String edtChieuDayBCD;
    @ColumnInfo
    public String edtChieuDaySuonDam;
    @ColumnInfo
    public String edtChieuCaoSuon;
    @ColumnInfo
    public String edtSoLuongDamNgang1Nhip;
    @ColumnInfo
    public String edtTongSoDamNgang;
    @ColumnInfo
    public String edtYv;
    @ColumnInfo
    public String edtKhoangCachTimDNDenauDC;
    @ColumnInfo
    public String edtS2;
    @ColumnInfo
    public String edthn;
    @ColumnInfo
    public String edtbn;
    @ColumnInfo
    public String edttfdn;
    @ColumnInfo
    public String edttwdn;
    @ColumnInfo
    public String edthwdn;
    @ColumnInfo
    public String edta;
    @ColumnInfo
    public String edtnlkn;
    @ColumnInfo
    public String edthlkn;
    @ColumnInfo
    public String edtSlkn;
    @ColumnInfo
    public String edtb;
    @ColumnInfo
    public String edtAtg;
    @ColumnInfo
    public String edtDCneo;
    @ColumnInfo
    public String edtDClcT;
    @ColumnInfo
    public String edtDClcBT;
    @ColumnInfo
    public String edtPL;
    @ColumnInfo
    public String edtT;
    @ColumnInfo
    public String edtDtt;
    @ColumnInfo
    public String edtDtt_ct;
    @ColumnInfo
    public String edtDbaove_t;
    @ColumnInfo
    public String edtd0;
    @ColumnInfo
    public String edtnn;
    @ColumnInfo
    public String edtdneo;
    @ColumnInfo
    public String edtpn;

    ///////////////
    @ColumnInfo
    public  String edtDuThuaBMC;

    public savedata(String edtTenDuAn, String edtHoatTaiTieuChuan, String edtChieuDaiNhip, String edtChieuDaiNhipTinhToan, String edtBeRongPhanXeChay, String edtBeRongLanCan, String edtTongBeRongToanCuaCau, String edtLoaiLienKetSuDung, String edtCauTaoDamChu, String edtMatCatNgangDamChu, String edtCuongDoChiuNenCuaBeTong, String edtTiTrongCuaBeTong, String edtModuynDanHoiCuaBeTong, String edtChieuDayBMC, String edtChieuDayLopPhu, String edtTytrongVLlamLopPhu, String edtThepKetCau, String edtModuynDanHoiThep, String edtCuongDoChiuKeoMIN, String edtCuongDoChayMIN, String edtTiTrongThep, String edtSoLuongDamChu, String edtKhoangCachGiuaDC, String edtChieuDaiPhanHang, String edtChieuCaoDC, String edtChieuRongBanCanhTren, String edtChieuDayBCT, String edtChieuRongBCD, String edtChieuDayBCD, String edtChieuDaySuonDam, String edtChieuCaoSuon, String edtSoLuongDamNgang1Nhip, String edtTongSoDamNgang, String edtYv, String edtKhoangCachTimDNDenauDC, String edtS2, String edthn, String edtbn, String edttfdn, String edttwdn, String edthwdn, String edta, String edtnlkn, String edthlkn, String edtSlkn, String edtb, String edtAtg, String edtDCneo, String edtDClcT, String edtDClcBT, String edtPL, String edtT, String edtDtt, String edtDtt_ct, String edtDbaove_t, String edtd0, String edtnn, String edtdneo, String edtpn) {
        this.edtTenDuAn = edtTenDuAn;
        this.edtHoatTaiTieuChuan = edtHoatTaiTieuChuan;
        this.edtChieuDaiNhip = edtChieuDaiNhip;
        this.edtChieuDaiNhipTinhToan = edtChieuDaiNhipTinhToan;
        this.edtBeRongPhanXeChay = edtBeRongPhanXeChay;
        this.edtBeRongLanCan = edtBeRongLanCan;
        this.edtTongBeRongToanCuaCau = edtTongBeRongToanCuaCau;
        this.edtLoaiLienKetSuDung = edtLoaiLienKetSuDung;
        this.edtCauTaoDamChu = edtCauTaoDamChu;
        this.edtMatCatNgangDamChu = edtMatCatNgangDamChu;
        this.edtCuongDoChiuNenCuaBeTong = edtCuongDoChiuNenCuaBeTong;
        this.edtTiTrongCuaBeTong = edtTiTrongCuaBeTong;
        this.edtModuynDanHoiCuaBeTong = edtModuynDanHoiCuaBeTong;
        this.edtChieuDayBMC = edtChieuDayBMC;
        this.edtChieuDayLopPhu = edtChieuDayLopPhu;
        this.edtTytrongVLlamLopPhu = edtTytrongVLlamLopPhu;
        this.edtThepKetCau = edtThepKetCau;
        this.edtModuynDanHoiThep = edtModuynDanHoiThep;
        this.edtCuongDoChiuKeoMIN = edtCuongDoChiuKeoMIN;
        this.edtCuongDoChayMIN = edtCuongDoChayMIN;
        this.edtTiTrongThep = edtTiTrongThep;
        this.edtSoLuongDamChu = edtSoLuongDamChu;
        this.edtKhoangCachGiuaDC = edtKhoangCachGiuaDC;
        this.edtChieuDaiPhanHang = edtChieuDaiPhanHang;
        this.edtChieuCaoDC = edtChieuCaoDC;
        this.edtChieuRongBanCanhTren = edtChieuRongBanCanhTren;
        this.edtChieuDayBCT = edtChieuDayBCT;
        this.edtChieuRongBCD = edtChieuRongBCD;
        this.edtChieuDayBCD = edtChieuDayBCD;
        this.edtChieuDaySuonDam = edtChieuDaySuonDam;
        this.edtChieuCaoSuon = edtChieuCaoSuon;
        this.edtSoLuongDamNgang1Nhip = edtSoLuongDamNgang1Nhip;
        this.edtTongSoDamNgang = edtTongSoDamNgang;
        this.edtYv = edtYv;
        this.edtKhoangCachTimDNDenauDC = edtKhoangCachTimDNDenauDC;
        this.edtS2 = edtS2;
        this.edthn = edthn;
        this.edtbn = edtbn;
        this.edttfdn = edttfdn;
        this.edttwdn = edttwdn;
        this.edthwdn = edthwdn;
        this.edta = edta;
        this.edtnlkn = edtnlkn;
        this.edthlkn = edthlkn;
        this.edtSlkn = edtSlkn;
        this.edtb = edtb;
        this.edtAtg = edtAtg;
        this.edtDCneo = edtDCneo;
        this.edtDClcT = edtDClcT;
        this.edtDClcBT = edtDClcBT;
        this.edtPL = edtPL;
        this.edtT = edtT;
        this.edtDtt = edtDtt;
        this.edtDtt_ct = edtDtt_ct;
        this.edtDbaove_t = edtDbaove_t;
        this.edtd0 = edtd0;
        this.edtnn = edtnn;
        this.edtdneo = edtdneo;
        this.edtpn = edtpn;
    }

    public savedata() {

    }

    public String getEdtTenDuAn() {
        return edtTenDuAn;
    }

    public void setEdtTenDuAn(String edtTenDuAn) {
        this.edtTenDuAn = edtTenDuAn;
    }

    public String getEdtHoatTaiTieuChuan() {
        return edtHoatTaiTieuChuan;
    }

    public void setEdtHoatTaiTieuChuan(String edtHoatTaiTieuChuan) {
        this.edtHoatTaiTieuChuan = edtHoatTaiTieuChuan;
    }

    public String getEdtChieuDaiNhip() {
        return edtChieuDaiNhip;
    }

    public void setEdtChieuDaiNhip(String edtChieuDaiNhip) {
        this.edtChieuDaiNhip = edtChieuDaiNhip;
    }

    public String getEdtChieuDaiNhipTinhToan() {
        return edtChieuDaiNhipTinhToan;
    }

    public void setEdtChieuDaiNhipTinhToan(String edtChieuDaiNhipTinhToan) {
        this.edtChieuDaiNhipTinhToan = edtChieuDaiNhipTinhToan;
    }

    public String getEdtBeRongPhanXeChay() {
        return edtBeRongPhanXeChay;
    }

    public void setEdtBeRongPhanXeChay(String edtBeRongPhanXeChay) {
        this.edtBeRongPhanXeChay = edtBeRongPhanXeChay;
    }

    public String getEdtBeRongLanCan() {
        return edtBeRongLanCan;
    }

    public void setEdtBeRongLanCan(String edtBeRongLanCan) {
        this.edtBeRongLanCan = edtBeRongLanCan;
    }

    public String getEdtTongBeRongToanCuaCau() {
        return edtTongBeRongToanCuaCau;
    }

    public void setEdtTongBeRongToanCuaCau(String edtTongBeRongToanCuaCau) {
        this.edtTongBeRongToanCuaCau = edtTongBeRongToanCuaCau;
    }

    public String getEdtLoaiLienKetSuDung() {
        return edtLoaiLienKetSuDung;
    }

    public void setEdtLoaiLienKetSuDung(String edtLoaiLienKetSuDung) {
        this.edtLoaiLienKetSuDung = edtLoaiLienKetSuDung;
    }

    public String getEdtCauTaoDamChu() {
        return edtCauTaoDamChu;
    }

    public void setEdtCauTaoDamChu(String edtCauTaoDamChu) {
        this.edtCauTaoDamChu = edtCauTaoDamChu;
    }

    public String getEdtMatCatNgangDamChu() {
        return edtMatCatNgangDamChu;
    }

    public void setEdtMatCatNgangDamChu(String edtMatCatNgangDamChu) {
        this.edtMatCatNgangDamChu = edtMatCatNgangDamChu;
    }

    public String getEdtCuongDoChiuNenCuaBeTong() {
        return edtCuongDoChiuNenCuaBeTong;
    }

    public void setEdtCuongDoChiuNenCuaBeTong(String edtCuongDoChiuNenCuaBeTong) {
        this.edtCuongDoChiuNenCuaBeTong = edtCuongDoChiuNenCuaBeTong;
    }

    public String getEdtTiTrongCuaBeTong() {
        return edtTiTrongCuaBeTong;
    }

    public void setEdtTiTrongCuaBeTong(String edtTiTrongCuaBeTong) {
        this.edtTiTrongCuaBeTong = edtTiTrongCuaBeTong;
    }

    public String getEdtModuynDanHoiCuaBeTong() {
        return edtModuynDanHoiCuaBeTong;
    }

    public void setEdtModuynDanHoiCuaBeTong(String edtModuynDanHoiCuaBeTong) {
        this.edtModuynDanHoiCuaBeTong = edtModuynDanHoiCuaBeTong;
    }

    public String getEdtChieuDayBMC() {
        return edtChieuDayBMC;
    }

    public void setEdtChieuDayBMC(String edtChieuDayBMC) {
        this.edtChieuDayBMC = edtChieuDayBMC;
    }

    public String getEdtChieuDayLopPhu() {
        return edtChieuDayLopPhu;
    }

    public void setEdtChieuDayLopPhu(String edtChieuDayLopPhu) {
        this.edtChieuDayLopPhu = edtChieuDayLopPhu;
    }

    public String getEdtTytrongVLlamLopPhu() {
        return edtTytrongVLlamLopPhu;
    }

    public void setEdtTytrongVLlamLopPhu(String edtTytrongVLlamLopPhu) {
        this.edtTytrongVLlamLopPhu = edtTytrongVLlamLopPhu;
    }

    public String getEdtThepKetCau() {
        return edtThepKetCau;
    }

    public void setEdtThepKetCau(String edtThepKetCau) {
        this.edtThepKetCau = edtThepKetCau;
    }

    public String getEdtModuynDanHoiThep() {
        return edtModuynDanHoiThep;
    }

    public void setEdtModuynDanHoiThep(String edtModuynDanHoiThep) {
        this.edtModuynDanHoiThep = edtModuynDanHoiThep;
    }

    public String getEdtCuongDoChiuKeoMIN() {
        return edtCuongDoChiuKeoMIN;
    }

    public void setEdtCuongDoChiuKeoMIN(String edtCuongDoChiuKeoMIN) {
        this.edtCuongDoChiuKeoMIN = edtCuongDoChiuKeoMIN;
    }

    public String getEdtCuongDoChayMIN() {
        return edtCuongDoChayMIN;
    }

    public void setEdtCuongDoChayMIN(String edtCuongDoChayMIN) {
        this.edtCuongDoChayMIN = edtCuongDoChayMIN;
    }

    public String getEdtTiTrongThep() {
        return edtTiTrongThep;
    }

    public void setEdtTiTrongThep(String edtTiTrongThep) {
        this.edtTiTrongThep = edtTiTrongThep;
    }

    public String getEdtSoLuongDamChu() {
        return edtSoLuongDamChu;
    }

    public void setEdtSoLuongDamChu(String edtSoLuongDamChu) {
        this.edtSoLuongDamChu = edtSoLuongDamChu;
    }

    public String getEdtKhoangCachGiuaDC() {
        return edtKhoangCachGiuaDC;
    }

    public void setEdtKhoangCachGiuaDC(String edtKhoangCachGiuaDC) {
        this.edtKhoangCachGiuaDC = edtKhoangCachGiuaDC;
    }

    public String getEdtChieuDaiPhanHang() {
        return edtChieuDaiPhanHang;
    }

    public void setEdtChieuDaiPhanHang(String edtChieuDaiPhanHang) {
        this.edtChieuDaiPhanHang = edtChieuDaiPhanHang;
    }

    public String getEdtChieuCaoDC() {
        return edtChieuCaoDC;
    }

    public void setEdtChieuCaoDC(String edtChieuCaoDC) {
        this.edtChieuCaoDC = edtChieuCaoDC;
    }

    public String getEdtChieuRongBanCanhTren() {
        return edtChieuRongBanCanhTren;
    }

    public void setEdtChieuRongBanCanhTren(String edtChieuRongBanCanhTren) {
        this.edtChieuRongBanCanhTren = edtChieuRongBanCanhTren;
    }

    public String getEdtChieuDayBCT() {
        return edtChieuDayBCT;
    }

    public void setEdtChieuDayBCT(String edtChieuDayBCT) {
        this.edtChieuDayBCT = edtChieuDayBCT;
    }

    public String getEdtChieuRongBCD() {
        return edtChieuRongBCD;
    }

    public void setEdtChieuRongBCD(String edtChieuRongBCD) {
        this.edtChieuRongBCD = edtChieuRongBCD;
    }

    public String getEdtChieuDayBCD() {
        return edtChieuDayBCD;
    }

    public void setEdtChieuDayBCD(String edtChieuDayBCD) {
        this.edtChieuDayBCD = edtChieuDayBCD;
    }

    public String getEdtChieuDaySuonDam() {
        return edtChieuDaySuonDam;
    }

    public void setEdtChieuDaySuonDam(String edtChieuDaySuonDam) {
        this.edtChieuDaySuonDam = edtChieuDaySuonDam;
    }

    public String getEdtChieuCaoSuon() {
        return edtChieuCaoSuon;
    }

    public void setEdtChieuCaoSuon(String edtChieuCaoSuon) {
        this.edtChieuCaoSuon = edtChieuCaoSuon;
    }

    public String getEdtSoLuongDamNgang1Nhip() {
        return edtSoLuongDamNgang1Nhip;
    }

    public void setEdtSoLuongDamNgang1Nhip(String edtSoLuongDamNgang1Nhip) {
        this.edtSoLuongDamNgang1Nhip = edtSoLuongDamNgang1Nhip;
    }

    public String getEdtTongSoDamNgang() {
        return edtTongSoDamNgang;
    }

    public void setEdtTongSoDamNgang(String edtTongSoDamNgang) {
        this.edtTongSoDamNgang = edtTongSoDamNgang;
    }

    public String getEdtYv() {
        return edtYv;
    }

    public void setEdtYv(String edtYv) {
        this.edtYv = edtYv;
    }

    public String getEdtKhoangCachTimDNDenauDC() {
        return edtKhoangCachTimDNDenauDC;
    }

    public void setEdtKhoangCachTimDNDenauDC(String edtKhoangCachTimDNDenauDC) {
        this.edtKhoangCachTimDNDenauDC = edtKhoangCachTimDNDenauDC;
    }

    public String getEdtS2() {
        return edtS2;
    }

    public void setEdtS2(String edtS2) {
        this.edtS2 = edtS2;
    }

    public String getEdthn() {
        return edthn;
    }

    public void setEdthn(String edthn) {
        this.edthn = edthn;
    }

    public String getEdtbn() {
        return edtbn;
    }

    public void setEdtbn(String edtbn) {
        this.edtbn = edtbn;
    }

    public String getEdttfdn() {
        return edttfdn;
    }

    public void setEdttfdn(String edttfdn) {
        this.edttfdn = edttfdn;
    }

    public String getEdttwdn() {
        return edttwdn;
    }

    public void setEdttwdn(String edttwdn) {
        this.edttwdn = edttwdn;
    }

    public String getEdthwdn() {
        return edthwdn;
    }

    public void setEdthwdn(String edthwdn) {
        this.edthwdn = edthwdn;
    }

    public String getEdta() {
        return edta;
    }

    public void setEdta(String edta) {
        this.edta = edta;
    }

    public String getEdtnlkn() {
        return edtnlkn;
    }

    public void setEdtnlkn(String edtnlkn) {
        this.edtnlkn = edtnlkn;
    }

    public String getEdthlkn() {
        return edthlkn;
    }

    public void setEdthlkn(String edthlkn) {
        this.edthlkn = edthlkn;
    }

    public String getEdtSlkn() {
        return edtSlkn;
    }

    public void setEdtSlkn(String edtSlkn) {
        this.edtSlkn = edtSlkn;
    }

    public String getEdtb() {
        return edtb;
    }

    public void setEdtb(String edtb) {
        this.edtb = edtb;
    }

    public String getEdtAtg() {
        return edtAtg;
    }

    public void setEdtAtg(String edtAtg) {
        this.edtAtg = edtAtg;
    }

    public String getEdtDCneo() {
        return edtDCneo;
    }

    public void setEdtDCneo(String edtDCneo) {
        this.edtDCneo = edtDCneo;
    }

    public String getEdtDClcT() {
        return edtDClcT;
    }

    public void setEdtDClcT(String edtDClcT) {
        this.edtDClcT = edtDClcT;
    }

    public String getEdtDClcBT() {
        return edtDClcBT;
    }

    public void setEdtDClcBT(String edtDClcBT) {
        this.edtDClcBT = edtDClcBT;
    }

    public String getEdtPL() {
        return edtPL;
    }

    public void setEdtPL(String edtPL) {
        this.edtPL = edtPL;
    }

    public String getEdtT() {
        return edtT;
    }

    public void setEdtT(String edtT) {
        this.edtT = edtT;
    }

    public String getEdtDtt() {
        return edtDtt;
    }

    public void setEdtDtt(String edtDtt) {
        this.edtDtt = edtDtt;
    }

    public String getEdtDtt_ct() {
        return edtDtt_ct;
    }

    public void setEdtDtt_ct(String edtDtt_ct) {
        this.edtDtt_ct = edtDtt_ct;
    }

    public String getEdtDbaove_t() {
        return edtDbaove_t;
    }

    public void setEdtDbaove_t(String edtDbaove_t) {
        this.edtDbaove_t = edtDbaove_t;
    }

    public String getEdtd0() {
        return edtd0;
    }

    public void setEdtd0(String edtd0) {
        this.edtd0 = edtd0;
    }

    public String getEdtnn() {
        return edtnn;
    }

    public void setEdtnn(String edtnn) {
        this.edtnn = edtnn;
    }

    public String getEdtdneo() {
        return edtdneo;
    }

    public void setEdtdneo(String edtdneo) {
        this.edtdneo = edtdneo;
    }

    public String getEdtpn() {
        return edtpn;
    }

    public void setEdtpn(String edtpn) {
        this.edtpn = edtpn;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.student.management.model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SinhVienTinChi extends SinhVien{
    private int soTinChiHoanThanh;

    public SinhVienTinChi(int soTinChiHoanThanh, String hoTen, String maSV, String gioiTinh, String email, String khoaHoc, ArrayList<MonHoc> listMonHoc) {
        super(hoTen, maSV, gioiTinh, email, khoaHoc, listMonHoc);
        this.soTinChiHoanThanh = soTinChiHoanThanh;
    }

    public int getSoTinChiHoanThanh() {
        return soTinChiHoanThanh;
    }

    public void setSoTinChiHoanThanh(int soTinChiHoanThanh) {
        this.soTinChiHoanThanh = soTinChiHoanThanh;
    }

    @Override
    public boolean xetTotNghiep() {
        super.xetTotNghiep(); 
        return false;
    }
    
    
    
}

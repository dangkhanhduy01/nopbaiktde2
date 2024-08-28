/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangDiaABC;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyCD {
      private ArrayList<CD> danhSachCD;
 public QuanLyCD() {
        this.danhSachCD = new ArrayList<>();
        danhSachCD.add(new CD("CD01", "Noi buon gac tro", "Quang Linh", 195000, 2018));
        danhSachCD.add(new CD("CD03", "Cau ho chieu que Nhieu", " Nhieu ca si", 172000, 2022));
        danhSachCD.add(new CD("CD04", "Tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        danhSachCD.add(new CD("CD05", "Thanh pho mua bay", "Dan Nguyen", 182000, 2019));
    }
 public void xuatDanhSach() {
        double tongTriGia = 0;
        for (CD cd : danhSachCD) {
            System.out.println(cd);
            tongTriGia += cd.getGiaban();
        }
        System.out.println("Tong tri gia cua cac CD: " + tongTriGia);
    }
  public void layCDTruoc2020() {
        for (CD cd : danhSachCD) {
            if (cd.getNamphathanh() < 2020) {
                System.out.println(cd);
            }
        }
    }
  public void timCDTheoTen() {
        for (CD cd : danhSachCD) {
            if (cd.getTenCD().toLowerCase().contains("tinh")) {
                System.out.println(cd);
            }
        }
    }
   public void sapXepTheoGia() {
        Collections.sort(danhSachCD, new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD cd2) {
                return Double.compare(cd2.getGiaban(), cd1.getGiaban());
            }
        });
    }
    public void xoaCDTheoMaSo(String maso) {
        danhSachCD.removeIf(cd -> cd.getMaso().equals(maso));
    }

    public void suaGiaBanTheoMaSo(String maso, double giaMoi) {
        for (CD cd : danhSachCD) {
            if (cd.getMaso().equals(maso)) {
                cd.setGiaban(giaMoi);
                break;
            }
        }
    }
     public double tongTriGia() {
        double tong = 0;
        for (CD cd : danhSachCD) {
            tong += cd.getGiaban();
        }
        return tong;
    }
}


   
  
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Redmi
 */
public class DanhSachSoThuc {
    public ArrayList<Double> danhsachsothuc;
    public Double d;
    Scanner sc  = new Scanner(System.in);
    
    public DanhSachSoThuc(){
        super();
        danhsachsothuc = new ArrayList<>();
    }
    
    public void Nhap(){
        int n;
        System.out.print("So luong can nhap: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Nhap so thuc vao danh sach: ");
            float x = sc.nextFloat();
            d = new Double(x);
            danhsachsothuc.add(d);
        }
    }
    
    public void Xuat(){
        for (Double d : danhsachsothuc)
        {
            System.out.print(d.toString());
        }
    }
}

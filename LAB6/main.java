/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB6;

/**
 *
 * @author Redmi
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = sc.nextLine();

        // Tách họ, tên đệm và tên
        int spaceIndex1 = fullName.indexOf(' ');
        int spaceIndex2 = fullName.lastIndexOf(' ');
        String lastName = fullName.substring(0, spaceIndex1).toUpperCase();
        String middleName = fullName.substring(spaceIndex1 + 1, spaceIndex2).toUpperCase();
        String firstName = fullName.substring(spaceIndex2 + 1).toUpperCase();

        // Xuất kết quả
        System.out.println("Ho: " + lastName);
        System.out.println("Ten dem: " + middleName);
        System.out.println("Ten: " + firstName);
    }
}
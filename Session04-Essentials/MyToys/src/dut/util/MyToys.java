/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dut.util;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MyToys {

    /*
        Bien final giong const ben C, bien hang so, khong cho thay doi value
        ngoai tru luc moi khai bao
     */
    public static final double PI = 3.14;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENTS = 500;
    private static Scanner sc = new Scanner(System.in);

    /*
        Ta se gap 1 dang nhap du lieu nhu sau, gap hoai
        nhap dai, rong HCN bk hinh tron, a b c cua tam giac,
        diem thi cac mon, cot diem cac mon, menu
        nhap so: troi lenh, ngoai bien, ca chon - try - catch, lap bat nhap lai
        suy nghi tot hon: ta lam ham nhap so, oi hay tra ve so da nhap, chan het moi thu
     */
    // errMesg, lower, upper
    public static int getAnInteger(String inputMsg) {
        int n; // nhap tu ban phim cho can chua
        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());

                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input integer");
            }
        } while (true);
    }
}

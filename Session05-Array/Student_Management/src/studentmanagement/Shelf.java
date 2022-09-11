/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import data.Student;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Shelf {

    private String color;

    /*
        Nhan dan tu de phan loai do ben trong
     */
    private String label;

    /*
        Dac diem dac biet, ta focus vao khi mua 1 Tu/ke, dung luong, dung tich
        kha nang chua cac mon do
     */
 /*
        Co dac diem, thi viec do value/ gan value cho cac dd nay nam o dau
        color, label: pheu do vao
        arr ma mi, ten mang, can kich thuoc, vi mang la khai bao so bien
        moi bien chua value gi la cau chuyen khac
    
        Co vai cach de dua value cho instance variable
        gan san value luc khai bao. Khong linh hoat, mun theo nhu cau rieng
        dua vao qua pheu. Linh hoat, new la co value moi
        dua qua set()
    
        C1: arr = new [so bien object truyen vao]
        C2: fix cung kich thuoc khong can dua vao
     */
    private int count = 0;
    // defaul cho count, khong can linh hoat
    // Tu moi mua da lam gi co do ben trong

    private Student[] arr = new Student[500]; // bao nhieu bien Student khac
    private static Scanner sc;

    public Shelf(String color, String label) { // size kich thuoc mang
        this.color = color;
        this.label = label;
        sc = new Scanner(System.in);
    }

    /*
        Hanh dong, ham cua 1 object la gi, de dau?
        Nhap ho so sinh vien dua vao the nao
        Nhap tu tu va thuoc cai Tu/ ke/ Bo mon/ Truong
        Tra ve viec nhap cho tung object
     */
    public void addStudent() {
        // thao tac nhap infor cua tung sinh vien sau do add vao mang arr
        // count = 0; // day hay chua la dac trung cua tung cai Tu

        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        arr[count] = new Student(id, name, yob, gpa);
        count++;
        // i chay kieu slow-motion, tu tu se day, nhung rai rac kieu ban ve ham goi nhieu lan
    }

    // Tu do da co 1 dong do, minh muon xem hay view coi
    public void showListStudent() {
        System.out.println("There is/are " + count + " student(s) in the list");
//        for (Student student : arr) {
//            student.showProfile();
//        } // de chet vi nullpointer
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }
    }

    /*
        Ta co nhieu data, ta lo viec xu ly
        Search la 1 viec nhu the, offer dich vu
     */
    public void searchAStudent() {
        /*
            Tim 1 sinh vien ma so abc
            Thuat toan vet can
         */
        System.out.print("Input id that you want to search: ");
        String id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (arr[i].getId().equalsIgnoreCase(id)) {
                arr[i].showProfile();
                return;
            }
        }
        System.out.println("Not found!!!");
    }
}

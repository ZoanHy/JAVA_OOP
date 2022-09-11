/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import data.Student; //~ vao ngan tu data lay khuon ra de duc
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saveAStudent();
//        inputAStudent();
    }

    // SINGLETON pattern
    
    /*
        Mun nhap infor tu ban phim: ta can phuong tien nhap, OOP cai gi cung phai la object
        tuong tac voi object qua cham. Quanh tui: Camera, WC, Scanner o tiem photo
        Ban phim ao/ Touchpad/ Ban phim co, File --> dua data tu ngoai may tinh
        thuoc nhom Scanner may quet cung cap data
        muon dua data vao may tinh can bien chua
     */
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa; // local variable, STACK

        Scanner myKeyboard = new Scanner(System.in);
        System.out.print("Input id: ");
        id = myKeyboard.nextLine();
        
        System.out.print("Input name: ");
        name = myKeyboard.nextLine();
        
        System.out.print("Input yob: ");
        yob = myKeyboard.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = myKeyboard.nextDouble();

        // Xong do data vao thui
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }

    // hard-code fix luon infor sv, khong da, uoc gi nhap tu ban phim, cung phai do vao pheu/ khuon
    public static void saveAStudent() {
//        Student an = new Student("DUT111", "An Nguyen", 2002, 9.8);
//        Student an = new Student("DUT111", "Tay Choi", 2002, 9.8);
        Student s1 = new Student("DUT111", "Loc Phat", 2002, 9.8);
        Student s2 = new Student("DUT111", "Bat Tu", 2001, 6.7);
        s1.showProfile();
        s2.showProfile();
        
        System.out.println("Check the public/private");
        // xem cham khi co public private
        String s1_name = s1.name;
        System.out.println(s1_name);
//        s1.getName();
        System.out.println("s1 name: " + s1_name);
        System.out.println("s1 name: " + s1.name);
        System.out.println("s1 name: " + s1.getName());

        /*
            Khi so truc tiep dac diem, tuc la ta cham truc tiep bien, cham bien ~ get() set()
         */
        s1.name = "Khong hoc bai";
        s1.setName("Cay rank khong cay code");
        System.out.println("After Cay rank khong cay code");
        s2.name = "Doi nganh cung la lua chon";
        s1.showProfile();
        s2.showProfile();
     
        /*
            Static la vung nho dung chung cho cac object cung loai
            ai cung nghi la cua minh, nhung thuc chat la dung chung
            neu 1 ai do tac dong, thi tat ca bi anh huong
        */
        
        System.out.println("s1 yob: " + s1.yob);
        System.out.println("s2 yob: " + s2.yob);
        
        System.out.println("s1 name: " + s1.name);
        System.out.println("s2 name: " + s2.name);
        /*
            Vung static chung cho moi object, cho nen gia tri cua vung nay
            chung cho tat ca cac SV hien tai va tuong lai, WC tap the chung cho ca day lau
            khong nen tu huu cai do xai chung
            s1.name ~ s1.name ~ s3.name ~~~~ Student.name
            so static dung so qua kieu tu huu ma nen so theo kieu Class cham static
        */
        System.out.println("Student name: " + Student.name);
        
        /*
            Co 2 loai cham: 
            + cham qua bien object ham y non-static, do thuoc tung object
            + cham thu 2: do static xai chung, new ca ti lan cung 1 vung ram, chung ca dam
            Vay cham qua ca dam hop ly hon
        */
        
    }
    
}

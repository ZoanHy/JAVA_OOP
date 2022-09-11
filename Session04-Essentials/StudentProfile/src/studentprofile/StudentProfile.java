/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentprofile;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputAProfile();
    }

    // Viet ham nhap vao thong tin sinh vien: name, yob, address sau do in ra ket qua
    // Khong xai OOP, chi focus vao nhap data tu ban phim, check cac vd nhap
    public static void inputAProfile() {
        String name, address;
        int yob;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
//        yob = sc.nextInt();
//        sc.nextLine();
        yob = Integer.parseInt(sc.nextLine());
        /*
            Address bi troi boi nextInt()
            vi nextInt() se de lai rac
        
            Bat cu chuong trinh nao co cho nhap lieu du lieu thi se co bo dem Buffer
            Bo dem nay duoc xem nhu la noi luu tru cac tien xu ly trong Ram
            De cho CPU tranh truong hop qua tai thi Buffer van luu duoc nhung gia tri do de xu ly sau
            Vi the khi nhap lieu du lieu thi no se luu vao bo dem Buffer
        
            Voi cau lenh nextLine() sau khi nhap xong se luu vao Buffer 
            Vi nextLine() la lay theo dong la chuoi nen no lay het thong tin nhap vao ca dau Enter nua
            va nhan dau enter
            luc nay CPU se xu ly bang cach bo dau hay xoa dau Enter di va lay noi dung da go
        
            Con voi cau lenh nextInt() thi neu chi go 123 xong roi Enter thi luc nay
            nextInt() no xu ly chi lay gia tri 123 roi quy doi sang kieu int
            va con dau Enter thi no khong bo van con luu lai trong Buffer
            Do do ma neu phia ben duoi cau lenh co cau lenh nhap chuoi nextLine()
            nua thi luc nay no thay trong bo dem co du lieu se lay het thong tin trong bo dem
            va gan cho bien moi tao do vi the ma xuat hien hien tuong troi lenh
         */
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");

        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }
}

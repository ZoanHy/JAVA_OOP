/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samurai;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputAProfile();
    }

    public static void inputAProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

//        System.out.print("Input yob: ");
//        yob = Integer.parseInt(sc.nextLine()); // lenh nay co nguy co vang vi convert khong thanh cong
        // default Java giet app
        // Java cho dev/app 1 co hoi, neu lenh co nguy hiem
        // thi nhot no lai, khong che va kiem soat no
        try {
            // lenh vang mieng o day
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            /*
                Khi co vang mieng hay loi xay ra, no se vo day khong bay lung tung
                Java khong giet app nhu mac dinh, vi minh da keu co loi thi vo day minh tu lo
                CPU se chay den doan code o day, neu co ca chon xay ra
                Khong co ca chon thi khong vao day
                Trao minh co hoi tu xu o day, app khong bi giet sau cau lenh nay
                song song do JVM (Java Virtual Machine) gui 1 la thu bao tu mau do
                Exception e = new Exception("thu do, noi rang may gay ra toi chet me may deee");
                muon biet thu co gi
                e.printStackTrace()
                chet the nao? setDefault()
             */
//            yob = 69;
//            e.printStackTrace();
              yob = 0;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }
}

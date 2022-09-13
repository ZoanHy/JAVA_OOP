/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package craftman;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author ASUS
 */

/*
    OOP: Object Oriented Programming
    Paradigm: (tu duy, mo thuc)

 */
public class Craftman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        cutShapes();
        sortShapes();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "RED", 1.0, 3.0);

        Rectangle rectArr[] = new Rectangle[9];
        /*
            Co 9 hinh se cat, 9 bien Rectangle, 9 con tro
            <=> Phong hop co 9 ghe, 9 cho, nhung chua ai vao ngoi
            
            9 bien con tro => tro vao vung new/ clone Student (...) Rectangle (...)
                              can lam luong 1 toa do vung new (); object
                              eo quan tam vung new nay moi hay cu
         */

        rectArr[0] = r1; // 2 chang 1 nang
//        rectArr[0].paint();
//        rectArr[0].setOwner("TIA YEU!!!");
//        System.out.println("Chung minh 2 chang 1 nang");
//        r1.paint();

        rectArr[1] = new Rectangle("MA", "BLUE", 3.0, 15.0);
        rectArr[2] = new Rectangle("BE NA", "BLUE", 3.0, 10.0);

//        rectArr[3] = new Square("GHE BE NA", "PINK", 5.6);
        /*
            CHUNG MINH KHONG CUNG HE, S EO PHAI LA HINH CHU NHAT KHONG CUNG MANG
            MANG NOI RANG: KHAI BAO CUNG KIEU, MANG CHU NHAT CHI CHUA HINH CHU NHAT

            ??? arr[] = new ???[9]
            arr[0] = new Rectangle(...);
            arr[1] = new Square(...);
            arr[2] = new Disk(...);
            
            for ??? .getArea() > ???. getArea()
         */
        System.out.println("Before sorting");
//        for (Rectangle rectangle : rectArr) {
//            rectangle.paint(); // can than NUll pointer
//        }
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        System.out.println("After sorting");
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle temp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TIA", "RED", 1.0, 3.0);
        r1.paint();

        Square s1 = new Square("MA", "GREEN", 4.0);
        s1.paint();

        Disk d1 = new Disk("BE NA", "BLUE", ":))", 4);
        d1.paint();
    }

}

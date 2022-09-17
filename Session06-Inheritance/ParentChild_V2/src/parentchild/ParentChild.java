/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parentchild;

import data.Child;
import data.Parent;

/**
 *
 * @author ASUS
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playWithParentChild();
    }

    public static void playWithParentChild() {
        /*
            Kha Cha = new Cha
            Khi cham xo ra tat ca nhung gi cua Khuon Cha
            Khai bao the nao, xo nhu the
         */
        Parent p = new Parent("BIET THU", "1000BTC");
        p.showProfile();

        /*
            Khai Con new Con
         */
        Child c1 = new Child(("NHA PHO"), "1000ETH", "MOTOR");
        c1.showProfile(); // Se in la Parent, neu khong chiu Override (extends)

        /*
            Khai Con new Cha, Vo van
         */
//        Child c2 = new Parent(assetOne, assetTwo);
        /*
            Khai Cha new Con
            Cham thi xo ra gi: dac diem thuoc tinh cua Cha 
            Luu y: Khai Cha new Con thi khi chi hien thuoc tinh cua Cha thoi
            Vi day la kieu du lieu cua Cha nen se khong hien ra nhung biet di cua con
            Nhu vay phai cu xu nhu nguoi lon
            --> Chi xo cua Cha khong CARE Con co gi khac biet ngoai tru phan Override
         */
        Parent c2 = new Child("CAN HO", "DOGECOIN", "DU THUYEN");
        c2.showProfile();
        /*
            Goi Cha nhung chay Con, duy nhat vay
            sayHi() mai mai khong thay, vi nam ngoai con tro cua Cha
            Con vao SG di choi o CyberCore, di dua xe, Ba khong biet
         */
//        c2.sayHi(); ro rang ham nay co, vi new Child() cham khong tai
        /*
            Co cach nao Khai Cha ma van so Con dac biet khong ???
            Cau tra loi la van co
         */
 /*
            Choi tro keo gian soi thun, de do day new Child(), lay duoc toa do cua new Child()
            Le ra toa do co roi, nhung do ta xai con tro lung chung
            Tro Cha khong tro day, gio vo day, ki thuat ep Cho thanh Meo, CAST
            Ep kieu, Cua Gat
            Dung con tro tam, de luu toa do
         */

 /*
            Keo gian con tro xuong day new Child(), lay toa do, thay cho tmp
            La con tro Child, 2 chang 1 nang again
            1 chang lung chung, 1 chang day new
         */
        Child temp = (Child) c2;
        temp.sayHi();
        temp.showProfile();
        // Cach tren se ton them 1 bien con tro de tro luu dia chi do cu the la co 8 byte
        // Cat di de dung la hay chi dung 1 lan roi thoi, deu oki, new Dog(...).bark() ~ sinh ra 1 lan roi bi JVM don dep

        
        ((Child) c2).sayHi();
    }
}

/*
    List<Student> list = new ArrayList();
       Cha                  Con
 */

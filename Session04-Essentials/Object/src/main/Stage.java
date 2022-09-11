/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import data.Student;

/**
 *
 * @author ASUS
 */
public class Stage {

    public static void main(String[] args) {
//        checkObject();
//        checkObject_V7();
        checkObject_V8().setName("EM HOG DOI NGANH");
        checkObject_V8().showProfile();
    }

    // HAM TRA VE OBJECT, KHONG TRA PRIMITIVE
    public static Student checkObject_V8() {
        return new Student("DUT102", "ZOAN", 2002, 7.8);
    }

    // KHAI BAO BIEN ROI GAN SAU
    public static void checkObject_V7() {
        Student s1;
        /*
            to voi cau se noi xau dim hang 1 thang ban heng
            s1 la dua tao voi may choi no, no troll, cho no len confession
            s1 can lam luon tro vung new, san sang de tro
         */

        s1 = new Student("DUT102", "AHIHI", 2002, 9.6);
        s1.showProfile();
    }

    public static void checkObject_V6() {
//        Student s1 = new Student("DUT102", "AN NGUYEN", 2002, 6.7);

        /*
            object vo danh, sinh ra ma khong them dat ten, chi khoc 1 tieng roi pass away
            s1.showProfile()
            s1 cham tuc la vao vung toa do cham lam gi do
            new ... cung chinh la toa do, day cho s1, s1 va new ... la nhu nhau
            s1 cham cung nhu new cham
         */
        new Student("DUT102", "AHIHI", 2002, 6.9).showProfile();

        /*
            co ho chay ra duong khong co ong chu cam xich, Exciter hot cmn luon
            khong con tro, oe len 1 lan, roi chet boi cong ty do thi moi truong
            object vo danh anonymous object
            Mun re-use object, cham nhieu lan thi phai co ten goi
         */
    }

    // HAI CHANG TREO/ TRO 1 NANG
    public static void checkObject_V5() {
        Student s1 = new Student("DUT102", "AN NGUYEN", 2002, 6.7);
        Student s2 = s1; // 2 thang cung nhom chung 1 huong toa do, 2 chang tro 1 nang

        // s1, s2 cung luu 1 toa do, cung tro vung new clone AN
        s1.setName("ANH CUC SUC");

        s2.showProfile();
        s1.showProfile();
    }

    // BACKUP CON TRO, LUU TOA DO
    public static void checkObject_V4() {
        Student s1 = new Student("DUT102", "AN NGUYEN", 2002, 6.7);

        /*
            Truoc khi choi voi BINH, khong muon mat AN
            Vay can ghi ra dau day de luu toa do vung NEW
            tranh truong hop thang JVM se clear deeee
            Truoc khi dang tri thi nen ghi ten ra bang cach tao mot bien temp
         */
        s1.setName("EM EO TIN THAY");
        Student temp = s1;
        /*
            temp la 1 bien object, nen rat can toa do 1 vung new
            cho toa do dee, khong new :))
            temp se tro den toa do cua AN NGUYEN o tren
         */

        s1 = new Student("DUT103", "BINH LE", 2000, 8.9);
        /*
            s1 da bo AN de di voi BINH
            Con temp la AN cua NGAY HOM QUA, Xua cu bi s1 ruong bo
         */
        s1.showProfile();
        temp.showProfile();
    }

    public static void checkObject_V3() {
        Student s1 = new Student("DUT102", "AN NGUYEN", 2002, 8.9);

        /*
            LUY Y: - SOURCE: Khi 1 object/ vung new clone khong co ai tro toi, mat con tro,
            do con tro gan qua vung new khac, thi ta mat dau toa do, vung new cu
            Java: JVM may ao J chay ben Windowns, giam sat vung ram app viet - Java
            Bo giam sat may ao Java goi la: cong ty moi truong do thi
            GARBAGE COLLECTOR, clear, available cho new clone khac free 
            (con tro ben C - free vung malloc() calloc() HEAP)
        
            Viec clear ram HEAP cua Java dien ra theo dinh ky, bao nhieu giay, phut, ...
            Tuy nhien minh co the goi ngay luon: System.gc()
         */
        s1 = new Student("DUT103", "BINH LE", 2000, 8.5);
        s1.showProfile();

    }

    /*
        BIEN CO QUYEN THAY DOI CHO TRO !!!
        MAT TOA DO, MAU DAU VUNG NEW, CO THE CO DIEU NAY HAY KHONG,
        NEU CO THI KET QUA HAY HAU TRUONG DIEN RA LA GI?
     */
    public static void checkObject_V2() {
        Student s1 = new Student("DUT102", "AN NGUYEN", 2002, 8.9);

        /*
            con tro, luu toa do vung new
            bien obj, luu toa do vung clone
            reference variable, tao tham chieu tao do cho khac 
            Bien con tro/Obj/Tham chieu
         */
        Student s2 = new Student("DUT102", "AN NGUYEN", 2002, 8.9);

        s1.showProfile();
        s2.showProfile();

        s1.setName("DOI ROI, KHONG HOC BAI !!!");
        s2.showProfile();
        s1.showProfile();

        System.out.println("Check duplication if any???");

        s1 = new Student("DUT103", "BINH LE", 2002, 7.8);
        s1.showProfile(); // in ra cai gie???

        /*
            bien object thay doi con tro, chieu, toa do
            tao can lam luon 1 toa do vung new
         */
 /*
            bien co quyen thay doi value no luu tru, vi thay doi value no moi la bien
            variable - su bien doi, may dang 10 roi may thanh 100
         */
    }

    public static void checkObject_V1() {
        Student s1 = new Student("DUT102", "LOC PHAT", 2002, 8.9);
        Student s2 = new Student("DUT102", "LOC PHAT", 2002, 8.9);

        /*
            Chung minh 2 new la 2 obj khac nhau, 2 vung clone khac nhau, du do infor giong nhau
            o ngoai doi: vao tiem sach, to tuong, chon 2 tuong "giong nhau"
            
         */
        s1.showProfile();
        s2.showProfile();

        s1.setName("DOI ROI, KHONG HOC BAI !!!");
        s2.showProfile();
        s1.showProfile();

        System.out.println("Check duplication if any???");

    }

    public static void checkObject() {
        Student s1 = new Student("DUT102", "LOC PHAT", 2002, 8.9);

        /*
            bien obj
            bien doi tuong
            obj variable
            reference variable
            "con tro"
        
            1. new la clone vung ram tu Khuon (static if any)
            2. goi pheu do data vao vung clone
            3. chot lai toa do vung new thay cho ai do giu
                thay cho bien object luu tru
                
         */

 /*
            Vung new/ Vung object/ Instance/ Hien than/ The hien ... Cu the
         */
        s1.showProfile();

        s1 = new Student("DUT6789", "ZOAN", 2000, 5.8);
        s1.showProfile();

        /* 
            Mat toa do LOC PHAT roi
            Mat toa do vung ram/object thi dieu gi xay ra
            
            Cong ty Moi truong do thi, GARBAGE COLLECTOR, vung ram object khong ai tro toi se bi thu hoi,
            object bi giet de
        
            HEAP CLEAR - free (con tro ben C) vung HEAP tra lai cho new object moi
         */
 /*
            sep --> CS ST
            sep --> nguoi quy dinh muc luong nguoi di lam thue
            ti  --> may o nha, tao o nha
            ti  --> Trang Ti
         */
        System.gc();
        int a = 10;
        a = 100; // bien vi may thay doi value

        /*
            HAI CHANG TRO MOT NANG
            VUA SINH RA KHOC 1 TIENG ROI CHET
         */
        // a bi bien doi gia tri
        // a duoc goi la bien - variable
    }
}

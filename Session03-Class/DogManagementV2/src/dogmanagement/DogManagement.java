/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogmanagement;

import data.Dog;

/**
 *
 * @author ASUS
 */
public class DogManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog chiHu = new Dog("CHI HU HU", 2021, 5);
        chiHu.bark(); // 1 object lam 1 hanh dong nao do

        Dog ngaoDa = new Dog("NGAO DA", 2021, 7);
        ngaoDa.bark();

        System.out.println("ChiHu barks again");
        chiHu.bark();

        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        System.out.println("ND YOB: " + ngaoDa.getYob());

        chiHu.setWeight(10);
        chiHu.bark();
        ngaoDa.bark();
        
        System.out.println("Show all infor by using toString() method");
        System.out.println(chiHu.toString());
        System.out.println("CH details: " + chiHu); // ben C thi se ra toa do vung new
        
        /*
            Java khong tin toa do, no hieu la vao vung ram cua object show het info
            goi tham ben em, goi ngam ham toString() khi in bien object
        */
        
        /*
            Neu khong co toString() ro rang trong Khuon ma lai doi in ra chi tiet cua bien Object
            dang tro object, thi JVM tu dong in ra 1 con so Hexa, goi la HASH-NUMBER
            ma bam cua vung ram, toan bo data duoc do vao cua object duoc bam theo thuat toan
            convert theo 1 thuat toan de ra duoc 1 con so dac trung
            MD5, SHA-256
        */
    }

}

/*
    Toan tu New se nhan ban cai Khuon/Phoi/CMND, chua cho san don vat lieu do vao
    bao nhieu nhat NEW, bay nhieu lan dung pheu, bay nhieu lan tao phoi trang
    , mo khuon tuong da kho bo ra chua cho chuan bi duc
    nhu vay cu new la trong ram se co ban copy cua khuon
    pheu do data vao dung cho tuong ung
    Bai nay ta co 2 name, ND khong dung hang de che CH
 */

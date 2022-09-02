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
        Dog chiHu = new Dog("CHI HU HU", 2021 , 5);
        chiHu.bark(); // 1 object lam 1 hanh dong nao do
        
        Dog ngaoDa = new Dog("NGAO DA", 2021, 7);
        ngaoDa.bark();
        
        //Xem xem con ngaoDa co de chet con chiHu hay khong ?
        System.out.println("ChiHu barks again");
        chiHu.bark();
        
//        chiHu.name
        
        //CaSi chiPu = {name: NTC; yob: 1993: hits: Doa hoa hong} JSON
        // goi get set giao tiep voi object khi no co thong tin
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        System.out.println("ND YOB: " + ngaoDa.getYob());

        chiHu.setWeight(10);
        chiHu.bark();
        ngaoDa.bark();
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

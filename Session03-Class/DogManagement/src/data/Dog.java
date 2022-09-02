/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */

/*
    Cach ta gom ham va bien co lien quan vao trong 1 don vi/ khuon che giau no,
    show no ra khi can thiet
    No dai dien cho 1 object voi dac tinh va hanh vi nam tron ven trong 1 khu vuc
    Ky thuat nay goi la ENCAPSULATION
*/

/*
Class ~ Khuon, khong duoc lung => code chinh la cac dac diem chi tiet
ben trong khuon, thi phai o trong khuon
vat lieu che vao khuon phai nam trong khuon
 */
public class Dog { // template, form, blueprint, prototype, mold

    public String name;
    private int yob;
    private double weight;

    // Co Khuon phai co pheu de hung vat lieu vao

    /* 
    pheu chinh la 1 ham rat rat dac biet
    no dung de nhan vat lieu ben ngoai dua vao, lap/fill/gan vat lieu nay
    vao cac chi tiet cua khuon
    Vay neu goi la pheu/ xai pheu ~~~ bat dau ta di duc/tao/contruct 1 buc tuong
    ra duoc 1 san pham, la chinh cai object dang de cap
    dung o trong Khuon ban chat la dang dung o vi tri cua 1 object duoc tao ra trong tuong lai
    Khi do value vao se tao ra 1 object dang dung
    cho nen ham nay khong can tra ve value nao ca, cung khong xai void luon
     */
    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    /*
    Ham pheu la ham ma khong tra ve gi ca, chinh no dung de tao ra object dang de cap
    Ten ham nay trung 100% ten Class
     */
    
    /* Ham de xu ly info
        Nhin goc do thuc the song, thi bark() duoc goi la hanh vi
        hanh xu, phuong thuc, cach thuc, hanh dong, method
        ham gan voi dac trung cua object
    */ 
    public void bark() {
//        System.out.println("gogogogo ... My name is " + name);
//        System.out.println("gogogogo ... My yob is " + yob);
        System.out.printf("|GOGO|%-20s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    public int getYob(){
        return yob;
    }
    
    /*
        Co khi ta co nhu cau thay doi lai infor da duoc cho tu luc dau
        giong nhu ta thay doi wallpaper cua dien thoai ta
        ta se set thay cai cu = cai moi dua vao
    */
    
    public void setWeight(double newWeight){
        weight = newWeight;
    }
}

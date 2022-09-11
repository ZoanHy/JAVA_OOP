/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Dog { // template, form, blueprint, prototype, mold

    public String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

//    public Dog(String name, int yob, double weight) {
//        // this: de chi cua tui la linh hon cua minh khong nham lan voi cai ben ngoai
//        this.name = name;
//        this.yob = yob;
//        this.weight = weight;
//    }
    public void bark() {
        System.out.printf("|GOGO|%-20s|%4d|%4.1f|\n", name, yob, weight);
    }

    /*
        Moi object sinh ra thuong co ho so hay thong so gi do nhu dien thoai cha han
        CMND/CCCD cung la 1 dang ho so: show thong tin co ban du nhan ra ban
        ....
    
        Con nguoi cung the, co profile tren FB
        Nhu cau show thong tin duoc do duc ra la co that cho moi object
        Ham toString() bien doi moi infor ta co thanh chuoi, khong them in ra, return
    
        
     */
//    public int getYob(){
//        return this.yob; // du khong can this vi khong co su nham lan thong tin cua ngoai cua trong, cua tui cua anh
//    }
//
//    public void setWeight(double weight){
//        this.weight = weight;
//    }
    @Override
    public String toString() {
//        return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        return String.format("|GOGO|%-20s|%4d|%4.1f|\n", name, yob, weight);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Triangle {

    private String owner;
    private String color;
    private double a, b, c;

    /*
        Tong 2 bat ky phai lon hon canh con lai moi duoc lam tam giac
        co nhung phuong phap nao do de chan ca chon
        chan luc do vao, cu do vao roi tinh
        neu ca chon luc do, choi default 3 4 5
     */
    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "owner=" + owner + ", color=" + color + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    /*
        Doan code nay can thiet, vi lien quan den infor ben trong object va giao tiep ra ben ngoai
        nhung no lai nham chan
        Vi the, co 1 nhom dev ho dua ra giai phap rut gon trong luc viet code
        Ho viet san 1 thu vien, may cai class giong Scanner, Math, ... xai thi phai import
    
        Ban chi can khai bao rang Khuon nay can co pheu ra sao get() set() hay khong
        muon toString() 3 4 dong la xong
        Gererate phuc hoi lai toan bo doan code tren cho day du nhu cu
        Thu vien ten la LOMBOK
     */
    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void paint() {
        System.out.printf("|TRIANGLE |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n", owner, color, a, b, c, getArea());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Rectangle {

    protected String owner;
    protected String color;
    protected double width;
    protected double length;
//    protected double area;

    /* 
        co nhung dac diem tinh duoc tu nhung dac diem khac
        derived field / dac tinh, dac diem dan xuat (tu dua khac)
        Can nhac khi co dan xuat, vi tinh nhat quan/ dong bo data bi - consistency
        do vao tu pheu khong khop
        con cua bi: setW (canh moi) --> quen tinh lai dien tich thi S toang
    
        Ly do nguy hiem, tao phu thuoc boi thang khac -> no thay doi thi ta phai thay doi theo
        so luong, don gia, thanh tien: doi so luong, don gia ma quen tinh thanh tien --> toang
    
        Con cua anh chi Hai
    
        Tu duy moi: VIEC TINH TOAN LA VIEC XU LY DATA LA VIEC CUA HAM
        
        Dan xuat no nen duoc xem la ham, vi no co tinh toan
        Tinh S() xem la hanh dong/ behavior hon la dan xuat, luc giao tiep thi hoi ta tinh -> chinh xac luon
    
        
     */
    public Rectangle(String owner, String color, double weight, double length) {
        this.owner = owner;
        this.color = color;
        this.width = weight;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", weight=" + width + ", length=" + length + '}';
    }

    public double getArea() {
        /*
            tao eo in, muc tieu de re-use lai trong nhung lenh khac
         */
        return width * length;
    }

    public void paint() {
        System.out.printf("|RECTANGLE|%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner, color, width, length, getArea());
    }
}

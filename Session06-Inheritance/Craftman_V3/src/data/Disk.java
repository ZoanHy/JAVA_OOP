/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Disk {

    private static double PI = 3.14;
    private String owner;
    private String color;
    private String smile;
    private double radius;

    public Disk(String owner, String color, String smile, double gpa) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.radius = gpa;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public String getSmile() {
        return smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "owner=" + owner + ", color=" + color + ", smile=" + smile + ", gpa=" + radius + '}';
    }

    public double getArea() {
        /*
            non choi voi all , static la do xai chung
        */
        return Disk.PI * Math.pow(radius, 2.0);
    }

    public void paint() {
        System.out.printf("|DISK     |%-15s|%-10s|%4s|%4.1f|%7.2f|\n", owner, color, smile, radius, getArea());
    }
}

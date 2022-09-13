/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Square {

    private String owner;
    private String color;
    private double edge;

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getEdge() {
        return edge;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" + "owner=" + owner + ", color=" + color + ", edge=" + edge + '}';
    }

    public double getArea() {
        return Math.pow(edge, 2.0);
    }

    public void paint() {
        System.out.printf("|SQUARE   |%-15s|%-10s|%4.1f| -- |%7.2f|\n", owner, color, edge, getArea());
    }
}

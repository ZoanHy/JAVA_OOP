/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dut.main;

import dut.util.MyToys;

/**
 *
 * @author ASUS
 */
public class Stage {

    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
//        MyToys.PI = 4.0; ~ cam thay doi vi da dat kieu dang final
        System.out.println("PI again: " + MyToys.PI);
        int width = MyToys.getAnInteger("Input a width: ");
        int length = MyToys.getAnInteger("Input a length: ");

        System.out.println("Width: " + width);
        System.out.println("Length: " + length);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samurai;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Samurai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputAProfile();
    }

    public static void inputAProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do ku now how to edit error?");
                yob = 0;
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }
}

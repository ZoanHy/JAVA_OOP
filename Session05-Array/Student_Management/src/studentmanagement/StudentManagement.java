/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            Menu lua chon add ho so tu tu theo kieu slow-motion
            Chon 1 de chon 2 de chon 3 de
            
            1. menu
            2. nhap lua chon
            3. tuy chon gi thi goi cai do de xu ly tuong ung
         */

        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf dutCNTT = new Shelf("blue", "IT");
        do {
            printMenu();
            System.out.print("Please choose 1..6: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    dutCNTT.addStudent();
                    break;
                }
                case 2: {
                    dutCNTT.showListStudent();
                    break;
                }
                case 3: {
                    dutCNTT.searchAStudent();
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    System.out.println("Bye bye! See you next time");
                    break;
                }
                default:
                    System.out.println("Please choose only 1..6");
                    break;
            }
        } while (choice != 6);

    }

    public static void printMenu() {
        // In menu
        System.out.println("Welcome to DUT Application.");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student profile");
        System.out.println("4. Update the student profile");
        System.out.println("5. Remove a student");
        System.out.println("6. Quit");
        /*
            XOA KHONG HAN LA XOA, XOA LA AN INFOR
        */
    }

    public static void CheckShelft() {
        // TODO code application logic here
        /*
            OOP: cac loai tu xuat hien, hanh xu doc lap.
            Truong DH nao, nhap ho so ring cua truong do
         */

        Shelf dutCNTT = new Shelf("blue", "Information Technology");
        Shelf dutCNSH = new Shelf("green", "Biology Technology");

        dutCNTT.addStudent();
        dutCNTT.addStudent();

        dutCNSH.addStudent();

        dutCNTT.showListStudent();
        dutCNSH.showListStudent();

    }

}

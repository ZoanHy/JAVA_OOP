/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicarray;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Sorting {

    public static void main(String[] args) {
//        System.out.println("ahihi");
//        sortPrimitiveArray();
//        sortStudentList();
        inputStudentList();
    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String name, id;
        int yob, count;
        double gpa;
        Student arr[];

        System.out.println("How many students do you want to input?");
        count = Integer.parseInt(sc.nextLine());

        arr = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Input Student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());

            arr[i] = new Student(id, name, yob, gpa);
        }

        System.out.println("The student list: ");
        for (Student student : arr) {
            student.showProfile();
        }
        
        // TAO THUNG CHUA NHIEU DOI TUON
    }

    public static void sortStudentList() {
        Student arr[] = new Student[5];
        arr[0] = new Student("SE9", "CHIN", 2019, 7.8);
        arr[1] = new Student("SE10", "MUOI", 2019, 9.8);
        arr[2] = new Student("SE11", "MUOI MOT", 2019, 5.6);
        arr[3] = new Student("SE12", "MUOI HAI", 2019, 4.9);
        arr[4] = new Student("SE13", "MUOI BA", 2019, 8.8);

        System.out.println("The student list before sorting");
        for (Student student : arr) {
            student.showProfile();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() < arr[j].getGpa()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The student list after sorting");
        for (Student student : arr) {
            student.showProfile();
        }

    }

    public static void sortPrimitiveArray() {
        int arr[] = new int[]{-1000, 1000, 50, 30, 10, -20, -3000};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}

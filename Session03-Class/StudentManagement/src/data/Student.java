/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Student {

    private static String id; // bien gan voi instance
    public static String name;

    public int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public double getGpa() {
        return gpa;
    }

//    public void setId(String id) {
//        this.id = id;
//    } // doi ma so sinh vien la chuyen lon. trung voi id khac
    // primary key/identifier ben Database
    public void setName(String name) {
        this.name = name;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-30s|%4d|%4.1f|", id, name, yob, gpa);
    }

    /*
        non-static choi voi ai? choi voi non-static ro rang
    */
    public void showProfile() {
        System.out.printf("|%8s|%-30s|%4d|%4.1f|\n", id, name, yob, gpa);
    }

    // choi ham static
    public static void sayHi() {
        System.out.println("Hi everyone, my name is: " + name);
//        System.out.println("By the way, my yob is: " + yob);
        /*
            eo biet yob nao de ma in vi clone nhieu yob qua, vi nhieu sv
            Static chi choi voi static vi la do xai chung khong phai cua tung object
            hay noi cach khac la cung khu vuc
        */
    }
    
    

}

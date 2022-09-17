/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */

/*
    Cha va Con deu co 2 mon tai san
    Rectangle co o, c, w, l
    Square    co o, c, w, l
 */
public class Parent {

    protected String assetOne; //biet thu
    protected String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parennt{" + "assetOne=" + assetOne + ", assetTwo=" + assetTwo + '}';
    }

    public void showProfile() {
        System.out.printf("PARENT ? assetOne: %s, assetTwo: %s\n", assetOne, assetTwo);
    }

}

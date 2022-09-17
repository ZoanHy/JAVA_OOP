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
    1. Khi co IS A giua cac Khuon, doc 1 chieu, extends
    2. Tao dac diem
        2.1. Neu Con trung dac diem het voi Cha, Con dung lai het khong can khai bao dac diem cho Con
        2.2. Con co quyen co dac diem rieng khac Cha, bien di
             Cu khai bao nhu moi class binh thuong, minh dang lam khuon
             Co nhung cai minh lam bieng, xai lai cho roi
             Co nhung thu khong dung lai duoc, muon khac di, tu lam
    3. Pheu, nho Con giu lai ban sac, neu can thi thoa hiep voi Cha
 */
public class Child extends Parent {

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }

    @Override
    public void showProfile() {
        System.out.printf("CHILD ? assetOne: %s, assetTwo: %s\n", assetOne, assetTwo);
    }

    /*
        1 ham ma Cha chua co, di biet, lan dot bien
     */
    
    public void sayHi(){
        System.out.println("Hello");
    }
}

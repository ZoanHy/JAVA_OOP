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
    1. Khuon moi co the ke thua duoc tu khuon cu, IS A tu nhien
     extends
    2. Dac tinh cua khuon moi: neu Khuon moi co dac diem tuong dong hoan toan
       Khuon cu, thi khong phai bao lai dac diem cho Con, lay Cha da khai bao xai luon
    3. Pheu cho con nhung van giu ban sac cua Con, ma lai dung hoa voi Cha
 */
public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    } // new Con chinh la new 1 phien ban cua Cha
    // cat TGV chinh la cat 1 TG, cu khi nao

    // muon qua mat ba, Ba cu de Con lai xe cho
    @Override
    public void paint() {
        System.out.printf("|TRIANGLE |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n", owner, color, a, b, c, getArea());
    }
}

/*
    Con muon mo loi di rieng thi sao???
    Sinh hoc
    Di truyen: Cha co gi Con co nay - inherit
    bien di: Con co khac hoan toan voi Cha, khong phai @
*/

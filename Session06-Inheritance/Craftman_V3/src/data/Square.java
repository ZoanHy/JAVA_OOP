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

    Hinh vuong la 1 hinh chu nhat dac biet, IS A (Kind of/ version) HCN
    Tu duy phien ban, tu duy series, tu duy ke thua, vi tao la 1 dang cua may, tao co may
    Minh la con nha ho Le, Pham, Tran, Nguyen, ... chac chan minh se duoc thua huong hay ho.
    RE-USE KIEU SAN CO
    Logic: Khuon Square lam rat it thu, vi HCN lam roi, ma V la HCN
    cung kieu, ve chung 1 nha, xu ly chung duoc data, sort chang han
 */

 /*
    HV la su mo rong, tiep noi, phien ban, chinh sua, do lai, tinh chinh, dieu chinh
    tu hinh chu nhat, nang cap, tang cuong them

    1. A extends B, HV extends HCN, HV ke thua, do lai tu HCN
                               HCN dc goi la (ban goc): class Cha, parent, super, base
                               HV phien ban do: class Con, child, sub, derived

    2. field/ instance variables: vi HV la 1 phien ban cua HCN, cho nen nhung gi HCN co thi HV se co
    (di nhien HV cung se co them nhieu dieu db, ban sau)

    3. Pheu van can co, vi Khuon can pheu de duc, nhan vat lieu
       Con khong luu tru infor do giong Cha, su dung cua Cha, nen pheu Con se do data tu ngoai vao ben tren Cha
    Cac field luc nay nam ben Cha, phia Cha
    Khong tu lam, vi vay dau con goi la do tu cai da co
       Hay ton trong ban sac cua Con, ton trong Constructor cua Con
    
    Vi Hinh Vuong, ta se noi ve ownerr, color, edge --> chi 1 canh noi ve vuong
 */
public class Square extends Rectangle {

    public Square(String owner, String color, double width) {
        super(owner, color, width, width);
    }   // super ~~~ new Rectangle(...)
    /*
        Khi goi pheu tuc la clone vung new, do vao de duc object
        Du lieu hay vat lieu se chay vao ben trong vung new/ object
        new Square() goi pheu S, tuc la duc Hinh Vuong
        Logic cat HV chinh la HCN
        new HV chinh la new HCN
     */
    
    /*
        VE LY THUYET, HV DA XONG, KHONG CAN LAM GI THEM, VI INFOR DUOC HCN GIU GIUM
        QUA PHEU DO LEN, HCN (HV) DA DU DU INFOR DE XU LY, TA KHONG CAN LAM GI THEM
        TINH S() EO CAN, PAINT() EO CAN, GET/SET(), KE THUA, CU THE MA XAI
        KHONG PHAI COPY/ PASTE
    */

    
    /*
        Override: danh dau 1 dieu rang Con co ham trung ten 100% voi Cha
        Hien tuong Con qua mat Cha Cha ngoi im di, de Con xuat hien, the hien
        phu quyet, ghi de, Cha chi con la y nghia, tinh than thoy, Con moi la thuc
    
        Con lon roi, de Con ra mat
        No dinh den 1 khai niem quan trong: tinh da xa, da hinh, da anh xa, da sac thai
        50 sac thai, bien hinh, transformer, bien thien, da nhan cach
        POLYMORPHISM, tu 1 anh xa ra nhieu
    */
    @Override
    public void paint() {
        System.out.printf("|SQUARE   |%-15s|%-10s|%4.1f| -- |%7.2f|\n", owner, color, width, getArea());
    }

    
}

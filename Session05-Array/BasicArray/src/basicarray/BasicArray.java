/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarray;

/**
 *
 * @author ASUS
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        playWithPrimitiveArray_V1();
//        playWithPrimitiveArray_V2();
//        playWithPrimitiveArray_V3();
//        playWithPrimitiveArray();
//        playWithAStudent();
//        playWithObjectArray();
//        sortStudentArray_V2();
        sortStudentArray_V3();
    }

    public static void sortStudentArray_V3() {
        Student arr[] = new Student[3];

        arr[0] = new Student("DUT102", "ANH NGUYEN", 2002, 6.7);
        arr[1] = new Student("DUT103", "BINH LE", 2003, 9.8);
        arr[2] = new Student("DUT104", "HUY LE", 2003, 8.8);
        System.out.println("Before sorting");
        for (Student student : arr) {
            student.showProfile();
        }

        System.out.println("After sorting ascending by gpa");

        for (Student student : arr) {
            student.showProfile();
        }

    }

    public static void sortStudentArray_V2() {
        Student arr[] = new Student[2];

        arr[0] = new Student("DUT102", "ANH NGUYEN", 2002, 6.7);
        arr[1] = new Student("DUT103", "BINH LE", 2003, 9.8);
        System.out.println("Before sorting");

        for (Student student : arr) {
            student.showProfile();
        }

        Student temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("After sorting");
        for (Student student : arr) {
            student.showProfile();
        }

        /*
            sap xep mang object, sap mang con tro, tro ra dung thu tu
            CHANG QUA LA DOI VUNG TRO, DOI VALUE TRONG BIEN CON TRO
            DOI TOA DO/ DIA CHI VUNG OBJECT TRONG BIEN [I]
            
            sap mang la doi toa do vi tri con tro cua tung phan tu trong mang
            ta phai dung bien object trung gian de luu toa do truoc khi gan chung
         */
    }

    public static void sortStudentArray() {
        Student arr[] = new Student[2];

        arr[0] = new Student("DUT102", "ANH NGUYEN", 2002, 6.7);
        arr[1] = new Student("DUT103", "BINH LE", 2003, 9.8);

//        System.out.println("Before  Sorting: ");
//        for (int i = 0; i < 10; i++) {
//            arr[i].showProfile();
//            System.out.println(arr[i]); // goi ngam ham toString() 
//        }

        /*
            Mang object la cuon danh ba, moi dong danh ba, phan tu cua cuon
            chinh la 1 dia chi, so lien lac, con tro
         */
        for (Student x : arr) {
            // x = tung phan tu, moi phan tu la 1 danh ba, dia chi
            x.showProfile();
        }

    }

    public static void playWithObjectArray() {
        // tui can luu 50 gia tri int
        int a[] = new int[50];

        // tui can luu ho so 50 sinh vien
        Student arr[] = new Student[50];
        arr[0] = new Student("102", "Z1", 2002, 7.8);
        arr[1] = new Student("103", "Z2", 2002, 5.8);
        arr[2] = new Student("104", "Z3", 2002, 6.8);

        /*
            arr cham co so ra gi hay khong?
            s[0] co so gi khong
        
            Nguyen tac khi choi voi mang object, khong duoc for het
            ma chi for den cho nao da gan, vi phan con lai no se tro null, VO mat
            CHOI MANG LA CAN BIEN COUNT DEM XEM DA CO BAO NHIEU BIEN DUOC GAN VALUE
        
            VI THE, for each chet vi phan con lai toan NULL
         */
        for (int i = 0; i < 3; i++) {
            arr[i].showProfile();
        }

    }

    public static void playWithAStudent() {
        // mun co 1 sinh vien, ta can 2 thu: con tro/ bien tham chieu = value phuc tap
        Student x;
        x = new Student("DUT102", "AN NGUYEN", 2002, 8.9);
        x.showProfile();

        /*
            Chuyen hay ho
            x.showProfile(); bi chui do truoc do thieu value, bien khong value ko cham duoc
            
            x = chi can so am chi dia chi trong vung ram, vi tri cua 1 byte nao do
            x = null; x: ha canh noi anh --> xuong day cua thanh ram, vung nay cos 8 transitor OFFFFF
        
            
         */
        x = null;
        x.showProfile();
    }

    public static void playWithPrimitiveArray_V3() {
//        int arr1[50]; chui khong cho kich thuoc khi khai bao
        int arr2[] = {5, 10, 15, 20, 25}; // 5 bien int va bien con tro arr2
        // ~ arr[0] [1] [2] [3] [4] ~~~ int a = 5
//        int arr3[] = new int[5]{5, 10, 15, 20, 25}; giong cach tren khong duoc khi kich thuoc
        int arr3[] = new int[]{5, 10, 15, 20, 25}; // explicit: tuong minh

        int arr[] = new int[5]; // 5 bien int trung ten arr, arr[0], arr[1]
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        /*
            Phan con lai [3] [4] nam o dau, default la 0
         */
//        System.out.println("The array has:");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(arr[i] + "\t");
//        }

        System.out.println("The array has (using for each): ");
        for (int i : arr) {
            System.out.println(i + "\t");
            // loi tung thang ra lay value
        }

        /*
            arr[0] cham xo gi? arr[1] cham xo gi
            arr. ra cai gi
        
            arr tro vung new bu, co 1 dam bien primitive va con + ham(), length()
         */
        System.out.println("The array has: " + arr); // goi tham ten em

    }

    public static void playWithPrimitiveArray_V2() {
        double array[] = new double[365];

        for (double x : array) {
            System.out.print(x + "\t");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        /*
            QUAN TRONG: Ten mang ban than la 1 bien ma mi, tu ong, tu ba, con tro, reference
            tro vao dau 1 day ra nhieu bien khac
        
            No la bien ma mi vi quan ly o duoi ra nhieu em chan dai, trai nganh
            Hoi ma mi hoi ba con bao nhieu linh, ma mi tra loi, rang t co 365
            day chinh la dac diem cua ma mi, quan ly nhieu linh ...
            Ma mi oi ba co bao nhieu linh ma mi cham length
         */
    }

    public static void playWithPrimitiveArray() {
//        double array[234]; cam tuyet doi trong lenh khai bao

//        double v[234] = {1, 2, 3, 4}
        double v[] = {0, 5, 10, 15, 20, 25, 30}; // mang 7 phan tu, 7 bien double: tu dong resize kich thuoc

        // do san value v[0] = 0; v[1] = 5; ...
        // STACK             Value: 0, 5, ... HEAP do em
        v[0] = 6969;

        System.out.println("v[0]: " + v[0] + "| v[1]: " + v[1]);
        System.out.printf("Element 0 ne: %.1f\n", v[0]);

//        v[7] = 123; // vuot bien, cua co die
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + "\t");
            /*
                Chet cau lenh vi vuot bien
             */
        }
        System.out.println("\n\nThe array v has value of (using for each)");
        for (double x : v) {
            /*
                voi moi bien double x no se can quet qua toan bo phan tu cua mang
                x thuoc : tap hop v, x co quyen bang phan tu v thu 1, x = v[0]
                x = v[1], x = v[2], ... x = v[i]
                sout(x) ~~~~~~ sout(v[i])
                phan tu thu i cua mang double la 1 bien double v[i] -> x bien double co gi sai
             */
            System.out.print(x + "\t");
        }
    }

}

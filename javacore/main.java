package javacore;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
//        System.out.println("Giao Lang");
//        System.out.println("5 + 5 = "+ (5 + 5)); // output = 10
//        System.out.println("5 + 5 = "+ 5 + 5); // out = 55
//        playWidthVariables();

//        playWithInterger();
//        playWithDoubles();
//        playWithCharacter();
//        playWithBoolean();
        printintergerList();
    }

    public static void playWidthVariables(){
        // bien la 1 vung ram duoc dat ten chiem 1 so byte nhat dinh tuy loai du lieu ma no se chua ben trong (so , chu ,anh)
        // la cach dat ten cho 1 dai luong, 1 gia tri don, phuc
        int age =21;
        int a = 10, b;
        b = 100;
        System.out.println("age = " + age + ", a = " + a);
        System.out.printf("age = %d, a = %d", age , a);
        int yob = 2004;
        age = 2024 - yob;
//        System.out.println("\nage = " + 2024 - yob);  => error
        System.out.print("\nage = " + (2024 - yob));
        System.out.print("\nage = " + age);

    }
    public static void valiable(){
        /**
         * byte
         * short
         * long
         * int
         * float
         * double
         * boolean
         * char
         * */
    }

    public static void playWithInterger(){
        int n = 39;
        /**
         * mọi con số, kí tự xuất hiện trong code được gọi là "literal value"
         * số nguyên xuất hiện trong code mặc định là int
         * */
        System.out.println("so nguyen = " + "n");
        System.out.println("so nguyen = " + n);

//        long m = 30000000000; // error
        long m = 3000000000L; // ổn

        System.out.println("m = " + m);

        int status = 0xFA; //hệ 16
        System.out.println("status = " + status); // output =250

        int phone = 010;
        // số hệ 8
        System.out.println("phone = "+ phone);


    }
    public static void playWithDoubles(){
        // double = 8 byte
        double pi = 3.14;
        System.out.println("pi = " + pi);
        System.out.printf("pi = %.2f\n", pi); // không dùng %lf

//        float vat = 0.1;  errors
        float vat = 0.1F;
        System.out.println("vat =  " + vat );
    }
    public static void playWithCharacter(){
         // 2byte cho kiểu char , lưu bằng mã unicode
        char m = '$';  // chiếm 2 byte
        System.out.println("unit : " + m );
        String name = "Ngo Trong Liem";  // loại data pyte mới hoàn toàn và phức tạp
                                         // object data type của hướng đối tượng
        System.out.println("name = " + name);
        System.out.println("laster name = " + name.charAt(0)); // output = N => lấy chữ đầu tiên
        System.out.println("lowercase = " + name.toLowerCase()); // output = ngo trong liem
    }
    public static void playWithBoolean(){
        boolean marriedStatus = false;
        if(marriedStatus == true){
            System.out.println("danh don co dich moi vui");
        }else{
            System.out.println("vuon hong co loi nhung chua ai vao");
        }
    }

    public static void printintergerList(){
//        in ra các số tự nhiên từ 1 -> 100
        System.out.println("the list of 100 first interger");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        for (int i = 1; i <=10 ;i++){
            System.out.print(i + " ");
        }
    }
}
// youtube Giáo làng oop




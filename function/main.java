package function;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n = getApositiveInterger(); // gọi hàm va gán vào giá trị n
        Scanner sc = new Scanner(System.in);
        printIntergerList(n); // hard-code đầu vào, code cứng  - cố định đầu vào
        // không mềm mại , linh hoạt
        // bạn muốn in đến mấy ??? hỏi và nhập
//        printIntergerList();
//        printIntergerList();
    }

    // in ra n số tính từ 1
    // hiện tượng 1 class bất kì nhiều hàm trùng tên nhưng khác tham số đầu vào , mà phải khác trên data pyte chứ không phải khác trên tên biến
    // được gọi là OVERLOAD/OVERLOADING - quá tải hàm
    // - giống như: 5 anh em trên 1 chiếc xe wave
    // - OVERRIDE
    // - POLYMORPHISM - Tính đa hình
    public static void printIntergerList(int x){
        // không nên viết scaan ở đây
        // body of func <nghiền , trộn , xử lí > với đầu vào giả định
        System.out.println("The list of " + x + " first integers");
        for (int i = 1 ; i<=x ; i++ ){
            System.out.printf("%d\t", i );
        }

    }
    public static void printIntergerList(){ // hàm trùng với hàm trên nhưng có đầu vào x

    }
//    public static void printIntergerList(int n){ // error
//
//    }
    public static void printIntergerList(long x){ // phân biệt kiểu dữ liệu

    }
    public static int getApositiveInterger(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        n = sc.nextInt();
        return n;
    }
}

package ws;

public class ws1 {
    public static void main(String[] args) {
        boolean result  = isPrime(0);
        System.out.println("0 : " + result);
        System.out.println("100 : " + isPrime(100));
        System.out.println("101 : " + isPrime(101));

//        in các số từ 1 đến 100
        printPrimeList();

    }
    public static void printPrimeList(){
        System.out.println("the list of primes from 1...1000");
        for (int i = 1; i < 1000 ; i++ ){
            if(isPrime(i) == true){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int n){
        if( n < 2)
            return false;
        // else rồi đấy nếu CPU đến đây , n>= 2
        //kiểm tra xem trong khoảng từ 2 ... căn (n)
        // lỡ tay chia hết đauws nào không, có kl ngay không nguyên tốc
        if(n == 2){
            return true;
        }
        // for 2 ... căn n , n ơi , mày có chia hết đauws nào từ 2 đến căn ?
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false; // này lỡ tay chia hết trong [2 đến căn ]
            }

        }
//        hết for rồi mà không thoát sớm , đích thị không chia hết đứa nào
        // sure nguyên tố
        return true;
    }
}

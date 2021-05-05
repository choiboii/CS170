public class PrimeNumber {

    // write your code here
    public static boolean isPrime(int n){
        int i = 2;
        while(i < n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        // test your code here
        System.out.println(isPrime(2));
        System.out.println(isPrime(11));
        System.out.println(isPrime(9));
        System.out.println(isPrime(17));
        System.out.println(isPrime(57));
    }

}

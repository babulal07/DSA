public class LargestPrimeNumInRange {
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int start= 1;
        int end = 100;
        for(int i = end;i>=start;i--){
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }
}

public class SmallestPrimeandLargestPrimeNum {
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
        int smallestPrime = -1;
        int largestPrime = -1;
        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                if(smallestPrime == -1){
                    smallestPrime = i;
                }
                largestPrime = i;
            }
        }
        System.out.println("Smallest prime: " + smallestPrime);
        System.out.println("Largest prime: " + largestPrime);
    }
}

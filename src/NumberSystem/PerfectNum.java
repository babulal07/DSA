package NumberSystem;

public class PerfectNum {
    public static void main(String[] args) {
        int num= 6;
        int sum = 1;
        for(int i = 2 ; i<num ; i++){
            if (num%i==0) {
                sum+=i;
            }
        }
        if(sum==num)System.out.println("Perfect Num");
        else System.out.println("Not a Perfect Num");
    }
}

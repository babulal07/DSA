package NumberSystem;

public class HappyNum {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum += rem*rem;
            num/=10;
            if(num==0 && sum>9){
                num = sum;
                sum = 0;
            }
        }

        if(sum==1){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not a Happy Number");
        }
    }
}

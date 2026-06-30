public class Fibonacci {
    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        int size =10;
        for(int i = 0; i<size;i++){
            System.out.print(a+ " ");
            int c= a+b;
            a=b;
            b=c;
        }
    }
}

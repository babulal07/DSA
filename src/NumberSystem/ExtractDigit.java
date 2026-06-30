package NumberSystem;

class ExtractDigit{
    public static void main(String[] args) {
        int num = 154;
        while(num!=0){
            System.out.println(num%10);
            num/=10;
        }
    } 
}

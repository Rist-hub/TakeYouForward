public class PrintNto1{
    public static int print(int n){
        if(n<=0){
            return 0;
        }
        else{
            System.out.print(n+", ");
            n--;
            return print(n);
        }
    }

    public static void main(String[] args){
        print(5);
    }
}
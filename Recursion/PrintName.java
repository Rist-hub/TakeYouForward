public class PrintName{
    public static int print(int n){
        if(n<=0){
            return 0;
        }
        else{
            System.out.println("Rishabh");
            n--;
            return print(n);
        }
    }

    public static void main(String[] args){
        print(-5);
    }
}
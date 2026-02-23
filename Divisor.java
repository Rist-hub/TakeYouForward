public class Divisor{
    public static void main(String[] args){
        int N = 36;
        System.out.print("[ ");
        for(int i=1; i<=N; i++){
            if(N%i==0){
                System.out.print(i+", ");
            }
        }
        System.out.print("]");
    }
}
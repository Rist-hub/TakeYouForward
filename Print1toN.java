public class Print1toN{
    public static void print(int n){
        if(n>1){
            n--;
            print(n);
            System.out.print((n+1)+", ");
        }else{
            System.out.print(1+", ");

        }
    }

    public static void main(String[] args){
        print(5);
    }
}
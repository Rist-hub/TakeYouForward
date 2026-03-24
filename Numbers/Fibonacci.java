public class Fibonacci{
    public static void main(String args[]){
        int prev=0;
        int current=1;
        int next;
        for(int i=1;i<=10;i++){
            next = current + prev;
            System.out.print(next+",");
            prev=current;
            current=next;
        }
    }
}
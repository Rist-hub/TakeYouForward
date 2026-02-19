public class ReverseDigs{
    public static void main(String[] args){
        int num = 1534236469;   
        int temp = num,rem=0;
        long ten=1;
        long sum=0;
        while(temp!=0){
            temp=temp/10;
            ten=ten*10;
        }
        while(num>0){
            rem=num%10;
            ten=ten/10;
            sum=sum+(ten*rem);
            num=num/10;
        }
        System.out.println("Reverse of digs :"+sum);
    }
}
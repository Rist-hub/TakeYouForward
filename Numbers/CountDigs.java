public class CountDigs{
    public static void main(String[] args){
        int num = 1234556;
        int temp = num;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            ++count;
        }

        System.out.println("Number of digs :"+count);
    }
}
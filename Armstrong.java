public class Armstrong{
    public boolean armstrong(int n){
        long temp = n;
        int power=0,digit=0;
        double sum=0;
        if(n>0){
            while(temp!=0){
                temp=temp/10;
                ++power;
            }
            temp=n;
            while(temp!=0){
                digit=(int)temp%10;
                sum=sum+Math.pow(digit, power);
                temp=temp/10;
            }
        }
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Armstrong armObj = new Armstrong();
        boolean checkArm =armObj.armstrong(9474);
        System.out.println(checkArm);
    }
}
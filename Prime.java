public class Prime{
    public boolean checkPrime(int n){
        int count=0;
        boolean retVal=false;
        for(int i=2; i<n/2; i++){
            if(n%i==0){
                ++count;
            }
        }
        if(count>0){
            retVal = false;
        }else{
            retVal = true;
        }
    return retVal;
    }

    public static void main(String[] args){
        Prime obj = new Prime();
        boolean ans = obj.checkPrime(27);
        System.out.print(ans);
    }
}
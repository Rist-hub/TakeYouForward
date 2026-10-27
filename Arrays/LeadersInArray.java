
import java.util.ArrayList;
import java.util.List;

public class LeadersInArray{
    public static List<Integer> leaders(int[] arr){
        List<Integer> li = new ArrayList<>();
        int[] leaderArr = new int[arr.length];
        int index = 0;
        if(arr.length<2){
            li.add(arr[0]);
        }
        else{
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    li.add(arr[i]);
                }
            }
        }
        li.add(arr[arr.length-1]);

    return li;
    }

    public static void main(String[] args){
        int[] arr = {-3, 4, 5, 1, -4, -5};
        List<Integer> liMain = new ArrayList<>();
        liMain = leaders(arr);
        System.out.println(liMain);
    }
}
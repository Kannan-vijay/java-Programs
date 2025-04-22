//import java.util.Scanner;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int[] arr={1,5,9,7,3};
        System.out.println(Arrays.toString(find(arr,16)));
    }
    static int[] find(int[] arr,int target){
        HashMap<Integer,Integer> map =  new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}

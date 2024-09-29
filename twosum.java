//import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        int[] arr={1,5,9,7,3};
        int target=20;
        int i=0,j=1;
        for( i=0;i<4;i++){
            for( j =1;j<=4;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
                } 
                    // else{
                    //     System.out.println("No matched item found");
                    // }

            }
            
        }
        if(arr[i-1]+arr[j-1]!=target){
            System.err.println("target not found");
        }
        

    }
}

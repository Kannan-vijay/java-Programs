import java.util.Arrays;

public class rotate180 {
    public static void main(String[] args) {
        int[][] arr={
            // {1,2,3,4},
            // {5,6,7,8},
            // {9,10,11,12},
            // {13,14,15,16}

            {1,2,3},{4,5,6},{7,8,9}
        };
        int n=arr.length;
        // int row=(arr.length%2==0)? (arr.length/2):(arr.length/2)+1;
        // int col=(arr[0].length%2==0)?(arr[0].length):(arr[0].length/2);
        // for (int i = 0; i <row; i++) {
        //     for (int j = 0; j <arr[i].length; j++) {
        //         if(i==row && j==col)
        //             break;
        //         System.out.print(arr[i][j]);
                
        //     }
        //     System.out.println();
        // }






        int start=0;
        int end=arr.length-1;

       for (int i = 0; i < arr.length/2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp=arr[start][j];
                arr[start][j]=arr[end][j];
                arr[end][j]=temp;  
            }
            start++;
            end--;
       }
       
       for (int i = 0; i < arr.length; i++) {
            start=0;
             end=n-1;
            for (int j = 0; j < arr[i].length/2; j++) {
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
       }
       System.out.println(Arrays.deepToString(arr));
    }
}

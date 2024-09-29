
public class pattern1 {

    public static void main(String[] args) {
        int n=4;
        int num1=n;
        int l=0;
        int r=2*n-1;
        int[][] arr=new int[1000][1000];
        while (num1>0) {
            for (int i = l; i < r+1; i++) {
                for (int j = l; j < r+1; j++) {
                    if (i==l || i==r || j==l || j==r) {
                        arr[i][j]=num1;
                    }
                }  
            }
            l++;
            r--;
            num1--;   
        }
        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < n*2; j++) {
                System.err.printf("%3d",arr[i][j]);
            }
            System.err.print("\n");
        }
        System.err.println("finished");
    }
}
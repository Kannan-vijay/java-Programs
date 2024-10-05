import java.util.Arrays;

public class Spiral_Matrix_II_59 {
    public static void main(String[] args) {
        int n=4;
        int[][] res=new int[n][n];
        res=generateMatrix(n);
        System.out.println(Arrays.deepToString(res));
    }
    public static int[][] generateMatrix(int n) {
        int val=1;
        int[][] mat=new int[n][n];
        int i=0,j=0;
        int check=1;
        int row1=0,row2=n-1,col2=0,col1=n-1;
        while(val!=(n*n)+1){
            if(check==1){
                if(j==col1){
                    check=2;
                    row1++;
                }
                else{
                    mat[i][j]=val++;
                    j++;
                }
            }
            else if(check==2){
                if(i==row2){
                    check=3;
                    col1--;
                }
                else{
                    mat[i][j]=val++;
                    i++;
                }
            }
            else if(check==3){
                if(j==col2){
                    check=4;
                    row2--;
                }
                else{
                    mat[i][j]=val++;
                    j--;
                }
            }
            else if(check==4){
                if(i==row1){
                    check=1;
                    col2++;
                }
                else{
                    mat[i][j]=val++;
                    i--;
                }
            }
        }
        return mat;
    }
}

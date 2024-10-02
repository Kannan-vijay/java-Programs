import java.util.Arrays;

public class Rotate_Image_48 {
    public static void main(String[] args) {
        int[][] arr={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        arr=rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static int[][] rotate(int[][] mat) {
        int top=0,bot=mat.length-1;
        while(top<bot){
            for(int i=0;i<mat[0].length;i++){
                int temp=mat[top][i];
                mat[top][i]=mat[bot][i];
                mat[bot][i]=temp;
            }
            top++;bot--;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[i].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        return mat;
    }
}

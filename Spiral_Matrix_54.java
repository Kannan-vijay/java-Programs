import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Spiral_Matrix_54 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res= new ArrayList<>();
        res=spiralOrder(arr);
        System.out.println("[ "+res.stream()
                               .map(Object::toString)
                               .collect(Collectors.joining(" "))+" ]");
    }
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res=new ArrayList<Integer>();
        int i=0,j=0;
        int check=1;
        int row1=0,row2=mat.length-1,col2=0,col1=mat[0].length-1;
        while(res.size()!=mat.length*mat[0].length){
            if(check==1){
                if(j==col1){
                    check=2;
                    row1++;
                }
                else{
                    res.add(mat[i][j]);
                    j++;
                }
            }
            else if(check==2){
                if(i==row2){
                    check=3;
                    col1--;
                }
                else{
                    res.add(mat[i][j]);
                    i++;
                }
            }
            else if(check==3){
                if(j==col2){
                    check=4;
                    row2--;
                }
                else{
                    res.add(mat[i][j]);
                    j--;
                }
            }
            else if(check==4){
                if(i==row1){
                    check=1;
                    col2++;
                }
                else{
                    res.add(mat[i][j]);
                    i--;
                }
            }
        }
        return res;
    }
}

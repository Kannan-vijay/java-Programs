import java.util.Arrays;

public class Partition_Array_According_to_Given_Pivot_2161 {
    public static void main(String[] args) {
        int[] num={9,12,5,10,14,3,10};
        num=pivotArray(num,10);
        System.out.println(Arrays.toString(num));

    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int low=0,high=0,equal=0;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                high++;
            }
            else if(nums[i]<pivot){
                low++;
            }
            else{
                equal++;
            }
        }
        high=low+equal;
        equal=low;
        low=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                res[low++]=nums[i];
            }
            else if(nums[i]>pivot){
                res[high++]=nums[i];
            }
            else{
                res[equal++]=nums[i];
            }
        }
        return res;
    }
}

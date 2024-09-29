

public class findbstidxtoinsertaNo {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        int[] res=new int[2];
        res=calculate(arr,4);
        if(res[0]==-1){
            System.out.println("The number is already present");
        }
        else{
            System.out.println("between "+res[0]+" "+res[1]);
        }
    }
    public static int[] calculate(int[] nums,int target){
        int left=0,mid=0;
        int right=nums.length;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                return new int[]{-1};
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(right+" "+left);
        return new int[]{right,left};
    }
}

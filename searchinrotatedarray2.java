public class searchinrotatedarray2 {
    public static void main(String[] args) {
        int[] arr={1,2,2,0,1,1,1};
        System.out.println(calculate(arr,0));
    }
    public static boolean calculate(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return true;
            }
            else{
                return false;
            }
        }
        int l=0,r=nums.length-1;
        while(l<=r){
            if(nums[l]!=nums[0] && nums[r]!=nums[0]){
                break;
            }
            else if(nums[l]==nums[0]){
                l++;
            }
            else{
                r--;
            }
        }
         int left=l,right=r;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[0]){
                left=mid+1;
            }
            else if(nums[mid]<nums[0]){
                right=mid-1;
            }
        }
        System.out.println(left +"  "+right);
        int center=right;
        if(target>=nums[0]){
            int start=0,end=center;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return true;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        else if(target<nums[0]){
            int start=center+1,end=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return true;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return false;
    }
}

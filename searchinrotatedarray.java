public class searchinrotatedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(calculate(arr,3));
    }
    public static int calculate(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=nums[0]){
                left=mid+1;
            }
            else if(nums[mid]<nums[0]){
                right=mid-1;
            }
        }
        int center=left;
        if(target>=nums[0]){
            int start=0,end=center-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
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
            int start=left,end=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return -1;
        // if(target>=nums[0]){
        //     for(int i=0;i<left;i++){
        //         if(nums[i]==target){
        //             return i;
        //         }
        //     }
        // }
        // else{
        //     for(int i=left;i<nums.length;i++){
        //         if(nums[i]==target){
        //             return i;
        //         }
        //     }
        // }
       
    }
}

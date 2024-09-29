public class mininrotatedarray {
    public static void main(String[] args) {
        int[] arr={11,13,15,17};
        System.out.println(calculate(arr));
    }
    public static int calculate(int nums[]){
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
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
        return nums[left];
    }
}

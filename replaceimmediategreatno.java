public class replaceimmediategreatno {
    public static void main(String[] args) {
        int[] arr={2,-1,0,-1,3};
        for(int i=0;i<arr.length;i++){
            arr[i]=calculate(arr,i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("%3d",arr[i]);
        }
    }
    public static int calculate(int[] nums,int idx){
        int val=nums[idx],min=999999;
        for(int i=idx;i<nums.length;i++){
            if(nums[i]>val){
                if(nums[i]<min){
                    min=nums[i];
                }
            }
        }
        if(min==999999){
            return -1;
        }
        return min;
    }
}

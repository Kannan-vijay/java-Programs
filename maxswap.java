public class maxswap {
    public static void main(String[] args) {
        int[] arr={17, 94, 1, 6, 2, 55, 80};
        int left=0;int right=arr.length-1;
        boolean check=true;
        while(left<=right){
            int idx=maxidx(arr, left, right);
            if(check){
                int temp=arr[idx];
                arr[idx]=arr[left];
                arr[left]=temp;
                left++;
            }
            else{
                int temp=arr[idx];
                arr[idx]=arr[right];
                arr[right]=temp;
                right--;
            }
            check=!check;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d",arr[i]);
        }

    }
    public static int maxidx(int[] arr,int st,int end){
        int max=0;int idx=0;
        for(int i=st;i<=end;i++){
            if(max<=arr[i]){
                max=arr[i];
                idx=i;
            }
        }
        return idx;
    }
}

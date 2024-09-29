
public class factbasedsort {
    public static void main(String[] args) {
        int[] arr={10,9,25,50};
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=findfactors(arr[i]);
        }
        int idx=0;
        for(int i=0;i<arr.length;i++){
            int min=9999999;
            for(int j=i;j<arr.length;j++){
                if(min>res[j]){
                    min=res[j];
                    idx=j;
                }
            }
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
            int temp1=res[idx];
            res[idx]=res[i];
            res[i]=temp1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("%3d",arr[i]);
        }
    }
    public static int findfactors(int num){
        int count=2;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }
}

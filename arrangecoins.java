public class arrangecoins {
    public static void main(String[] args) {
        int n=2147483647 ;
        System.out.println(calculate(n));
    }
    public static int calculate(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            sum+=i;
            if(sum>n){
                return i-1;
            }
            else if(sum==n){
                return i;
            }
        }
        return n;
    }
}

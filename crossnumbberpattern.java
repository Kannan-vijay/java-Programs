public class crossnumbberpattern {
    public static void main(String[] args) {
        int n=5,k=0;
        int num=n+2;
        for(int i=1;i<(n*2);i++){
            if(k<n){
                k=i;
            }
            for (int j = 1; j <= k; j++) {
                if(i>n && i+j<=num){
                    System.out.print("   ");
                }
                else{
                    System.out.printf("%3d",j);
                }
            }
            if(i>n){
                num+=2;
            }
            
            System.out.println();
        }
            
    }
}


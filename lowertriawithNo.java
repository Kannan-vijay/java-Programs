public class lowertriawithNo {
    public static void main(String[] args) {
        int n=5,num=1,temp=n,num1=0;
        for (int i = 1; i <= n; i++) {
            num1=num;
            for (int j = 1; j <= n; j++) {
                
                if(i+j<=n){
                    System.out.print("   ");
                }
                else{
                    System.out.printf("%3d",num1);
                    num1=num1-j;
                }
            }
            num=num+temp;
            temp--;
            
            System.out.println();
        }
    }
}

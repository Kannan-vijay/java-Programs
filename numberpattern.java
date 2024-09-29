public class numberpattern {
    public static void main(String[] args) {
        int n=8;
        for (int i = 1; i <= n; i++) {
            for (int j2 = 0; j2 < n-i; j2++) {
                System.out.print("  ");
            }
            // for (int j = i; j >=1; j--) {
            //     System.out.printf("%2d",j);
            // }
            // for (int j = 2; j <=i; j++) {
            //     System.out.printf("%2d",j);
            // }
            int num=i;
            boolean check=true;
            for (int j = 0; j < (i*2)-1; j++) {
                if(num==1){
                    check=false;
                }
                if(check){
                    System.out.printf("%2d",num--);
                }
                else{
                    System.out.printf("%2d",num++);
                }
            }
            System.out.println();
        }
    }
}

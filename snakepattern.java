public class snakepattern {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){
                    System.out.printf("%4d",num);
                    num++;
                }
                else{
                    System.out.printf("%4d",num);
                    num--;
                }
            }
           if (i%2==0) {
            num=num+n-1;
           }
           else{
            num+=n+1;
           }
            System.out.println();
        }
    }
}

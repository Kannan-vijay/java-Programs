public class zigzagpattern {
    public static void main(String[] args) {
        int num=1,num1;
        int var=0;
        int n=10;
        for (int i = 0; i < n; i++) {
            num1=num;
            for (int j = 0; j < n; j++) {
                if (j+i<=n-1) {
                    System.out.printf("%4d",num1);
                    num1=num1+var+2;
                    var++;
                }
                else{
                    num1=num1-1;
                    System.out.printf("%4d",num1);
                    num1=num1+var;
                    var--;
                }
            }
            System.out.println();
            num=num+i+1;
            var=i+1;
        }
    }
}

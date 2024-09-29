import java.util.Scanner;

public class ebbill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the units:");
        int a = scan.nextInt();
        if(a<=100){
            System.out.print("pay the amoutn of ="+a*1.5);

        }
        else if(a>100 && a<=200)
        {
            System.out.println("pay the amoutn of ="+((100*1.5)+((a-100)*2)));
        }
        else if(a>200 && a<=300)
        {
            System.out.println("pay the amoutn of ="+((100*1.5)+(100*2)+(a-200)*3));
        }
        else if(a>300)
        {
            System.out.println("pay the amoutn of ="+((100*1.5)+(100*2)+(100*3)+(a-300)*4));
        }
        scan.close();
}
    
}

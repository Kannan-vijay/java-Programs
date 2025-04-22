public class patterns {
    public static void main(String[] args) {
        pattern14(5);
    }
    static void pattern14(int n){
        // 1  2  3  4  5
        // 10  9  8  7  6
        // 11 12 13 14 15
        // 20 19 18 17 16
        // 21 22 23 24 25
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2 == 0){
                    System.out.printf("%3d",val++);
                }
                else{
                    System.out.printf("%3d",val--);
                }
            }
            System.out.println();
            val+=(i%2==0)?4:6;
        }
    }
    static void pattern13(){
        // z o h o c o r 
        //           p
        //         o
        //       r
        //     a
        //   t
        // i o n t e a m
        String str = "zohocorporationteam";
        int n=0;
        for (int i = 1; i < str.length(); i++) {
            if((2*i)+(i-2) == str.length()){
                n=i;
                break;
            }
        }
        if(n==0){
            System.out.println("Not Possible to print this pattern");
            return;
        }
        int idx=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i+j==n-1 || i==n-1){
                    System.out.print(str.charAt(idx++)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        // 4 4 4 4 4 4 4 
        // 4 3 3 3 3 3 4
        // 4 3 2 2 2 3 4
        // 4 3 2 1 2 3 4
        // 4 3 2 2 2 3 4
        // 4 3 3 3 3 3 4
        // 4 4 4 4 4 4 4
        int m=2*n-1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int temp = n - Math.min(Math.min(i,j),Math.min(m-i-1,m-j-1));
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
    //     1  3  6 10 15
    //     2  5  9 14 19
    //     4  8 13 18 22
    //     7 12 17 21 24
    //    11 16 20 23 25
        int val = 1;
        for (int i = 1; i <= n; i++) {
            int temp = val;int inc = i+1;
            for (int j = 0; j < n; j++) {
                if(i+j<n){
                    System.out.printf("%3d",temp);
                    temp+=inc;
                    inc++;
                }
                else{
                    System.out.printf("%3d",temp);
                    inc--;
                    temp+=inc;
                }
            }
            System.out.println();
            val+=i;
        }
    }
    static void pattern10(int n){
        // 1 2 3 4 5 
        // 2 3 4 5 1
        // 3 4 5 1 2
        // 4 5 1 2 3
        // 5 1 2 3 4
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n+i; j++) {
                System.out.print((j%n+1)+" ");
            }
            System.out.println();
        }
    }
    static void pattern9(){
        // 1       5 
        //   2   4
        //     3
        //   2   4
        // 1       5
        int[] arr = {1,2,3,4,5};
        int n=arr.length;
        int l=0,r=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    System.out.print(arr[l]+" ");
                    l++;
                    if(i+j==n-1){
                        r--;
                    }
                }
                else if(i+j==n-1){
                    System.out.print(arr[r]+" ");
                    r--;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        // 1 
        // 2 4
        // 3 5 8
        // 6 8 11 15
        // 9 11 14 18 23
        int val = 1,inc =1;
        for (int i = 0; i < n; i++) {
            int temp = val;
            for (int j = 2; j <= i+2; j++) {
                System.out.print(temp+" ");
                temp+=j;
            }
            System.out.println();
            if(i>0 && i%2==0){
                inc+=2;
            }
            val+=inc;
            
        }
    }
    static void pattern7(int n){
        //         1
        //       2 1
        //     3 2 1
        //   4 3 2 1
        // 5 4 3 2 1 
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n-i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        //   2 3 4
        //     3 4
        //       4
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; (j <= i && j <= n); j++) {
                if(i>n && j<= i-n){
                    System.out.print("  ");
                }
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        // 1 
        // 2 4
        // 3 5 7
        // 4 6 8 10
        // 5 7 9 11 13
        for (int i = 0; i < n; i++) {
            int num=i+1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num +" ");
                num+=2;
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        // 1 
        // 2 6
        // 3 7 10
        // 4 8 11 13
        // 5 9 12 14 15
        for (int i = 1; i <= n; i++) {
            int num = i;
            int diff = 4;
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num+=diff;
                diff--;
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
            //         1 
            //       2 1
            //     3 2 1
            //   4 3 2 1
            // 5 4 3 2 1
        for (int i = 1; i <= n; i++) {
            for(int k=0;k<n-i;k++){
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        //         0 
        //       1 0 1
        //     2 1 0 1 2
        //   3 2 1 0 1 2 3
        // 4 3 2 1 0 1 2 3 4
        for (int i = 0; i < n; i++) {
            for(int k=0;k<n-i;k++){
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j+" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        //            1 
        //          6 2
        //       10 7 3
        //    13 11 8 4
        // 15 14 12 9 5
        int val=1;int inc = 5;
        for (int i = 0; i < n; i++) {
            int temp = val;
            for (int j = 0; j < n; j++) {
                if(i+j<n-1){
                    System.out.print("   ");
                }
                else{
                    System.out.print(temp+" ");
                    temp-=j+1;
                }
            }
            System.out.println();
            val+=inc;
            inc--;
        }
    }
    
}

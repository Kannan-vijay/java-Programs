public class sumofsquareofnumber {
    public static void main(String[] args) {
        int num=100;
        System.out.println(calculate(num));
    }
    public static boolean calculate(int c){
        int left=1,right=c;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((left*left)+(mid*mid)==c){
                return true;
            }
            else if((left*left)+(mid*mid)<c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}

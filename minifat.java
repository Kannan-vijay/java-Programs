public class minifat {
    public static void main(String[] args) {
        int[]a={9,7,7,7,7,8,5,4,5,2,1,0,9,8,3,-100,8};
        int min=a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
    
}

public class maxoddbinNo {
    public static void main(String[] args) {
        String str="11111111111111";
        System.out.println(calculate(str));
    }
    public static String calculate(String s){
        int count=0;String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        if(count==1){
            for(int i=0;i<s.length()-1;i++){
                res+='0';
            }
            res+='1';
            return res;
        }
        else{
            for(int i=0;i<count-1;i++){
                res+='1';
            }
            int n=res.length();
            for(int i=n;i<s.length()-1;i++){
                res+='0';
            }
            res+='1';
            return res;
        }
    }
}

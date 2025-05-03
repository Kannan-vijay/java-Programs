import java.util.*;

public class zohoPreparation {
    public static void main(String[] args) {
        rotate();
    }
    static void rearrangePosNeg(){
        int[] arr = {1,2,5,-5, -2, -3, -4, 5, -6,6};
        int[] res = new int[arr.length];
        int posidx = 0,negidx = 1;
        for (int i = 0; i < res.length; i++) {
            if(arr[i]<0){
                res[negidx] = arr[i];
                negidx+=2;
            }
            else{
                res[posidx] = arr[i];
                posidx+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    static void addDate(){
        int date = 7,month = 12,year = 2023;
        int incrementDate = 35;
        int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0 && year%100!=0) || year%400 == 0){
            mon[1] = 29;
        }
        while (incrementDate>0) {
            int temp = date + incrementDate;
            if(temp > mon[month-1]){
                incrementDate -= (mon[month-1] - date);
                date = 0;
                month++;
            }
            else{
                date = temp;
                incrementDate = 0;
            }
            if(month == 13){
                month = 1;
                year++;
            }
        }
        System.out.println(date+"/"+month+"/"+year);
    }
    static void moveZeros(){
        int[] arr = {1,2,4,5,0,1,0,1,2,0,1,5,4,8};
        int i = 0,j = 0;
        while (j<arr.length) {
            if(arr[i] == 0 && arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            if(arr[i]!=0){
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void addDigittoAll(){
        int digit = 4;
        int number = 2875;
        int reverseNum = 0;
        while (number>0) {
            reverseNum = reverseNum*10+(number%10);
            number/=10;
        }
        int resNum = 0;
        while (reverseNum>0) {
            int currdigit = (reverseNum%10)+digit;
            resNum = (int) (resNum * Math.pow(10, String.valueOf(currdigit).length())) + currdigit;
            reverseNum/=10;
        }
        System.out.println(resNum);
    }
    static void seperateZoroOnes(){
        int[] arr = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,0,0,1};
        int i = 0,j = arr.length-1;
        while (i<j) {
            if(arr[i] == 1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void sortArrayAscendingDecending(){
        int[] arr = {5 ,8 ,11 ,6, 2, 1, 7};
        Arrays.sort(arr);
        int i = 0,j = 0;
        while (j<arr.length) {
            if(arr[j]%2 != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        j--;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortedArraysWithOutRepeating(){
        int[] arr1 = {1,2,2,2,3,3,3,4,5,6};
        int[] arr2 = {2,2,3,3,4,5,5,6};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0,j = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                int num = arr1[i];
                res.add(num);
                while (i<n && arr1[i]==num) {
                    i++;
                }
                while (j<m && arr2[j]==num) {
                    j++;
                }
            }
            else if(arr1[i]<arr2[j]){
                int num = arr1[i];
                res.add(num);
                while (i<n && arr1[i]==num) {
                    i++;
                }
            }
            else{
                int num = arr2[j];
                res.add(num);
                while (j<m && arr2[j]==num) {
                    j++;
                }
            }
        }
        while (i<n) {
            int num = arr1[i];
            res.add(num);
            while (i<n && arr1[i]==num) {
                i++;
            }
        }
        while (j<m) {
            int num = arr2[j];
            res.add(num);
            while (j<m && arr2[j]==num) {
                j++;
            }
        }
        System.out.println(res);
    }
    static int findReverseIndex(String s,String k){
        char[] key = k.toCharArray();
        int i = s.length()-1;
        while (i>=0) {
            if(s.charAt(i) == key[0]){
                if(indexcheck(i, s, key)){
                    return i-key.length+2;
                }
            }
            i--;
        }
        return -1;
    }
    static boolean indexcheck(int start,String s,char[] key){
        int j = 0;
        int n = key.length -1;
        for (int i = start; (i >= start - n && i>=0); i--) {
            if(s.charAt(i) != key[j]){
                return false;
            }
            j++;
        }
        return j==key.length;
    }
    static void reverse(char[] arr){
        int i=0,j=arr.length-1;
        while (i<j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
    static void kthSmallerElements(){
        int[][] mat = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int k=3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> b - a
        );
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                pq.add(mat[i][j]);
            }
        }
        int temp = 0;
        k=pq.size()-k;
        while (k>=0) {
            temp =pq.poll();
            k--;
        }
        System.out.println("The K th Smaller element is : "+temp);
    }
    static void topKfreqElements(){
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );
        pq.addAll(map.keySet());
        ArrayList<Integer> res = new ArrayList<>();
        while (!pq.isEmpty() && k>0) {
            res.add(pq.poll());
            k--;
        }
        System.out.println(res);
    }
    static void mergeIntervels(){
        int[][] intervels = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };
        Arrays.sort(intervels,(a,b) -> Integer.compare(a[0],b[0]));
        int k = 0;
        for (int i = 0; i < intervels.length; i++) {
            if(intervels[k][1]>=intervels[i][0]){
                intervels[k][1] = Math.max(intervels[k][1], intervels[i][1]);
            }
            else{
                k++;
                intervels[k]=intervels[i];
            }
        }
        System.out.println(Arrays.deepToString(Arrays.copyOfRange(intervels, 0, k+1)));
    }
    static void maximumProductSubarray(){
        int[] nums = {2, 3, -2, 4};
        int n= nums.length;
        int[] prefOrSuff = new int[nums.length];
        prefOrSuff[0] = nums[0];
        int maxProd = nums[0];
        for (int i = 1; i < n; i++) {
            if(prefOrSuff[i-1] == 0){
                prefOrSuff[i] = nums[i];
            }
            else{
                prefOrSuff[i] = nums[i] * prefOrSuff[i-1];
            }
            maxProd = Math.max(maxProd, prefOrSuff[i]);
        }
        prefOrSuff[n-1] = nums[n-1];
        maxProd = Math.max(maxProd, nums[n-1]);
        for (int i = n-2; i >= 0; i--) {
            if(prefOrSuff[i+1] == 0){
                prefOrSuff[i] = nums[i];
            }
            else{
                prefOrSuff[i] = nums[i] * prefOrSuff[i+1];
            }
            maxProd = Math.max(maxProd, prefOrSuff[i]);
        }
        System.out.println("The Maximum Product is : " +maxProd);
    }
    static void rotate(){
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int n = matrix.length;
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

    }
    static void twoSum(){
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                System.out.println("The Indexex are : "+map.get(diff)+" and "+i);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("There is No indexes Available.");
    }
    static void spiralMatrixTraversal(){
        int[][] mat = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int n = mat.length;
        int rowfirst = 0,rowlast = n-1;
        int colfirst = 0,collast = n-1;
        int[] res = new int[n*n];
        int idx = 0;
        while (idx<(n*n)) {
            for (int i = colfirst; i <= collast; i++) {
                res[idx++] = mat[rowfirst][i];
            }
            rowfirst++;
            for (int i = rowfirst; i <= rowlast; i++) {
                res[idx++] = mat[i][collast];
            }
            collast--;
            for (int i = collast; i >= colfirst; i--) {
                res[idx++] = mat[rowlast][i];
            }
            rowlast--;
            for (int i = rowlast; i >= rowfirst; i--) {
                res[idx++] = mat[i][colfirst];
            }
            colfirst++;
        }
        System.out.println(Arrays.toString(res));
    }
    static void checkValidParanthesis(){
        char[] arr = "({[)}]".toCharArray();
        Stack<Character> st = new Stack<>();
        for (Character i : arr) {
            if(i=='(' || i=='[' || i=='{'){
                st.push(i);
            }
            else{
                if (st.isEmpty() || (i==')' && st.peek()!='(') || (i==']' && st.peek()!='[') || (i=='}' && st.peek()!='{')){
                    System.out.println("Not Valid parantesis.");
                    return;
                }
                st.pop();
            }
        }
        System.out.println("Valid Pranthesis");
    }
    static void findMissingNumber(){
        int[] arr = {1, 2, 4, 5, 6};
        int n =  arr.length+1;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println("The Missing Number is :"+(totalSum-sum));
    }
    static void firstNonRepeatingChar(){
        String s = "swiss";
        int[] freq = new int[26];
        for(char i:s.toCharArray()){
            freq[i-'a']++;
        }
        for(char i:s.toCharArray()){
            if(freq[i-'a'] == 1){
                System.out.println("First Non Repeating Characte is :"+i);
                return;
            }
        }
        System.out.println("There is no Character is present.");
    }
    static void maximumSumSubarray(){
        int[] arr = {2, -3, 5, 1, -2, 7, -5};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("The Maximum sum SubArray is :"+maxSum);
    }
    static void digitSum(){
        int num = 9875;
        if(num == 0){
            System.out.println("Sum of Digits :" + 0);
            return;
        }
        if(num%9 == 0){
            System.out.println("Sum of Digits :" + 9);
            return;
        }
        System.out.println("Sum of Digits :"+num%9);
    }
    static void matrixTransformation(){
        int[][] mat = {
            {1, 0, 0}, 
            {0, 0, 0}, 
            {0, 0, 1}
        };
        boolean[] row = new boolean[mat.length];
        boolean[] col = new boolean[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(row[i] || col[j]){
                    mat[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }
    static void anagramCheck(){
        String str1 = "listen";
        String str2 = "silent";
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
        }
        int[] freq = new int[26];
        for(int i = 0 ;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
    static void nextgreaterElement(){
        Stack<Integer> st = new Stack<>();
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] res = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=arr[i]) {
                st.pop();
            }
            res[i] = (st.isEmpty())?-1:st.peek();
            st.push(arr[i]);
        }
        System.out.println("Original Array :"+Arrays.toString(arr));
        System.out.println("Result Array :"+Arrays.toString(res));
    }
}

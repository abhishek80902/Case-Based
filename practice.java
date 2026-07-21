





public class practice {

    static long Limit = 4294967295L;

    static long rev(long n){
        long rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;        
        }
        return rev;
    }


    static boolean isPalindrome(long n){
        return n == rev(n);
    }
    public static void main(String[] args) {

        // check hello is subsequence of given string or not
        // Scanner sc = new Scanner(System.in);

        // String s = sc.next();
        // String target = "hello";

        // int j = 0;
        // for(int i = 0; i< s.length() && j < target.length(); i++){
        //     if(s.charAt(i) == target.charAt(j)){
        //         j++;
        //     }
        // }
        // if(j == target.length()){
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }


        



        // This problem is a simulation two card  problem.

        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();

        // while(t-- > 0){
        //     int a1 = sc.nextInt();
        //     int a2 = sc.nextInt();
        //     int b1 = sc.nextInt();
        //     int b2 = sc.nextInt();

        //     int[][] A = {{a1, a2}, {a2, a1}};
        //     int[][] B = {{b1, b2}, {b2, b1}};

        //     int ans = 0;
        //     for(int i = 0; i<2; i++){
        //         for(int j = 0; j<2; j++){
                    
        //             int suneet = 0;
        //             int slavic = 0;

        //             // Round 1
        //             if(A[i][0] > B[j][0]){
        //                 suneet++;
        //             } else if(A[i][0] < B[j][0]){
        //                 slavic++;
        //             }

        //             // Round 2
        //             if(A[i][1] > B[j][1]){
        //                 suneet++;
        //             } else if(A[i][1] < B[j][1]){
        //                 slavic++;
        //             }

        //             if(suneet > slavic){
        //                 ans++;
        //             }
        //         }
        //     }
        //     System.out.println(ans);

        // }











        // Sliding window problem for black white repaint

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // while(n-- > 0){
        //     int m = sc.nextInt();  // length
        //     int k = sc.nextInt();  // size of window

        //     String s = sc.next();

        //     int White = 0;
              
        //        // Count whites in first window
        //     for(int i = 0; i< k; i++){
        //         if(s.charAt(i) == 'W'){
        //             White++;        
        //         }
        //     }

        //     int ans = White;  // store the minimum white count

        //     // Slide the window
        //     for(int i = k; i< m; i++){
        //         if(s.charAt(i-k) == 'W'){    // remove the left white
        //             White--;
        //         }
        //         if(s.charAt(i) == 'W'){   // add the right white
        //             White++;

        //              ans = Math.min(ans, White);
        //         }

        //     }
        //     System.out.println(ans); 
        // }















        // HashMap problem

        //         Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt();

        // while (t-- > 0) {

        //     int n = sc.nextInt();
        //     long k = sc.nextLong();

        //     long[] arr = new long[n];
        //     HashMap<Long, Integer> map = new HashMap<>();

        //     for (int i = 0; i < n; i++) {
        //         arr[i] = sc.nextLong();
        //         map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        //     }

        //     boolean possible = false;

        //     for (long x : arr) {
        //         long need = x - k;

        //         if (!map.containsKey(need))
        //             continue;

        //         if (need != x || map.get(need) > 1) {
        //             possible = true;
        //             break;
        //         }
        //     }

        //     System.out.println(possible ? "YES" : "NO");
        // }










       // You can only swap adjacent digits of different parity.

        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();

        // while(t-- > 0){
        //     String s = sc.next();

        //     List<Character> odd = new ArrayList<>();
        //     List<Character> even = new ArrayList<>();

        //     // Separate the digits into odd and even lists

        //     for(char c : s.toCharArray()){
        //         if((c - '0') % 2 == 0){
        //             even.add(c);
        //         } else {
        //             odd.add(c);
        //         }
        //     }

        //     // Merge the odd and even lists back into a single string
        //     StringBuilder result = new StringBuilder();
        //     int i = 0, j = 0;
        //     while(i < even.size() && j < odd.size()){
        //         if(even.get(i) < odd.get(j)){
        //             result.append(even.get(i));
        //             i++;
        //         } else {
        //             result.append(odd.get(j));
        //             j++;
        //         }
        //     }

        //     // Append any remaining digits
        //     while(i < even.size()){
        //         result.append(even.get(i));
        //         i++;
        //     }
        //     while(j < odd.size()){
        //         result.append(odd.get(j));
        //         j++;
        //     }

        //     System.out.println(result.toString());
        // }








        // Reverse and Add given number repeatedly to get a Palindrome number

        // Scanner sc = new Scanner(System.in);
        // long n = sc.nextLong();

        // int count = 0;

        // while(count <= 1000){
        //     if(isPalindrome(n)){
        //         System.out.println(count + " " + n);
        //         break;
        //     } else {
        //         n += rev(n);

        //         if(n > Limit){
        //             System.out.println("Not Possible");
        //             break;
        //         }
        //         count++;
        //     }
        // }
        // System.out.println("Not Possible");















        // Split an Array into Two Equal Sum Subarrays
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // int totalSum = 0;
        // for(int i = 0; i< n; i++){
        //     arr[i] = sc.nextInt();
        //     totalSum += arr[i];
        // }
        // // if the sum is odd can not split rqually
        // if(totalSum % 2 != 0){
        //     System.out.println("NO");
        // } 

        // int targetSum = totalSum / 2;
        // int currentSum = 0;

        // // check for the valid split
        // for(int i = 0; i< n-1; i++){
        //     currentSum += arr[i];
        //     if(currentSum == targetSum){
        //         System.out.println("YES");
        //         return;
        //     }
        // }
        // System.out.println("NO");








        // 3 Sum Smaller Problem

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for(int i = 0; i< n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // int target = sc.nextInt();

        // Arrays.sort(arr);
        // int count = 0;

        // for(int i = 0; i< n-2; i++){
        //     int left  = i+1;
        //     int right = n-1;

        //     while(left < right){
        //         int sum = arr[i] + arr[left] + arr[right];

        //         if(sum < target){
        //             count += (right - left);
        //             left++;
        //         }
        //         else{
        //             right--;
        //         }
        //     }
        // }
        // System.out.println(count);
        













       // 6. helper function is below

    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();

    //    while(n-- > 0){
    //     int t = sc.nextInt();
    //     int r = sc.nextInt();
    //     int l = sc.nextInt();

    //     int[] arr = new int[t];
    //     for(int i = 0; i< t; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println(maxWins(arr, l, r));
    //    }



        

           
        

    }




    // Remove letter to Equalize Frequency - LC 2423


    // public boolean equalFrequency(String word) {

    //     int[] freq = new int[26];

    //     // Count frequency
    //     for (char ch : word.toCharArray()) {
    //         freq[ch - 'a']++;
    //     }

    //     // Try removing each character
    //     for (int i = 0; i < word.length(); i++) {

    //         int idx = word.charAt(i) - 'a';
    //         freq[idx]--;

    //         if (isValid(freq)) {
    //             return true;
    //         }

    //         // Restore
    //         freq[idx]++;
    //     }

    //     return false;
    // }

    // private boolean isValid(int[] freq) {

    //     int target = 0;

    //     for (int count : freq) {

    //         if (count == 0)
    //             continue;

    //         if (target == 0) {
    //             target = count;
    //         } else if (count != target) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }













    // N Queen Problem 

//     static int[][] board;
//     static int n;

//     static boolean solve(int row) {

//         if (row == n)
//             return true;

//         for (int col = 0; col < n; col++) {

//             if (isSafe(row, col)) {

//                 board[row][col] = 1;

//                 if (solve(row + 1))
//                     return true;

//                 board[row][col] = 0;
//             }
//         }

//         return false;
//     }

//     static boolean isSafe(int row, int col) {

//         // Check same column
//         for (int i = 0; i < row; i++) {
//             if (board[i][col] == 1)
//                 return false;
//         }

//         // Check left diagonal
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 1)
//                 return false;
//         }

//         // Check right diagonal
//         for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
//             if (board[i][j] == 1)
//                 return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         n = sc.nextInt();

//         board = new int[n][n];

//         if (solve(0)) {

//             for (int i = 0; i < n; i++) {

//                 for (int j = 0; j < n; j++) {
//                     System.out.print(board[i][j] + " ");
//                 }

//                 System.out.println();
//             }

//         } else {

//             System.out.println("No Solution");
//         }
//     }


 









       //  Sliding Window 6. Egor got bored and decided to do something

       static int maxWins(int[] arr, int l, int r){
        int sum = 0;
        int wins = 0;
        int left = 0;

        for(int right = 0; right < arr.length; right ++){
            sum += arr[right];
            
            while(left <= right &&  sum > right){
                sum -= arr[left];
                left++;
            }
            if(sum >= l){
                wins++;
                sum = 0;
                left = right + 1;
            }
        }
        return wins;
       }
}



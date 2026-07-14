import java.util.*;

public class practice {
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

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            int m = sc.nextInt();  // length
            int k = sc.nextInt();  // size of window

            String s = sc.next();

            int White = 0;
              
               // Count whites in first window
            for(int i = 0; i< k; i++){
                if(s.charAt(i) == 'W'){
                    White++;        
                }
            }

            int ans = White;  // store the minimum white count

            // Slide the window
            for(int i = k; i< m; i++){
                if(s.charAt(i-k) == 'W'){    // remove the left white
                    White--;
                }
                if(s.charAt(i) == 'W'){   // add the right white
                    White++;

                     ans = Math.min(ans, White);
                }

            }
            System.out.println(ans); 
        }

    }
}



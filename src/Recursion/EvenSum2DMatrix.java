package Recursion;

import java.util.Scanner;

public class EvenSum2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        isRows(0,arr,n,m);
    }
    static void isRows(int i, int[][]arr, int n, int m){
        if (i == n){
            return;
        }
        int ans = isColumn(i,0,arr,m,0); // call
        System.out.println(ans);
        isRows(i+1,arr,n,m);
    }
    static int isColumn(int i, int j, int[][]arr,int m, int sum){
        if (j == m){
            return 0;
        }
        if (arr[i][j]%2 != 0){ // 1
            sum = isColumn(i,j+1,arr,m,sum);

        }else {
            sum = isColumn(i,j+1,arr,m,sum) + arr[i][j];
            //System.out.println(isColumn(i,j+1,arr,m,sum));

        }
        return sum;
    }
}
/*
// input
3 3
1 2 3
4 5 6
7 8 9

// output
2
10
8
 */

package top.lehanbal.base;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;

public class TransposeMatrix {
    public static void TransposeMatrix(int[][] arr){
        int x = arr.length;
        int y = arr[0].length;
        int a = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                if(i == j) continue;
                a = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = a;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1,3,2},
                        {2,5,11},
                        {5,7,9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                StdOut.print(arr[i][j] + " ");
            }
            StdOut.println();
        }

        StdOut.println();

        TransposeMatrix(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                StdOut.print(arr[i][j] + " ");
            }
            StdOut.println();
        }
    }
}

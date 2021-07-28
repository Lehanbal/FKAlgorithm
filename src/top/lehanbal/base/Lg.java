package top.lehanbal.base;

import edu.princeton.cs.algs4.StdOut;

public class Lg {
    public static int LgFun(int N){
        int result = 0;
        for (int i = 2; i <= N; i *= 2) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        StdOut.println(LgFun(15));
    }
}

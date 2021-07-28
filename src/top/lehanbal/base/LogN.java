package top.lehanbal.base;

import edu.princeton.cs.algs4.StdOut;

//to calculate lg(N!)
public class LogN {
    public static double LogNFun(double N){
        if(N == 0 || N == 1) return 0.0;
        return Math.log(N) + LogNFun(N-1);
    }

    public static void main(String[] args) {
        StdOut.println(LogNFun(4));
        StdOut.println(Math.log(24));

    }
}

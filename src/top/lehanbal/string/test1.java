package top.lehanbal.string;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        String a = args[0];
        boolean flag = true;
        for (int i = 1; i < args.length; i++) {
            if (!a.equals(args[i])) {
                flag = false;
            }
        }
        if (flag) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }
}

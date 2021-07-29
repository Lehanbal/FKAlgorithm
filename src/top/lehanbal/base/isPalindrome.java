package top.lehanbal.base;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class isPalindrome {
    public static boolean isPalindromeFun(String text){
        int len = text.length();
        for (int i = 0; i < len / 2; i++) {
            if(text.charAt(i) != text.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StdOut.println(isPalindromeFun("aavvaa"));
        StdOut.println(isPalindromeFun("aavvaa1"));
        StdOut.println(isPalindromeFun("aavvaa2"));

    }
}

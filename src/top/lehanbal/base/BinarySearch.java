package top.lehanbal.base;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int[] arr, int key){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(key < arr[mid]) hi = mid - 1;
            else if(key > arr[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();

        Arrays.sort(whiteList);

        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(whiteList, key) == -1){
                StdOut.println(key);
            }
        }
    }
}

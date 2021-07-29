package top.lehanbal.base;

public class isStringSort {

    public static boolean isStringSortFun(String[] text) {
        int len = text.length;

        for (int i = 1; i < len; i++) {
            if (text[i - 1].compareTo(text[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = {"aada", "absdsdqw", "basd"};
        String[] b = {"dsda", "absdsdqw", "basd"};
        System.out.println(isStringSortFun(a));
        System.out.println(isStringSortFun(b));
    }
}

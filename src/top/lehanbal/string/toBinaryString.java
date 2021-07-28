package top.lehanbal.string;

public class toBinaryString {
    public static String toBinaryStringFun(int a){
        StringBuilder sb = new StringBuilder();
        for (int i = a; i > 0; i /= 2){
            sb.insert(sb.length(), i % 2);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toBinaryStringFun(16));
    }
}

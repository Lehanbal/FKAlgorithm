package top.lehanbal.base;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private static Scanner sc = new Scanner(System.in);

    public static void cal() {

    }

    public static void main(String[] args) {
        Stack<Double> vals = new Stack<>();
        Stack<String> ops = new Stack<>();
        while (!sc.hasNext("q")) {
            String s = sc.next();
            switch (s) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                    ops.push(s);
                    break;
                case ")":
                    String op = ops.pop();
                    double val = vals.pop();
                    switch (op){
                        case "+":
                            val += vals.pop();
                            vals.push(val);
                            break;
                        case "-":
                            val -= vals.pop();
                            vals.push(val);
                            break;
                        case "*":
                            val *= vals.pop();
                            vals.push(val);
                            break;
                        case "/":
                            val /= vals.pop();
                            vals.push(val);
                            break;
                        case "sqrt":
                            val = Math.sqrt(val);
                            vals.push(val);
                            break;
                    }
                    break;
                default:
                    vals.push(Double.parseDouble(s));
                    break;
            }
        }
        System.out.println(vals.pop());
    }
}

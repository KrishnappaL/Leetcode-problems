package code2;

import java.util.Stack;

public class EvalExpression {
public static void main(String[] args) {
	String[] tokens = {"2","1","+","3","*"};
	evalRPN(tokens);
}
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String t : tokens) {
            if (t.length() > 1 || Character.isDigit(t.charAt(0))) {
                stk.push(Integer.parseInt(t));
            } else {
                int y = stk.pop();
                int x = stk.pop();
                switch (t) {
                case "+":
                    stk.push(x + y);
                    break;
                case "-":
                    stk.push(x - y);
                    break;
                case "*":
                    stk.push(x * y);
                    break;
                default:
                    stk.push(x / y);
                    break;
                }
            }
        }
        return stk.pop();
    }
}


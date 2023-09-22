package com.java8practice;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String parenthesisString = "[{()}]";
        if(isBalanced(parenthesisString)){
            System.out.println("Balanced");
        }else System.out.println("Not Balanced");
    }

    @SuppressWarnings("unchecked")
    public static boolean isBalanced(String parenthesisString) {
        char[] chArr = parenthesisString.toCharArray();
        Stack stack = new Stack<>();
        for (int i = 0; i < chArr.length; i++) {

            if (chArr[i] == '(' || chArr[i] == '{' || chArr[i] == '[') {
                stack.push(chArr[i]);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char ch;
            switch (chArr[i]) {
                case ')':
                    ch = (char) stack.pop();
                    if (ch == '{' || ch == '[')
                       return false;
                    break;
                case '}':
                    ch = (char) stack.pop();
                    if (ch == '(' || ch == '[')
                        return false;
                    break;
                case ']':
                    ch = (char) stack.pop();
                    if (ch == '{' || ch == '(')
                        return false;
                    break;
            }
        }
       return stack.isEmpty();
    }
}

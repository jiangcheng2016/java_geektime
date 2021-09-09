package com.jiangrzc.bishi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class xiecheng0909_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Stack<String> stack = new Stack<>();
        stack.add("\\");
        while(n -- > 0) {
            String str = in.readLine();
            String strSplit[] = str.split(" ");
            String ml = strSplit[0];
            String dir = null;
            if(strSplit.length > 1){
                dir = strSplit[1];
            }
            if(ml.equals("cd"))
            {
                if(dir.equals("..")){
                    stack.pop();
                }
                else{
                    if(stack.size() == 1)
                        stack.add(dir);
                    else
                        stack.add("\\" + dir);
                }
            }else if(ml.equals("pwd"))
            {
                for (String s : stack) {
                    System.out.print(s);
                }
                System.out.println();
            }
        }
    }
}

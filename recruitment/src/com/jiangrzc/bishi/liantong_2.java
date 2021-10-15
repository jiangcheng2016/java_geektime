package com.jiangrzc.bishi;

import javafx.scene.SnapshotParameters;

import java.util.Scanner;

public class liantong_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score;
        while(in.hasNextLine()){
            String passWord = in.nextLine();
            score = 0;
            System.out.println(getScore(passWord,score));
        }
    }

    private static int getScore(String passWord, int score) {
        int len = passWord.length();
        //1.长度
        if(len <= 4)
            score += 5;
        else if(len >= 5 && len <= 7)
            score += 10;
        else if(len >= 8)
            score += 25;
        //2.字母
        int isLower = 0;
        int isHigh = 0;
        int isNumber = 0;
        for(int i = 0; i < len; i ++)
        {
            if(passWord.charAt(i) >= 'A' && passWord.charAt(i) <= 'Z')
                isHigh ++;
            if(passWord.charAt(i) >= 'a' && passWord.charAt(i) <= 'z')
                isLower ++;
            if(passWord.charAt(i) >= '0' && passWord.charAt(i) <= '9')
                isNumber ++;
        }
        if(isHigh == len || isLower == len) score += 10;
        if(isHigh > 0 && isLower > 0) score += 25;
        //3.数字
        if(isNumber == 1 || isNumber == 2) score += 10;
        if(isNumber >= 3) score += 20;
        //4.符号
        if(isHigh + isLower + isNumber < (len - 1)) score += 10;
        if(isHigh + isLower + isNumber < (len - 2)) score += 20;
        //5.其他
        if(isHigh > 0 && isLower > 0 && isNumber >0 && (isHigh + isLower + isNumber) < len) score += 10;
        else  if((isHigh > 0 || isLower > 0) && isNumber >0 && (isHigh + isLower + isNumber) < len) score += 5;
        else if((isHigh > 0 || isLower > 0) && isNumber >0 ) score += 3;
        return score;
    }
}

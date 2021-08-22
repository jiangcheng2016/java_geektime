package com.jiangrzc.bishi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zijie0822_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        while(t != 0){
            t --;

            String str = in.readLine();

            String[] strSplit = str.split(" ");

            int x = Integer.parseInt(strSplit[0]);
            int y = Integer.parseInt(strSplit[1]);

            System.out.println(x + ":" + y);
        }

    }
}


/*
#include <iostream>
using namespace std;



int main()
{
    int t;

    cin >> t;

    int a, b;

    while(t --)
    {
        int x,y;
        cin >> x >> y;
        int count = 0;
        for(int i = x; i <= y; i ++)
        {
            if(i < 10){
              count ++;
              continue;
            }

            while(i > 10)
            {
                cout << i << endl;
                if(i < 100)
                {
                    a = i % 10;
                    b = i / 10;
                    i = b;
                }
                else
                {
                    a = i % 10;
                    b = i % 100;
                    i = i / 100;
                }

                if(a != b)
                    break;
            }

            if(a == b) count ++;
        }

        cout << count << endl;
    }

}
 */


/*
#include <iostream>
#include <vector>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    int t;
    cin >> t;

    vector<int> a;

    while(t --)
    {
        int x, y;
        cin >> x >> y;

        int count = 0;
        for(int i = x; i <= y; i ++)
        {
            a.clear();
            // if(i < 10){
            //     count ++;
            //     continue;
            // }

            int c = i;
            while(c > 10)
            {

                a.push_back(c % 10);
                c = c / 10;
            }

            a.push_back(c);


            //sort(a.begin(),a.end());
            int sum = 0;
            for(int i = 0; i < a.size(); i ++)
            {
                if(a[0] != a[i])
                    break;
                else
                    sum ++;
            }
            if(sum == a.size()) count ++;

            sum = 0;

            // if(a.size() > 1)
            //     if(a[0] == a[a.size() - 1])
            //         count ++;
        }

        cout << count << endl;

    }

    return 0;
}
 */
package com.jiangrzc.bishi;

import java.util.PriorityQueue;

public class Zuiduanlu {

    public static void main(String[] args) {
        Zuiduanlu so = new Zuiduanlu();
        int[][] arr = {{1,1,1,1,0},{0,1,0,1,0},{1,1,2,1,1},{0,2,0,0,1}};
        so.minSailCost(arr);
    }
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
    boolean[][] vis;
    public int minSailCost (int[][] input) {
        vis = new boolean[input.length][input[0].length];
        PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2)->{
            return o1[2] - o2[2];
        });
        int ans = Integer.MAX_VALUE;
        // 第一步花费为0
        que.offer(new int[]{0,0,0});
        while(!que.isEmpty()){
            int[] top = que.poll();
            int x = top[0];
            int y = top[1];
            vis[x][y] = true;
            int co = top[2];
            if(x == input.length-1 && y == input[0].length-1){
                return co;
            }
            for(int i = 0; i < 4; i++){
                int xx = x + dir[i][0];
                int yy = y + dir[i][1];
                if(xx >= 0 && xx < input.length && yy >= 0 && yy < input[0].length && input[xx][yy] != 2  && !vis[xx][yy]){
                    int t = input[xx][yy] == 1 ? 1 : 2;
                    int coco = co + t;
                    que.offer(new int[]{xx,yy,coco});
                }
            }
        }
        return -1;
    }


}
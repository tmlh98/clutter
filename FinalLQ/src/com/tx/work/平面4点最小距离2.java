package com.tx.work;

import java.util.ArrayList;
import java.util.Scanner;

public class 平面4点最小距离2 {
    public static ArrayList<point> list = new ArrayList<point>();
    public static double minDistance = Double.MAX_VALUE;
    
    static class point {
        public double x;
        public double y;
        point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public double getDistance(point a, point b) {
        double result = Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y));
        return result;
    }
    
    public void getResult() {
        double[][] distance = new double[list.size()][list.size()];  //获取所有点之间的距离
        for(int i = 0;i < list.size();i++) {
            point a = list.get(i);
            for(int j = i + 1;j < list.size();j++) {
                point b = list.get(j);
                distance[i][j] = getDistance(a, b);
                distance[j][i] = distance[i][j];
            }
        }
        
        for(int a = 0;a < list.size();a++) {
            for(int b = a + 1;b < list.size();b++) {
                double temp1 = distance[a][b];
                if(temp1 > minDistance)
                    continue;
                for(int c = b + 1;c < list.size();c++) {
                    double temp2 = distance[a][b] + distance[a][c] + distance[b][c];
                    if(temp2 > minDistance)
                        continue;
                    for(int d = c + 1;d < list.size();d++) {
                        double temp = distance[a][b] + distance[a][c] + distance[a][d]+
                        distance[b][c] + distance[b][d] + distance[c][d];
                        if(temp < minDistance)
                            minDistance = temp;
                    }
                }
            }
        }
        minDistance = minDistance / 6;
        System.out.printf("%.2f", minDistance);
    }
    
    public static void main(String[] args) {
        平面4点最小距离2 test = new 平面4点最小距离2();
        Scanner in = new Scanner(System.in);
        while(true) {
            String a = in.nextLine();
            if(a.equals(null) || a.equals(""))
                break;
            String[] temp = a.split(",");
            double x = Double.valueOf(temp[0]);
            double y = Double.valueOf(temp[1]);
            list.add(new point(x,y));
        }
        test.getResult();
    }
}
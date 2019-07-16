package cn.dzqc.sftg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class 快乐司机 {

	/**
	 *现在知道了汽车核载重量为w，可供选择的物品的数量n。每个物品的重量为gi,价值为pi。求汽车可装载的最大价值。（
	 *输入第一行为由空格分开的两个整数n w
　　	 *第二行到第n+1行，每行有两个整数，由空格分开，分别表示gi和pi
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int w=in.nextInt();
		//汽车核载重量为w，可供选择的物品的数量n,重量为gi,价值为pi
		int g[]=new int [n];
		int p[]=new int [n];
		double pg[]=new double [n];
		double pg2[]=new double [n];
		int index[]=new int [n];
		
		//n个物品：g[]保存第n个物品的重量，p[]保存第n个物品的价值，单价为pi/gi;
		for (int i = 0; i < n; i++) {
			g[i]=in.nextInt();
			p[i]=in.nextInt();
			pg2[i]=pg[i]=(double)p[i]/(double)g[i];//保存单价
		}
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j<n-1; j++) {
				if(pg2[j]>pg2[j+1]){
					double temp=pg2[j];
					pg2[j]=pg2[j+1];
					pg2[j+1]=temp;
					
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(pg[i]==pg2[j]){
					index[i]=j;
				}
			}
		}//保存价值的下标；
		double result=0;//最大价值
		//装载按价值从大到小
		for (int i = 0; i <n; i++) {
			if(w>p[index[n-i-1]]){
				result+=p[index[n-i-1]];
				w-=g[index[n-i-1]];
			}else if(w>0){
				result+=w*pg[index[n-i-1]];
				break;
			}
			
		}
		BigDecimal bdBigDecimal=new BigDecimal(result).setScale(1,RoundingMode.FLOOR);
		System.out.print(bdBigDecimal);

	}

}

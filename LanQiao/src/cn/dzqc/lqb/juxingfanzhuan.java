package cn.dzqc.lqb;
import java.util.Scanner;

public class juxingfanzhuan {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("��ֱ��������У��ͷ���");
		int M=in.nextInt();
		int N=in.nextInt();
		int Z=in.nextInt();
		int nums[][]=top(M,N,Z);
		
		System.out.println("��ת��");
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] top(int m,int n,int z){
		Scanner in=new Scanner(System.in);
		int nums[][]=new int [m][n];
		System.out.println("�����鸳ֵ��");
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j]=in.nextInt();
			}
		}
		System.out.println("����ǰ��");
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		if(z==1){
			for(int i=0;i<nums.length;i++){
				if((nums.length)/2==i){
					break;
				}else{
					for(int j=0;j<nums[i].length;j++){
						int temp=0;
						temp=nums[i][j];
						nums[i][j]=nums[nums.length-i-1][j];
						nums[nums.length-i-1][j]=temp;
					}
				}
			}
		}else if(z==0){
			for(int i=0;i<nums.length;i++){
					for(int j=0;j<nums[i].length;j++){
						if(n/2!=j){
							int temp=0;
							temp=nums[i][j];
							nums[i][j]=nums[i][n-1-j];
							nums[i][n-1-j]=temp;
						}else{
							break;
						}
						
					}
			}
		}
		
		
		return nums;
	} 

}
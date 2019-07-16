package cn.dzqc.sftg;

import java.util.Scanner;

public class ÐÂ½¨Microsoft_WordÎÄµµ {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[1500];
		int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			String string = scanner.next();
			if(string.charAt(0)=='N'){//New
				for(int j=0;j<n;j++){
					if(arr[j]==0){
						arr[j]=1;
						System.out.println(j+1);
						break;
					}
				}
			}else{//Delete
				int a = scanner.nextInt();
				if(arr[a-1]==1){
					arr[a-1]=0;
					System.out.println("Successful");
				}else if(arr[a-1]==0){
					System.out.println("Failed");
				}
			}
		}
	}
}

package cn.java.ss;
/*
 *小明参加了学校的趣味运动会，其中的一个项目是：跳格子。
    地上画着一些格子，每个格子里写一个字，如下所示：（也可参见p1.jpg）
		从我做起振
		我做起振兴
		做起振兴中
		起振兴中华

    比赛时，先站在左上角的写着“从”字的格子里，可以横向或纵向跳到相邻的格子里，但不能跳到对角的格子或其它位置。一直要跳到“华”字结束。
    要求跳过的路线刚好构成“从我做起振兴中华”这句话。
    请你帮助小明算一算他一共有多少种可能的跳跃路线呢？
    答案是一个整数，请通过浏览器直接提交该数字。
 */
public class 振兴中华 {
	static int count  = 0;
	
	public static void main(String[] args) {
		int M=4,N=5;  
        int[][] a=new int [M][N];  
        for (int j=0;j<N;j++)  
        {  
            a[0][j]=1;  
        }  
        for (int i=1;i<M;i++)  
        {  
            a[i][0]=1;  
            for (int j=1;j<N;j++)  
                a[i][j]=a[i-1][j]+a[i][j-1];  
        }  
        System.out.println(a[M-1][N-1]);  
        
        
		f(1 , 1);//每次都从(1,1)的位置起跳
		System.out.println(count);
	}
	//n :横坐标 m:纵坐标
	private static void f(int n, int m) {
		if(n == 4 && m== 5) {
			count ++;
			return;
		}
		if(n > 4 || m>5)return;
		f(n + 1, m);
		f(n , m + 1);
	}
}

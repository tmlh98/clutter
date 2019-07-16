import java.util.Scanner;


public class Main {
     
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	f3(a,b,c);
    	
	}

	private static void f(int a, int b, int c) {
		if( b < a){ // b < a     ? c
			if(c < b){
				System.out.println(c + " " + b +  " " + a);
			}else if( a < c ){   // b < a ,  b < c  ,  a ? c 
				System.out.println(b + " " + a +  " " + c);
			}else{
				System.out.println(b + " " + c +  " " + a);
			}
		}else{    // a < b      ? c
			if(c < a){
				System.out.println(c + " " + a +  " " + b);
			}else if( b < c ){   // a < b ,  a < c  ,  b ? c 
				System.out.println(a + " " + b +  " " + c);
			}else{ 
				System.out.println(a + " " + c +  " " + b);
			}
		}
	}
    
	private static void f2(int a, int b, int c) {
		int temp  = 0;
		if(a > b){//����  ��ʱ      a < b
			temp =a ;
			a = b ;
			b = temp;
		} 
		if(a > c){//����  ��ʱ      a < b     , a<c
			temp =a ;
			a = c ;
			c = temp;
		}
		if(b > c){//����  ��ʱ      a < b , a<c ,  b < c
			temp =b ;
			b = c ;
			c = temp;
		}
		
		System.out.println( a + " " + b + " " + c);
	}
	
	//ʹ����������    : һ����ͬʱ���������һ������ô�ض������������ .  ��: a ^b ^ b = a;
	private static void f3(int a, int b, int c) {
		if(a > b){//����  ��ʱ      a < b
			a ^= b;  
			b ^= a;
			a ^= b;
		} 
		if(a > c){//����  ��ʱ      a < b     , a<c
			a ^= c;
			c ^= a;
			a ^= c ;
		}
		if(b > c){//����  ��ʱ      a < b , a<c ,  b < c
			c ^= b;
			b ^= c;
			c ^= b;
		}
		System.out.println( a + " " + b + " " + c);
	}
	
}
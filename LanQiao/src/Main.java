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
		if(a > b){//交换  此时      a < b
			temp =a ;
			a = b ;
			b = temp;
		} 
		if(a > c){//交换  此时      a < b     , a<c
			temp =a ;
			a = c ;
			c = temp;
		}
		if(b > c){//交换  此时      a < b , a<c ,  b < c
			temp =b ;
			b = c ;
			c = temp;
		}
		
		System.out.println( a + " " + b + " " + c);
	}
	
	//使用异或运算符    : 一个数同时异或两次另一个数那么必定等于最初的数 .  即: a ^b ^ b = a;
	private static void f3(int a, int b, int c) {
		if(a > b){//交换  此时      a < b
			a ^= b;  
			b ^= a;
			a ^= b;
		} 
		if(a > c){//交换  此时      a < b     , a<c
			a ^= c;
			c ^= a;
			a ^= c ;
		}
		if(b > c){//交换  此时      a < b , a<c ,  b < c
			c ^= b;
			b ^= c;
			c ^= b;
		}
		System.out.println( a + " " + b + " " + c);
	}
	
}
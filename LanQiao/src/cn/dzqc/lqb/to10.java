package cn.dzqc.lqb;
import java.math.BigInteger;
import java.util.Scanner;
public class to10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		BigInteger bigInteger=new BigInteger(HaxTo2(a),2);
		in.close();
		System.out.println(bigInteger.toString());
	}
	public static String  HaxTo2(String str){
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='0')
				sb.append("0000") ;
			else if(str.charAt(i)=='1')
				sb.append("0001") ;
			else if(str.charAt(i)=='2')
				sb.append("0010") ;
			else if(str.charAt(i)=='3')
				sb.append("0011") ;
			else if(str.charAt(i)=='4')
				sb.append("0100") ;
			else if(str.charAt(i)=='5')
				sb.append("0101") ;
			else if(str.charAt(i)=='6')
				sb.append("0110") ;
			else if(str.charAt(i)=='7')
				sb.append("0111") ;
			else if(str.charAt(i)=='8')
				sb.append("1000") ;
			else if(str.charAt(i)=='9')
				sb.append("1001") ;
			else if(str.charAt(i)=='A')
				sb.append("1010") ;
			else if(str.charAt(i)=='B')
				sb.append("1011") ;
			else if(str.charAt(i)=='C')
				sb.append("1100") ;
			else if(str.charAt(i)=='D')
				sb.append("1101") ;
			else if(str.charAt(i)=='E')
				sb.append("1110") ;
			else if(str.charAt(i)=='F')
				sb.append("1111") ;
			
		}
		return sb.toString();
	}
	
	

}

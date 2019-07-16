package cn.java.ss;

public class ╠х╬фа© {
	public static void main(String[] args) {
		for(int a = 20 ; a > 0 ; a --)
			for(int b = a -1 ; b > 0 ; b --)
				for(int c = b - 1; c > 0 ; c --)
					for(int d = c - 1; d > 0 ; d --)
						if(a*b*c*d == a*b*c + a*c*d + a*b*d + b*c*d)
							System.out.println(a +" " + b + " " + c + " " +d + " 0");
	}
}

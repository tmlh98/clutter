package cn.dzqc.sftg; 
public class �������̹��� {
	public static void main(String[] args) {
		/**
		 * A:b,c,d����
		 * B:c��e
		 * C��c��d
		 * D��ade
		 * E:abcd
		 * �����˵�滰�ķֱ�ΪAB,AC,AD,AE,BC,BD,BE,CD,CE,DE��
		 */
		int r; 
		for(int i=1;i<=5;i++){ 
		r=0; 
		if(i!=1&&i!=5) 
		r++; 
		if(i==3||i==5) 
		r++; 
		if(i==3||i==4) 
		r++; 
		if(i!=2&&i!=3) 
		r++; 
		if(i!=5) 
		r++; 
		if(r==2) 
		System.out.print((char)(i-1+'A')+"");
		
	}
	}
}
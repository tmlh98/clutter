package cn.dzqc.lqb;

import java.util.Scanner;
class person{
   public static void main(String []args){
       Scanner in=new Scanner(System.in);
       String per1=in.next();
       String per2=in.next();
       String N="";
       if(per1.length()>=1&&per1.length()<=50&&per2.length()==per1.length()){
           
    	   for(int i=0;i<per1.length();i++){
    		  N+=judge(per1.charAt(i),per2.charAt(i)); 
    	   }
    	   System.out.println(N);
    	   
    	   
       }
   } 
   public  static String judge(char a,char b){
	   if(a=='1'&&b=='1'){
		   return "1";
	   }
	   if(a=='0'&&b=='0'){
		   return "1";
	   }else{
		   return "0";
	   }
	   
	   
   }
   
   
   
   
}
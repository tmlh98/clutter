package cn.java.ss;
/*
 * 今年的植树节（2012年3月12日），小明和他的叔叔还有小伙伴们一起去植树。
 * 休息的时候，小明的同学问他叔叔多大年纪，他叔叔说：“我说个题目，看你们谁先猜出来！”
    “把我出生的年月日连起来拼成一个8位数（月、日不足两位前补0）正好可以被今天的年、月、日整除！”
    他想了想，又补充到：“再给个提示，我是6月出生的。”
    根据这些信息，请你帮小明算一下，他叔叔的出生年月日。
    答案写在“解答.txt”中，不要写在这里！
    格式是年月日连成的8位数。
    例如，如果是1948年6月12日，就写：19480612
 */
public class 猜生日 {
    public static void main(String[] args) {  
        
        //外层循环年  
        for(int year=2011; year>1912; year--){  
                //内层循环日  
                for (int i = 1; i <= 31; i++) {  
                    //把年月日拼接起来  
                    String s = year+"06"+(i>=10?i:"0"+i);  
                    //转换成8位的数字  
                    int a = Integer.valueOf(s);  
                    //验证整除关系  
                    if(a%2012 == 0   
                            && a%3 == 0  
                            && a%12 == 0){  
                        System.out.println(s);  
                        break;  
                    }  
                }  
        }  
    }  
}

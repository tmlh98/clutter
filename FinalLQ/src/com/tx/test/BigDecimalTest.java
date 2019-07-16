package com.tx.test;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalTest {
	
	public static void main(String[] args) {
		BigDecimal bd = BigDecimal.valueOf(5);
		BigDecimal bd2 =bd.divide(BigDecimal.valueOf(6),new MathContext(1000));

		System.out.println(bd2);
		
		BigDecimal loanAmount = new BigDecimal("15000.48"); //������ 
		BigDecimal interestRate = new BigDecimal("0.008"); //����  
		BigDecimal interest = loanAmount.multiply(interestRate); //���
		
		System.out.println(interest);
	}
	
}

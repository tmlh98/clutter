package com.tx.test;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalTest {
	
	public static void main(String[] args) {
		BigDecimal bd = BigDecimal.valueOf(5);
		BigDecimal bd2 =bd.divide(BigDecimal.valueOf(6),new MathContext(1000));

		System.out.println(bd2);
		
		BigDecimal loanAmount = new BigDecimal("15000.48"); //贷款金额 
		BigDecimal interestRate = new BigDecimal("0.008"); //利率  
		BigDecimal interest = loanAmount.multiply(interestRate); //相乘
		
		System.out.println(interest);
	}
	
}

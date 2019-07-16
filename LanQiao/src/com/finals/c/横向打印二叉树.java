package com.finals.c;

import java.util.ArrayList;
import java.util.Scanner;

import com.finals.datastruct.BiTree;

public class ºáÏò´òÓ¡¶þ²æÊ÷ {
   public static void main(String[] args) {
	   BiTree root =new BiTree(100);
	   root.add(new BiTree(500));
	   root.add(new BiTree(50));
	   root.add(new BiTree(200));
	   ArrayList<Integer> list = root.PrintFromTopToBottom(root);
	   for (Integer integer : list) {
		System.out.println(list);
	}
   }
}
package com.javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondLargest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = s.nextInt();
		int[] num = new int[size];
		int len = num.length;
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0; i<len; i++)
		{
			num[i]=s.nextInt();
		} 
		Arrays.sort(num);
		System.out.println("Sorted Elements: ");
		for(int i=0; i<len; i++)
		{
			System.out.println(num[i]);
		} 
		System.out.println("2nd Largest: "+num[len-2]);

	}

}



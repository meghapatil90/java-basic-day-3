package com.javabasic;

import java.util.Scanner;

public class PrintArrayELement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of array: ");	
		int size = s.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = s.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			System.out.print("array Elemets: "+arr[i]+" " );
		}

	}

}



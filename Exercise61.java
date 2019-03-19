package com;

import java.util.Scanner;

public class Exercise61 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
			System.out.println(r);
		}
		System.out.println(sum);
	}

}

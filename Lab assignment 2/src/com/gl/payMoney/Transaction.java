package com.gl.payMoney;
import java.util.*;
public class Transaction {
	
	
	public static int[] array;
	public static int size, totalTargets;
	
	static Scanner sc = new Scanner(System.in);
	
	public void moneyTransaction() {
		
		
		System.out.println("Enter total transactions: ");
		size=sc.nextInt();
		
		array=new int[size];
		
		System.out.println("Enter the transactions: ");
		transactionValues();
		
		System.out.println("Enter total targets: ");
		totalTargets=sc.nextInt();
		
		while(totalTargets-- !=0) {
			int flag=0;
			
			long dailyTarget;
			
			System.out.println("Enter the daily target: ");
			dailyTarget=sc.nextLong();
			
			long sum=0;
			
			for(int i=0;i<array.length;i++) {
				sum+=array[i];
				if(sum>=dailyTarget) {
					System.out.println("Target achieved at "+(i+1)+" transaction");
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("Given target not achieved");
			}
		}
		
		sc.close();
		
	}
	
	public void transactionValues(){
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
	}
	
	public static void main(String[] args) {
		Transaction PayMoney = new Transaction();
		PayMoney.moneyTransaction();
	}
}

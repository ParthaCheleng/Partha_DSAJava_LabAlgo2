package com.gl.notesDriver;
import com.gl.notes.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		NoteCounter noteCounter = new NoteCounter();
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of currency denomination: ");
		int size=sc.nextInt();
		int[] notes=new int[size];
		
		System.out.println("Enter the currency denominations value: ");
		
		for(int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
		
		System.out.println("Enter amount to pay: ");
		int amount=sc.nextInt();
		

		bubbleSort.sort(notes);
		noteCounter.notesCounterImplementation(notes, amount);
		
		sc.close();
	}
	

}

package com.greatlearning.iitr.dsa.labsession2;

import java.util.Scanner;

public class Transaction {

	static int sum;

	public static void main(String[] args) {

		System.out.println("**************PayMoney***************");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction array: ");
			int size = sc.nextInt();
			int i;
			int transaction[] = new int[size];

			System.out.println("Enter values of array:");
			for (i = 0; i < size; i++) {
				System.out.print(+(i + 1) + ")");
				transaction[i] = sc.nextInt();
			}

			System.out.println("\n\nEnter the total no of targets that needs to be achieved");
			int targets = sc.nextInt();
			int flag;
			for (i = 1; i <= targets; i++) {
				sum = 0;
				flag = 0;

				System.out.println("\nEnter the value of target " + i);
				int target = sc.nextInt();

				for (int j = 0; j < transaction.length; j++) {
					sum += transaction[j];
					if (sum >= target) {
						flag = 1;
						System.out.println("Target achived after " + (j + 1) + " transactions \n");
						break;
					}
				}
				if (flag == 0)
					System.out.println("Given target is not achived \n");
			}

			sc.close();
		}
	}
}

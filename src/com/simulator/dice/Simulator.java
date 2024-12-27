package com.simulator.dice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Simulator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean appComplited=false;
		do {
		try {
		System.out.println("How many dice would you like to roll?");
		int numberOfDice = scanner.nextInt();
		
		appComplited=true;
		
        System.out.println("About to roll "+ numberOfDice + " dice");
		
		Random rand = new Random();
		for(int i=0;i<numberOfDice;i++) {
		int rolledNumber = rand.nextInt(6) + 1;
		System.out.println(display(rolledNumber));
	}
		}catch (InputMismatchException e) {
			System.out.println("that is not a valid number!");
			scanner.next();
		}
	}while(!appComplited);
	}

	static String display(int value) {
		switch (value) {
		case 1:
	        return "--------\n|      |\n|  o   |\n|      |\n--------";
	    case 2:
	        return "--------\n| o    |\n|      |\n|    o |\n--------";
	    case 3:
	        return "--------\n| o    |\n|  o   |\n|    o |\n--------";
	    case 4:
	        return "--------\n| o  o |\n|      |\n| o  o |\n--------";
	    case 5:
	        return "--------\n| o  o |\n|  o   |\n| o  o |\n--------";
	    case 6:
	        return "--------\n| o  o |\n| o  o |\n| o  o |\n--------";
	    default:
	        return "Not a valid die value";
		}
	}
}
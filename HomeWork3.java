/**
	Java. Level 1. Lesson 3. HomeWork3
	
	@author Artem Valeev
	@version Aug 19, 2018
*/

import java.util.Scanner;
import java.util.Random;

public class HomeWork3 {
	
	static void game1() {
		
		Scanner sc = new Scanner(System.in);
		int trueNumber = (int) (Math.random() * 10);
		int userNumber = -1;
		boolean gameTrue = false;
		int shot = 0;
		
		do {
			if (shot != 0) {
				if (userNumber < trueNumber)
					System.out.println("\tNeed more!");
				else
					System.out.println("\tNeed less!");
			};
			shot++;
			System.out.print("Shot #" + shot + ".\n\tNumber is ");
			userNumber = sc.nextInt();
			gameTrue = userNumber == trueNumber;	
		} while (shot < 3 && !gameTrue);  
		
		if (gameTrue) 
			System.out.println("\nYou win!\n");	
		else
			System.out.println("\nYou lose!\n");	
	}
	
	static void game2() {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String[] words = {"apple", "orange", "lemon", "banana", "apricot",
		"avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
		"melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
		"pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
		boolean gameTrue = false;
		String trueWord = words[random.nextInt(words.length)];
		String userWord = "";
		
		System.out.println("The word is enigmatic! Try to guess!");
		
		do {
			if (userWord != "") {
				System.out.print("\t");
				for (int i = 0; i < 16; i++) {
					if (i < trueWord.length() && i < userWord.length()) {
						if (trueWord.charAt(i) == userWord.charAt(i)) {
							System.out.print(userWord.charAt(i));
						} else
							System.out.print("#");
					}
					else 
						System.out.print("#");
				}
				System.out.println();
			}
			System.out.print("\t");
			userWord = sc.next();
			gameTrue = trueWord.equals(userWord);
		} while (!gameTrue);
		
		if (gameTrue) 
			System.out.println("\nYou win!\n");		
	}
	
	public static void main(String[] args){	
		
		Scanner sc = new Scanner(System.in);
		int game = 0;
		int repeat = 0;
		
		do {
			System.out.println("Choose a game.\n\t0. Exit\n\t1. Guess number \n\t2. Guess the words");
			game = sc.nextInt();
			switch (game) {
				case 0 : 
					System.out.println("\nGoodbye!\n");
					break;
				case 1 :
					do {
						game1();
						System.out.println("Repeat the game?\n\t0. No repeat \n\t1. Repeat");
						repeat = sc.nextInt();
					} while (repeat != 0);
					break;	
				case 2 : 
					do {
						game2();
						System.out.println("Repeat the game?\n\t0. No repeat \n\t1. Repeat");
						repeat = sc.nextInt();
					} while (repeat != 0);
					break;
				default: System.out.println("Game not found!");	
			}
		} while ( game != 0 );		
	}
}

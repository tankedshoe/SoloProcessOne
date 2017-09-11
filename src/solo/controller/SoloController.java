package solo.controller;

import java.util.Scanner;

public class SoloController
{
	public void start()
	{
		System.out.println("This is a tight solo project just trying to get");
		System.out.println("everything organized and started");
		testScanner();
	}

	private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner object.
		firstScanner = new Scanner(System.in); //Instanciates a Scanner object.
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat "+ answer + "? That's tight.");
	}
}

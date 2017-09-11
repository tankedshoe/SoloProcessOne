package solo.controller;

import java.util.Scanner;
import solo.model.PlayDohCircle;
import solo.model.PlayDohLine;

public class SoloController
{
	public SoloController()
	{
		
	}
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		PlayDohLine firstLine = new PlayDohLine();
		PlayDohLine secondLine;
		secondLine = new PlayDohLine(10);
		
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

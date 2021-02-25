package Tic_Tac_Toe;

import java.util.Random;
import java.util.Scanner;
import Tic_Tac_Toe.*;

public class Tic_Tac_Toe_Game {
	
	public void setupGame() {
		Scanner inputScan = new Scanner(System.in);
		
		//System.out.println("How many players?");
		System.out.println("Welcome to Tic-Tac-Toe \nWhat is player ones name?");
		
		//Initilize players
		Player player1 = new Player();
		Player player2 = new Player();

		//Set names for players
		player1.setName(inputScan.next());
		System.out.println("What is player twos name?");
		player2.setName(inputScan.next());
		
		boolean validResponse=false;
		String response="";
		System.out.println("Would you like the computer to decide who goes first?");
		while(!validResponse) {
			response = inputScan.next();
			response.toUpperCase();
			if(response != "YES" || response != "NO") {
				System.out.println("Error incorrect response, please enter yes or no");
			}
		}
		if (response =="YES") {
			boolean tempBool = playerPicker(player1.getName(),player2.getName());
			if(tempBool == true) {
				System.out.println(player1.getName()+" goes first");
			}else {
				System.out.println(player2.getName()+" goes first");
			}
		}
		else{
			player1.setOrderNum(1);
			player2.setOrderNum(2);
		}
	}
	
	public boolean playerPicker(String player1,String player2) {
		Random randomNumGen = new Random();
		int randomNum = randomNumGen.nextInt();
		//int randomNum = (int)Math.random()*9999+0;
		if(randomNum%2 ==0) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Tic_Tac_Toe_Game game = new Tic_Tac_Toe_Game();
		game.setupGame();
		System.out.println("Done");
	}

}

package Tic_Tac_Toe;

import java.util.Random;
import java.util.Scanner;
import Tic_Tac_Toe.*;

public class Tic_Tac_Toe_Game {
	
	public void setupGame() {
		Scanner inputScan = new Scanner(System.in);
		
		//System.out.println("How many players?");
		System.out.println("Welcome to Tic-Tac-Toe \nWhat is player ones name?");
		Player player1 = new Player();
		player1[0] = inputScan.next();
		player1[1] = "1";
		System.out.println("What is player twos name?");
		String[] player2;
		player2[0] = inputScan.next();
		player2[1] = "2";
		
		boolean validResponse=false;
		String response="";
		System.out.println("Would you like the computer to decide who goes first?");
		while(!validResponse) {
			response = inputScan.next();
			response.toUpperCase();
			if(response != "YES" || response != "NO") {
				System.out.println("Error incorrect response, Please enter yes or no");
			}
		}
		if (response =="YES") {
			boolean tempBool = playerPicker(player1Name,player2Name);
			if(tempBool == true) {
				System.out.println(player1Name+" goes first");
			}else {
				System.out.println(player2Name+" goes first");
			}
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
		

	}

}

package Tic_Tac_Toe;

public class Player extends Tic_Tac_Toe_Game{
	private String playerName;
	private int orderNum;
	
	//Constructors
	Player() {playerName = null; orderNum = 0;}

	public String getName() {
		return this.playerName;
	}
	public void setName(String name) {
		this.playerName = name;
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
}

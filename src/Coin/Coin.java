package Coin;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinname=new HashMap<Integer,String>();
	
	public Coin() {
		coinname.put(1, "penny");
		coinname.put(10, "dime");
		coinname.put(25, "quater");
		coinname.put(50, "half-dollar");
	}
	public String getname(int amount) {
		if(coinname.containsKey(amount))
		{return coinname.get(amount);}
		else
			{return "not found";}	
		}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		Coin coin=new Coin();
		String name=coin.getname(amount);
		System.out.println(name);
	}

}

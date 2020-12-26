package user;
import java.util.ArrayList;

import game.Game;

public class Client extends User{
	protected float balance;
	protected ArrayList<Game> library = new ArrayList<Game>();
	
	public Client(float balance) {
		super();
		this.balance = balance;
	}
	
	public void buy_game(Game game) {
		boolean contains = false;
		for(int i = 0;i<library.size();i++) {
			if(game.getName().equals(library.get(i).getName())) {
				contains = true;
			}
		}
		
		if(contains == false) {
			if(this.balance >= game.getPrice()) {
				library.add(game);
				this.balance = this.balance - game.getPrice();
			}
			else {
				System.out.println("ERROR");
			}
		}
		else {
			System.out.println("ERROR");
		}

	}
	
	public void refund_game(Game game) {
		boolean contains = false;
		int gameIndex = -1;
		for(int i = 0;i<library.size();i++) {
			if(game.getName().equals(library.get(i).getName())) {
				contains = true;
				gameIndex = i;
			}
		}
		if(contains == true) {
			library.remove(gameIndex);
			this.balance = this.balance + game.getPrice();
		}
	}
	
	public void display_library() {
		System.out.print("Library: [");
		for(int i = 0;i<library.size();i++) {
			if(i<library.size()-1) {
				System.out.print(library.get(i).getName()+",");
			}
			else {
				System.out.println(library.get(i).getName()+"]");
			}

		}
	}



	
}

package activity6.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Team {

	
	private String name;
	ArrayList<Player> playerList = new ArrayList<Player>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Player> getPlayerList() {
		Collections.sort(playerList, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		return playerList;
	}
	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}
	public Team(String name) {
		super();
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", playerList=" + playerList + "]";
	}
	
	public void addPlayer(String playername) {
		playerList.add(new Player(playername));
		
	}
	public Team(String name, ArrayList<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	
}

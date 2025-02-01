package map;

import java.util.Map;

public class Team {

	private int id;
	private String name;
	private String color;
	private String state;
	private Map<Integer, String> players;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Map<Integer, String> getPlayers() {
		return players;
	}

	public void setPlayers(Map<Integer, String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", color=" + color + ", state=" + state + ", players=" + players
				+ "]";
	}

}

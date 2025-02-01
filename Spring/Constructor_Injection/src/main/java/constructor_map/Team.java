package constructor_map;

import java.util.Map;

public class Team {

	private int id;
	private String name;
	private String color;
	private String state;
	private Map<Integer, String> players;

	public Team(int id, String name, String color, String state, Map<Integer, String> players) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.state = state;
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", color=" + color + ", state=" + state + ", players=" + players
				+ "]";
	}

}

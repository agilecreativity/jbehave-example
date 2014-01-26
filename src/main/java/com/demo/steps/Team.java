package com.demo.steps;

public class Team {

	private String name;
	
	private int win;
	
	private int lose;
	
	public Team(String name, int win, int lose) {
		this.name = name;
		this.win = win;
		this.lose = lose;
	}

	public String getName() {
		return name;
	}

	public int getWin() {
		return win;
	}

	public int getLose() {
		return lose;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lose;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + win;
		return result;
	}
	
	/**
	 * Utility method for easy access
	 */
	public int diffScore() {
		return getWin() - getLose();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (lose != other.lose)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (win != other.win)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", win=" + win + ", lose=" + lose + "]";
	}

}

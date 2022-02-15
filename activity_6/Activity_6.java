// 1. Array
// 2. Objects

class Team {
	String name;
	String surname;
	int age;
	String position;
	String teamName;
	int goalScored;

	public Team(String name, String surname, int age, 
				String position, String teamName, 
				int goalScored) {

		this.name = name;
		this.surname = surname;
		this.age = age;
		this.position = position;
		this.teamName = teamName;
		this.goalScored = goalScored;
	}
	
	public int x() {
		return 5;
	}

	int x = 5;

	public static double getTeamStats(Team[] team) {

		double totalGoalsScored = 0.0;

		for(int i = 0; i < team.length; i++) {
			System.out.println(team[i].name + " " + team[i].position);
			totalGoalsScored += team[i].goalScored;
		}

		System.out.println("TEAM "+ team[0].teamName + " TOTAL GOALS: " + (int) totalGoalsScored);

		return totalGoalsScored;
	}

	public static void main(String[] args) {

		// Barcelona
		Team player_1 = new Team("Michael", "Angelo", 19, "Centre back", "Barcelona", 3);
		Team player_2 = new Team("Garith", "Bale", 45, "Striker", "Barcelona", 10);
		Team player_3 = new Team("Mubashir", "Isaacs", 18, "Goal keeper", "Barcelona", 1);
		
		// Madrid
		Team player_4 = new Team("Michael", "Angelo", 19, "Centre back", "Madrid", 6);
		Team player_5 = new Team("Garith", "Bale", 45, "Striker", "Madrid", 34);
		Team player_6 = new Team("Mubashir", "Isaacs", 18, "Goal keeper", "Madrid", 1);

		Team[] team_1 = {player_1, player_2, player_3};
		Team[] team_2 = {player_4, player_5, player_6};

		double team_1TotalGoalsScored = getTeamStats(team_1);
		double team_2TotalGoalsScored = getTeamStats(team_2);

		if(team_2TotalGoalsScored < team_1TotalGoalsScored) {
			System.out.println( (int)(team_1TotalGoalsScored - team_2TotalGoalsScored) );
		} else {
			System.out.println( (int)(team_2TotalGoalsScored - team_1TotalGoalsScored) );
		}

	}


}
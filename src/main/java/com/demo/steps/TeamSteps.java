package com.demo.steps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

public class TeamSteps {
	
	private Map<String, Team> scoreMap = new HashMap<String, Team>();

	@Given("the scores table of English Premier leage for year 2001-2002: $scoresTable")
	public void givenTeamScore(ExamplesTable scoresTable) {
		scoreMap = teamScore(scoresTable);
	}

	private Map<String, Team> teamScore(ExamplesTable table) {

		Map<String, Team> teamMap = new HashMap<String, Team>();

		for (Map<String, String> row : table.getRows()) {

			String name = row.get(Constants.FIELD_TEAM_NAME);
			int win = Integer.parseInt(row.get(Constants.FIELD_SCORE_FOR));
			int lose = Integer.parseInt(row.get(Constants.FIELD_SCORE_AGAINST));

			teamMap.put(name, new Team(name, win, lose));
		}

		return teamMap;
	}

	@When("win and lose is calculated")
	public void calculateWinAndLose() {
		//do nothing
	}

	@Then("the score should be as follow: $expectedTable")
	public void scoreResultSummary(ExamplesTable expectedTable) {

		// Save the result of the actual team that have the lowest different
		// between the two scores.
		Team actualLowestScoreTeam = lowestDiffScore(getScoreMap());

		for (int i = 0; i < expectedTable.getRowCount(); i++) {

			Parameters row = expectedTable.getRowAsParameters(i);

			String name = row.valueAs(Constants.FIELD_TEAM_NAME, String.class);
			int win = row.valueAs(Constants.FIELD_SCORE_FOR, Integer.class);
			int lose = row.valueAs(Constants.FIELD_SCORE_AGAINST, Integer.class);

			Team expectedTeam = new Team(name, win, lose);

			int expectedDiff = row.valueAs(Constants.FIELD_DIFF, Integer.class);

			String expectedLowestDiff = row
					.valueAs(Constants.FIELD_LOWEST_DIFF, String.class);

			// use name to lookup the value of each row)
			Team actualTeam = scoreMap.get(expectedTeam.getName());
			
			// Note: this is where we asserts the correctness of result
			Assert.assertEquals(expectedDiff, actualTeam.diffScore());

			Assert.assertEquals(expectedLowestDiff,
					haveTheSameName(expectedTeam, actualLowestScoreTeam));
		}
	}
	
	public Map<String, Team> getScoreMap() {
		return scoreMap;
	}

	/**
	 * Helper method to make it easy to use in the validation result
	 */
	private String haveTheSameName(Team team1, Team team2) {
		if (team1.getName().equalsIgnoreCase(team2.getName())) {
			return "Yes";
		} else {
			return "No";
		}
	}
	
	/**
	 * Return the team which have the lowest difference in for/against goals.
	 *
	 * @param scoreMap
	 * @return
	 */
	private Team lowestDiffScore(Map<String, Team> scoreMap) {

		Set<Map.Entry<String, Team>> entries = scoreMap.entrySet();

		Team teamWithLowestDiff = null;

		int lowestDiffSoFar = Integer.MAX_VALUE;

		for (Entry<String, Team> entry : entries) {

			Team teamEntry = entry.getValue();

			if (teamEntry.diffScore() < lowestDiffSoFar) {
				teamWithLowestDiff = teamEntry;
				lowestDiffSoFar = teamEntry.diffScore();
			}
		}

		return teamWithLowestDiff;
	}

}

package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

@Test
public void getMembers_returns_correct_members() {
    team.addMember("Matthew N.");
    assertTrue(team.getMembers().contains("Matthew N."));
}

@Test
public void setName_sets_name() {
    team.setName("new-team");
    assertEquals("new-team", team.getName());
}

@Test
public void setMembers_sets_members() {
    ArrayList<String> members = new ArrayList<>();
    members.add("Matthew N.");

    team.setMembers(members);

    assertEquals(members, team.getMembers());
}

@Test
public void default_constructor_works() {
    Team t = new Team();

    assertEquals("", t.getName());
    assertTrue(t.getMembers().isEmpty());
}

@Test
public void equals_same_object_returns_true() {
    assertTrue(team.equals(team));
}

@Test
public void equals_null_returns_false() {
    assertFalse(team.equals(null));
}

@Test
public void equals_non_team_returns_false() {
    assertFalse(team.equals("not a team"));
}

@Test
public void equals_same_teams_returns_true() {
    Team team1 = new Team("test-team");
    Team team2 = new Team("test-team");

    team1.addMember("Matthew N.");
    team2.addMember("Matthew N.");

    assertEquals(team1, team2);
}

@Test
public void equals_different_name_returns_false() {
    Team team1 = new Team("team-one");
    Team team2 = new Team("team-two");

    assertNotEquals(team1, team2);
}

@Test
public void equals_different_members_returns_false() {
    Team team1 = new Team("test-team");
    Team team2 = new Team("test-team");

    team1.addMember("Matthew N.");
    team2.addMember("Eshaan");

    assertNotEquals(team1, team2);
}

@Test
public void toString_returns_correct_string() {
    team.addMember("Matthew N.");

    assertEquals(
        "Team(name=test-team, members=[Matthew N.])",
        team.toString()
    );
}

@Test
public void hashCode_equal_teams_are_equal() {
    Team team1 = new Team("test-team");
    Team team2 = new Team("test-team");

    team1.addMember("Matthew N.");
    team2.addMember("Matthew N.");

    assertEquals(team1.hashCode(), team2.hashCode());
}

@Test
public void hashCode_is_not_zero_or_one() {
    Team team = new Team("test-team");
    team.addMember("Matthew N.");

    assertNotEquals(0, team.hashCode());
    assertNotEquals(1, team.hashCode());
}

@Test
public void hashCode_returns_correct_value() {
    Team team = new Team("test-team");
    team.addMember("Matthew N.");

    int expected = team.getName().hashCode() | team.getMembers().hashCode();

    assertEquals(expected, team.hashCode());
}

}


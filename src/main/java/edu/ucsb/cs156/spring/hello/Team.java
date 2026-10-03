package edu.ucsb.cs156.spring.hello;

import java.util.ArrayList;

/**
 * A class to represent a team of developers.
 */
public class Team {
    public String name;
    public ArrayList<String> members;

    /**
     * Default constructor for a team.
     * Needed if we use Jackson for JSON serialization/deserialization
     */
    public Team() {
        this.name = "";
        this.members = new ArrayList<String>();
    }

    /**
     * Constructor a team with a given name.
     * @param name name of the team
     */
    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<String>();
    }
    /**
     * Add a member to the team
     * @param member members name
     */
    public void addMember(String member) {
        this.members.add(member);
    }
    /*
     * Get the name of the team
     * @return the name of the team
     */
    public String getName() {
        return this.name;
    }
    /*
     * Get the members of the team
     * @return the members of the team
     */
    public ArrayList<String> getMembers() {
        return this.members;
    }

    /** setter for name */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter for members
     */
    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    /**
     * Check if a team is equal to another object
     * @param obj object to compare to
     * @return true if the object is a team with the same name and members
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team other = (Team) obj;
        return this.name.equals(other.name) && this.members.equals(other.members);
    }

    /*
     * Get a string representation of the team
     */
    @Override
    public String toString() {
        return "Team(name=" + this.name + ", members=" + this.members + ")";
    }

    /**
     * Get a hash code for the team
     */
    @Override
    public int hashCode() {
        return this.name.hashCode() | this.members.hashCode();
    }
    }

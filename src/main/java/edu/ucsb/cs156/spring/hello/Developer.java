package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
               return "Matthew N.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "matthewvnguyen110";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
    
        Team team = new Team("f26-02");
        team.addMember("Eshaan");
        team.addMember("Isaac H.");
        team.addMember("Matthew N.");
        team.addMember("Timothy");
        team.addMember("Zach");
        team.addMember("Wayne");
        return team;
    }
}

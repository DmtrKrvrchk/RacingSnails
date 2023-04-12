package racingSnail;

import java.util.Random;

/**
 * Class to define a racing snail
 * @author d.krivoruchko
 */
public class RacingSnail {

    /** Racing snail's name */
    private final String name;

    /** Racing nail's race */
    private final String race;

    /** Racing snail's maximal speed */
    private final int maxSpeed;

    /** Covered path */
    private double covered;


    /**
     * Constructor of racing snails
     * @param name Racing snail's name
     * @param race Racing snail's race
     * @param maxSpeed Racing snail's maximal speed
     */
    public RacingSnail(String name, String race, int maxSpeed) {
        this.name = name;
        this.race = race;
        this.maxSpeed = maxSpeed;
        this.covered = 0;
    }


    /**
     * Method for a snail to crawl
     */
    public void crawl() {
        Random random = new Random();
        this.covered += maxSpeed*random.nextFloat()*1;
    }


    /**
     * Method returns the name of a snail
     * @return the name of a snail
     */
    public String getName() {
        return name;
    }


    /**
     * Method returns the covered distance
     * @return the covered distance
     */
    public double getCovered() { return covered; }


    /**
     * Method to get the information about a racing snail in the String-form
     * @return the information about racing snail's parameters
     */
    public String toString() {
        return "Racing snail's name is "+this.name+" from "+this.race+" with maximal speed "+this.maxSpeed+".";
    }
}

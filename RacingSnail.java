package racingSnail;

import java.util.Random;

/**
 * Class to define a racing snail
 * @author d.krivoruchko
 */
public class RacingSnail {

    /** Racing snail's name */
    private String name;

    /** Racing nail's race */
    private String race;

    /** Racing snail's maximal speed */
    private double maxSpeed;

    /** Covered path */
    private double covered;


    /**
     * Constructor of racing snails
     * @param name - Racing snail's name
     * @param race - Racing snail's race
     * @param maxSpeed - Racing snail's maximal speed
     */
    public RacingSnail(String name, String race, double maxSpeed) {
        this.name = name;
        this.race = race;
        this.maxSpeed = maxSpeed;
        this.covered = 0;
    }


    /**
     * Method for a snail to crawl
     * @return - Covered distance according to snail's speed
     */
    public void crawl() {
        Random random = new Random();
        this.covered += maxSpeed*(random.nextInt(10) +1);
    }


    /**
     * Method returns the name of a snail
     * @return - The name of a snail
     */
    public String getName() {
        return name;
    }


    /**
     * Method returns the race of a snail
     * @return - The Race  of a snail
     */
    public String getRace() {
        return race;
    }


    /**
     * Method returns the maximum speed of a snail
     * @return - The maximum speed of a snail
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }


    /**
     * Method returns the covered distance
     * @return - The covered distance
     */
    public double getCovered() {
        return covered;
    }


    /**
     * Method to get the information about a racing snail in the String-form
     * @return - The information about racing snail's parameters
     */
    public String toString() {
        return "Racing snail's name: "+this.name+", racing snail's race: "+this.race+", racing snail's maximal speed: "+this.maxSpeed+".";
    }

}
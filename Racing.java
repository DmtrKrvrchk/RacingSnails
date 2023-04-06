package racingSnail;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to define a racing path
 * @author d.krivoruchko
 */
public class Racing {

    /** Racing path's name */
    private String name;

    /** Participating snails */
    private ArrayList<RacingSnail> racingSnails;

    /** The length of the path to be crawled */
    private double pathLength;


    /**
     * Constructor of racing
     * @param name - Name of racing
     * @param pathLength - The length of the path to be crawled
     */
    public Racing (String name, double pathLength) {
        this.name = name;
        this.pathLength = pathLength;
        this.racingSnails = new ArrayList<RacingSnail>();
    }


    /**
     * Method to add a list of racing snails to the racing
     * @param snails - The list of snails to add to the racing's list
     * @throws IllegalArgumentException - if the snail already on the racing's list
     */
    public void addRacingSnails(List<RacingSnail> snails){
        if (this.racingSnails.contains(snails)) {
            throw new IllegalArgumentException("You cannot add the same racing snail twice!");
        } else {
            racingSnails.addAll(snails);
        }
    }


    /** Method to remove a racing snail from the racing's list
     * @param name - The name of the snail to remove from the racing's list
     */
    public void removeRacingSnail (String name) {
        this.racingSnails.remove(name);
    }


    /**
     * Method returns the information about the racing and the racing snails in the String-form
     * @return - The information about the racing and the racing snails
     */
    public String toString() {
        return "The name of racing is "+this.name+". The racing snails are: "+this.racingSnails.toString()+". The length of the racing path is "+this.pathLength+".";
    }


    /**
     * Method determines the winner of the racing
     * @return - The winning snail or null, if nobody won
     */
    private RacingSnail determineWinner() {
        RacingSnail winner = null;
        for (RacingSnail snail:this.racingSnails) {
            if (snail.getCovered() > this.pathLength) {
                if (winner == null) {
                    winner = snail;
                } else {
                    if (snail.getCovered() > winner.getCovered()) {
                        winner = snail;
                    }
                }
            }
        }
        return winner;
    }


    /**
     * Method lets the racing snails crawl
     */
    void letSnailCrawl() {
        for (RacingSnail snail:this.racingSnails) {
            snail.crawl();
        }
    }


    /**
     * Method starts the racing
     */
    RacingSnail execute() {
        RacingSnail winner = null;
        while (winner == null) {
            this.letSnailCrawl();
            winner = determineWinner();
        }
        return winner;
    }


    /**
     * Method returns the name of racing
     * @return Name of racing
     */
    public String getName() { return name; }


    /**
     * Method returns participating snails
     * @return Participating snails
     */
    public ArrayList<RacingSnail> getRacingSnails() { return racingSnails; }
}
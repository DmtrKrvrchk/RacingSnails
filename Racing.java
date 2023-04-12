package racingSnail;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Class to define a racing path
 * @author d.krivoruchko
 */
public class Racing {

    /** Racing path's name */
    private final String name;

    /** Participating snails */
    private final ArrayList<RacingSnail> racingSnails;

    /** The length of the path to be crawled */
    private final double pathLength;

    /**
     * Logger object is used to log messages
     */
    Logger logger = Logger.getLogger(String.valueOf(Racing.class));


    /**
     * Constructor of racing
     * @param name name of racing
     * @param pathLength the length of the path to be crawled
     */
    public Racing (String name, double pathLength) {
        this.name = name;
        this.pathLength = pathLength;
        this.racingSnails = new ArrayList<>();
    }


    /**
     * Method to add a list of racing snails to the racing
     * @param snails the list of snails to add to the racing's list
     */
    public void addRacingSnails(List<RacingSnail> snails){
        if (snails.stream().anyMatch(racingSnails::contains)) {
            logger.info("You cannot add the same racing snail twice!");
        } else {
            racingSnails.addAll(snails);
        }
    }


    /**
     * Method to add a racing snails to the racing
     * @param snail snail to add
     */
    public void addRacingSnail(RacingSnail snail){
        if (!racingSnails.contains(snail)){
            racingSnails.add(snail);
        }
    }


    /** Method to remove a racing snail from the racing's list
     * @param name the name of the snail to remove from the racing's list
     */
    public void removeRacingSnail (String name) {
        racingSnails.removeIf(racingSnail -> racingSnail.getName().equals(name));
        }



    /**
     * Method returns the information about the racing and the racing snails in the String-form
     * @return the information about the racing and the racing snails
     */
    public String toString() {
        return "The name of racing is "+this.name+". The racing snails are: "+ this.racingSnails +". The length of the racing path is "+this.pathLength+".";
    }


    /**
     * Method determines the winner of the racing
     * @return the winning snail or null, if nobody won
     */
    private RacingSnail determineWinner() {
        RacingSnail winner = null;
        for (RacingSnail snail:this.racingSnails) {
            if (snail.getCovered() >= this.pathLength) {
                if (winner == null) {
                    winner = snail;
                } else {
                    if (snail.getCovered() >= winner.getCovered()) {
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
}

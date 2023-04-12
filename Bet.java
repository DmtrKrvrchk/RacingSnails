package racingSnail;

import java.util.logging.Logger;

/**
 * Class to define a bet
 * @author d.krivoruchko
 */
public class Bet {

    /** Player's name */
    private final String playerName;

    /** Snail's name */
    private final String snailName;

    /** Amount to bet */
    private double betAmount;


    /**
     * Logger object is used to log messages
     */
    Logger logger = Logger.getLogger(String.valueOf(Racing.class));


    /**
     * Constructor of a bet
     * @param playerName name of a player who bets
     * @param snailName name of a snail to bet on
     * @param betAmount amount to bet
     */
    public Bet (String playerName, String snailName, double betAmount) {
        this.playerName = playerName;
        this.snailName = snailName;
        if (betAmount < .01) {
            logger.info("You have to bet at least .01 Euro");
        } else {
            this.betAmount = betAmount;
        }
    }


    /**
     * Method returns information about a bet in a String-form
     * @return player's name, snail's name to bet on and a bet amount to bet
     */
    public String toString() {
        return this.playerName+" bet on "+this.snailName+" "+this.betAmount+"!";
    }


    /**
     * Method returns player's name in a String-form
     * @return name of a player
     */
    public String getPlayerName() { return playerName; }


    /**
     * Method returns snail's name in a String-form
     * @return name of a snail
     */
    public String getSnailName() { return snailName; }


    /**
     * Method returns the bet amount
     * @return bet amount
     */
    public double getBetAmount() { return betAmount; }
}

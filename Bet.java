package racingSnail;

/**
 * Class to define a bet
 * @author d.krivoruchko
 */
public class Bet {

    /** Player's name */
    private String playerName;

    /** Snail's name */
    private String snailName;

    /** Amount to bet */
    private double betAmount;


    /**
     * Constructor of a bet
     * @param playerName - Name of a player who bets
     * @param snailName - Name of a snail to bet on
     * @param betAmount - Amount to bet
     * @throws IllegalArgumentException - if the bet amount less than 0.01
     */
    public Bet (String playerName, String snailName, double betAmount) {
        this.playerName = playerName;
        this.snailName = snailName;
        if (betAmount < .01) {
            throw new IllegalArgumentException("You have to bet at least .01 Euro");
        } else {
            this.betAmount = betAmount;
        }
    }


    /**
     * Method returns information about a bet in a String-form
     * @return - Player's name, snail's name to bet on and a bet amount to bet
     */
    public String toString() {
        return this.playerName+" bet on "+this.snailName+" "+this.betAmount+"!";
    }


    /**
     * Method returns player's name in a String-form
     * @return - Name of a player
     */
    public String getPlayerName() { return playerName; }


    /**
     * Method returns snail's name in a String-form
     * @return - Name of a snail
     */
    public String getSnailName() { return snailName; }


    /**
     * Method returns the bet amount
     * @return - Bet amount
     */
    public double getBetAmount() { return betAmount; }

}
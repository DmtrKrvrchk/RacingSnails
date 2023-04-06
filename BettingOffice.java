package racingSnail;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Class to define a betting office
 * @author d.krivoruchko
 */
public class BettingOffice {

    /** Racing to bet at this booking office */
    private Racing racing;

    /** Coefficient to bet */
    private double coefficient;

    /** ArrayList with all bets */
    private ArrayList<Bet> bets;

    /** ArrayList with winning bets */
    private ArrayList<Bet> winnnerBets;


    /**
     * Constructor of a betting office
     * @param racing - Racing to bet
     * @param coefficient - Coefficient to bet
     */
    public BettingOffice(Racing racing, double coefficient) {
        this.racing = racing;
        this.bets = new ArrayList<>();
        this.winnnerBets = new ArrayList<>();
        if (coefficient < 1.01) {
            throw new IllegalArgumentException("The coefficient has to be more than 1.01!");
        } else {
            this.coefficient = coefficient;
        }
    }


    /**
     * Method to bet
     * @param playerName - Name of betmaker
     * @param snailName - Name of snail to bet
     * @param betAmount - Amount to bet
     */
    public void betting(String playerName, String snailName, double betAmount) {
            this.bets.add(new Bet(playerName, snailName, betAmount));
    }


    /**
     * Method to get winnings
     * @return - Amount to win
     */
    public double getWinnings() {
        double winnings = 0;
        for (Bet winnerBet:winnnerBets) {
            winnings = coefficient * winnerBet.getBetAmount();
        }
        return winnings;
    }

    /**
     * Method to get ArrayList with winnerbets
     * @return - ArrayList with winnerbets
     */
    public ArrayList<Bet> getWinner() {
        RacingSnail winner = racing.execute();;
        for (Bet bet:bets) {
            if (Objects.equals(bet.getSnailName(), winner.getName())) {
                winnnerBets.add(new Bet(bet.getPlayerName(), bet.getSnailName(), bet.getBetAmount()));
            }
        }
        return winnnerBets;
    }


    /**
     * Method to get all bets
     * @return - All bets
     */
    public ArrayList<Bet> getBets() {
        return bets;
    }


    /**
     * Method returns information about booking office in a String-form
     * @return - Racing, betting coefficient and all the bets
     */
    public String toString() {
        return "Today's racing is "+racing+". Its coefficient is "+coefficient+". Today's bets are "+bets+".";
    }

}
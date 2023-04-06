package racingSnail;

import java.util.List;
import java.util.logging.Logger;

/**
 * Main class
 * @author d.krivoruchko
 */
public class Main {

    /**
     * Main methode
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(String.valueOf(Main.class));

        RacingSnail snail1 = new RacingSnail("Billy", "Alustante", 25);
        RacingSnail snail2 = new RacingSnail("Joe", "Campione d'Italia", 34);
        RacingSnail snail3 = new RacingSnail("Karl", "Laméac", 30);
        RacingSnail snail4 = new RacingSnail("Linda", "Ulyanovsk Oblast", 36);
        RacingSnail snail5 = new RacingSnail("Olga", "Saléchan", 20);
        RacingSnail snail6 = new RacingSnail("Mark", "Schneckenhausen", 19);
        RacingSnail snail7 = new RacingSnail("George", "Aigre", 15);
        RacingSnail snail8 = new RacingSnail("Boris", "Éragny", 39);

        Racing racing1 = new Racing("Abu Dhabi Grand Prix", 1500);
        Racing racing2 = new Racing("Canadian Grand Prix", 2000);
        Racing racing3 = new Racing("European Grand Prix", 2250);

        racing1.addRacingSnails(List.of(snail1, snail2, snail3, snail4));
        racing2.addRacingSnails(List.of(snail3, snail4, snail5, snail6));
        racing3.addRacingSnails(List.of(snail5, snail6, snail7, snail8));

        BettingOffice bookmaker1 = new BettingOffice(racing1, 3);
        BettingOffice bookmaker2 = new BettingOffice(racing2, 3.5);
        BettingOffice bookmaker3 = new BettingOffice(racing3, 2);

        bookmaker1.betting("Mr Cash", "Joe", 10000);
        bookmaker1.betting("Mrs Money", "Linda", 500);
        bookmaker1.betting("Mrs Bigger Money", "Billy", 1000);
        bookmaker1.betting("Mr The Biggest Money", "Karl", 5000);

        bookmaker2.betting("Mr The Biggest Money", "Olga", 30000);
        bookmaker2.betting("Mrs Money", "Mark", 5000);
        bookmaker2.betting("Mrs Bigger Money", "Linda", 3000);

        bookmaker3.betting("Mr Cash", "George", 4000);
        bookmaker3.betting("Mr Cash", "Boris", 10000);
        bookmaker3.betting("Mrs Hustle", "Mark", 800);



        //RacingSnail winnerSnail1 = racing1.execute();
        //logger.info("Winner Snail is " + winnerSnail1.getName());

        logger.info("Today's bets are "+bookmaker1.getBets()+". Today's winner is "+bookmaker1.getWinner()+". You won "+bookmaker1.getWinnings());

    }
}
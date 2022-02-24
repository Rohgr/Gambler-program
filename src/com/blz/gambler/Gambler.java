package com.blz.gambler;
import static java.lang.System.exit;
public class Gambler {
    public static final int GAMBLER_WITH_MONEY = 100;
    public static final int GAMBLER_BET = 1;

    public static void main(String[] args) {
           int total_Amount = 0 ;
        System.out.println("gambler money: " + GAMBLER_WITH_MONEY);
        for (int i = 1; i <= 20; i++) {
            int total_Cash = GAMBLER_WITH_MONEY;
            int bet = GAMBLER_BET;
            while (total_Cash < 150 && total_Cash > 50) {
                double game = (Math.floor((Math.random() * 10) % 2));
                if (game == 1) {
                    total_Cash += bet;
                } else {
                    total_Cash -= bet;
                }
            }
            if (total_Cash == 150) {
                total_Amount +=50;
            } else {
                total_Amount -=50;
            }
        }
            if(total_Amount > 0){
                System.out.println("gambler won by " +total_Amount);
            } else {
                System.out.println("gambler loss by " +total_Amount);
            }

    }
}





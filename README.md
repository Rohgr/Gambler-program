# Gambler-program
package com.blz.gambler;
import static java.lang.System.exit;

public class Gambler {
   public static final int GAMBLER_WITH_MONEY= 100;
    public static final int GAMBLER_BET= 1;
    public static final int GAMBLER_WITH_MONEY = 100;
    public static final int GAMBLER_BET = 1;

    public static void main(String[] args) {

           int total_Amount = 0 ;
        System.out.println("gambler money: " + GAMBLER_WITH_MONEY);
        int total_Cash = GAMBLER_WITH_MONEY;
        while (total_Cash != 151 || total_Cash != 49) {
            double bet =  (Math.floor((Math.random() * 10) % 2));
            if (bet == 1) {
                System.out.println("$1 won");
                total_Cash += 1;
                System.out.println(total_Cash);
                if (total_Cash == 150) {

                    exit(0);
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
                System.out.println("$1 loss");
                total_Cash -= 1;
                System.out.println(total_Cash);
                total_Amount -=50;
            }
            if (total_Cash == 50) {
                exit(0);
        }
            if(total_Amount > 0){
                System.out.println("gambler won by " +total_Amount);
            } else {
                System.out.println("gambler loss by " +total_Amount);
            }

        }
    }
}


    }

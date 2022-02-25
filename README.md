# Gambler-program

package com.blz.gambler;

import static java.lang.System.exit;

public class Gambler {
   public static final int GAMBLER_WITH_MONEY= 100;
    public static final int GAMBLER_BET= 1;

    public static void main(String[] args) {

        System.out.println("gambler money: " +GAMBLER_WITH_MONEY);
        int amount=GAMBLER_WITH_MONEY;
            double bet = (double)(Math.floor((Math.random() * 10) % 2 ));
//            System.out.println(bet);
        System.out.println("gambler money: " + GAMBLER_WITH_MONEY);
        int total_Cash = GAMBLER_WITH_MONEY;
        while (total_Cash != 151 || total_Cash != 49) {
            double bet =  (Math.floor((Math.random() * 10) % 2));
            if (bet == 1) {
                System.out.println("$1 won");
                amount+=1;
                System.out.println(amount);
                total_Cash += 1;
                System.out.println(total_Cash);
                if (total_Cash == 150) {

            }
                else
                {
                    System.out.println("$1 loss");
                    amount-=1;
                    System.out.println(amount);
                    exit(0);
                }
            } else {
                System.out.println("$1 loss");
                total_Cash -= 1;
                System.out.println(total_Cash);
            }
            if (total_Cash == 50) {
                exit(0);
            }

        }
    }

    }

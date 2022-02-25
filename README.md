# Gambler-program
package com.blz.gambler;


public class Gambler {
   public static final int GAMBLER_WITH_MONEY= 100;
    public static final int GAMBLER_BET= 1;

    public static void main(String[] args) {

        System.out.println("gambler money: " +GAMBLER_WITH_MONEY);
        int amount=GAMBLER_WITH_MONEY;
            double bet = (double)(Math.floor((Math.random() * 10) % 2 ));
//            System.out.println(bet);
            if (bet == 1) {
                System.out.println("$1 won");
                amount+=1;
                System.out.println(amount);

            }
                else
                {
                    System.out.println("$1 loss");
                    amount-=1;
                    System.out.println(amount);
                }
            }

    }

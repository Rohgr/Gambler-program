package com.blz.gambler;
public class Gambler {
    public static final int GAMBLER_WITH_MONEY = 100;
    public static final int GAMBLER_BET = 1;
    public static final int MONTH_DAYS = 30;
    public static final int Days = 1;
    public static String checkwon ="won";

    public static void main(String[] args) {
        int total_Amount = 0 ;

        while (checkwon.equals("won")) {
            checkwon = getResult(checkwon);
            if(checkwon.equals("loss")) {
                System.out.println("would like to stop gambling");
            } else {
                System.out.println("would like to play again");
            }
        }
    }
    private static String getResult(String check){
        int total_Amount = 0;
        int i = Days;
        System.out.println("gambler money: " + GAMBLER_WITH_MONEY);
        for ( i = 1; i <= MONTH_DAYS; i++) {
                int count = 0;
                int won_Count = 0;
                int loss_Count = 0;
                int total_Cash = GAMBLER_WITH_MONEY;
                int bet = GAMBLER_BET;
                while (total_Cash < 150 && total_Cash > 50) {
                    //   int count =0;
                    double game = (Math.floor((Math.random() * 10) % 2));
                    if (game == 1) {
                        total_Cash += bet;
                        won_Count++;
                    } else {
                        total_Cash -= bet;
                        loss_Count++;
                    }
                    count++;
                }
                if (total_Cash == 150) {
                    total_Amount +=50;
                    System.out.println("Gambler won " + total_Amount + " on Day " + i + " won count " + won_Count + " total count " + count);
                } else {
                    total_Amount -= 50;
                    System.out.println("Gambler loss " + total_Amount + " on Day " + i + " loss count " + loss_Count + " total count " + count);
                }
            }

            if (total_Amount > 0) {
                check ="won";
                System.out.println("gambler won by " + total_Amount);
            } else {
                check="loss";
                System.out.println("gambler loss by " + total_Amount);
            }
            return check;
        }
    }

package com.javaproject.dayseven;

import java.util.Random;
import java.util.Scanner;

public class GamblerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rad = new Random();

        int stake = 100;
        int bet = 1;

        int currentStake = 0, days = 0, month, totalAmount = 0;
        int bets = 0 ;
        int countWin = 0;
        int countLoss = 0;
        int totalLoss = 0;
        int totalWin = 0;

        int arrays[] = new int[25000];

        System.out.println("Welcome to the Game of Gambling");
        System.out.println();

        for (month = 1; month <= 12; month++) {

            for (days = 0; days < 20; days++) {

                for (int i = 1; i <= 50; i++) {

                    if (stake > 50) {
                        bets = rad.nextInt(2);
                        System.out.println("Betresult " + bets);

                        if (bets == 1) {
                            System.out.println("The Gambler has won the bet");
                            currentStake = stake + bet;
                            countWin++;
                            System.out.println("The Stake is :" + currentStake);
                        } else {
                            System.out.println("The Gambler has loss the bet");
                            currentStake = stake - bet;
                            System.out.println("The Stake is :" + currentStake);
                            countLoss++;
                        }
                    }
                }
                stake = currentStake;
                arrays[days] = stake;
                System.out.println("The final Stake after Gabling for the " + days + " day is "
                                     + arrays[days]);
                arrays[month] = arrays[days];
            }

            System.out.println("The final Stake after Gabling for the " + month + " month is "
                    + arrays[month]);

            arrays[countLoss] = countLoss;
            System.out.println("The Counts of the loss for the " + month + " month is "
                    + arrays[countLoss]);

            arrays[countWin] = countWin;
            System.out.println("The Counts of the Win for the " + month + " month is "
                    + arrays[countWin]);

            totalWin = arrays[countWin] - arrays[countLoss];
            System.out.println("The Winning Stake for these " + month + " month is "
                    + totalWin);

            totalLoss = arrays[countLoss] - arrays[countWin];
            System.out.println("The Loss Stake for these " + month + " month is "
                    + totalLoss);
        }

        for (days = 0; days < 20; days++) {
            int Day = days + 1;
            System.out.println();
            System.out.println("The final Stake after Gabling for the day " + Day + " is "
                    + arrays[days]);
        }
        for (days = 0; days < 20; days++) {
                totalAmount = totalAmount + arrays[days];
            }
            System.out.println();
            System.out.println("The total amount after the 20 Days is : " + totalAmount);
    }
}
package com.deckofcards;

import java.util.Random;

public class DeckOfCards {

    static int[][] cards = new int[4][13];    //array of card size 4 and 13

    public static void main(String[] args) {
        System.out.println("WELCOME TO DECK OF CARDS");


        for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
            allocateCards(playerNumber);
            System.out.println("Player Number " + playerNumber + ":- Cards");
            //print player cards;
            print(playerNumber);
        }
    }

    //method to distribute 9 cards of 4 differnt suits and 13 different ranks
    public static void allocateCards(int playerNumber) {
        for (int i = 0; i < 9; i++) {
            oneCard(playerNumber);
        }
    }

    //generating a single card
    public static void oneCard(int playerNumber) {
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        cards[suit][rank] = playerNumber;

    }

    //printing cards
    public static void print(int playerNumber) {
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                if (cards[suit][rank] == playerNumber) {
                    System.out.print(" " + getSuit(suit) + "--" + getRank(rank) + "\t");
                }
            }
        }
        System.out.println("\n");
    }

    //getting to know rank values using switch case
    public static String getRank(int rankNumber) {
        switch (rankNumber) {
            case 0:
                return "2";
            case 1:
                return "3";
            case 2:
                return "4";
            case 3:
                return "5";
            case 4:
                return "6";
            case 5:
                return "7";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            case 9:
                return "king";
            case 10:
                return "queen";
            case 11:
                return "ace";
            case 12:
                return "jocker";
            default:
                return "";
        }
    }

    //method to know spade value using switch case
    public static String getSuit(int suitNumber) {
        switch (suitNumber) {
            case 0:
                return "clubs";
            case 1:
                return "diamonds";
            case 2:
                return "hearts";
            case 3:
                return "spades";
            default:
                return "";
        }
    }

}


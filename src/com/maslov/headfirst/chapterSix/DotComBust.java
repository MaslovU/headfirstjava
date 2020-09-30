package com.maslov.headfirst.chapterSix;

import java.util.ArrayList;

public class DotComBust {

    private final GameHelper helper = new GameHelper();
    private final ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your purpose - kill three sites");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them in the minimum number of moves");

        for (DotCom dotComToSet: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {

        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Make move");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {

        numOfGuesses ++;
        String result = "Fail";
        for (DotCom dotComToSet: dotComsList) {
            result = dotComToSet.checkYourself(userGuess);
            if (result.equals("Hit")) {
                break;
            }
            if (result.equals("Kill")){
                dotComsList.remove(dotComToSet);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All sites is kiled! Game over");
        if (numOfGuesses <= 18) {
            System.out.println("You have " + numOfGuesses + " attempts");
            System.out.println("GC!");
        } else {
            System.out.println("You have " + numOfGuesses + " attempts");
            System.out.println("Fish like you!");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}

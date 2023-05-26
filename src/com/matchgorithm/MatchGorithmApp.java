package com.matchgorithm;

import com.matchgorithm.*;

import java.util.Scanner;


public class MatchGorithmApp {
    private final Scanner scanner = new Scanner(System.in); //read inputs from console

    public void execute() {
        Bio.initializeBioList();
        Name.initializeNameList();
        Picture.initializePicList();
        Career.initializeCareerList();
        showProfile();

    }

    private void showProfile() {
        boolean runLoop = true;
        while (runLoop) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            Profile profile = new Profile();
            System.out.println(profile);
            userInput result = promptForSwipe();
            switch (result){
                case SWIPE_LEFT:
                    break;
                case SWIPE_RIGHT:
                    break;
                case SUPER_LIKE:
                    break;
                case NEXT_PIC:
                    break;
                case PREVIOUS_PIC:
                    break;
                case EXIT:
                    runLoop = false;
                    break;
            }
        }
    }

    private userInput promptForSwipe() {
        userInput result = null;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Input choices are " + userInput.SWIPE_LEFT+ ", " +
                    userInput.SWIPE_RIGHT + ", " + userInput.SUPER_LIKE + ", " +
                    userInput.NEXT_PIC +  " and " + userInput.PREVIOUS_PIC + ": ");
            String input = scanner.nextLine().trim().toUpperCase();
            switch(input) {
                case "LEFT":
                    result = userInput.SWIPE_LEFT;
                    validInput = true;
                    break;
                case "RIGHT":
                    result = userInput.SWIPE_RIGHT;
                    validInput = true;
                    break;
                case "SUPER LIKE":
                    result = userInput.SUPER_LIKE;
                    validInput = true;
                    break;
                case "NEXT PIC":
                    result = userInput.NEXT_PIC;
                    validInput = true;
                    break;
                case "PREVIOUS PIC":
                    result = userInput.PREVIOUS_PIC;
                    validInput = true;
                    break;
                case "EXIT":
                    result = userInput.EXIT;
                    validInput = true;
                    break;
            }
        }
        return result;
    }

    public static enum userInput {
        SWIPE_LEFT, SWIPE_RIGHT, SUPER_LIKE, NEXT_PIC, PREVIOUS_PIC, EXIT
    }

}
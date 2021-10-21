package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Inicializējam Skeneris, randoms un padodam vērtības masīvam
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        String[] possibleChoices = {"Rock", "Paper", "Scissors"};

        // Dators izvēlās savu izvēli.
        int randomComputerId = r.nextInt(possibleChoices.length);
        String computersChoiceName = possibleChoices[randomComputerId];

        // Lietotājs izvēlās savu izvēli. Pārbaudam vai izvēle ir robežās 0,1,2 - citas vērtības neder.
        System.out.println("Izvēlieties savu gājienu: 0 - Rock / 1 - Paper / 2 - Scissors");
        int usersChoice = input.nextInt();
        while(usersChoice < 0 || usersChoice > 2) {
            System.out.println("Jāizvēlas cipars 0 , 1 vai 2.");
            usersChoice = input.nextInt();
        }

        // Parādam lietotāja un datora izvēles.
        System.out.println("Lietotājs ir izvēlējies numuru: " + usersChoice + " ,kas atbilst izvēlei - " + possibleChoices[usersChoice]);
        System.out.println("Dators ir izvēlējies: " + computersChoiceName );
        System.out.println("");


        // Pārbaudam kurš uzvarēja.
        if(randomComputerId == usersChoice) {
            System.out.println("Neizšķirts!");
        }
        else {
            System.out.println("Kāds uzvarēja, bet vēl nezinam kurš :O");
        }


    }


}

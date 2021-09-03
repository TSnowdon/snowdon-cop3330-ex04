/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Snowdon
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String noun;
        String verb;
        String adjective;
        String adverb;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        noun = reader.nextLine();
        System.out.print("Enter a verb: ");
        verb = reader.nextLine();
        System.out.print("Enter a adjective: ");
        adjective = reader.nextLine();
        System.out.print("Enter a adverb: ");
        adverb = reader.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");

    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;


public class Main {

    public static void main(String[] args) {
        // Fun with ArrayLists

        //create list of colors
        ArrayList<String> color = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);

        //Add a new color?
        String answer = "y";

        //Add 3 colors, hard code
        color.add("Red");
        color.add("Blue");
        color.add("Green");

        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Add a new color: ");

            color.add(keyboard.nextLine());


            System.out.print("Enter more colors? (y/n): ");
            answer = keyboard.nextLine();

        }
        System.out.println("Full Color List: ");
        for (String name : color) {
            System.out.println(name);
        }
    }
}
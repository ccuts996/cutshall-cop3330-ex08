/*
 *  UCF COP3330 Fall 2021 Assignment 08 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String people;
        System.out.print(" How many people? ");

        people = input.next();

        Integer i = Integer.parseInt(people);

        String pizza;
        System.out.print(" How many pizzas do you have?");

        pizza = input.next();

        Integer j = Integer.parseInt(pizza);

        String slices;
        System.out.print(" How many slices per pizza?");

        slices = input.next();

        Integer k = Integer.parseInt(slices);

        int totalslices = j * k;
        int givenslices = totalslices / i;
        int leftover = totalslices % i;
        System.out.print(i + " people " + " with " + j + " pizzas " + "(" + totalslices + " total slices)." +System.lineSeparator() );
        System.out.print("Each person gets " + givenslices + " slices of pizza." + System.lineSeparator());
        System.out.print("There are " + leftover +" leftover slices of pizza.");

    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] strings = input.nextLine().split(" ");
	updateString(strings);
	afiseaza(strings);


    }

    private static void updateString(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] =strings[i].substring(0,1).toUpperCase()+strings[i].substring(1).toLowerCase();
            strings[i] = strings[i].replaceAll("[^a-zA-Z]", "");

        }
    }

    private static void afiseaza(String[] strings){
        System.out.println("Output:");
        for (String s:strings)
            System.out.println(s+" ");
          System.out.println();
    }
}

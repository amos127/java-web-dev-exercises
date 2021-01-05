package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String userString = input.nextLine();
        char[] charactersInString = userString.toUpperCase().toCharArray();
        input.close();

        HashMap<Character, Integer> characterCount = new HashMap<>();
            for (char character : charactersInString) {
                if (Character.isLetterOrDigit(character)) {
                    if (characterCount.containsKey(character)) {
                        characterCount.put(character, characterCount.get(character) + 1);
                    } else {
                        characterCount.put(character, 1);
                    }
                }
            }

        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }

}

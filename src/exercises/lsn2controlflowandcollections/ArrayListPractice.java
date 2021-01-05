package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEvens(integers));

//        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("Array", "Java", "Clown", "Garold"));
//        printFiveLetterWords(wordList);

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> wordLists = new ArrayList<>(Arrays.asList(str.split(" ")));
        printFiveLetterWords(wordLists);

    }

    public static int sumEvens(ArrayList<Integer> numbers) {
        int total = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                total += num;
            }
        } return total;
    }

    public static void printFiveLetterWords(ArrayList<String> strings) {
        Scanner input = new Scanner(System.in);;
        System.out.println("Enter word length: ");
        int length = input.nextInt();
        input.skip("\n");
        input.close();
        for (String word : strings) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

}

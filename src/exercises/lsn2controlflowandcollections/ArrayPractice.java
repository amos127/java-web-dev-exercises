package exercises.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numberArray = {1, 1, 2, 3, 5, 8};

        for (int num : numberArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] stringArray = str.split(" ");
        System.out.println(Arrays.toString(stringArray));

        String[] sentenceArray = str.split("\\. ");
        System.out.println(Arrays.toString(sentenceArray));
    }

}

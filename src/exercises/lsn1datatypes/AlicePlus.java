package exercises.lsn1datatypes;

import java.util.Scanner;

public class AlicePlus {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search text:");
        String search = input.nextLine();
        System.out.println("Index: " + quote.toLowerCase().indexOf(search.toLowerCase()));
        System.out.println("Length: " + search.length());
    }
}
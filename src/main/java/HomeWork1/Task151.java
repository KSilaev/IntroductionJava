package HomeWork1;

import java.util.Scanner;

public class Task151 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
            String reversedString = "";
            String[] words = s.trim().split("\\s+");
            for (int i = words.length - 1; i > 0; --i) {
                reversedString += words[i] + " ";
            }
            return reversedString + words[0];
    }
}

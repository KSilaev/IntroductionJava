package HomeWork6;

import java.util.Scanner;

public class input {
    static Scanner input = new Scanner(System.in);

    public static int Int(String usersText){
        System.out.println(usersText);
        int value = input.nextInt();
        return value;
    }

    public static String Str(String userText){
        System.out.println(userText);
//        String value = input.next();
        return input.next();
    }
}
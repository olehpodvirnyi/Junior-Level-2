package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Type in a pattern");
            Pattern pattern = Pattern.compile(input.nextLine());

            System.out.println("Type in a String to search: ");
            Matcher matcher =  pattern.matcher(input.nextLine());

            boolean found = false;
            while (matcher.find()) {
                System.out.format("I found the text" +
                                " \"%s\" starting at " +
                                "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;
            }
            if (!found) {
                System.out.format("No match found.%n");
            }
        }
    }
}
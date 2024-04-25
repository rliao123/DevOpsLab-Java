package edu.sjsu;

import java.util.regex.*;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single
     * quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        // TODO: implement

        String regex = "^(?!['-])(?!.*['-]{2})[a-zA-Z'-]{2,40}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}

package edu.sjsu;

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

        if (input.length() >= 2 && input.length() <= 40 && input.matches("^(?!.*[-']{2})[a-zA-Z-'']+$")
                && !input.startsWith("-")
                && !input.startsWith("'") && input.indexOf("'") == input.lastIndexOf("'")) {
            return true;
        } else {
            return false;
        }
    }
}

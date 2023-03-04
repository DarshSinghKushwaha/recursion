
// PROGRAM TO FIND ALL SUSEQUENCES OF A STRING AND STORE IN ARRAYLIST
import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        System.out.println(subSequence("abc"));
    }

    static ArrayList<String> subSequence(String str) {
        // EXIT CONDITION
        if (str.length() == 0) {
            ArrayList<String> emptyString = new ArrayList<>();
            emptyString.add("");
            return emptyString;
        }
        // BREAK STRING
        char currentChar = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> result = new ArrayList<>();
        // CALCULATE SUBSEQUENCES FOR REMAINING STRING USING RECURSION
        ArrayList<String> temp = subSequence(remainingString);
        for (String s : temp) {
            // SUBSEQUENCES WITHOUT CURRENT CHARACTER
            result.add(s);
            // SUBSEQUENCES WITH CURRENT CHARACTER
            result.add(currentChar + s);
        }
        return result;
    }
}
// PROGRAM TO REMOVE DUPLICATES FROM A STRING
public class remdup {
    // CREATE A BOOLEAN TYPE LIST TO STORE IF CHARACTER IS PREVIOSLY ENCOUNTERED OR
    // NOT
    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        rem("abbccdb", 0, "");
    }

    public static void rem(String str, int i, String newstr) {
        // EXIT CONDITION
        if (i == str.length()) {
            System.out.println(newstr);
            return;
        }
        // CHECK IF A PROGRAM IS NOT ENCOUNTERED PREVIOUSLY ADD TO RESULT AND CHANGE
        // VALUE IN MAP
        if (map[str.charAt(i) - 'a'] == false) {
            newstr += str.charAt(i);
            map[str.charAt(i) - 'a'] = true;
        }
        // RECURSIVE CALL
        rem(str, i + 1, newstr);
    }
}

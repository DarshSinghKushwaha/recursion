// PROGRAM TO MOVE ALL 'X's TO THE END
public class movex {
    public static void main(String[] args) {
        move("axbgxxxftxxxk", 0, 0, "");
    }

    public static void move(String str, int i, int cnt, String newstr) {
        // EXIT AFTER ADDING ALL X TO THE RESULT
        if (i == str.length()) {
            for (int j = 0; j < cnt; j++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        // IF CHARACTER EQUALS TO X THEN INCREASE COUNT OTHERWISE ADD TO RESULT
        if (str.charAt(i) == 'x') {
            cnt++;
            move(str, i + 1, cnt, newstr);
        } else {
            newstr += str.charAt(i);
            move(str, i + 1, cnt, newstr);
        }
    }
}

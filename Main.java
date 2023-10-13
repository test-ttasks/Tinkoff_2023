import java.util.*;

/*
 * Game. Computer chooses a word from its dictionary, and you try to guess the letters.
 */
public class Main {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        List<String> secret = d.stringToList(d.getWord());
        Scanner sc = new Scanner(System.in);
        Set<String> knownLetters = new HashSet<>();
        int mistakeCnt = 0;
        boolean win = false;
        while (!win) {
            String inp = sc.nextLine().trim().toLowerCase();
            if (d.validateInput(inp)) {
                if (secret.contains(inp)) {
                    System.out.println("Yes!");
                    knownLetters.add(inp);
                } else {
                    System.out.println("No...");
                    mistakeCnt++;
                }
                win = d.printCurrent(secret, knownLetters);
            } else {
                System.err.println("Incorrect input.");
            }
        }
        System.out.println("Mistakes: " + mistakeCnt);
    }
}

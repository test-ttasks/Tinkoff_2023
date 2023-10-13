import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Dictionary {
    private final List<String> dict;
    private List<String> abc;
    public Dictionary() {
        dict = new ArrayList<>();
        dict.add("mother");
        dict.add("black");
        dict.add("hehehe");
        dict.add("micro");
        abc = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
    }

    public Dictionary(List<String> init) {
        dict = init;
    }

    /* Picks a word from the dictionary */
    public String getWord() {
        return dict.get((int)(Math.random() * dict.size()));
    }

    /* Makes a list of letters out of String */
    public List<String> stringToList(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            res.add("" + s.charAt(i));
        }
        return res;
    }

    public boolean validateInput(String s) {
        return (abc.contains(s));
    }

    public boolean printCurrent(List<String> secret, Set<String> knownLetters) {
        boolean win = true;
        for (int i = 0; i < secret.size(); i++) {
            if (knownLetters.contains(secret.get(i))) {
                System.out.print(secret.get(i));
            } else {
                System.out.print("*");
                win = false;
            }
        }
        System.out.println();
        return win;
    }

}

package practices;
import java.util.*;

public class ReArrangetheWords {
public static String arrangeWords(String sentence) {
sentence = sentence.toLowerCase();
String[] words = sentence.split(" ");
Arrays.sort(words, (a, b) -> a.length() - b.length());
StringBuilder sb = new StringBuilder();
for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        return sb.toString();
    }

    public static void main(String[] args) {

        String sentence = "Leetcode makes me happy";
        String sentence1 = "Keep calm and carry on";
        String sentence2 = "To be or not to be";
        System.out.println(arrangeWords(sentence));
        System.out.println(arrangeWords(sentence1));
        System.out.println(arrangeWords(sentence2));
    }
}

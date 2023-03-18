import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    static void reverse(String str){
        // remove leading and trailing spaces
        str = str.trim();
        // convert into array {"hello","world"}
        String[] words = str.split(" ");
        // convert into list ["hello","world"]
        List<String> wordlist = Arrays.asList(words);
        // now reverse a list
        Collections.reverse(wordlist); // "worldhello"
        String result = String.join(" ", wordlist); // "world hello"
        System.out.println(result);

    }
    public static void main(String[] args) {
        String str = "Hello World";
        reverse(str);
    }
}

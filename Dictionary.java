import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private static ArrayList<Word> listWord = new ArrayList<>();
    private static List<String> listWordTarget = new ArrayList<>();
    private static List<String> listWordRelated = new ArrayList<>();

    /**
     * Show all word.
     */

    public static void  showAllWord() throws FileNotFoundException {
            System.out.println("No" + "   |English\\t" + "\t\t\t\t\t|Vietnamese");
    }
}

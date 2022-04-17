package Hoang;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    public static ArrayList<Word> listWord = new ArrayList<>();
    public static List<String> listWordTarget = new ArrayList<>();
    public static List<String> listWordRelated = new ArrayList<>();

    /**
     * Show all word.
     */

    public static void  showAllWord() throws FileNotFoundException {
            System.out.println("No" + "\t|English" + "\t|Vietnamese");
            for(int i=0;i<listWord.size();i++){
                String wordTarget = listWord.get(i).getWord_target();
                String wordExplain = listWord.get(i).getWord_explain();
                System.out.printf("%d\t|%s\t\t|%s\n",i,wordTarget,wordExplain);
            }
    }
}

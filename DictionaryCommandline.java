package Hoang;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class DictionaryCommandline extends Dictionary {
    /**
     * dictionaryBasic.
     */
    public static void dictionaryBasic() throws FileNotFoundException, SQLException {
        DictionaryManagement.insertFromCommandline();
        Dictionary.showAllWord();
    }

    public static void dictionaryAdvanced() throws FileNotFoundException {
        DictionaryManagement.insertFromFile();
        Dictionary.showAllWord();
        DictionaryManagement.dictionaryLookup();
    }

    public static void dictionarySearcher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String wordTarget = sc.nextLine();
        listWordRelated.clear();
        for (int i = 0; i < listWord.size(); i++) {
            if (listWord.get(i).getWord_target().toLowerCase().startsWith(wordTarget.toLowerCase())) {
                listWordRelated.add(listWord.get(i).getWord_target());
            }
        }
        for (int i = 0; i < listWordRelated.size(); i++) {
            System.out.printf("%d    |%s\t\n", i, listWordRelated.get(i));

        }
    }

}

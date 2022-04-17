package Hoang;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class DictionaryCommandline {
    /**
     * dictionaryBasic.
     */
    public static void dictionaryBasic() throws FileNotFoundException, SQLException {
        DictionaryManagement.insertFromCommandLine();
        Dictionary.showAllWord();
    }

    public static void dictionaryAdvanced() throws FileNotFoundException {
        DictionaryManagement.insertFromFile();
        Dictionary.showAllWord();
        DictionaryManagement.dictionaryLookup();
    }

}

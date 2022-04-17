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

}

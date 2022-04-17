import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class DictionaryManagement extends Dictionary {
    public String insertFromCommandLine() throws SQLException {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter number of words you want to translate: ");
        int num = nhap.nextInt();
        nhap.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter your word_target: ");
            String wordTarget = nhap.nextLine();
            System.out.println("Enter your word_explain of this word_target: ");
            String wordExplain = nhap.nextLine();
        }

        /**
         * Insert from file.
         */
        public static void insertFromFile(){
            Scanner sc;
            listWord.clear();
            listWordTarget.clear();
            try{
                sc = new Scanner(new File("dictionaries.txt"));
                while(sc.hasNext()){
                    String wordTarget = sc.nextLine().trim();
                    String wordExplain = sc.nextLine().trim();
                    listWord.add(new Word(wordTarget, wordExplain));
                }
                for(Word word : listWord){
                    listWordTarget.add(word.getWord_target());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return "Successfully Inserted";
    }


}
